
/** 
 * A classe DemoRobos demonstra inst�ncias das classes RoboSimples e 
 * RoboABateria.
 * ESTA CLASSE N�O PODE SER COMPILADA POR CAUSA DE ERROS INTENCIONAIS.
 */
class DemoRobos // declara��o da classe
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es de
     * inst�ncias das classes RoboSimples e RoboABateria, e tenta declarar uma inst�ncia
     * da classe abstrata RoboAbstrato (causando um erro de compila��o).
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos e manipulamos um rob� que � uma inst�ncia da classe RoboSimples
        RoboSimples exp =
                new RoboSimples("Explorer", 0, 0, (short) 90);
        exp.move(10);                // posi��o ser� 0,10
        exp.mudaDire��o((short) 180);
        exp.move();                  // posi��o ser� -1,10
        exp.move();                  // posi��o ser� -2,10
        System.out.println(exp);
        // Criamos e manipulamos um rob� que � uma inst�ncia da classe RoboABateria
        RoboABateria walk =
                new RoboABateria("Walker", 0, 0, (short) 90, 111);
        walk.move(10);                // posi��o ser� 0,10
        walk.mudaDire��o((short) 180);
        walk.move();                  // posi��o ser� -1,10
        walk.move();                  // posi��o ser� -1,10 - n�o houve energia para
        // modificar a posi��o
        System.out.println(walk);
    // Tentamos criar uma inst�ncia da classe RoboAbstrato, o que causar� um erro de
    // compila��o.
    //RoboAbstrato imag = new RoboAbstrato("Imagin�rio",0,0,(short)180);
    } // fim do m�todo main
} // fim da classe DemoRobos
