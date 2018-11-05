/** 
 * A classe OtimizacaoRemocaoDeInvariantesEmLacos demonstra como c�digos podem 
 * ser otimizados atrav�s da redu��o de c�digo invariante de dentro de la�os.
 */
class OtimizacaoRemocaoDeInvariantesEmLacos
  {
 /**
  * O m�todo main permite a execu��o desta classe. Este m�todo calcular� duas vezes
  * uma somat�ria de valores, sendo que em uma delas a parte invariante do la�o �
  * calculada fora deste. 
  * @param argumentos os argumentos que podem ser passados para o m�todo via linha 
  *        de comando, mas que neste caso ser�o ignorados.
  */
  public static void main(String[] argumentos)
    {
    long antes,depois; // vari�veis que receber�o o tempo corrente em milissegundos
    // Marcamos o tempo presente 
    antes = System.currentTimeMillis();
    // Fazemos 36000001 itera��es com um la�o (aparentemente deveriam ser 36000000
    // mas, como o contador � do tipo double, existem erros de arredondamento). A
    // precis�o do contador no for � dada por uma f�rmula simples.
    double fatorDePrecis�o = 100000.;
    for(double �nguloEmGraus=0;�nguloEmGraus<360;�nguloEmGraus+=1/fatorDePrecis�o) 
      {
      // Convers�o de graus para radianos, usando uma f�rmula simples. Parte desta
      // f�rmula � invariante durante o la�o, mas � recalculada em cada itera��o.
      double convertido = �nguloEmGraus*Math.PI/180.;
      }
    // Marcamos de novo o tempo presente 
    depois = System.currentTimeMillis();
    System.out.println("Sem otimiza��o: tempo = "+(depois-antes));
    // Refazemos o c�lculo, desta vez com a parte invariante da f�rmula calculada
    // previamente e simplesmente reutilizada dentro do la�o.
    // Marcamos o tempo presente 
    antes = System.currentTimeMillis();
    // Calculamos o fator de convers�o e o armazenamos em uma vari�vel
    double fatorDeConvers�o = Math.PI/180.;
    // Fazemos 36000001 itera��es com um la�o
    for(double �nguloEmGraus=0;�nguloEmGraus<360;�nguloEmGraus+=1/fatorDePrecis�o)
      {
      // Convers�o de graus para radianos, usando uma f�rmula simples. 
      double convertido = �nguloEmGraus*fatorDeConvers�o;
      }
    // Marcamos de novo o tempo presente 
    depois = System.currentTimeMillis();
    System.out.println("Com otimiza��o: tempo = "+(depois-antes));
    // Refazemos o c�lculo, desta vez com as partes invariantes da f�rmula e do
    // incremento do la�o calculados previamente e reutilizados dentro do la�o.
    // Marcamos o tempo presente 
    antes = System.currentTimeMillis();
    // Calculamos o incremento uma s� vez
    double incremento = 1/fatorDePrecis�o;
    // Fazemos 36000001 itera��es com um la�o
    for(double �nguloEmGraus=0;�nguloEmGraus<360;�nguloEmGraus+=incremento)
      {
      // Convers�o de graus para radianos, usando uma f�rmula simples. 
      double convertido = �nguloEmGraus*fatorDeConvers�o;
      }
    // Marcamos de novo o tempo presente 
    depois = System.currentTimeMillis();
    System.out.println("Com mais otimiza��o: tempo = "+(depois-antes));
    } // fim do m�todo main

  } // fim da classe OtimizacaoRemocaoDeInvariantesEmLacos
