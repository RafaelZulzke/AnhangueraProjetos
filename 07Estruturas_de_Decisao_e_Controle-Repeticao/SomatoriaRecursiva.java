/** 
 * A classe SomatoriaRecursiva demonstra o c�lculo da somat�ria dos primeiros
 * N n�meros inteiros atrav�s da chamada recursiva de um m�todo est�tico.
 */
class SomatoriaRecursiva
  {
  /**
   * O m�todo main permite a execu��o desta classe. Este m�todo calcula a somat�ria
   * dos N primeiros n�meros inteiros, onde N � entrado pelo teclado. O c�lculo �
   * feito de forma recursiva.
   * @param argumentos os argumentos que podem ser passados para o m�todo via linha 
   *        de comando, mas que neste caso ser�o ignorados.
   */
  public static void main(String[] argumentos)
    {
    System.out.println("Este programa calcula a somat�ria dos N primeiros "+
                       "n�meros usando um m�todo recursivo.");
    System.out.print("Entre o valor de N:");
    int n = Keyboard.readInt();
    long resultado = somat�ria(n);
    System.out.println("A somat�ria � "+resultado+".");
    } // fim do m�todo main

 /**
  * O m�todo somat�ria calcula a soma dos N primeiros n�meros inteiros recursivamente.
  * O valor de N � passado como argumento, e a cada passo o m�todo calcula a
  * somat�ria dos N-1 primeiros n�meros, somando este resultado ao valor de N, a n�o
  * ser que N seja igual a zero.
  * Este m�todo � menos complicado do que aparenta: muitos comandos de impress�o
  * foram adicionados para maior clareza na execu��o do programa, e podem ser
  * retirados sem problemas.
  * @param N o n�mero de inteiros que devem ser somados
  * @return a somat�ria dos N primeiros valores
  */
  static long somat�ria(int N)
    {
    System.out.println("Vamos calcular a somat�ria dos "+N+" primeiros n�meros...");
    if (N == 0) 
      {
      System.out.println("N�o precisamos calcular a somat�ria dos 0 primeiros "+
                         "n�meros.");
      return 0; // a somat�ria dos primeiros 0 n�meros inteiros � 0 - n�o
                // existe a necessidade de quebrar o problema em peda�os 
                // menores.
      }
    else 
      {
      long sum = somat�ria(N-1);
      System.out.println("O resultado da somat�ria dos "+N+" primeiros n�meros � "+
                         N+"+"+sum+" = "+(N+sum));
      return N + sum; // Se N n�o for igual a zero, retorne N mais a 
      // somat�ria dos (N-1) primeiros n�meros inteiros.
      }
    } // fim do m�todo somat�ria

  }  // fim da classe SomatoriaRecursiva
