
/** 
 * A classe DataIf cont�m campos e m�todos que permitem a manipula��o de datas.
 * Esta vers�o da classe n�o tem m�todos que seriam �teis para seu uso, somente 
 * cont�m o construtor (que n�o verifica a validade dos dados) e o m�todo toString 
 * que demonstra a instru��o if usada em cascata (objetivo desta classe).
 */
class DataIf // declara��o da classe 
{

    /**
     * Declara��o dos campos da classe
     */
    private byte dia,  m�s; // dia e m�s s�o representados por bytes
    private short ano; // ano � representado por um short

    /**
     * O construtor da classe DataIf recebe argumentos para inicializar os campos da
     * classe. Este construtor n�o verifica a validade da data, veja o coment�rio no
     * in�cio da classe para maiores informa��es.
     * @param d o argumento correspondente ao m�todo dia
     * @param m o argumento correspondente ao m�todo m�s
     * @param a o argumento correspondente ao m�todo ano
     */
    DataIf(byte d, byte m, short a) {
        dia = d;
        m�s = m;
        ano = a;
    } // fim do construtor

    /**
     * O m�todo toString retorna uma string contendo os valores dos campos formatados
     * (ou seja, a data com o m�s por extenso)
     * @return uma string com a data formatada
     */
    public String toString() {
        String resultado = "" + dia;
        resultado += " de ";
        if (m�s == 1) {
            resultado += "Janeiro";        // Verifica qual � o m�s e
        } else if (m�s == 2) {
            resultado += "Fevereiro"; // imprime o nome
        } else if (m�s == 3) {
            resultado += "Mar�o";
        } else if (m�s == 4) {
            resultado += "Abril";
        } else if (m�s == 5) {
            resultado += "Maio";
        } else if (m�s == 6) {
            resultado += "Junho";
        } else if (m�s == 7) {
            resultado += "Julho";
        } else if (m�s == 8) {
            resultado += "Agosto";
        } else if (m�s == 9) {
            resultado += "Setembro";
        } else if (m�s == 10) {
            resultado += "Outubro";
        } else if (m�s == 11) {
            resultado += "Novembro";
        } else if (m�s == 12) {
            resultado += "Dezembro";
        }
        resultado += " de " + ano;
        return resultado;
    }  // fim do m�todo toString
} // fim da classe DataIf
