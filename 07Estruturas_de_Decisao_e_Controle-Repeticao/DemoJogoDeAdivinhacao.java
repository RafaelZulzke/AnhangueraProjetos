/** 
 * A classe DemoJogoDeAdivinhacao demonstra o uso de uma inst�ncia da classe 
 * JogoDeAdivinhacao. 
 */
class DemoJogoDeAdivinhacao // declara��o da classe 
  {
  /**
   * O m�todo main permite a execu��o desta classe. Este m�todo cria uma inst�ncia da
   * classe JogoDeAdivinhacao e executa o m�todo tenta para permitir a intera��o com o
   * usu�rio.
   * @param argumentos os argumentos que podem ser passados para o m�todo via linha 
   *        de comando, mas que neste caso ser�o ignorados.
   */
  public static void main(String[] argumentos)
    {
    JogoDeAdivinhacao novoJogo = new JogoDeAdivinhacao(237865);
    novoJogo.tenta();
    } // fim do m�todo main

  } // fim da classe DemoJogoDeAdivinhacao
