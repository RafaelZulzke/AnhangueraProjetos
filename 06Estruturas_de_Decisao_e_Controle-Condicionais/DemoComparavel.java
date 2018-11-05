
/** 
 * A classe DemoComparavel demonstra o uso de inst�ncias da classe Comparavel.
 */
class DemoComparavel // declara��o da classe 
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m a declara��o
     * de uma inst�ncia da classe Comparavel, e demonstra seu uso.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma inst�ncia da classe Comparavel que encapsula o valor 123
        Comparavel meuValor = new Comparavel(123);
        // Criamos alguns valores constantes para usar com os m�todos
        double valor1 = 120;
        double valor2 = 122;
        // Executamos os m�todos de compara��o da classe Comparavel - primeiro a igualdade
        if (meuValor.�IgualA(valor1)) {
            System.out.println("Os valores " + meuValor + " e " + valor1 + " s�o iguais.");
        }
        if (meuValor.�IgualA(valor1, valor2)) {
            System.out.println("Os valores " + meuValor + ", " + valor2 + " e " + valor1 +
                    " s�o iguais.");
        }
        // Comparamos para ver se o encapsulado � maior que os passados
        // (somente os comandos associados a estes "if"s ser�o executados)
        if (meuValor.�MaiorQue(valor1)) {
            System.out.println("O valor " + meuValor + " � maior que o valor " + valor1);
        }
        if (meuValor.�MaiorQue(valor1, valor2)) {
            System.out.println("O valor " + meuValor + " � maior que os valores " + valor1 + " e " +
                    valor2);
        }
        // Comparamos para ver se o encapsulado � menor que os passados
        if (meuValor.�MenorQue(valor1)) {
            System.out.println("O valor " + meuValor + " � menor que o valor " + valor1);
        }
        if (meuValor.�MenorQue(valor1, valor2)) {
            System.out.println("O valor " + meuValor + " � menor que os valores " + valor1 + " e " +
                    valor2);
        }
    } // fim do m�todo main
} // fim da classe DemoComparavel  
