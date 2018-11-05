
/** 
 * A classe SimuladorDeCaixaDeBanco simula um caixa de banco onde o atendimento
 * é feito através de uma senha que indica a ordem de atendimento. Um dos campos desta
 * classe será declarado como estático, significando que somente um valor será 
 * armazenado neste campo, independente de quantas instâncias da classe sejam criadas
 * em um programa.
 */
class SimuladorDeCaixaDeBanco // declaração da classe 
{

    /**
     * Declaração dos campos da classe
     */
    static private int númeroDoCliente; // o número do cliente a ser atendido. Este campo
    // é declarado estático, somente um único valor
    // poderá ser armazenado nele independentemente
    // de quantas instâncias desta classe sejam
    // criadas.
    private int númeroDoCaixa; // o número do caixa (para sua identificação)

    /**
     * O construtor da classe inicializa o número do caixa (para identificação),
     * inicializa o contador de clientes e imprime uma mensagem.
     * @param n o número do caixa dentro do banco
     */
    SimuladorDeCaixaDeBanco(int n) {
        númeroDoCaixa = n;
        númeroDoCliente = 0;
        System.out.println("Caixa " + númeroDoCaixa + " iniciou operação.");
    } // fim do construtor

    /**
     * O método próximoAtendimento simula o atendimento de um cliente.
     */
    public void próximoAtendimento() {
        númeroDoCliente = númeroDoCliente + 1; // o próximo cliente será chamado
        System.out.print("Cliente com a senha número " + númeroDoCliente + ", favor ");
        System.out.println("dirigir-se ao caixa número " + númeroDoCaixa + ".");
    }
} // fim da classe SimuladorDeCaixaDeBanco
