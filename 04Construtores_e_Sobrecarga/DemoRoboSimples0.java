
/** 
 * A classe DemoRoboSimples0 demonstra o uso de inst�ncias da classe 
 * RoboSimples0.
 */
class DemoRoboSimples0 // declara��o da classe 
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es de
     * algumas inst�ncias da classe RoboSimples0, e demonstra seu uso. Basicamente alguns
     * rob�s simulados ser�o criados e movidos.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Declaramos algumas refer�ncias a inst�ncias da classe RoboSimples0
        // e as inicializamos com construtores diversos.
        RoboSimples0 groucho = new RoboSimples0("Groucho", 20, 10, 'S');
        RoboSimples0 chico = new RoboSimples0("Chico");
        RoboSimples0 semNome = new RoboSimples0();
        // Movimentamos estes rob�s
        groucho.move(10);
        chico.mudaDire��o('E');
        chico.move(5);
        semNome.move();
        // Onde os rob�s est�o agora ?
        System.out.println(groucho);
        System.out.println(chico);
        System.out.println(semNome);
    } // fim do m�todo main
} // fim da classe DemoRoboSimples0 
