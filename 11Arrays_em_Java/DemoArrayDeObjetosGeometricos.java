
/** 
 * A classe DemoArrayDeObjetosGeometricos demonstra o uso de instâncias da classe 
 * ArrayDeObjetosGeometricos.
 */
class DemoArrayDeObjetosGeometricos {

    /**
     * O método main permite a execução desta classe. Este método contém declarações de
     * uma instância da classe ArrayDeObjetosGeometricos, e demonstra chamada de seus
     * métodos.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Declara e inicializa a instância da classe: um array de objetos geométricos com
        // capacidade para armazenar oito objetos
        ArrayDeObjetosGeometricos adog =
                new ArrayDeObjetosGeometricos(8);
        // Criamos algumas instâncias com referências de classes que implementam a
        // interface ObjetosGeometricos
        Circulo c1 = new Circulo(new Ponto2D(0, 0), 25.0); // centrado na origem, raio 25
        Circulo c2 = new Circulo(new Ponto2D(-9, -3), 0.1); // centrado em (-9,-3), raio 0.1
        Retangulo r1 = new Retangulo(new Ponto2D(-1, -1), // um canto está em (-1,-1)
                new Ponto2D(1, 1));  // e o outro em (1,1)
        Retangulo r2 = new Retangulo(new Ponto2D(0, 0), // um canto está em (0,0)
                new Ponto2D(0, 0)); // e o outro também !
        // Adicionamos estas instâncias à instância da classe ArrayDeObjetosGeometricos
        adog.modifica(0, c1);
        adog.modifica(1, c2);
        adog.modifica(3, r1);
        adog.modifica(120, r2); // este não deverá ser adicionado
        // imprimimos uma string que representa o array encapsulado.
        System.out.println(adog);
        // Imprimimos os objetos em determinadas posições do array encapsulado - alguns
        // não estão em posições válidas
        System.out.println(
                "Na posição  0:" + adog.qualObjeto(0));
        System.out.println(
                "Na posição  3:" + adog.qualObjeto(3));
        System.out.println(
                "Na posição  6:" + adog.qualObjeto(6));
        System.out.println(
                "Na posição 99:" + adog.qualObjeto(99));
        // Qual é a origem do objeto na posição 1 ?
        System.out.println(
                "Centro do objeto na posição 1 é " +
                adog.qualObjeto(1).centro());
        // Qual é a área do objeto na posição 3 ?
        System.out.println("Área do objeto na posição 3 é " +
                adog.qualObjeto(3).calculaÁrea());
        // Qual é o perímetro do objeto na posição 123 ? Como tal índice não existe, o
        // método qualObjeto retornará null, e a máquina virtual Java mostrará um erro
        // em tempo de execução ao executar a linha a seguir (não podemos executar
        // métodos usando null como referência !)
        System.out.println(
                "Perímetro do objeto na posição 123 é " +
                adog.qualObjeto(123).calculaPerímetro());
    } // fim do método main
} // fim da classe DemoArrayDeObjetosGeometricos
