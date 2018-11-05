/** 
 * A classe FibonacciRecursiva demonstra o c�lculo da somat�ria dos primeiros
 * N n�meros inteiros atrav�s da chamada recursiva de um m�todo est�tico.
 */
class FibonacciRecursiva
  {
  /**
   * O m�todo main permite a execu��o desta classe. Este m�todo calcula o N-�simo 
   * elemento da s�rie de Fibonacci, onde N � entrado pelo teclado.
   * @param argumentos os argumentos que podem ser passados para o m�todo via linha 
   *        de comando, mas que neste caso ser�o ignorados.
   */
  public static void main(String[] argumentos)
    {
    System.out.println("Este programa calcula o N-�simo elemento da s�rie de "+
                       "Fibonacci.");
    System.out.print("Entre o valor de N. Note que o primeiro valor � zero:");
    int n = Keyboard.readInt();
    long resultado = fibonacci(n);
    System.out.println("O "+n+"-�simo elemento da s�rie de Fibonacci � "+
                       resultado+".");
    } // fim do m�todo main

 /**
  * O m�todo fibonacci calcula o N-�simo elemento da s�rie de Fibonacci de maneira
  * recursiva. O valor de N � passado como argumento. Se N for zero ou um, o m�todo
  * retornar� um, sen�o o m�todo retornar� a soma dos elementos N-1 e N-2 da s�rie,
  * chamando novamente o m�todo.
  * @param N o �ndice do elemento da s�rie de Fibonacci
  * @return o valor do elemento da s�rie de Fibonacci
  */
  static long fibonacci(int N)
    {
    if (N == 0) return 1;
    else if (N == 1) return 1;
    else return fibonacci(N-1)+fibonacci(N-2);
    } // fim do m�todo fibonacci

  }  // fim da classe FibonacciRecursiva
