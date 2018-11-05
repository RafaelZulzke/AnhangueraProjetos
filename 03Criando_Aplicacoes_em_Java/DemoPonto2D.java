
/** 
 * A classe DemoPonto2D demonstra usos da classe Ponto2D. Esta classe demonstra,
 * em especial, onde � necess�rio ou n�o o uso do operador new para criar novas 
 * inst�ncias da classe Ponto2D.
 */
class DemoPonto2D // declara��o da classe 
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es
     * de algumas inst�ncias da classe Ponto2D, e demonstra sua cria��o e uso.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Declaramos quatro refer�ncias a inst�ncias da classe Ponto2D, mas n�o
        // criamos as inst�ncias associadas nem as inicializamos ainda.
        Ponto2D p1;           // declaramos somente uma refer�ncia
        Ponto2D p2, p3, p4;     // v�rias refer�ncias podem ser declaradas desta forma
        // Vamos criar duas inst�ncias e associ�-las �s refer�ncias
        p1 = new Ponto2D();
        p2 = new Ponto2D();
        // Vamos inicializar somente uma inst�ncia com valores
        p1.inicializaPonto2D(-1.34, 9.17);
        // Como o m�todo toString existe na classe Ponto2D, podemos imprimir diretamente
        // as inst�ncias
        System.out.println("As coordenadas de P1 s�o " + p1); // imprime (-1.34,9.17)
        // Se a inst�ncia p2 n�o foi inicializada com valores, que valores ela cont�m ?
        System.out.println("As coordenadas de P2 s�o " + p2); // imprime (0.0,0.0)
        // Podemos criar inst�ncias sem usar diretamente o new !
        p3 = p1.clona();   // o m�todo clona retorna uma nova inst�ncia
        p4 = p1.origem();  // o m�todo origem retorna uma nova inst�ncia
        System.out.println("As coordenadas de P3 s�o " + p3); // imprime (-1.34,9.17)
        System.out.println("As coordenadas de P4 s�o " + p4); // imprime (0.0,0.0)
        // Que pontos s�o iguais aos outros ?
        System.out.println("P1 est� na mesma posi��o de P2 ? " + p1.�Igual(p2)); // false
        System.out.println("P1 est� na mesma posi��o de P3 ? " + p1.�Igual(p3)); // true
        System.out.println("P1 est� na mesma posi��o de P4 ? " + p1.�Igual(p4)); // false
        System.out.println("P2 est� na mesma posi��o de P4 ? " + p2.�Igual(p4)); // true
        // Podemos ter inst�ncias sem refer�ncias !
        System.out.println(new Ponto2D()); // imprime (0.0,0.0)
    }  // fim do m�todo main
} // fim da classe DemoPonto2D 
