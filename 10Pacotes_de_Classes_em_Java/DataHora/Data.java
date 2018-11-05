/* Esta classe faz parte do pacote DataHora */
package DataHora;

/**
 * A classe Data encapsula os dados de uma data qualquer e que faz parte do 
 * pacote DataHora. 
 */
public class Data {
    // Declara��o dos campos da classe.

    /**
     * Este campo representa o dia de uma inst�ncia de Data
     */
    byte dia;
    /**
     * Este campo representa o m�s de uma inst�ncia de Data
     */
    byte m�s;
    /**
     * Este campo representa o ano de uma inst�ncia de Data
     */
    short ano;

    /**
     * O construtor da classe, que recebe argumentos para inicializar os campos da
     * classe. Note que o construtor � declarado como sendo p�blico, caso contr�rio
     * ele n�o poder� ser chamado de fora do pacote !
     * Nenhuma verifica��o � feita nos valores, para manter o exemplo simples.
     * @param d o dia a ser encapsulado por uma inst�ncia desta classe
     * @param m o m�s a ser encapsulado por uma inst�ncia desta classe
     * @param a o ano a ser encapsulado por uma inst�ncia desta classe
     */
    public Data(byte d, byte m, short a) {
        dia = d;
        m�s = m;
        ano = a;
    }

    /**
     * O m�todo toString, que retorna uma string contendo os campos desta classe,
     * formatados de forma adequada.
     * @return uma string com os valores dos campos desta classe
     */
    public String toString() {
        return dia + "/" + m�s + "/" + ano;
    }
} // fim da classe Data
