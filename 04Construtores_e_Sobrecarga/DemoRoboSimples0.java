
/** 
 * A classe DemoRoboSimples0 demonstra o uso de instâncias da classe 
 * RoboSimples0.
 */
class DemoRoboSimples0 // declaração da classe 
{

    /**
     * O método main permite a execução desta classe. Este método contém declarações de
     * algumas instâncias da classe RoboSimples0, e demonstra seu uso. Basicamente alguns
     * robôs simulados serão criados e movidos.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Declaramos algumas referências a instâncias da classe RoboSimples0
        // e as inicializamos com construtores diversos.
        RoboSimples0 groucho = new RoboSimples0("Groucho", 20, 10, 'S');
        RoboSimples0 chico = new RoboSimples0("Chico");
        RoboSimples0 semNome = new RoboSimples0();
        // Movimentamos estes robôs
        groucho.move(10);
        chico.mudaDireção('E');
        chico.move(5);
        semNome.move();
        // Onde os robôs estão agora ?
        System.out.println(groucho);
        System.out.println(chico);
        System.out.println(semNome);
    } // fim do método main
} // fim da classe DemoRoboSimples0 
