/** 
 * A classe OtimizacaoRemocaoDeChamadasAMetodos demonstra como códigos podem ser
 * otimizados através da remoção de código invariante de dentro de laços.
 */
class OtimizacaoRemocaoDeChamadasAMetodos
  {
 /**
  * O método main permite a execução desta classe. Este método calculará duas vezes
  * uma somatória de valores, sendo que em uma delas métodos são usados para o 
  * cálculo enquanto que a outra implementa o cálculo diretamente.
  * @param argumentos os argumentos que podem ser passados para o método via linha 
  *        de comando, mas que neste caso serão ignorados.
  */
  public static void main(String[] argumentos)
    {
    long antes,depois; // variáveis que receberão o tempo corrente em milissegundos
    double soma; // variável para receber o valor da somatória
    // Marcamos o tempo presente 
    antes = System.currentTimeMillis();
    // Fazemos 10000000 iterações com um laço
    soma = 0;
    for(int contador=0;contador<10000000;contador++)
      {
      // Fazemos a somatória dos termos usando duas chamadas a métodos.
      soma += adiciona(contador,-1)/adiciona(contador,+1);
      }
    // Marcamos de novo o tempo presente 
    depois = System.currentTimeMillis();
    System.out.println("Sem otimização: tempo = "+(depois-antes));
    // Refazemos o cálculo, desta vez efetuando os cálculos diretamente ao invés
    // de usar um método.
    // Marcamos o tempo presente 
    antes = System.currentTimeMillis();
    // Fazemos 10000000 iterações com um laço
    soma = 0;
    for(int contador=0;contador<10000000;contador++)
      {
      // Fazemos a somatória dos termos usando duas chamadas a métodos.
      soma += (contador-1.)/(contador+1.);
      }
    // Marcamos de novo o tempo presente 
    depois = System.currentTimeMillis();
    System.out.println("Com otimização: tempo = "+(depois-antes));
    } // fim do método main

 /**
  * O método adiciona simplesmente adiciona os valores passados como argumentos e
  * retorna o resultado. Este tipo de método pode ser facilmente substituído para
  * evitar que deva ser chamado.
  * @param valor o valor base que será adicionado 
  * @param delta o valor a ser adicionado ao valor base
  * @return a soma dos argumentos a este método
  */
  public static double adiciona(double valor,double delta)
    {
    return valor+delta; // simplesmente adiciona os argumentos e retorna a soma
    } // fim do método adiciona

  } // fim da classe OtimizacaoRemocaoDeChamadasAMetodos
