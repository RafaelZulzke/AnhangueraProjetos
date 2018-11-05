/** 
 * A classe FibonacciRecursiva demonstra o cálculo da somatória dos primeiros
 * N números inteiros através da chamada recursiva de um método estático.
 */
class FibonacciRecursiva
  {
  /**
   * O método main permite a execução desta classe. Este método calcula o N-ésimo 
   * elemento da série de Fibonacci, onde N é entrado pelo teclado.
   * @param argumentos os argumentos que podem ser passados para o método via linha 
   *        de comando, mas que neste caso serão ignorados.
   */
  public static void main(String[] argumentos)
    {
    System.out.println("Este programa calcula o N-ésimo elemento da série de "+
                       "Fibonacci.");
    System.out.print("Entre o valor de N. Note que o primeiro valor é zero:");
    int n = Keyboard.readInt();
    long resultado = fibonacci(n);
    System.out.println("O "+n+"-ésimo elemento da série de Fibonacci é "+
                       resultado+".");
    } // fim do método main

 /**
  * O método fibonacci calcula o N-ésimo elemento da série de Fibonacci de maneira
  * recursiva. O valor de N é passado como argumento. Se N for zero ou um, o método
  * retornará um, senão o método retornará a soma dos elementos N-1 e N-2 da série,
  * chamando novamente o método.
  * @param N o índice do elemento da série de Fibonacci
  * @return o valor do elemento da série de Fibonacci
  */
  static long fibonacci(int N)
    {
    if (N == 0) return 1;
    else if (N == 1) return 1;
    else return fibonacci(N-1)+fibonacci(N-2);
    } // fim do método fibonacci

  }  // fim da classe FibonacciRecursiva
