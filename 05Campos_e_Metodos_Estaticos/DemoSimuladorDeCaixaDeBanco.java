
/** 
 * A classe DemoSimuladorDeCaixaDeBanco0 demonstra usos de inst�ncias da classe
 * SimuladorDeCaixaDeBanco0, em especial o problema que ocorre por causa da 
 * independ�ncia das inst�ncias da classe SimuladorDeCaixaDeBanco0.
 */
class DemoSimuladorDeCaixaDeBanco // declara��o da classe 
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es
     * de algumas inst�ncias da classe SimuladorDeCaixaDeBanco0, e demonstra sua cria��o
     * e uso.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Declaramos cinco refer�ncias a inst�ncias da classe SimuladorDeCaixaDeBanco0,
        // e as usamos para simular os caixas de um banco.
        SimuladorDeCaixaDeBanco c1 = new SimuladorDeCaixaDeBanco(1);
        SimuladorDeCaixaDeBanco c2 = new SimuladorDeCaixaDeBanco(2);
        SimuladorDeCaixaDeBanco c3 = new SimuladorDeCaixaDeBanco(3);
        SimuladorDeCaixaDeBanco c4 = new SimuladorDeCaixaDeBanco(4);
        SimuladorDeCaixaDeBanco c5 = new SimuladorDeCaixaDeBanco(5);
        // Fazemos v�rias simula��es de atendimento com balanceamento desigual.
        c1.pr�ximoAtendimento();
        c2.pr�ximoAtendimento();
        c3.pr�ximoAtendimento();
        c4.pr�ximoAtendimento();
        c5.pr�ximoAtendimento();
        c1.pr�ximoAtendimento();
        c2.pr�ximoAtendimento();
        c3.pr�ximoAtendimento();
        c1.pr�ximoAtendimento();
        c2.pr�ximoAtendimento();
        c1.pr�ximoAtendimento();
        c1.pr�ximoAtendimento();
        c1.pr�ximoAtendimento();
        c1.pr�ximoAtendimento();
    } // fim do m�todo main
} // fim da classe DemoSimuladorDeCaixaDeBanco0 
