
/**
 * A classe DemoObjetosGeometricosEPolimorfismo demonstra características de 
 * polimorfismo com interfaces e classes que as implementam.
 */
class DemoObjetosGeometricosEPolimorfismo // declaração da classe
{

    /**
     * O método main permite a execução desta classe. Este método contém declarações de
     * referências da interface ObjetoGeometrico, que receberão instâncias das classes
     * Circulo e Retangulo, classes que implementam a interface.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Declaramos algumas referências à interface ObjetoGeometrico
        ObjetoGeometrico o1, o2, o3, o4;
        // Criamos as instâncias das classes Circulo e Retangulo e as associamos às
        // referências à interface ObjetoGeometrico. Note que o cast não é necessário,
        // já que um Circulo (ou Retangulo) é um tipo de ObjetoGeometrico
        o1 = new Circulo(new Ponto2D(0, 0), 20);    // centrado na origem, raio 20
        o2 = new Retangulo(new Ponto2D(-1, -1), // um canto está em (-1,-1)
                new Ponto2D(1, 1));     // e o outro em (1,1)
        o3 = new Circulo(new Ponto2D(-7, 3), 12.3); // centrado em (-7,3), raio 12.3
        o4 = new Retangulo(new Ponto2D(0, 0), // um canto está em (0,0)
                new Ponto2D(1, 1));     // e o outro em (1,1)
        // Vamos ver que referência é instância de que classe
        System.out.println("o1 é um Círculo ? " +
                (o1 instanceof Circulo)); // true
        System.out.println("o1 é um Retângulo ? " +
                (o1 instanceof Retangulo)); // false
        System.out.println("o1 é um ObjetoGeometrico ? " +
                (o1 instanceof ObjetoGeometrico)); // true
        System.out.println("o2 é um Círculo ? " +
                (o2 instanceof Circulo)); // false
        System.out.println("o2 é um Retângulo ? " +
                (o2 instanceof Retangulo)); // true
        System.out.println("o2 é um ObjetoGeometrico ? " +
                (o2 instanceof ObjetoGeometrico)); // true
    } // fim do método main
} // fim da classe DemoObjetosGeometricosEPolimorfismo
