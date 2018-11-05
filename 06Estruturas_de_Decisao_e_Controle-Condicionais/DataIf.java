
/** 
 * A classe DataIf contém campos e métodos que permitem a manipulação de datas.
 * Esta versão da classe não tem métodos que seriam úteis para seu uso, somente 
 * contém o construtor (que não verifica a validade dos dados) e o método toString 
 * que demonstra a instrução if usada em cascata (objetivo desta classe).
 */
class DataIf // declaração da classe 
{

    /**
     * Declaração dos campos da classe
     */
    private byte dia,  mês; // dia e mês são representados por bytes
    private short ano; // ano é representado por um short

    /**
     * O construtor da classe DataIf recebe argumentos para inicializar os campos da
     * classe. Este construtor não verifica a validade da data, veja o comentário no
     * início da classe para maiores informações.
     * @param d o argumento correspondente ao método dia
     * @param m o argumento correspondente ao método mês
     * @param a o argumento correspondente ao método ano
     */
    DataIf(byte d, byte m, short a) {
        dia = d;
        mês = m;
        ano = a;
    } // fim do construtor

    /**
     * O método toString retorna uma string contendo os valores dos campos formatados
     * (ou seja, a data com o mês por extenso)
     * @return uma string com a data formatada
     */
    public String toString() {
        String resultado = "" + dia;
        resultado += " de ";
        if (mês == 1) {
            resultado += "Janeiro";        // Verifica qual é o mês e
        } else if (mês == 2) {
            resultado += "Fevereiro"; // imprime o nome
        } else if (mês == 3) {
            resultado += "Março";
        } else if (mês == 4) {
            resultado += "Abril";
        } else if (mês == 5) {
            resultado += "Maio";
        } else if (mês == 6) {
            resultado += "Junho";
        } else if (mês == 7) {
            resultado += "Julho";
        } else if (mês == 8) {
            resultado += "Agosto";
        } else if (mês == 9) {
            resultado += "Setembro";
        } else if (mês == 10) {
            resultado += "Outubro";
        } else if (mês == 11) {
            resultado += "Novembro";
        } else if (mês == 12) {
            resultado += "Dezembro";
        }
        resultado += " de " + ano;
        return resultado;
    }  // fim do método toString
} // fim da classe DataIf
