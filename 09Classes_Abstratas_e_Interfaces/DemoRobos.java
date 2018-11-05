
/** 
 * A classe DemoRobos demonstra instâncias das classes RoboSimples e 
 * RoboABateria.
 * ESTA CLASSE NÃO PODE SER COMPILADA POR CAUSA DE ERROS INTENCIONAIS.
 */
class DemoRobos // declaração da classe
{

    /**
     * O método main permite a execução desta classe. Este método contém declarações de
     * instâncias das classes RoboSimples e RoboABateria, e tenta declarar uma instância
     * da classe abstrata RoboAbstrato (causando um erro de compilação).
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos e manipulamos um robô que é uma instância da classe RoboSimples
        RoboSimples exp =
                new RoboSimples("Explorer", 0, 0, (short) 90);
        exp.move(10);                // posição será 0,10
        exp.mudaDireção((short) 180);
        exp.move();                  // posição será -1,10
        exp.move();                  // posição será -2,10
        System.out.println(exp);
        // Criamos e manipulamos um robô que é uma instância da classe RoboABateria
        RoboABateria walk =
                new RoboABateria("Walker", 0, 0, (short) 90, 111);
        walk.move(10);                // posição será 0,10
        walk.mudaDireção((short) 180);
        walk.move();                  // posição será -1,10
        walk.move();                  // posição será -1,10 - não houve energia para
        // modificar a posição
        System.out.println(walk);
    // Tentamos criar uma instância da classe RoboAbstrato, o que causará um erro de
    // compilação.
    //RoboAbstrato imag = new RoboAbstrato("Imaginário",0,0,(short)180);
    } // fim do método main
} // fim da classe DemoRobos
