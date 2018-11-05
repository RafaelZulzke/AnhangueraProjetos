/* Esta classe faz parte do pacote DataHora */
package DataHora;

/** 
 * A classe DataHora reutiliza as classes Data e Hora através de delegação.
 * A data e hora são representadas por instâncias das respectivas classes que estão
 * embutidas na classe DataHora. Como as classes Data e Hora fazem parte do mesmo
 * pacote e seus membros foram declarados sem modificadores de acesso, poderão ser
 * acessados diretamente nesta classe.
 */
public class DataHora // declaração da classe 
{
    // Declaração dos campos da classe.

    /**
     * Este campo é uma instância da classe Data e representa o dia, mês e ano
     */
    Data estaData;
    /**
     * Este campo é uma instância da classe Hora e representa a hora, minuto e segundo
     */
    Hora estaHora;

    /**
     * O construtor para a classe DataHora, que recebe argumentos para inicializar
     * todos os campos que esta classe indiretamente contém, e chama os construtores
     * das classes Data e Hora para inicializar os campos das instâncias destas classes.
     * Note que o construtor é declarado como sendo público, caso contrário ele não
     * poderá ser chamado de fora do pacote !
     * @param h a hora
     * @param min o minuto
     * @param s o segundo
     * @param d o dia
     * @param m o mês
     * @param a o ano
     */
    public DataHora(byte h, byte min, byte s, byte d, byte m, short a) {
        estaData = new Data(d, m, a);
        estaHora = new Hora(h, min, s);
    }

    /**
     * O método toString não recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados. Os campos das instâncias das classes Data e Hora
     * podem ser acessados diretamente, já que foram declarados sem modificadores nas
     * classes, e esta classe pertence ao mesmo pacote. Para demonstrar esta
     * possibilidade, este método acessa diretamente os campos das classes Data e Hora.
     * @return uma string com os valores dos campos formatados.
     */
    public String toString() {
        String resultado = estaHora.hora + ":" + estaHora.minuto + ":" + estaHora.segundo;
        resultado += " de " + estaData.dia;
        resultado += " de ";
        switch (estaData.mês) // dependendo do valor do campo mês, concatena o nome do mês
        {
            case 1:
                resultado += "Janeiro";
                break;
            case 2:
                resultado += "Fevereiro";
                break;
            case 3:
                resultado += "Março";
                break;
            case 4:
                resultado += "Abril";
                break;
            case 5:
                resultado += "Maio";
                break;
            case 6:
                resultado += "Junho";
                break;
            case 7:
                resultado += "Julho";
                break;
            case 8:
                resultado += "Agosto";
                break;
            case 9:
                resultado += "Setembro";
                break;
            case 10:
                resultado += "Outubro";
                break;
            case 11:
                resultado += "Novembro";
                break;
            case 12:
                resultado += "Dezembro";
                break;
        }
        resultado += " de " + estaData.ano;
        return resultado;
    }
} // fim da classe DataHora
