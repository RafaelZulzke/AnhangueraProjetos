/**
 * A classe CalculadoraDeLinhaDeComando implementa uma calculadora simples usando
 * argumentos passados pela linha de comando. Esta calculadora somente aceita valores
 * inteiros como argumentos.
 */
class CalculadoraDeLinhaDeComando // declaração da classe
  {
 /**
  * O método main permite a execução desta classe. Este método usa os argumentos
  * passados pela linha de comando, que serão disponibilizados para a aplicação
  * através do array que é o argumento para o método main. Os argumentos serão 
  * processados para cálculo da operação entre o primeiro e o terceiro argumentos,
  * onde a operação será definida pelo segundo argumento.
  * @param argumentos os argumentos que foram passados pela linha de comando para 
  *         esta aplicação.
  */                                                          
  public static void main(String[] argumentos)
    {      
    // Primeiro, verificamos se exatamente três argumentos foram passados pela linha 
    // de comando, e saímos do programa caso contrário.
    if (argumentos.length != 3)        
      {
      System.out.println("Este programa precisa que três argumentos sejam passados "+
                         "pela linha de comando.");
      System.exit(1); // saímos do programa com o código de execução número 1
      }
    // Extraímos um valor inteiro da string correspondente ao primeiro argumento 
    int primeiroValor = Integer.parseInt(argumentos[0]); 
    // Extraímos o primeiro caractere da string correspondente ao segundo argumento 
    char operador = argumentos[1].charAt(0);
    // Extraímos um valor inteiro da string correspondente ao terceiro argumento 
    int segundoValor = Integer.parseInt(argumentos[2]);
    // Dependendo do caractere operador, efetuamos a operação
    int resultado = 0; // deve ser inicializada
    switch(operador)
      {
      case '+': resultado = primeiroValor + segundoValor; break;
      case '-': resultado = primeiroValor - segundoValor; break;
      case '*': resultado = primeiroValor * segundoValor; break;
      case '/': resultado = primeiroValor / segundoValor; break;
      }
    // Imprimimos os argumentos passados com espaços entre eles
    for(int índice=0;índice<argumentos.length;índice++)
      System.out.print(argumentos[índice]+" ");
    // Imprimimos o resultado
    System.out.println("= "+resultado);
    } // fim do método main
 
  } // fim da classe CalculadoraDeLinhaDeComando 
