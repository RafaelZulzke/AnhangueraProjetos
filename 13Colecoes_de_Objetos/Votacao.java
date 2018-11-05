// A linha abaixo permite o uso das classes do pacote java.util
import java.util.*;

/** 
 * A classe Votacao encapsula um mecanismo simples de votação aberta (onde o número de 
 * candidatos não é previamente conhecido). Esta classe usa uma lista de votos para
 * criar, depois, o resultado tabulado.
 */
class Votacao // declaração da classe 
{

    /**
     * Declaração dos campos da classe
     */
    private List votos; // conterá os votos (lista de strings)
    private List candidatos; // conterá os nomes dos candidatos (lista de strings)
    private List votosPorCandidatos; // conterá os votos por candidatos (lista de
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
     * O método recebeVoto recebe um nome de candidato e lança um voto para este
     * candidato na lista de votos.
     * @param candidato o nome do candidato que recebeu um voto
     */
    public void recebeVoto(String candidato) {
        votos.add(candidato);
    }

    /**
     * O método tabula faz a contagem dos votos, armazenando, para cada candidato,
     * o número de votos recebidos e o nome do candidato em duas listas separadas.
     * Os votos contados são removidos da lista.
     * Esta tarefa não é feita automaticamente pelo método recebeVoto por ser
     * relativamente custosa: a tabulação pode ser feita esporadicamente.
     */
    public void tabula() {
        while (votos.size() > 0) // para cada voto recebido...
        {
            // Recuperamos o primeiro voto (nome do candidato) e o removemos da lista de votos
            String candidatoVotado =
                    (String) votos.remove(0); // com uma só método !
            // Verificamos se o candidato já está na lista
            if (candidatos.contains(candidatoVotado)) {
                // Recuperamos a posição do candidato na lista de candidatos
                int posição =
                        candidatos.indexOf(candidatoVotado);
                // Recuperamos o número de votos, incrementando este valor e o colocando
                // na lista novamente.
                Integer votosAtéAgora =
                        (Integer)
                        votosPorCandidatos.get(posição);
                votosAtéAgora =
                        new Integer(1 + votosAtéAgora.intValue());
                votosPorCandidatos.set(posição, votosAtéAgora);
            } else // não está na lista
            {
                // Vamos criar entradas para o candidato e seu primeiro voto.
                candidatos.add(candidatoVotado);
                votosPorCandidatos.add(new Integer(1));
            }
        } // fim do processamento dos votos
    }

    /**
     * O método toString retorna os nomes de candidatos e votos tabulados até então como
     * uma string.
     * @return uma string contendo uma representação dos valores do array encapsulado.
     */
    public String toString() {
        // Criamos uma instância de StringBuffer com um tamanho inicial proporcional
        StringBuffer sb = new StringBuffer(candidatos.size() * 40);
        for (int c = 0; c < candidatos.size(); c++) // para cada candidato
        {
            // Preparamos uma linha com o nome e número de votos
            sb.append(candidatos.get(c));
            sb.append(" recebeu ");
            sb.append(votosPorCandidatos.get(c));
            sb.append(" votos\n");
        }
        return sb.toString(); // retornamos o StringBuffer convertido para String
    }
} // fim da classe Votacao
