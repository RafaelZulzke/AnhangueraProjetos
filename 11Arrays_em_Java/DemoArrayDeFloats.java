
/** 
 * A classe DemoArrayDeFloats demonstra o uso de instâncias da classe 
 * ArrayDeFloats.
 */
class DemoArrayDeFloats {

    /**
     * O método main permite a execução desta classe. Este método contém declarações de
     * uma instância da classe ArrayDeFloats, e demonstra chamada de seus métodos.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Declara e inicializa a instância da classe
        ArrayDeFloats af = new ArrayDeFloats(25);
        // Vamos preencher o array com valores obtidos com cálculos simples e um laço.
        for (int i = -3; i < 40; i++) // os valores do laço não correspondem diretamente
        {
            af.modifica(i, (float) 1. / i); // aos índices aceitáveis para o array encapsulado,
        }                                  // porém somente os índices com valores entre 0 e 24
        // serão realmente usados.
        System.out.println(af); // imprimimos uma string contendo array encapsulado.
        // Imprimimos o maior e o menor valor do array encapsulado
        System.out.println("Maior valor:" + af.maiorValor());
        System.out.println("Menor valor:" + af.menorValor());
        // Imprimimos os valores em determinadas posições do array encapsulado
        System.out.println("Na posição  0:" + af.valor(0));
        System.out.println("Na posição 24:" + af.valor(24));
        System.out.println("Na posição 25:" + af.valor(25));
        // Imprimimos os valores em determinadas posições do array encapsulado, mas usando
        // a representação desencapsulada
        float[] cópia = af.paraArray();
        System.out.println("Na posição  0:" + cópia[0]); // indiretamente
        System.out.println("Na posição  0:" + af.paraArray()[0]); // diretamente
    }
} // fim da classe DemoArrayDeFloats
