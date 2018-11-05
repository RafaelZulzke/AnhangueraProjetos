/** 
 * A classe SomatoriaRecursiva demonstra o cálculo da somatória dos primeiros
 * N números inteiros através da chamada recursiva de um método estático.
 */
class SomatoriaRecursiva
  {
  /**
   * O método main permite a execução desta classe. Este método calcula a somatória
   * dos N primeiros números inteiros, onde N é entrado pelo teclado. O cálculo é
   * feito de forma recursiva.
   * @param argumentos os argumentos que podem ser passados para o método via linha 
   *        de comando, mas que neste caso serão ignorados.
   */
  public static void main(String[] argumentos)
    {
    System.out.println("Este programa calcula a somatória dos N primeiros "+
                       "números usando um método recursivo.");
    System.out.print("Entre o valor de N:");
    int n = Keyboard.readInt();
    long resultado = somatória(n);
    System.out.println("A somatória é "+resultado+".");
    } // fim do método main

 /**
  * O método somatória calcula a soma dos N primeiros números inteiros recursivamente.
  * O valor de N é passado como argumento, e a cada passo o método calcula a
  * somatória dos N-1 primeiros números, somando este resultado ao valor de N, a não
  * ser que N seja igual a zero.
  * Este método é menos complicado do que aparenta: muitos comandos de impressão
  * foram adicionados para maior clareza na execução do programa, e podem ser
  * retirados sem problemas.
  * @param N o número de inteiros que devem ser somados
  * @return a somatória dos N primeiros valores
  */
  static long somatória(int N)
    {
    System.out.println("Vamos calcular a somatória dos "+N+" primeiros números...");
    if (N == 0) 
      {
      System.out.println("Não precisamos calcular a somatória dos 0 primeiros "+
                         "números.");
      return 0; // a somatória dos primeiros 0 números inteiros é 0 - não
                // existe a necessidade de quebrar o problema em pedaços 
                // menores.
      }
    else 
      {
      long sum = somatória(N-1);
      System.out.println("O resultado da somatória dos "+N+" primeiros números é "+
                         N+"+"+sum+" = "+(N+sum));
      return N + sum; // Se N não for igual a zero, retorne N mais a 
      // somatória dos (N-1) primeiros números inteiros.
      }
    } // fim do método somatória

  }  // fim da classe SomatoriaRecursiva
