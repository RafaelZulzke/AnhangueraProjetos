/** 
 * A classe DemoFor demonstra vários exemplos de uso de laços for como 
 * contadores. 
 * ESTA CLASSE NÃO PODE SER EXECUTADA NORMALMENTE POR CAUSA DE ERROS INTENCIONAIS. 
 */
class DemoFor
  {
  /**
   * O método main permite a execução desta classe. Este método contém cinco exemplos
   * de laços for, sendo que um deles é um laço "infinito". Se a classe for executada,
   * o usuário deverá interromper o programa quando o laço "infinito" for executado.
   * @param argumentos os argumentos que podem ser passados para o método via linha 
   *        de comando, mas que neste caso serão ignorados.
   */
  public static void main(String[] argumentos)
    {
    // Primeiro exemplo de laço for: um contador simples que conta de 0 a 99
    int contador;
    for(contador = 0;contador < 100; contador++) // nunca alcança 100
      {
      System.out.println(contador);
      }
    // Segundo exemplo de laço for: um contador que conta do maior para o menor valor,
    // com decrementos. A variável contador, declarada anteriormente, é reutilizada.
    for(contador = 200;contador >= 0; contador -= 10) // de 200 a 0 de -10 em -10
      {
      System.out.println(contador);
      }
    // Terceiro exemplo de laço for: um contador que não chega a ser executado pois
    // a expressão de verificação do valor final já é avaliada como false no início do
    // laço.
    for(double controle = 0;controle < 0; controle += 3.5)
      {
      System.out.println(controle);
      }
    // Quarto exemplo de laço for: um laço aparentemente "infinito" que eventualmente 
    // será terminado por um comando break associado a uma instrução if.
    double início     = 100;
    double fim        = 200;
    double incremento = 2.5; 
    for(;;) // equivalente a dizer while(true)
      {
      System.out.println(início);
      if (início >= fim) break; // termina se início for maior que fim
      início += incremento; // se não terminou, incrementa
      }
    // Quinto exemplo de laço for: um laço "infinito" por distração do usuário
    for(contador = 0;contador < 1000; contador+=2) // de 0 a 1000, somente os pares
      {
      System.out.println(contador);
      contador = 0; // a variável de controle é reinicializada !
      }
    } // fim do método main

  } // fim da classe DemoFor
