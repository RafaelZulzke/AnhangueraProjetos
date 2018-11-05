
/** 
 * A classe DemoSimuladorDeCaixaDeBanco0 demonstra usos de instâncias da classe
 * SimuladorDeCaixaDeBanco0, em especial o problema que ocorre por causa da 
 * independência das instâncias da classe SimuladorDeCaixaDeBanco0.
 */
class DemoSimuladorDeCaixaDeBanco // declaração da classe 
{

    /**
     * O método main permite a execução desta classe. Este método contém declarações
     * de algumas instâncias da classe SimuladorDeCaixaDeBanco0, e demonstra sua criação
     * e uso.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Declaramos cinco referências a instâncias da classe SimuladorDeCaixaDeBanco0,
        // e as usamos para simular os caixas de um banco.
        SimuladorDeCaixaDeBanco c1 = new SimuladorDeCaixaDeBanco(1);
        SimuladorDeCaixaDeBanco c2 = new SimuladorDeCaixaDeBanco(2);
        SimuladorDeCaixaDeBanco c3 = new SimuladorDeCaixaDeBanco(3);
        SimuladorDeCaixaDeBanco c4 = new SimuladorDeCaixaDeBanco(4);
        SimuladorDeCaixaDeBanco c5 = new SimuladorDeCaixaDeBanco(5);
        // Fazemos várias simulações de atendimento com balanceamento desigual.
        c1.próximoAtendimento();
        c2.próximoAtendimento();
        c3.próximoAtendimento();
        c4.próximoAtendimento();
        c5.próximoAtendimento();
        c1.próximoAtendimento();
        c2.próximoAtendimento();
        c3.próximoAtendimento();
        c1.próximoAtendimento();
        c2.próximoAtendimento();
        c1.próximoAtendimento();
        c1.próximoAtendimento();
        c1.próximoAtendimento();
        c1.próximoAtendimento();
    } // fim do método main
} // fim da classe DemoSimuladorDeCaixaDeBanco0 
