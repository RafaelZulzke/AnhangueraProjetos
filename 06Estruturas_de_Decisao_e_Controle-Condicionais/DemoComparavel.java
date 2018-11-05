
/** 
 * A classe DemoComparavel demonstra o uso de instâncias da classe Comparavel.
 */
class DemoComparavel // declaração da classe 
{

    /**
     * O método main permite a execução desta classe. Este método contém a declaração
     * de uma instância da classe Comparavel, e demonstra seu uso.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma instância da classe Comparavel que encapsula o valor 123
        Comparavel meuValor = new Comparavel(123);
        // Criamos alguns valores constantes para usar com os métodos
        double valor1 = 120;
        double valor2 = 122;
        // Executamos os métodos de comparação da classe Comparavel - primeiro a igualdade
        if (meuValor.éIgualA(valor1)) {
            System.out.println("Os valores " + meuValor + " e " + valor1 + " são iguais.");
        }
        if (meuValor.éIgualA(valor1, valor2)) {
            System.out.println("Os valores " + meuValor + ", " + valor2 + " e " + valor1 +
                    " são iguais.");
        }
        // Comparamos para ver se o encapsulado é maior que os passados
        // (somente os comandos associados a estes "if"s serão executados)
        if (meuValor.éMaiorQue(valor1)) {
            System.out.println("O valor " + meuValor + " é maior que o valor " + valor1);
        }
        if (meuValor.éMaiorQue(valor1, valor2)) {
            System.out.println("O valor " + meuValor + " é maior que os valores " + valor1 + " e " +
                    valor2);
        }
        // Comparamos para ver se o encapsulado é menor que os passados
        if (meuValor.éMenorQue(valor1)) {
            System.out.println("O valor " + meuValor + " é menor que o valor " + valor1);
        }
        if (meuValor.éMenorQue(valor1, valor2)) {
            System.out.println("O valor " + meuValor + " é menor que os valores " + valor1 + " e " +
                    valor2);
        }
    } // fim do método main
} // fim da classe DemoComparavel  
