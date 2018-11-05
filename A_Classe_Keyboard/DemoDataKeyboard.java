/** 
 * A classe DemoDataKeyboard demonstra usos da classe DataKeyboard.
 */
class DemoDataKeyboard // declara��o da classe 
  {
  /**
   * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es 
   * de algumas inst�ncias da classe DataKeyboard, e demonstra como usar o construtor
   * da classe, que ler� seus dados do teclado.
   * @param argumentos os argumentos que podem ser passados para o m�todo via linha 
   *        de comando, mas que neste caso ser�o ignorados.
   */
  public static void main(String[] argumentos)
    {
    // Criamos duas inst�ncias da classe DataKeyboard, usando a palavra-chave new, que
    // far� com que o construtor seja chamado.
    System.out.println("Entre a data de hoje:");
    DataKeyboard hoje = new DataKeyboard();                 
    System.out.println("Entre a data do seu nascimento:");
    DataKeyboard seuNascimento = new DataKeyboard();
    // Vamos imprimir os conte�dos das inst�ncias
    hoje.mostraData();  
    seuNascimento.mostraData();  
    }  // fim do m�todo main

  } // fim da classe DemoDataKeyboard 
