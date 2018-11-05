
/** 
 * A classe DataComFabrica cont�m uma f�brica de inst�ncias da pr�pria classe.
 * Esta classe cont�m campos que representam uma data e m�todos simples para a
 * manipula��o destes campos. Esta classe cont�m tamb�m o construtor (que n�o verifica
 * a validade dos dados) e o m�todo toString.
 */
class DataComFabrica // declara��o da classe 
{

    /**
     * Declara��o dos campos da classe
     */
    private byte dia,  m�s; // dia e m�s s�o representados por bytes
    private short ano; // ano � representado por um short

    /**
     * O construtor da classe DataComFabrica recebe argumentos para inicializar os campos
     * da classe. Este construtor n�o verifica a validade da data para manter a classe
     * simples.
     * @param d o argumento correspondente ao m�todo dia
     * @param m o argumento correspondente ao m�todo m�s
     * @param a o argumento correspondente ao m�todo ano
     */
    DataComFabrica(byte d, byte m, short a) {
        dia = d;
        m�s = m;
        ano = a;
    } // fim do construtor

    /**
     * O m�todo toString retorna uma string contendo os valores dos campos formatados
     * @return uma string com a data formatada
     */
    public String toString() {
        return dia + "/" + m�s + "/" + ano;
    }  // fim do m�todo toString

    /**
     * O m�todo Natal (uma f�brica de inst�ncias da classe Data) retorna o dia de Natal
     * para o ano passado como argumento.
     * @param ano o ano para o qual retornaremos a data de Natal
     * @return uma inst�ncia da classe Data correspondente ao Natal daquele ano
     */
    public static DataComFabrica Natal(short ano) {
        return new DataComFabrica((byte) 25, (byte) 12, ano);
    }  // fim do m�todo Natal
} // fim da classe DataComFabrica








