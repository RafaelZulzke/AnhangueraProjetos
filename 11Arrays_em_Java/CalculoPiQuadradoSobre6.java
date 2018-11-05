
/** 
 * A classe CalculoPiQuadradoSobre6 calcula o valor de pi quadrado sobre seis,
 * usando uma a série matemática e um array.
 */
class CalculoPiQuadradoSobre6 {

    /**
     * O método main permite a execução desta classe. Este método declara e inicializa
     * um array de valores de ponto flutuante, e calcula a somatória de seus elementos
     * usando um método estático como sub-rotina.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Consideramos que 1000000 iterações serão calculadas.
        int iterações = 1000000;
        // Declaramos um array de valores de ponto flutuante com o tamanho adequado.
        // A cada elemento do array corresponderá um termo da série a ser calculada.
        double[] termosDaSérie = new double[iterações];
        // Calculamos o valor de cada termo da série usando um laço, e armazenamos o
        // valor do termo da série no elemento correspondente do array
        for (int c = 0; c < termosDaSérie.length; c++) {
            double denominador = c + 1;
            termosDaSérie[c] = 1 / (denominador * denominador);
        }
        // Com os termos calculados, vamos ver o resultado da somatória da série
        // com diferentes quantidades de termos. Para comparação, o valor de pi
        // ao quadrado sobre seis, calculado com uma calculadora, é 1.64493406684823
        calculaEMostraSomatória(termosDaSérie, 10);               // 1.5497677311665408
        calculaEMostraSomatória(termosDaSérie, 100);              // 1.6349839001848923
        calculaEMostraSomatória(termosDaSérie, 1000);             // 1.6439345666815615
        calculaEMostraSomatória(termosDaSérie, 10000);            // 1.6448340718480652
        calculaEMostraSomatória(termosDaSérie, 100000);           // 1.6449240668982423
        calculaEMostraSomatória(termosDaSérie, 1000000);          // 1.64493306684877
    }

    /**
     * O método calculaEMostraSomatória calcula e mostra a somatória de um array de
     * valores de ponto flutuante passado como argumento, usando um índice máximo também
     * passado como argumento.
     */
    private static void calculaEMostraSomatória(
            double[] array, int índiceMáximo) {
        double somatória = 0;
        for (int índice = 0; índice < índiceMáximo; índice++) {
            somatória += array[índice];
        }
        System.out.println("Índice Máximo:" +
                índiceMáximo + " Somatória:" + somatória);
    }
} // fim da classe CalculoPiQuadradoSobre6
