
/** 
 * A classe Automovel encapsula os dados de um automóvel à venda.
 */
class Automovel {

    /**
     * Declaração de alguns campos constantes desta classe. Estes campos são declarados
     * como public para serem acessíveis de fora da classe, como static pois serão
     * independentes de instâncias, e como final para que não sejam modificáveis.
     */
    public static final byte MOVIDOAGASOLINA = 1;
    public static final byte MOVIDOAALCOOL = 2;
    public static final byte MOVIDOADIESEL = 3;
    public static final byte MOVIDOAGAS = 4;
    // Este valor representa o número máximo de prestações, e é usado somente para
    // possibilitar cálculos de financiamento.
    private static final byte NÚMEROMÁXIMODEPRESTAÇÕES = 24;
    /**
     * Declaração dos campos da classe
     */
    private String modelo;       // o modelo do automóvel
    private String cor;          // a cor do automóvel
    private byte combustível;    // o tipo de combustível do automóvel, veja lista
    // declarada anteriormente nesta classe

    /**
     * O construtor da classe Automovel, que recebe argumentos para inicializar
     * seus campos.
     * @param m o modelo do automóvel
     * @param c a cor do automóvel
     * @param comb o tipo de combustível que o automóvel usa
     */
    Automovel(String m, String c, byte comb) {
        modelo = m;
        cor = c;
        combustível = comb;
    }

    /**
     * O método quantoCusta retorna o preço do automóvel, calculado de acordo com o
     * tipo de combustível.
     * @return o preço do automóvel
     */
    public float quantoCusta() {
        float preço = 0; // a variável deve ser inicializada
        switch (combustível) {
            case MOVIDOAGASOLINA:
                preço = 12000.0f;
                break; // Notem o sufixo 'f' ao final
            case MOVIDOAALCOOL:
                preço = 10500.0f;
                break; // de cada valor para denotar
            case MOVIDOADIESEL:
                preço = 11000.0f;
                break; // um valor do tipo float e não
            case MOVIDOAGAS:
                preço = 13000.0f;
                break; // double (que seria o default)
        }
        return preço;
    }

    /**
     * O método quantasPrestações retorna o número máximo de prestações para este tipo
     * de automóvel.
     * @return o número máximo de prestações
     */
    public byte quantasPrestações() {
        return NÚMEROMÁXIMODEPRESTAÇÕES;
    }

    /**
     * O método toString retorna uma string contendo os campos desta classe com uma
     * formatação simples.
     * @return os campos da classe, formatados
     */
    public String toString() {
       
        String resultado; // a string que irá receber a concatenação dos campos
        resultado = modelo + " " + cor + "\n"; // inicializamos o resultado com o modelo e cor
        switch (combustível) // adicionamos a descrição do combustível
        {
            case MOVIDOAGASOLINA:
                resultado += "Movido a Gasolina\n";
                break;
            case MOVIDOAALCOOL:
                resultado += "Movido a Álcool\n";
                break;
            case MOVIDOADIESEL:
                resultado += "Movido a Diesel\n";
                break;
            case MOVIDOAGAS:
                resultado += "Movido a Gás\n";
                break;
        }
        return resultado;  // retorna o resultado da concatenação
    }
} // fim da classe Automovel
