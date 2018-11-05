/** 
 * A classe DemoDataKeyboard demonstra usos da classe DataKeyboard.
 */
class DemoDataKeyboard // declaração da classe 
  {
  /**
   * O método main permite a execução desta classe. Este método contém declarações 
   * de algumas instâncias da classe DataKeyboard, e demonstra como usar o construtor
   * da classe, que lerá seus dados do teclado.
   * @param argumentos os argumentos que podem ser passados para o método via linha 
   *        de comando, mas que neste caso serão ignorados.
   */
  public static void main(String[] argumentos)
    {
    // Criamos duas instâncias da classe DataKeyboard, usando a palavra-chave new, que
    // fará com que o construtor seja chamado.
    System.out.println("Entre a data de hoje:");
    DataKeyboard hoje = new DataKeyboard();                 
    System.out.println("Entre a data do seu nascimento:");
    DataKeyboard seuNascimento = new DataKeyboard();
    // Vamos imprimir os conteúdos das instâncias
    hoje.mostraData();  
    seuNascimento.mostraData();  
    }  // fim do método main

  } // fim da classe DemoDataKeyboard 
