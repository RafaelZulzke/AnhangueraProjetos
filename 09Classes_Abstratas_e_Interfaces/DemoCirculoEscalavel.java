
/**
 * A classe DemoCirculoEscalavel demonstra o uso dos métodos da classe 
 * CirculoEscalavel e sua relação com as interfaces ObjetoGeometrico e Escalavel.
 */
class DemoCirculoEscalavel // declaração da classe
{

    /**
     * O método main permite a execução desta classe. Este método contém declarações de
     * uma instância da classe CirculoEscalavel e usa seus métodos.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Declaramos e alocamos uma instância da classe CirculoEscalavel
        CirculoEscalavel ce =
                new CirculoEscalavel(new Ponto2D(10, 10), 30);
        // Imprimimos a posição original do círculo escalável
        System.out.println(ce); // chamada implícita ao método toString
        // Modificamos a escala do círculo
        ce.amplia(3);
        // Imprimimos novamente os dados do círculo
        System.out.println(ce);
        // Modificamos a posição do círculo (espelhando)
        ce.espelha();
        // Imprimimos novamente os dados do círculo
        System.out.println(ce);
        // É uma instância da classe CirculoEscalavel ?
        System.out.println(ce instanceof CirculoEscalavel); // true
        // É uma instância da interface ObjetoGeometrico ?
        System.out.println(ce instanceof ObjetoGeometrico); // true
        // É uma instância da interface Escalavel ?
        System.out.println(ce instanceof Escalavel);        // true
    } // fim do método main
} // fim da classe DemoCirculoEscalavel
