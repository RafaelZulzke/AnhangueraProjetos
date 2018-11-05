

/** 
 * A classe DemoPonto2DK demonstra usos da classe Ponto2D, que serão 
 * inicializados com valores lidos do teclado.
 */
class DemoPonto2DK // declaração da classe 
  {
  /**
   * O método main permite a execução desta classe. Este método contém declarações 
   * de algumas instâncias da classe Ponto2D, e demonstra sua criação e uso. Os
   * valores para inicialização dos pontos serão lidos do teclado.
   * @param argumentos os argumentos que podem ser passados para o método via linha 
   *        de comando, mas que neste caso serão ignorados.
   */
  public static void main(String[] argumentos)
    {
    // Declaramos duas referências a instâncias da classe Ponto2D, e criamos as
    // instâncias associadas.
    Ponto2D p1 = new Ponto2D();
    Ponto2D p2 = new Ponto2D();
    // Vamos ler dois valores do tipo double do teclado para inicialização
    System.out.print("Entre um valor de ponto flutuante (coordenada x):");
    double x = Keyboard.readDouble();
    System.out.print("Entre outro valor de ponto flutuante (coordenada y):");
    double y = Keyboard.readDouble();
    p1.inicializaPonto2D(x,y);
    // Vamos ler diretamente dois valores do tipo double (sem usar variáveis)
    System.out.print("Entre dois valores de ponto flutuante, pressionando ENTER ");
    System.out.print("após entrar cada um:");
    // Inicializamos a instância p2 com os valores lidos diretamente.
    p2.inicializaPonto2D(Keyboard.readDouble(),Keyboard.readDouble());
    // Como o método toString existe na classe Ponto2D, podemos imprimir diretamente
    // as instâncias 
    System.out.println("As coordenadas de P1 são "+p1); // imprime P1
    System.out.println("As coordenadas de P2 são "+p2); // imprime P2
    }  // fim do método main

  } // fim da classe DemoPonto2DK
