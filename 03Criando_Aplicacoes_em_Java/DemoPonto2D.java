
/** 
 * A classe DemoPonto2D demonstra usos da classe Ponto2D. Esta classe demonstra,
 * em especial, onde é necessário ou não o uso do operador new para criar novas 
 * instâncias da classe Ponto2D.
 */
class DemoPonto2D // declaração da classe 
{

    /**
     * O método main permite a execução desta classe. Este método contém declarações
     * de algumas instâncias da classe Ponto2D, e demonstra sua criação e uso.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Declaramos quatro referências a instâncias da classe Ponto2D, mas não
        // criamos as instâncias associadas nem as inicializamos ainda.
        Ponto2D p1;           // declaramos somente uma referência
        Ponto2D p2, p3, p4;     // várias referências podem ser declaradas desta forma
        // Vamos criar duas instâncias e associá-las às referências
        p1 = new Ponto2D();
        p2 = new Ponto2D();
        // Vamos inicializar somente uma instância com valores
        p1.inicializaPonto2D(-1.34, 9.17);
        // Como o método toString existe na classe Ponto2D, podemos imprimir diretamente
        // as instâncias
        System.out.println("As coordenadas de P1 são " + p1); // imprime (-1.34,9.17)
        // Se a instância p2 não foi inicializada com valores, que valores ela contém ?
        System.out.println("As coordenadas de P2 são " + p2); // imprime (0.0,0.0)
        // Podemos criar instâncias sem usar diretamente o new !
        p3 = p1.clona();   // o método clona retorna uma nova instância
        p4 = p1.origem();  // o método origem retorna uma nova instância
        System.out.println("As coordenadas de P3 são " + p3); // imprime (-1.34,9.17)
        System.out.println("As coordenadas de P4 são " + p4); // imprime (0.0,0.0)
        // Que pontos são iguais aos outros ?
        System.out.println("P1 está na mesma posição de P2 ? " + p1.éIgual(p2)); // false
        System.out.println("P1 está na mesma posição de P3 ? " + p1.éIgual(p3)); // true
        System.out.println("P1 está na mesma posição de P4 ? " + p1.éIgual(p4)); // false
        System.out.println("P2 está na mesma posição de P4 ? " + p2.éIgual(p4)); // true
        // Podemos ter instâncias sem referências !
        System.out.println(new Ponto2D()); // imprime (0.0,0.0)
    }  // fim do método main
} // fim da classe DemoPonto2D 
