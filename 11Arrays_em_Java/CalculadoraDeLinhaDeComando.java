/**
 * A classe CalculadoraDeLinhaDeComando implementa uma calculadora simples usando
 * argumentos passados pela linha de comando. Esta calculadora somente aceita valores
 * inteiros como argumentos.
 */
class CalculadoraDeLinhaDeComando // declara��o da classe
  {
 /**
  * O m�todo main permite a execu��o desta classe. Este m�todo usa os argumentos
  * passados pela linha de comando, que ser�o disponibilizados para a aplica��o
  * atrav�s do array que � o argumento para o m�todo main. Os argumentos ser�o 
  * processados para c�lculo da opera��o entre o primeiro e o terceiro argumentos,
  * onde a opera��o ser� definida pelo segundo argumento.
  * @param argumentos os argumentos que foram passados pela linha de comando para 
  *         esta aplica��o.
  */                                                          
  public static void main(String[] argumentos)
    {      
    // Primeiro, verificamos se exatamente tr�s argumentos foram passados pela linha 
    // de comando, e sa�mos do programa caso contr�rio.
    if (argumentos.length != 3)        
      {
      System.out.println("Este programa precisa que tr�s argumentos sejam passados "+
                         "pela linha de comando.");
      System.exit(1); // sa�mos do programa com o c�digo de execu��o n�mero 1
      }
    // Extra�mos um valor inteiro da string correspondente ao primeiro argumento 
    int primeiroValor = Integer.parseInt(argumentos[0]); 
    // Extra�mos o primeiro caractere da string correspondente ao segundo argumento 
    char operador = argumentos[1].charAt(0);
    // Extra�mos um valor inteiro da string correspondente ao terceiro argumento 
    int segundoValor = Integer.parseInt(argumentos[2]);
    // Dependendo do caractere operador, efetuamos a opera��o
    int resultado = 0; // deve ser inicializada
    switch(operador)
      {
      case '+': resultado = primeiroValor + segundoValor; break;
      case '-': resultado = primeiroValor - segundoValor; break;
      case '*': resultado = primeiroValor * segundoValor; break;
      case '/': resultado = primeiroValor / segundoValor; break;
      }
    // Imprimimos os argumentos passados com espa�os entre eles
    for(int �ndice=0;�ndice<argumentos.length;�ndice++)
      System.out.print(argumentos[�ndice]+" ");
    // Imprimimos o resultado
    System.out.println("= "+resultado);
    } // fim do m�todo main
 
  } // fim da classe CalculadoraDeLinhaDeComando 
