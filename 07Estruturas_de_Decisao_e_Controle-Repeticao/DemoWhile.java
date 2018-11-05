/** 
 * A classe DemoWhile demonstra v�rios exemplos de uso de la�os while. 
 * ESTA CLASSE N�O PODE SER EXECUTADA NORMALMENTE POR CAUSA DE ERROS INTENCIONAIS. 
 */
class DemoWhile
  {
  /**
   * O m�todo main permite a execu��o desta classe. Este m�todo cont�m quatro exemplos
   * de la�os while, sendo que um deles � um la�o "infinito". Se a classe for 
   * executada, o usu�rio dever� interromper o programa quando o la�o "infinito" for
   * executado.
   * @param argumentos os argumentos que podem ser passados para o m�todo via linha 
   *        de comando, mas que neste caso ser�o ignorados.
   */
  public static void main(String[] argumentos)
    {
    // Primeiro exemplo de la�o while: um contador simples
    double valor = 1; // um valor inicial que ser� modificado pelo la�o
    while(valor < 2000) // enquanto este valor for menor que 2000
      {
      System.out.println(valor); // imprimimos o valor
      valor *= 2; // o valor � dobrado e a itera��o continua enquanto for < 2000
      }
    // Segundo exemplo de la�o while: usamos o break para sair do la�o
    char letra = 'A'; // vamos imprimir todos os caracteres mai�sculos
    while(true) // aparentemente este la�o ser� executado infinitamente
      {
      System.out.print(letra); // imprimimos a letra sem quebrar a linha
      letra++; // o valor da letra � incrementado
      if (letra > 'Z') // chegamos ao fim dos caracteres mai�sculos
        {
        System.out.println(); // imprimimos a quebra de linha
        break; // e sa�mos do la�o
        }
      }
    // Terceiro exemplo de la�o while: um la�o que n�o chega a ser executado
    int contador = 100; // vamos contar de 100 a 50, decrementando o contador
    while(contador < 50) // mas o comparador foi criado incorretamente e ser� igual 
      {                  // a false antes da primeira itera��o !
      contador--; // decrementamos o contador
      System.out.print(contador+" ");
      }
    // Quarto exemplo de la�o while: um la�o "infinito" por distra��o do programador.
    // Vamos calcular os fatores de 2 que sejam menores que 4611686018427387904 (2^62).
    long fatorDe2 = 1; // valor inicial
    while(fatorDe2 < 4611686018427387904L)
      {
      System.out.println(fatorDe2); // o valor � impresso mas n�o � modificado:
      }                             // o la�o executar� "infinitamente".

    } // fim do m�todo main

  } // fim da classe DemoWhile
