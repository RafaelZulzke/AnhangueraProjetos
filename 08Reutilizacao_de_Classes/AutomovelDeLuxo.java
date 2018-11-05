
/** 
 * A classe AutomovelDeLuxo encapsula os dados de um autom�vel b�sico � venda, e 
 * que herda da classe AutomovelBasico.
 */
class AutomovelDeLuxo extends AutomovelBasico {
    // Este valor representa o n�mero m�ximo de presta��es, e � usado somente para
    // possibilitar c�lculos de financiamento.

    private static final byte N�MEROM�XIMODEPRESTA��ES = 36;
    /**
     * Declara��o dos campos da classe (acess�rios que um autom�vel de luxo pode ter)
     */
    private boolean dire��oHidr�ulica;
    private boolean c�mbioAutom�tico;
    private boolean vidrosETravasEl�tricos;

    /**
     * O construtor da classe AutomovelDeLuxo, que recebe argumentos para inicializar
     * seus campos.
     * @param m o modelo do autom�vel
     * @param c a cor do autom�vel
     * @param comb o tipo de combust�vel que o autom�vel usa
     * @param retro true se o autom�vel tem retrovisor do lado do passageiro
     * @param limpa true se o autom�vel tem limpador do vidro traseiro
     * @param r�dio true se o autom�vel tem r�dio AM/FM
     * @param dir   true se o autom�vel tem dire��o hidr�ulica
     * @param camb  true se o autom�vel tem c�mbio autom�tico
     * @param vidro true se o autom�vel tem vidros e travas el�tricos
     */
    AutomovelDeLuxo(String m, String c, byte comb,
            boolean retro, boolean limpa, boolean r�dio,
            boolean dir, boolean camb, boolean vidro) {
        //super(m, c, comb); // a inicializa��o dos campos herdados �
        super(m, c, comb, retro, limpa, r�dio); // a inicializa��o dos campos herdados �
        // feita pela superclasse
        dire��oHidr�ulica = dir; // a inicializa��o dos campos desta classe � feita
        c�mbioAutom�tico = camb; // diretamente pelo construtor
        vidrosETravasEl�tricos = vidro;
    }

    /**
     * O construtor da classe AutomovelDeLuxo, que recebe argumentos para inicializar
     * seus campos. Esta vers�o do construtor considera que os acess�rios est�o todos
     * presentes.
     * @param m o modelo do autom�vel
     * @param c a cor do autom�vel
     * @param comb o tipo de combust�vel que o autom�vel usa
     */
    AutomovelDeLuxo(String m, String c, byte comb) {
        super(m, c, comb); // a inicializa��o dos campos herdados � feita pela superclasse
        dire��oHidr�ulica = true;
        c�mbioAutom�tico = true;
        vidrosETravasEl�tricos = true;
    }

    /**
     * O m�todo quantoCusta retorna o pre�o do autom�vel, calculado de acordo com o
     * tipo de combust�vel. Este m�todo usa o m�todo quantoCusta da superclasse para
     * calcular o pre�o-base do autom�vel, e acrescenta o valor dos opcionais.
     * @return o pre�o do autom�vel
     */
    public float quantoCusta() {
        float pre�o = super.quantoCusta(); // calcula o pre�o-base do autom�vel
        if (dire��oHidr�ulica) {
            pre�o += 5340;
        }
        if (c�mbioAutom�tico) {
            pre�o += 7500;
        }
        if (vidrosETravasEl�tricos) {
            pre�o += 2320;
        }
        return pre�o;
    }

    /**
     * O m�todo quantasPresta��es retorna o n�mero m�ximo de presta��es para este tipo
     * de autom�vel. � necess�rio sobrepor o m�todo herdado da classe Autom�vel para
     * que o valor correto seja impresso !
     * @return o n�mero m�ximo de presta��es
     */
    public byte quantasPresta��es() {
        return N�MEROM�XIMODEPRESTA��ES;
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
        if (dire��oHidr�ulica) {
            resultado += "Com dire��o hidr�ulica\n";
        }
        if (c�mbioAutom�tico) {
            resultado += "Com c�mbio autom�tico\n";
        }
        if (vidrosETravasEl�tricos) {
            resultado += "Com vidros e travas el�tricas\n";
        }
        return resultado;  // retorna o resultado da concatena��o
    }
} // fim da classe AutomovelDeLuxo
