
/** 
 * A classe SimuladorDeCaixaDeBanco simula um caixa de banco onde o atendimento
 * � feito atrav�s de uma senha que indica a ordem de atendimento. Um dos campos desta
 * classe ser� declarado como est�tico, significando que somente um valor ser� 
 * armazenado neste campo, independente de quantas inst�ncias da classe sejam criadas
 * em um programa.
 */
class SimuladorDeCaixaDeBanco // declara��o da classe 
{

    /**
     * Declara��o dos campos da classe
     */
    static private int n�meroDoCliente; // o n�mero do cliente a ser atendido. Este campo
    // � declarado est�tico, somente um �nico valor
    // poder� ser armazenado nele independentemente
    // de quantas inst�ncias desta classe sejam
    // criadas.
    private int n�meroDoCaixa; // o n�mero do caixa (para sua identifica��o)

    /**
     * O construtor da classe inicializa o n�mero do caixa (para identifica��o),
     * inicializa o contador de clientes e imprime uma mensagem.
     * @param n o n�mero do caixa dentro do banco
     */
    SimuladorDeCaixaDeBanco(int n) {
        n�meroDoCaixa = n;
        n�meroDoCliente = 0;
        System.out.println("Caixa " + n�meroDoCaixa + " iniciou opera��o.");
    } // fim do construtor

    /**
     * O m�todo pr�ximoAtendimento simula o atendimento de um cliente.
     */
    public void pr�ximoAtendimento() {
        n�meroDoCliente = n�meroDoCliente + 1; // o pr�ximo cliente ser� chamado
        System.out.print("Cliente com a senha n�mero " + n�meroDoCliente + ", favor ");
        System.out.println("dirigir-se ao caixa n�mero " + n�meroDoCaixa + ".");
    }
} // fim da classe SimuladorDeCaixaDeBanco
