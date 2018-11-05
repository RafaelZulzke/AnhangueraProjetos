/** 
 * A classe DemoRoboComMemoria demonstra o uso de uma inst�ncia da classe RoboComMemoria,
 * em especial, do seu m�todo retorna�Base.
 */
class DemoRoboComMemoria
  {
 /**
  * O m�todo main permite a execu��o desta classe. Este m�todo cria uma inst�ncia da
  * classe RoboComMemoria, usa seus m�todos de movimenta��o e faz com que o rob�
  * retorne � origem com o m�todo retorna�Base.
  * @param argumentos os argumentos que podem ser passados para o m�todo via linha
  *        de comando, mas que neste caso ser�o ignorados.
  */
  public static void main(String[] argumentos)
    {
    // Criamos a inst�ncia da classe RoboComMemoria
    RoboComMemoria n�mero5 =
            new RoboComMemoria("N�mero 5",10,10,(short)90);
    // Movimentamos este rob� em uma espiral quadrada
    for(int movimento=1;movimento<=50;movimento++)
      {
      n�mero5.mudaDire��o((short)  0); // para a esquerda...
      n�mero5.move(movimento++);
      n�mero5.mudaDire��o((short)270); // para baixo...
      n�mero5.move(movimento++);
      n�mero5.mudaDire��o((short)180); // para a direita...
      n�mero5.move(movimento++);
      n�mero5.mudaDire��o((short) 90); // para cima...
      n�mero5.move(movimento++);
      }
    System.out.println(n�mero5.listaCaminho()); // qual foi o caminho percorrido ?
    System.out.println(n�mero5); // onde o rob� est� ?
    n�mero5.retorna�Base(); // retornamos � base
    System.out.println(n�mero5); // onde o rob� est� ?
    } // fim do m�todo main

  }  // fim da classe DemoRoboComMemoria
