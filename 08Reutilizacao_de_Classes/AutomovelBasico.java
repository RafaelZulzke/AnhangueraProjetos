
/** 
 * A classe AutomovelBasico encapsula os dados de um autom�vel b�sico � venda, e 
 * que herda da classe Automovel.
 */
class AutomovelBasico extends Automovel {

    /**
     * Declara��o dos campos da classe (acess�rios que um autom�vel b�sico pode ter)
     */
    private boolean retrovisorDoLadoDoPassageiro;
    private boolean limpadorDoVidroTraseiro;
    private boolean r�dioAMFM;

    /**
     * O construtor da classe AutomovelBasico, que recebe argumentos para inicializar
     * seus campos.
     * @param m o modelo do autom�vel
     * @param c a cor do autom�vel
     * @param comb o tipo de combust�vel que o autom�vel usa
     * @param retro true se o autom�vel tem retrovisor do lado do passageiro
     * @param limpa true se o autom�vel tem limpador do vidro traseiro
     * @param r�dio true se o autom�vel tem r�dio AM/FM
     */
    AutomovelBasico(String m, String c, byte comb,
            boolean retro, boolean limpa, boolean r�dio) {
        super(m, c, comb); // A inicializa��o dos campos herdados � feita pela superclasse.
        retrovisorDoLadoDoPassageiro = retro; // a inicializa��o dos campos desta classe
        limpadorDoVidroTraseiro = limpa;      // � feita diretamente pelo construtor
        r�dioAMFM = r�dio;
    }

    /**
     * O construtor da classe AutomovelBasico, que recebe argumentos para inicializar
     * seus campos. Esta vers�o do construtor considera que os acess�rios est�o todos
     * presentes.
     * @param m o modelo do autom�vel
     * @param c a cor do autom�vel
     * @param comb o tipo de combust�vel que o autom�vel usa
     */
    AutomovelBasico(String m, String c, byte comb) {
        super(m, c, comb); // a inicializa��o dos campos herdados � feita pela superclasse
        retrovisorDoLadoDoPassageiro = true;
        limpadorDoVidroTraseiro = true;
        r�dioAMFM = true;
    }

    /**
     * O m�todo quantoCusta retorna o pre�o do autom�vel, calculado de acordo com o
     * tipo de combust�vel. Este m�todo usa o m�todo quantoCusta da superclasse para
     * calcular o pre�o-base do autom�vel, e acrescenta o valor dos opcionais.
     * @return o pre�o do autom�vel
     */
    public float quantoCusta() {
        float pre�o = super.quantoCusta(); // calcula o pre�o-base do autom�vel
        if (retrovisorDoLadoDoPassageiro) {
            pre�o += 280;
        }
        if (limpadorDoVidroTraseiro) {
            pre�o += 650;
        }
        if (r�dioAMFM) {
            pre�o += 190;
        }
        return pre�o;
    }

    /**
     * O m�todo toString retorna uma string contendo os campos desta classe com uma
     * formata��o simples.
     * @return os campos da classe, formatados
     */
    public String toString() {
        
        String resultado = super.toString(); // a string que ir� receber a concatena��o
        // dos campos, j� recebendo os dados
        // formatados do autom�vel
        if (retrovisorDoLadoDoPassageiro) {
            resultado += "Com retrovisor do lado do passageiro\n";
        }
        if (limpadorDoVidroTraseiro) {
            resultado += "Com limpador do vidro traseiro\n";
        }
        if (r�dioAMFM) {
            resultado += "Com r�dio AM/FM\n";
        }
        return resultado;  // retorna o resultado da concatena��o
    }
} // fim da classe AutomovelBasico
