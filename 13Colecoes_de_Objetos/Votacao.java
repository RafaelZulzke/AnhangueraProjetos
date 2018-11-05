// A linha abaixo permite o uso das classes do pacote java.util
import java.util.*;

/** 
 * A classe Votacao encapsula um mecanismo simples de vota��o aberta (onde o n�mero de 
 * candidatos n�o � previamente conhecido). Esta classe usa uma lista de votos para
 * criar, depois, o resultado tabulado.
 */
class Votacao // declara��o da classe 
{

    /**
     * Declara��o dos campos da classe
     */
    private List votos; // conter� os votos (lista de strings)
    private List candidatos; // conter� os nomes dos candidatos (lista de strings)
    private List votosPorCandidatos; // conter� os votos por candidatos (lista de
    // Integers)

    /**
     * O construtor para a classe Votacao, que inicializa a lista usada para receber os
     * votos.
     */
    Votacao() {
        votos = new LinkedList(); // instanciamos todos como LinkedList
        candidatos = new LinkedList(); // instanciamos todos como LinkedList
        votosPorCandidatos = new LinkedList(); // instanciamos todos como LinkedList
    }

    /**
     * O m�todo recebeVoto recebe um nome de candidato e lan�a um voto para este
     * candidato na lista de votos.
     * @param candidato o nome do candidato que recebeu um voto
     */
    public void recebeVoto(String candidato) {
        votos.add(candidato);
    }

    /**
     * O m�todo tabula faz a contagem dos votos, armazenando, para cada candidato,
     * o n�mero de votos recebidos e o nome do candidato em duas listas separadas.
     * Os votos contados s�o removidos da lista.
     * Esta tarefa n�o � feita automaticamente pelo m�todo recebeVoto por ser
     * relativamente custosa: a tabula��o pode ser feita esporadicamente.
     */
    public void tabula() {
        while (votos.size() > 0) // para cada voto recebido...
        {
            // Recuperamos o primeiro voto (nome do candidato) e o removemos da lista de votos
            String candidatoVotado =
                    (String) votos.remove(0); // com uma s� m�todo !
            // Verificamos se o candidato j� est� na lista
            if (candidatos.contains(candidatoVotado)) {
                // Recuperamos a posi��o do candidato na lista de candidatos
                int posi��o =
                        candidatos.indexOf(candidatoVotado);
                // Recuperamos o n�mero de votos, incrementando este valor e o colocando
                // na lista novamente.
                Integer votosAt�Agora =
                        (Integer)
                        votosPorCandidatos.get(posi��o);
                votosAt�Agora =
                        new Integer(1 + votosAt�Agora.intValue());
                votosPorCandidatos.set(posi��o, votosAt�Agora);
            } else // n�o est� na lista
            {
                // Vamos criar entradas para o candidato e seu primeiro voto.
                candidatos.add(candidatoVotado);
                votosPorCandidatos.add(new Integer(1));
            }
        } // fim do processamento dos votos
    }

    /**
     * O m�todo toString retorna os nomes de candidatos e votos tabulados at� ent�o como
     * uma string.
     * @return uma string contendo uma representa��o dos valores do array encapsulado.
     */
    public String toString() {
        // Criamos uma inst�ncia de StringBuffer com um tamanho inicial proporcional
        StringBuffer sb = new StringBuffer(candidatos.size() * 40);
        for (int c = 0; c < candidatos.size(); c++) // para cada candidato
        {
            // Preparamos uma linha com o nome e n�mero de votos
            sb.append(candidatos.get(c));
            sb.append(" recebeu ");
            sb.append(votosPorCandidatos.get(c));
            sb.append(" votos\n");
        }
        return sb.toString(); // retornamos o StringBuffer convertido para String
    }
} // fim da classe Votacao
