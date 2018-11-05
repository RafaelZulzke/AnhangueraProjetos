/** 
 * A classe OtimizacaoDesenrolamentoDeLacos demonstra como c�digos podem ser
 * otimizados atrav�s do uso de c�digo sequencial ao inv�s de pequenos la�os.
 */
class OtimizacaoDesenrolamentoDeLacos
  {
 /**
  * O m�todo main permite a execu��o desta classe. Este m�todo calcular� tr�s vezes
  * uma somat�ria de valores, que usa como termo uma minisseq��ncia de valores que
  * no primeiro caso � calculada com um la�o, no segundo como uma somat�ria direta e 
  * no terceiro como uma opera��o mais simples com menos termos.
  * @param argumentos os argumentos que podem ser passados para o m�todo via linha 
  *        de comando, mas que neste caso ser�o ignorados.
  */
  public static void main(String[] argumentos)
    {
    long antes,depois; // vari�veis que receber�o o tempo corrente em milissegundos
    double soma = 0; // vari�vel que receber� o valor de uma somat�ria
    // Marcamos o tempo presente 
    antes = System.currentTimeMillis();
    // Executamos 10000000 itera��es
    for(int contador=0;contador<10000000;contador++)
      {
      // Precisamos somar cinco valores sequenciais iniciando com o contador:
      // sem otimizar, usamos um la�o.
      double somaInterna = 0;
      for(int contadorInterno=contador;contadorInterno<contador+5;contadorInterno++)
        somaInterna += contadorInterno;
      // Calculamos o termo da seq��ncia e o somamos 
      soma += 1./somaInterna;
      }        
    // Marcamos de novo o tempo presente 
    depois = System.currentTimeMillis();
    System.out.println("Sem otimiza��o: tempo = "+(depois-antes));
    // Refazemos o c�lculo, desta vez substituindo o la�o interno por uma opera��o
    // direta com o mesmo resultado.
    soma = 0; // reinicializamos a somat�ria
    // Marcamos o tempo presente 
    antes = System.currentTimeMillis();
    // Executamos 10000000 itera��es
    for(int contador=0;contador<10000000;contador++)
      {
      // Somamos diretamente os cinco valores sequenciais e armazenamos em uma 
      // vari�vel, ao inv�s de usar um la�o.
      double somaInterna = (contador+contador+1+contador+2+contador+3+contador+4);
      soma += 1./somaInterna;
      }        
    // Marcamos de novo o tempo presente 
    depois = System.currentTimeMillis();
    System.out.println("Com otimiza��o: tempo = "+(depois-antes));
    // Refazemos o c�lculo, desta vez escrevendo a opera��o com menos termos
    soma = 0; // reinicializamos a somat�ria
    // Marcamos o tempo presente 
    antes = System.currentTimeMillis();
    for(int contador=0;contador<10000000;contador++)
      {
      // Usamos uma express�o mais concisa ao inv�s da soma com v�rios termos
      double somaInterna = 10+contador*5;
      soma += 1./somaInterna;
      }        
    // Marcamos de novo o tempo presente 
    depois = System.currentTimeMillis();
    System.out.println("Com mais otimiza��o: tempo = "+(depois-antes));
    } // fim do m�todo main

  } // fim da classe OtimizacaoDesenrolamentoDeLacos
