
/** 
 * A classe DemoArrayDeObjetosGeometricos demonstra o uso de inst�ncias da classe 
 * ArrayDeObjetosGeometricos.
 */
class DemoArrayDeObjetosGeometricos {

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es de
     * uma inst�ncia da classe ArrayDeObjetosGeometricos, e demonstra chamada de seus
     * m�todos.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Declara e inicializa a inst�ncia da classe: um array de objetos geom�tricos com
        // capacidade para armazenar oito objetos
        ArrayDeObjetosGeometricos adog =
                new ArrayDeObjetosGeometricos(8);
        // Criamos algumas inst�ncias com refer�ncias de classes que implementam a
        // interface ObjetosGeometricos
        Circulo c1 = new Circulo(new Ponto2D(0, 0), 25.0); // centrado na origem, raio 25
        Circulo c2 = new Circulo(new Ponto2D(-9, -3), 0.1); // centrado em (-9,-3), raio 0.1
        Retangulo r1 = new Retangulo(new Ponto2D(-1, -1), // um canto est� em (-1,-1)
                new Ponto2D(1, 1));  // e o outro em (1,1)
        Retangulo r2 = new Retangulo(new Ponto2D(0, 0), // um canto est� em (0,0)
                new Ponto2D(0, 0)); // e o outro tamb�m !
        // Adicionamos estas inst�ncias � inst�ncia da classe ArrayDeObjetosGeometricos
        adog.modifica(0, c1);
        adog.modifica(1, c2);
        adog.modifica(3, r1);
        adog.modifica(120, r2); // este n�o dever� ser adicionado
        // imprimimos uma string que representa o array encapsulado.
        System.out.println(adog);
        // Imprimimos os objetos em determinadas posi��es do array encapsulado - alguns
        // n�o est�o em posi��es v�lidas
        System.out.println(
                "Na posi��o  0:" + adog.qualObjeto(0));
        System.out.println(
                "Na posi��o  3:" + adog.qualObjeto(3));
        System.out.println(
                "Na posi��o  6:" + adog.qualObjeto(6));
        System.out.println(
                "Na posi��o 99:" + adog.qualObjeto(99));
        // Qual � a origem do objeto na posi��o 1 ?
        System.out.println(
                "Centro do objeto na posi��o 1 � " +
                adog.qualObjeto(1).centro());
        // Qual � a �rea do objeto na posi��o 3 ?
        System.out.println("�rea do objeto na posi��o 3 � " +
                adog.qualObjeto(3).calcula�rea());
        // Qual � o per�metro do objeto na posi��o 123 ? Como tal �ndice n�o existe, o
        // m�todo qualObjeto retornar� null, e a m�quina virtual Java mostrar� um erro
        // em tempo de execu��o ao executar a linha a seguir (n�o podemos executar
        // m�todos usando null como refer�ncia !)
        System.out.println(
                "Per�metro do objeto na posi��o 123 � " +
                adog.qualObjeto(123).calculaPer�metro());
    } // fim do m�todo main
} // fim da classe DemoArrayDeObjetosGeometricos
