
/** 
 * A classe Automovel encapsula os dados de um autom�vel � venda.
 */
class Automovel {

    /**
     * Declara��o de alguns campos constantes desta classe. Estes campos s�o declarados
     * como public para serem acess�veis de fora da classe, como static pois ser�o
     * independentes de inst�ncias, e como final para que n�o sejam modific�veis.
     */
    public static final byte MOVIDOAGASOLINA = 1;
    public static final byte MOVIDOAALCOOL = 2;
    public static final byte MOVIDOADIESEL = 3;
    public static final byte MOVIDOAGAS = 4;
    // Este valor representa o n�mero m�ximo de presta��es, e � usado somente para
    // possibilitar c�lculos de financiamento.
    private static final byte N�MEROM�XIMODEPRESTA��ES = 24;
    /**
     * Declara��o dos campos da classe
     */
    private String modelo;       // o modelo do autom�vel
    private String cor;          // a cor do autom�vel
    private byte combust�vel;    // o tipo de combust�vel do autom�vel, veja lista
    // declarada anteriormente nesta classe

    /**
     * O construtor da classe Automovel, que recebe argumentos para inicializar
     * seus campos.
     * @param m o modelo do autom�vel
     * @param c a cor do autom�vel
     * @param comb o tipo de combust�vel que o autom�vel usa
     */
    Automovel(String m, String c, byte comb) {
        modelo = m;
        cor = c;
        combust�vel = comb;
    }

    /**
     * O m�todo quantoCusta retorna o pre�o do autom�vel, calculado de acordo com o
     * tipo de combust�vel.
     * @return o pre�o do autom�vel
     */
    public float quantoCusta() {
        float pre�o = 0; // a vari�vel deve ser inicializada
        switch (combust�vel) {
            case MOVIDOAGASOLINA:
                pre�o = 12000.0f;
                break; // Notem o sufixo 'f' ao final
            case MOVIDOAALCOOL:
                pre�o = 10500.0f;
                break; // de cada valor para denotar
            case MOVIDOADIESEL:
                pre�o = 11000.0f;
                break; // um valor do tipo float e n�o
            case MOVIDOAGAS:
                pre�o = 13000.0f;
                break; // double (que seria o default)
        }
        return pre�o;
    }

    /**
     * O m�todo quantasPresta��es retorna o n�mero m�ximo de presta��es para este tipo
     * de autom�vel.
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
       
        String resultado; // a string que ir� receber a concatena��o dos campos
        resultado = modelo + " " + cor + "\n"; // inicializamos o resultado com o modelo e cor
        switch (combust�vel) // adicionamos a descri��o do combust�vel
        {
            case MOVIDOAGASOLINA:
                resultado += "Movido a Gasolina\n";
                break;
            case MOVIDOAALCOOL:
                resultado += "Movido a �lcool\n";
                break;
            case MOVIDOADIESEL:
                resultado += "Movido a Diesel\n";
                break;
            case MOVIDOAGAS:
                resultado += "Movido a G�s\n";
                break;
        }
        return resultado;  // retorna o resultado da concatena��o
    }
} // fim da classe Automovel
