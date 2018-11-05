/* Esta classe faz parte do pacote DataHora */
package DataHora;

/** 
 * A classe DataHora reutiliza as classes Data e Hora atrav�s de delega��o.
 * A data e hora s�o representadas por inst�ncias das respectivas classes que est�o
 * embutidas na classe DataHora. Como as classes Data e Hora fazem parte do mesmo
 * pacote e seus membros foram declarados sem modificadores de acesso, poder�o ser
 * acessados diretamente nesta classe.
 */
public class DataHora // declara��o da classe 
{
    // Declara��o dos campos da classe.

    /**
     * Este campo � uma inst�ncia da classe Data e representa o dia, m�s e ano
     */
    Data estaData;
    /**
     * Este campo � uma inst�ncia da classe Hora e representa a hora, minuto e segundo
     */
    Hora estaHora;

    /**
     * O construtor para a classe DataHora, que recebe argumentos para inicializar
     * todos os campos que esta classe indiretamente cont�m, e chama os construtores
     * das classes Data e Hora para inicializar os campos das inst�ncias destas classes.
     * Note que o construtor � declarado como sendo p�blico, caso contr�rio ele n�o
     * poder� ser chamado de fora do pacote !
     * @param h a hora
     * @param min o minuto
     * @param s o segundo
     * @param d o dia
     * @param m o m�s
     * @param a o ano
     */
    public DataHora(byte h, byte min, byte s, byte d, byte m, short a) {
        estaData = new Data(d, m, a);
        estaHora = new Hora(h, min, s);
    }

    /**
     * O m�todo toString n�o recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados. Os campos das inst�ncias das classes Data e Hora
     * podem ser acessados diretamente, j� que foram declarados sem modificadores nas
     * classes, e esta classe pertence ao mesmo pacote. Para demonstrar esta
     * possibilidade, este m�todo acessa diretamente os campos das classes Data e Hora.
     * @return uma string com os valores dos campos formatados.
     */
    public String toString() {
        String resultado = estaHora.hora + ":" + estaHora.minuto + ":" + estaHora.segundo;
        resultado += " de " + estaData.dia;
        resultado += " de ";
        switch (estaData.m�s) // dependendo do valor do campo m�s, concatena o nome do m�s
        {
            case 1:
                resultado += "Janeiro";
                break;
            case 2:
                resultado += "Fevereiro";
                break;
            case 3:
                resultado += "Mar�o";
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
