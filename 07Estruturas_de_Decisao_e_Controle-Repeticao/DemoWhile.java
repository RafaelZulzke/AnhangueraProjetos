/** 
 * A classe DemoWhile demonstra vários exemplos de uso de laços while. 
 * ESTA CLASSE NÃO PODE SER EXECUTADA NORMALMENTE POR CAUSA DE ERROS INTENCIONAIS. 
 */
class DemoWhile
  {
  /**
   * O método main permite a execução desta classe. Este método contém quatro exemplos
   * de laços while, sendo que um deles é um laço "infinito". Se a classe for 
   * executada, o usuário deverá interromper o programa quando o laço "infinito" for
   * executado.
   * @param argumentos os argumentos que podem ser passados para o método via linha 
   *        de comando, mas que neste caso serão ignorados.
   */
  public static void main(String[] argumentos)
    {
    // Primeiro exemplo de laço while: um contador simples
    double valor = 1; // um valor inicial que será modificado pelo laço
    while(valor < 2000) // enquanto este valor for menor que 2000
      {
      System.out.println(valor); // imprimimos o valor
      valor *= 2; // o valor é dobrado e a iteração continua enquanto for < 2000
      }
    // Segundo exemplo de laço while: usamos o break para sair do laço
    char letra = 'A'; // vamos imprimir todos os caracteres maiúsculos
    while(true) // aparentemente este laço será executado infinitamente
      {
      System.out.print(letra); // imprimimos a letra sem quebrar a linha
      letra++; // o valor da letra é incrementado
      if (letra > 'Z') // chegamos ao fim dos caracteres maiúsculos
        {
        System.out.println(); // imprimimos a quebra de linha
        break; // e saímos do laço
        }
      }
    // Terceiro exemplo de laço while: um laço que não chega a ser executado
    int contador = 100; // vamos contar de 100 a 50, decrementando o contador
    while(contador < 50) // mas o comparador foi criado incorretamente e será igual 
      {                  // a false antes da primeira iteração !
      contador--; // decrementamos o contador
      System.out.print(contador+" ");
      }
    // Quarto exemplo de laço while: um laço "infinito" por distração do programador.
    // Vamos calcular os fatores de 2 que sejam menores que 4611686018427387904 (2^62).
    long fatorDe2 = 1; // valor inicial
    while(fatorDe2 < 4611686018427387904L)
      {
      System.out.println(fatorDe2); // o valor é impresso mas não é modificado:
      }                             // o laço executará "infinitamente".

    } // fim do método main

  } // fim da classe DemoWhile
