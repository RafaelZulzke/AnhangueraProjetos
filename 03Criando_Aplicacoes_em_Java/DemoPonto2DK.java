

/** 
 * A classe DemoPonto2DK demonstra usos da classe Ponto2D, que ser�o 
 * inicializados com valores lidos do teclado.
 */
class DemoPonto2DK // declara��o da classe 
  {
  /**
   * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es 
   * de algumas inst�ncias da classe Ponto2D, e demonstra sua cria��o e uso. Os
   * valores para inicializa��o dos pontos ser�o lidos do teclado.
   * @param argumentos os argumentos que podem ser passados para o m�todo via linha 
   *        de comando, mas que neste caso ser�o ignorados.
   */
  public static void main(String[] argumentos)
    {
    // Declaramos duas refer�ncias a inst�ncias da classe Ponto2D, e criamos as
    // inst�ncias associadas.
    Ponto2D p1 = new Ponto2D();
    Ponto2D p2 = new Ponto2D();
    // Vamos ler dois valores do tipo double do teclado para inicializa��o
    System.out.print("Entre um valor de ponto flutuante (coordenada x):");
    double x = Keyboard.readDouble();
    System.out.print("Entre outro valor de ponto flutuante (coordenada y):");
    double y = Keyboard.readDouble();
    p1.inicializaPonto2D(x,y);
    // Vamos ler diretamente dois valores do tipo double (sem usar vari�veis)
    System.out.print("Entre dois valores de ponto flutuante, pressionando ENTER ");
    System.out.print("ap�s entrar cada um:");
    // Inicializamos a inst�ncia p2 com os valores lidos diretamente.
    p2.inicializaPonto2D(Keyboard.readDouble(),Keyboard.readDouble());
    // Como o m�todo toString existe na classe Ponto2D, podemos imprimir diretamente
    // as inst�ncias 
    System.out.println("As coordenadas de P1 s�o "+p1); // imprime P1
    System.out.println("As coordenadas de P2 s�o "+p2); // imprime P2
    }  // fim do m�todo main

  } // fim da classe DemoPonto2DK
