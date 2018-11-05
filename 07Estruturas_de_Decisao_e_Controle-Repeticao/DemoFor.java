/** 
 * A classe DemoFor demonstra v�rios exemplos de uso de la�os for como 
 * contadores. 
 * ESTA CLASSE N�O PODE SER EXECUTADA NORMALMENTE POR CAUSA DE ERROS INTENCIONAIS. 
 */
class DemoFor
  {
  /**
   * O m�todo main permite a execu��o desta classe. Este m�todo cont�m cinco exemplos
   * de la�os for, sendo que um deles � um la�o "infinito". Se a classe for executada,
   * o usu�rio dever� interromper o programa quando o la�o "infinito" for executado.
   * @param argumentos os argumentos que podem ser passados para o m�todo via linha 
   *        de comando, mas que neste caso ser�o ignorados.
   */
  public static void main(String[] argumentos)
    {
    // Primeiro exemplo de la�o for: um contador simples que conta de 0 a 99
    int contador;
    for(contador = 0;contador < 100; contador++) // nunca alcan�a 100
      {
      System.out.println(contador);
      }
    // Segundo exemplo de la�o for: um contador que conta do maior para o menor valor,
    // com decrementos. A vari�vel contador, declarada anteriormente, � reutilizada.
    for(contador = 200;contador >= 0; contador -= 10) // de 200 a 0 de -10 em -10
      {
      System.out.println(contador);
      }
    // Terceiro exemplo de la�o for: um contador que n�o chega a ser executado pois
    // a express�o de verifica��o do valor final j� � avaliada como false no in�cio do
    // la�o.
    for(double controle = 0;controle < 0; controle += 3.5)
      {
      System.out.println(controle);
      }
    // Quarto exemplo de la�o for: um la�o aparentemente "infinito" que eventualmente 
    // ser� terminado por um comando break associado a uma instru��o if.
    double in�cio     = 100;
    double fim        = 200;
    double incremento = 2.5; 
    for(;;) // equivalente a dizer while(true)
      {
      System.out.println(in�cio);
      if (in�cio >= fim) break; // termina se in�cio for maior que fim
      in�cio += incremento; // se n�o terminou, incrementa
      }
    // Quinto exemplo de la�o for: um la�o "infinito" por distra��o do usu�rio
    for(contador = 0;contador < 1000; contador+=2) // de 0 a 1000, somente os pares
      {
      System.out.println(contador);
      contador = 0; // a vari�vel de controle � reinicializada !
      }
    } // fim do m�todo main

  } // fim da classe DemoFor
