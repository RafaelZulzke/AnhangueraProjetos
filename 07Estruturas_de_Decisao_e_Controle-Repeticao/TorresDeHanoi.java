/** 
 * A classe TorresDeHanoi demonstra a solu��o recursiva para o problema das 
 * Torres de Han�i.
 */
class TorresDeHanoi
  {
  /**
   * O m�todo main permite a execu��o desta classe. Este m�todo simplesmente chama o
   * m�todo torresDeHan�i, que se chama recursivamente e soluciona o problema das
   * Torres de Han�i.
   * @param argumentos os argumentos que podem ser passados para o m�todo via linha 
   *        de comando, mas que neste caso ser�o ignorados.
   */
  public static void main(String[] argumentos)
    {
    torresDeHan�i(4,"primeiro pino","pino final","pino tempor�rio");
    } // fim do m�todo main

  /**
   * Este m�todo soluciona o problema das Torres de Han�i recursivamente, chamando-se
   * com argumentos diferentes para resolver partes menores do problema.
   * @param n�meroDeAn�is o n�mero de an�is que deve ser movido a cada chamada do
   *                      m�todo
   * @param origem o nome do pino para ser considerado de origem nesta execu��o
   * @param destino o nome do pino para ser considerado de destino nesta execu��o
   * @param auxiliar o nome do pino para ser considerado como auxiliar nesta execu��o
   */
  private static void torresDeHan�i(int n�meroDeAn�is,
                                    String origem,String destino,String auxiliar)
    {
    if (n�meroDeAn�is > 0)
      {
      // Movemos todos os an�is (menos o �ltimo) do pino de origem para o pino 
      // auxiliar usando o pino de destino como auxiliar tempor�rio
      torresDeHan�i(n�meroDeAn�is-1,origem,auxiliar,destino);
      // Movemos o �ltimo disco do pino de origem para o pino de destino, diretamente.
      System.out.println("Mover pino "+n�meroDeAn�is+" de "+origem+" para "+destino);
      // Movemos todos os an�is (menos o �ltimo) do pino de auxiliar para o pino de
      // destino usando o pino de origem como auxiliar tempor�rio
      torresDeHan�i(n�meroDeAn�is-1,auxiliar,destino,origem);
      }
    }

  } // fim da classe TorresDeHanoi
