/** 
 * A classe DemoJogoDeAdivinhacao demonstra o uso de uma instância da classe 
 * JogoDeAdivinhacao. 
 */
class DemoJogoDeAdivinhacao // declaração da classe 
  {
  /**
   * O método main permite a execução desta classe. Este método cria uma instância da
   * classe JogoDeAdivinhacao e executa o método tenta para permitir a interação com o
   * usuário.
   * @param argumentos os argumentos que podem ser passados para o método via linha 
   *        de comando, mas que neste caso serão ignorados.
   */
  public static void main(String[] argumentos)
    {
    JogoDeAdivinhacao novoJogo = new JogoDeAdivinhacao(237865);
    novoJogo.tenta();
    } // fim do método main

  } // fim da classe DemoJogoDeAdivinhacao
