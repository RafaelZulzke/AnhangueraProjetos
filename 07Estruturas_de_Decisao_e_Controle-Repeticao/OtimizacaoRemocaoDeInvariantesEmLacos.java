/** 
 * A classe OtimizacaoRemocaoDeInvariantesEmLacos demonstra como códigos podem 
 * ser otimizados através da redução de código invariante de dentro de laços.
 */
class OtimizacaoRemocaoDeInvariantesEmLacos
  {
 /**
  * O método main permite a execução desta classe. Este método calculará duas vezes
  * uma somatória de valores, sendo que em uma delas a parte invariante do laço é
  * calculada fora deste. 
  * @param argumentos os argumentos que podem ser passados para o método via linha 
  *        de comando, mas que neste caso serão ignorados.
  */
  public static void main(String[] argumentos)
    {
    long antes,depois; // variáveis que receberão o tempo corrente em milissegundos
    // Marcamos o tempo presente 
    antes = System.currentTimeMillis();
    // Fazemos 36000001 iterações com um laço (aparentemente deveriam ser 36000000
    // mas, como o contador é do tipo double, existem erros de arredondamento). A
    // precisão do contador no for é dada por uma fórmula simples.
    double fatorDePrecisão = 100000.;
    for(double ânguloEmGraus=0;ânguloEmGraus<360;ânguloEmGraus+=1/fatorDePrecisão) 
      {
      // Conversão de graus para radianos, usando uma fórmula simples. Parte desta
      // fórmula é invariante durante o laço, mas é recalculada em cada iteração.
      double convertido = ânguloEmGraus*Math.PI/180.;
      }
    // Marcamos de novo o tempo presente 
    depois = System.currentTimeMillis();
    System.out.println("Sem otimização: tempo = "+(depois-antes));
    // Refazemos o cálculo, desta vez com a parte invariante da fórmula calculada
    // previamente e simplesmente reutilizada dentro do laço.
    // Marcamos o tempo presente 
    antes = System.currentTimeMillis();
    // Calculamos o fator de conversão e o armazenamos em uma variável
    double fatorDeConversão = Math.PI/180.;
    // Fazemos 36000001 iterações com um laço
    for(double ânguloEmGraus=0;ânguloEmGraus<360;ânguloEmGraus+=1/fatorDePrecisão)
      {
      // Conversão de graus para radianos, usando uma fórmula simples. 
      double convertido = ânguloEmGraus*fatorDeConversão;
      }
    // Marcamos de novo o tempo presente 
    depois = System.currentTimeMillis();
    System.out.println("Com otimização: tempo = "+(depois-antes));
    // Refazemos o cálculo, desta vez com as partes invariantes da fórmula e do
    // incremento do laço calculados previamente e reutilizados dentro do laço.
    // Marcamos o tempo presente 
    antes = System.currentTimeMillis();
    // Calculamos o incremento uma só vez
    double incremento = 1/fatorDePrecisão;
    // Fazemos 36000001 iterações com um laço
    for(double ânguloEmGraus=0;ânguloEmGraus<360;ânguloEmGraus+=incremento)
      {
      // Conversão de graus para radianos, usando uma fórmula simples. 
      double convertido = ânguloEmGraus*fatorDeConversão;
      }
    // Marcamos de novo o tempo presente 
    depois = System.currentTimeMillis();
    System.out.println("Com mais otimização: tempo = "+(depois-antes));
    } // fim do método main

  } // fim da classe OtimizacaoRemocaoDeInvariantesEmLacos
