
/** 
 * A classe DataHora reutiliza as classes Data e Hora atrav�s de delega��o.
 * A data e hora s�o representadas por inst�ncias das respectivas classes que est�o
 * embutidas na classe DataHora, e toda a intera��o entre esta classe e as embutidas
 * � feita atrav�s da chamada de m�todos das classes embutidas. Esta classe demonstra 
 * o conceito de reutiliza��o de classes atrav�s de delega��o ou composi��o.
 */
class DataHora // declara��o da classe
{

    /**
     * Declara��o dos campos da classe. Estes campos s�o declarados como privados
     * para que n�o possam ser acessados de fora da classe.
     */
    private Data estaData; // uma refer�ncia � inst�ncia da classe Data representa
    // o dia, m�s e ano
    //private Hora estaHora; // uma refer�ncia � inst�ncia da classe Hora representa
    // a hora, minuto e segundo

    /**
     * O construtor para a classe DataHora, que recebe argumentos para inicializar
     * todos os campos que esta classe indiretamente cont�m, e chama os construtores
     * das classes Data e Hora para inicializar os campos das inst�ncias destas classes.
     * @param hora a hora
     * @param minuto o minuto
     * @param segundo o segundo
     * @param dia o dia
     * @param m�s o m�s
     * @param ano o ano
     */
    DataHora(byte hora, byte minuto, byte segundo, 
            byte dia, byte m�s, short ano) {
        estaData = new Data(dia, m�s, ano);
    //  estaHora = new Hora(hora, minuto, segundo);
    }

    /**
     * O construtor para a classe DataHora, que recebe argumentos para inicializar
     * os campos que representam uma data. O construtor tamb�m inicializar� os campos
     * que representam uma hora, considerando que todos valem zero (meia-noite).
     * De novo, os construtores das classes embutidas nesta ser�o chamados.
     * @param dia o dia
     * @param m�s o m�s
     * @param ano o ano
     */
    DataHora(byte dia, byte m�s, short ano) {
        estaData = new Data(dia, m�s, ano);
    //estaHora = new Hora((byte) 0, (byte) 0, (byte) 0); // cast necess�rio
    }

    /**
     * O m�todo toString n�o recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados. Os valores s�o obtidos atrav�s da chamada
     * impl�cita aos m�todos toString das inst�ncias das classes embutidas.
     * @return uma string com os valores dos campos formatados.
     */
    public String toString() {
        return estaData + " "; // + estaHora;
    }
} // fim da classe DataHora
