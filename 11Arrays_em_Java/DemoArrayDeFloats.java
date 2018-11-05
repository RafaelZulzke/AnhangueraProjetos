
/** 
 * A classe DemoArrayDeFloats demonstra o uso de inst�ncias da classe 
 * ArrayDeFloats.
 */
class DemoArrayDeFloats {

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es de
     * uma inst�ncia da classe ArrayDeFloats, e demonstra chamada de seus m�todos.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Declara e inicializa a inst�ncia da classe
        ArrayDeFloats af = new ArrayDeFloats(25);
        // Vamos preencher o array com valores obtidos com c�lculos simples e um la�o.
        for (int i = -3; i < 40; i++) // os valores do la�o n�o correspondem diretamente
        {
            af.modifica(i, (float) 1. / i); // aos �ndices aceit�veis para o array encapsulado,
        }                                  // por�m somente os �ndices com valores entre 0 e 24
        // ser�o realmente usados.
        System.out.println(af); // imprimimos uma string contendo array encapsulado.
        // Imprimimos o maior e o menor valor do array encapsulado
        System.out.println("Maior valor:" + af.maiorValor());
        System.out.println("Menor valor:" + af.menorValor());
        // Imprimimos os valores em determinadas posi��es do array encapsulado
        System.out.println("Na posi��o  0:" + af.valor(0));
        System.out.println("Na posi��o 24:" + af.valor(24));
        System.out.println("Na posi��o 25:" + af.valor(25));
        // Imprimimos os valores em determinadas posi��es do array encapsulado, mas usando
        // a representa��o desencapsulada
        float[] c�pia = af.paraArray();
        System.out.println("Na posi��o  0:" + c�pia[0]); // indiretamente
        System.out.println("Na posi��o  0:" + af.paraArray()[0]); // diretamente
    }
} // fim da classe DemoArrayDeFloats
