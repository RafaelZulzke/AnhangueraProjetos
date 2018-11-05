
/** 
 * A classe SimuladorDeCaixaDeBanco0 simula um caixa de banco, onde o atendimento
 * é feito através de uma senha que indica a ordem de atendimento. O nome da classe tem
 * o número 0 porque esta classe será melhorada posteriormente.
 */
class SimuladorDeCaixaDeBanco0 // declaração da classe 
{

    /**
     * Declaração dos campos da classe
     */
    private int númeroDoCliente; // o número do cliente a ser atendido
    private int númeroDoCaixa; // o número do caixa (para sua identificação)

    /**
     * O construtor da classe inicializa o número do caixa (para identificação),
     * inicializa o contador de clientes e imprime uma mensagem.
     * @param n o número do caixa dentro do banco
     */
    SimuladorDeCaixaDeBanco0(int n) {
        númeroDoCaixa = n;
        númeroDoCliente = 0;
        System.out.println("Caixa " + númeroDoCaixa +
                " iniciou operação.");
    } // fim do construtor

    /**
     * O método próximoAtendimento simula o atendimento de um cliente.
     */
    public void próximoAtendimento() {
        númeroDoCliente = númeroDoCliente + 1; // o próximo cliente será chamado
        System.out.print("Cliente com a senha número " +
                númeroDoCliente + ", favor ");
        System.out.println("dirigir-se ao caixa número " +
                númeroDoCaixa + ".");
    }
} // fim da classe SimuladorDeCaixaDeBanco0
