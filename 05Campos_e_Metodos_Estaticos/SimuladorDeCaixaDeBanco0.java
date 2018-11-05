
/** 
 * A classe SimuladorDeCaixaDeBanco0 simula um caixa de banco, onde o atendimento
 * � feito atrav�s de uma senha que indica a ordem de atendimento. O nome da classe tem
 * o n�mero 0 porque esta classe ser� melhorada posteriormente.
 */
class SimuladorDeCaixaDeBanco0 // declara��o da classe 
{

    /**
     * Declara��o dos campos da classe
     */
    private int n�meroDoCliente; // o n�mero do cliente a ser atendido
    private int n�meroDoCaixa; // o n�mero do caixa (para sua identifica��o)

    /**
     * O construtor da classe inicializa o n�mero do caixa (para identifica��o),
     * inicializa o contador de clientes e imprime uma mensagem.
     * @param n o n�mero do caixa dentro do banco
     */
    SimuladorDeCaixaDeBanco0(int n) {
        n�meroDoCaixa = n;
        n�meroDoCliente = 0;
        System.out.println("Caixa " + n�meroDoCaixa +
                " iniciou opera��o.");
    } // fim do construtor

    /**
     * O m�todo pr�ximoAtendimento simula o atendimento de um cliente.
     */
    public void pr�ximoAtendimento() {
        n�meroDoCliente = n�meroDoCliente + 1; // o pr�ximo cliente ser� chamado
        System.out.print("Cliente com a senha n�mero " +
                n�meroDoCliente + ", favor ");
        System.out.println("dirigir-se ao caixa n�mero " +
                n�meroDoCaixa + ".");
    }
} // fim da classe SimuladorDeCaixaDeBanco0
