/** 
 * A classe DemoRoboComMemoria demonstra o uso de uma instância da classe RoboComMemoria,
 * em especial, do seu método retornaÀBase.
 */
class DemoRoboComMemoria
  {
 /**
  * O método main permite a execução desta classe. Este método cria uma instância da
  * classe RoboComMemoria, usa seus métodos de movimentação e faz com que o robô
  * retorne à origem com o método retornaÀBase.
  * @param argumentos os argumentos que podem ser passados para o método via linha
  *        de comando, mas que neste caso serão ignorados.
  */
  public static void main(String[] argumentos)
    {
    // Criamos a instância da classe RoboComMemoria
    RoboComMemoria número5 =
            new RoboComMemoria("Número 5",10,10,(short)90);
    // Movimentamos este robô em uma espiral quadrada
    for(int movimento=1;movimento<=50;movimento++)
      {
      número5.mudaDireção((short)  0); // para a esquerda...
      número5.move(movimento++);
      número5.mudaDireção((short)270); // para baixo...
      número5.move(movimento++);
      número5.mudaDireção((short)180); // para a direita...
      número5.move(movimento++);
      número5.mudaDireção((short) 90); // para cima...
      número5.move(movimento++);
      }
    System.out.println(número5.listaCaminho()); // qual foi o caminho percorrido ?
    System.out.println(número5); // onde o robô está ?
    número5.retornaÀBase(); // retornamos à base
    System.out.println(número5); // onde o robô está ?
    } // fim do método main

  }  // fim da classe DemoRoboComMemoria
