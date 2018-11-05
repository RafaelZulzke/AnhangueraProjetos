
/** 
 * A classe DataSwitch cont�m campos e m�todos que permitem a manipula��o de 
 * datas. Esta vers�o da classe n�o tem m�todos que seriam �teis para seu uso, somente 
 * cont�m o construtor (que n�o verifica a validade dos dados) e dois m�todos que 
 * demonstram a instru��o switch (objetivo desta classe).
 */
class DataSwitch // declara��o da classe 
{

    /**
     * Declara��o dos campos da classe
     */
    private byte dia,  m�s; // dia e m�s s�o representados por bytes
    private short ano; // ano � representado por um short

    /**
     * O construtor da classe DataSwitch recebe argumentos para inicializar os campos da
     * classe. Este construtor n�o verifica a validade da data, veja o coment�rio no
     * in�cio da classe para maiores informa��es.
     * @param d o argumento correspondente ao m�todo dia
     * @param m o argumento correspondente ao m�todo m�s
     * @param a o argumento correspondente ao m�todo ano
     */
    DataSwitch(byte d, byte m, short a) {
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
        switch (m�s) // dependendo do valor do campo m�s, concatena um dos nomes abaixo.
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
        resultado += " de " + ano;
        return resultado;
    }  // fim do m�todo toString

    /**
     * O m�todo diasNoM�s retorna o n�mero de dias que existe no m�s encapsulado nesta
     * classe. O algoritmo simplifica, assumindo que o ano n�o � bissexto.
     * @return o n�mero de dias no m�s da data encapsulada
     */
    public byte diasNoM�s() {
        byte n�meroDeDias;
        switch (m�s) // dependendo do valor do campo m�s, armazenamos um n�mero de dias
        {
            case 2:
                n�meroDeDias = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                n�meroDeDias = 30;
                break;
            default:
                n�meroDeDias = 31;
                break;
        }
        return n�meroDeDias;
    }  // fim do m�todo diasNoM�s
} // fim da classe DataSwitch
