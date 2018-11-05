/** 
 * A classe TorresDeHanoi demonstra a solução recursiva para o problema das 
 * Torres de Hanói.
 */
class TorresDeHanoi
  {
  /**
   * O método main permite a execução desta classe. Este método simplesmente chama o
   * método torresDeHanói, que se chama recursivamente e soluciona o problema das
   * Torres de Hanói.
   * @param argumentos os argumentos que podem ser passados para o método via linha 
   *        de comando, mas que neste caso serão ignorados.
   */
  public static void main(String[] argumentos)
    {
    torresDeHanói(4,"primeiro pino","pino final","pino temporário");
    } // fim do método main

  /**
   * Este método soluciona o problema das Torres de Hanói recursivamente, chamando-se
   * com argumentos diferentes para resolver partes menores do problema.
   * @param númeroDeAnéis o número de anéis que deve ser movido a cada chamada do
   *                      método
   * @param origem o nome do pino para ser considerado de origem nesta execução
   * @param destino o nome do pino para ser considerado de destino nesta execução
   * @param auxiliar o nome do pino para ser considerado como auxiliar nesta execução
   */
  private static void torresDeHanói(int númeroDeAnéis,
                                    String origem,String destino,String auxiliar)
    {
    if (númeroDeAnéis > 0)
      {
      // Movemos todos os anéis (menos o último) do pino de origem para o pino 
      // auxiliar usando o pino de destino como auxiliar temporário
      torresDeHanói(númeroDeAnéis-1,origem,auxiliar,destino);
      // Movemos o último disco do pino de origem para o pino de destino, diretamente.
      System.out.println("Mover pino "+númeroDeAnéis+" de "+origem+" para "+destino);
      // Movemos todos os anéis (menos o último) do pino de auxiliar para o pino de
      // destino usando o pino de origem como auxiliar temporário
      torresDeHanói(númeroDeAnéis-1,auxiliar,destino,origem);
      }
    }

  } // fim da classe TorresDeHanoi
