/** 
 * A classe OtimizacaoRemocaoDeChamadasAMetodos demonstra como c�digos podem ser
 * otimizados atrav�s da remo��o de c�digo invariante de dentro de la�os.
 */
class OtimizacaoRemocaoDeChamadasAMetodos
  {
 /**
  * O m�todo main permite a execu��o desta classe. Este m�todo calcular� duas vezes
  * uma somat�ria de valores, sendo que em uma delas m�todos s�o usados para o 
  * c�lculo enquanto que a outra implementa o c�lculo diretamente.
  * @param argumentos os argumentos que podem ser passados para o m�todo via linha 
  *        de comando, mas que neste caso ser�o ignorados.
  */
  public static void main(String[] argumentos)
    {
    long antes,depois; // vari�veis que receber�o o tempo corrente em milissegundos
    double soma; // vari�vel para receber o valor da somat�ria
    // Marcamos o tempo presente 
    antes = System.currentTimeMillis();
    // Fazemos 10000000 itera��es com um la�o
    soma = 0;
    for(int contador=0;contador<10000000;contador++)
      {
      // Fazemos a somat�ria dos termos usando duas chamadas a m�todos.
      soma += adiciona(contador,-1)/adiciona(contador,+1);
      }
    // Marcamos de novo o tempo presente 
    depois = System.currentTimeMillis();
    System.out.println("Sem otimiza��o: tempo = "+(depois-antes));
    // Refazemos o c�lculo, desta vez efetuando os c�lculos diretamente ao inv�s
    // de usar um m�todo.
    // Marcamos o tempo presente 
    antes = System.currentTimeMillis();
    // Fazemos 10000000 itera��es com um la�o
    soma = 0;
    for(int contador=0;contador<10000000;contador++)
      {
      // Fazemos a somat�ria dos termos usando duas chamadas a m�todos.
      soma += (contador-1.)/(contador+1.);
      }
    // Marcamos de novo o tempo presente 
    depois = System.currentTimeMillis();
    System.out.println("Com otimiza��o: tempo = "+(depois-antes));
    } // fim do m�todo main

 /**
  * O m�todo adiciona simplesmente adiciona os valores passados como argumentos e
  * retorna o resultado. Este tipo de m�todo pode ser facilmente substitu�do para
  * evitar que deva ser chamado.
  * @param valor o valor base que ser� adicionado 
  * @param delta o valor a ser adicionado ao valor base
  * @return a soma dos argumentos a este m�todo
  */
  public static double adiciona(double valor,double delta)
    {
    return valor+delta; // simplesmente adiciona os argumentos e retorna a soma
    } // fim do m�todo adiciona

  } // fim da classe OtimizacaoRemocaoDeChamadasAMetodos
