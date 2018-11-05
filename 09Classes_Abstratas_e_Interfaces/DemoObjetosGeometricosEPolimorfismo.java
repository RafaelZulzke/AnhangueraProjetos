
/**
 * A classe DemoObjetosGeometricosEPolimorfismo demonstra caracter�sticas de 
 * polimorfismo com interfaces e classes que as implementam.
 */
class DemoObjetosGeometricosEPolimorfismo // declara��o da classe
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es de
     * refer�ncias da interface ObjetoGeometrico, que receber�o inst�ncias das classes
     * Circulo e Retangulo, classes que implementam a interface.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Declaramos algumas refer�ncias � interface ObjetoGeometrico
        ObjetoGeometrico o1, o2, o3, o4;
        // Criamos as inst�ncias das classes Circulo e Retangulo e as associamos �s
        // refer�ncias � interface ObjetoGeometrico. Note que o cast n�o � necess�rio,
        // j� que um Circulo (ou Retangulo) � um tipo de ObjetoGeometrico
        o1 = new Circulo(new Ponto2D(0, 0), 20);    // centrado na origem, raio 20
        o2 = new Retangulo(new Ponto2D(-1, -1), // um canto est� em (-1,-1)
                new Ponto2D(1, 1));     // e o outro em (1,1)
        o3 = new Circulo(new Ponto2D(-7, 3), 12.3); // centrado em (-7,3), raio 12.3
        o4 = new Retangulo(new Ponto2D(0, 0), // um canto est� em (0,0)
                new Ponto2D(1, 1));     // e o outro em (1,1)
        // Vamos ver que refer�ncia � inst�ncia de que classe
        System.out.println("o1 � um C�rculo ? " +
                (o1 instanceof Circulo)); // true
        System.out.println("o1 � um Ret�ngulo ? " +
                (o1 instanceof Retangulo)); // false
        System.out.println("o1 � um ObjetoGeometrico ? " +
                (o1 instanceof ObjetoGeometrico)); // true
        System.out.println("o2 � um C�rculo ? " +
                (o2 instanceof Circulo)); // false
        System.out.println("o2 � um Ret�ngulo ? " +
                (o2 instanceof Retangulo)); // true
        System.out.println("o2 � um ObjetoGeometrico ? " +
                (o2 instanceof ObjetoGeometrico)); // true
    } // fim do m�todo main
} // fim da classe DemoObjetosGeometricosEPolimorfismo
