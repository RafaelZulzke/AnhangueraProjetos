/** 
 * A classe OtimizacaoDesenrolamentoDeLacos demonstra como códigos podem ser
 * otimizados através do uso de código sequencial ao invés de pequenos laços.
 */
class OtimizacaoDesenrolamentoDeLacos
  {
 /**
  * O método main permite a execução desta classe. Este método calculará três vezes
  * uma somatória de valores, que usa como termo uma minisseqüência de valores que
  * no primeiro caso é calculada com um laço, no segundo como uma somatória direta e 
  * no terceiro como uma operação mais simples com menos termos.
  * @param argumentos os argumentos que podem ser passados para o método via linha 
  *        de comando, mas que neste caso serão ignorados.
  */
  public static void main(String[] argumentos)
    {
    long antes,depois; // variáveis que receberão o tempo corrente em milissegundos
    double soma = 0; // variável que receberá o valor de uma somatória
    // Marcamos o tempo presente 
    antes = System.currentTimeMillis();
    // Executamos 10000000 iterações
    for(int contador=0;contador<10000000;contador++)
      {
      // Precisamos somar cinco valores sequenciais iniciando com o contador:
      // sem otimizar, usamos um laço.
      double somaInterna = 0;
      for(int contadorInterno=contador;contadorInterno<contador+5;contadorInterno++)
        somaInterna += contadorInterno;
      // Calculamos o termo da seqüência e o somamos 
      soma += 1./somaInterna;
      }        
    // Marcamos de novo o tempo presente 
    depois = System.currentTimeMillis();
    System.out.println("Sem otimização: tempo = "+(depois-antes));
    // Refazemos o cálculo, desta vez substituindo o laço interno por uma operação
    // direta com o mesmo resultado.
    soma = 0; // reinicializamos a somatória
    // Marcamos o tempo presente 
    antes = System.currentTimeMillis();
    // Executamos 10000000 iterações
    for(int contador=0;contador<10000000;contador++)
      {
      // Somamos diretamente os cinco valores sequenciais e armazenamos em uma 
      // variável, ao invés de usar um laço.
      double somaInterna = (contador+contador+1+contador+2+contador+3+contador+4);
      soma += 1./somaInterna;
      }        
    // Marcamos de novo o tempo presente 
    depois = System.currentTimeMillis();
    System.out.println("Com otimização: tempo = "+(depois-antes));
    // Refazemos o cálculo, desta vez escrevendo a operação com menos termos
    soma = 0; // reinicializamos a somatória
    // Marcamos o tempo presente 
    antes = System.currentTimeMillis();
    for(int contador=0;contador<10000000;contador++)
      {
      // Usamos uma expressão mais concisa ao invés da soma com vários termos
      double somaInterna = 10+contador*5;
      soma += 1./somaInterna;
      }        
    // Marcamos de novo o tempo presente 
    depois = System.currentTimeMillis();
    System.out.println("Com mais otimização: tempo = "+(depois-antes));
    } // fim do método main

  } // fim da classe OtimizacaoDesenrolamentoDeLacos
