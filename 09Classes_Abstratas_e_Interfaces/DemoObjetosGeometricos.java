
/**
 * A classe DemoObjetosGeometricos demonstra inst�ncias de classes que 
 * implementam a interface ObjetoGeometrico.
 */
class DemoObjetosGeometricos // declara��o da classe
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es de
     * inst�ncias das classes Circulo e Retangulo, duas classes que implementam a
     * interface ObjetoGeometrico.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Declaramos algumas inst�ncias das classes Circulo e Retangulo
        Circulo c1 = new Circulo(new Ponto2D(0, 0), 100); // centrado na origem, raio 100
        Circulo c2 = new Circulo(new Ponto2D(-1, -1), 1); // centrado em (-1,-1), raio 1
        Circulo c3 = new Circulo(new Ponto2D(10, 8), 0); // centrado em (10,8), raio 0 (!)
        Retangulo r1 = new Retangulo(new Ponto2D(-2, -2), // um canto est� em (-2,-2)
                new Ponto2D(2, 2));  // e o outro em (2,2)
        Retangulo r2 = new Retangulo(new Ponto2D(-100, -1), // um canto est� em (-100,1)
                new Ponto2D(100, 1));  // e o outro em (100,1)
        Retangulo r3 = new Retangulo(new Ponto2D(0, 0), // um canto est� em (0,0)
                new Ponto2D(0, 0)); // e o outro tamb�m !
        // Vamos imprimir os dados completos de cada um destes objetos geom�tricos
        imprimeTodosOsDados(c1);
        imprimeTodosOsDados(c2);
        imprimeTodosOsDados(c3);
        imprimeTodosOsDados(r1);
        imprimeTodosOsDados(r2);
        imprimeTodosOsDados(r3);
    } // fim do m�todo main

    /**
     * O m�todo imprimeTodosOsDados imprime todos os dados de uma inst�ncia de uma
     * classe que implemente a interface ObjetoGeometrico.
     * @param og uma inst�ncia de qualquer classe que implemente a interface
     *           ObjetoGeometrico.
     */
    private static void imprimeTodosOsDados(ObjetoGeometrico og) {
        // Primeiro, imprime os dados padr�o do objeto - podemos fazer isto diretamente
        // atrav�s da chamada impl�cita ao m�todo toString
        System.out.println(og);
        // Podemos imprimir a sua �rea e per�metro com chamadas diretas aos m�todos das
        // classes
        System.out.println("Per�metro:" + og.calculaPer�metro());
        System.out.println("�rea:" + og.calcula�rea());
        // Imprimimos uma linha em branco para melhor visualiza��o dos resultados
        System.out.println();
    } // fim do m�todo imprimeTodosOsDados   
} // fim da classe DemoObjetosGeometricos
