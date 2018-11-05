
/** 
 * A classe CalculoPiQuadradoSobre6 calcula o valor de pi quadrado sobre seis,
 * usando uma a s�rie matem�tica e um array.
 */
class CalculoPiQuadradoSobre6 {

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo declara e inicializa
     * um array de valores de ponto flutuante, e calcula a somat�ria de seus elementos
     * usando um m�todo est�tico como sub-rotina.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Consideramos que 1000000 itera��es ser�o calculadas.
        int itera��es = 1000000;
        // Declaramos um array de valores de ponto flutuante com o tamanho adequado.
        // A cada elemento do array corresponder� um termo da s�rie a ser calculada.
        double[] termosDaS�rie = new double[itera��es];
        // Calculamos o valor de cada termo da s�rie usando um la�o, e armazenamos o
        // valor do termo da s�rie no elemento correspondente do array
        for (int c = 0; c < termosDaS�rie.length; c++) {
            double denominador = c + 1;
            termosDaS�rie[c] = 1 / (denominador * denominador);
        }
        // Com os termos calculados, vamos ver o resultado da somat�ria da s�rie
        // com diferentes quantidades de termos. Para compara��o, o valor de pi
        // ao quadrado sobre seis, calculado com uma calculadora, � 1.64493406684823
        calculaEMostraSomat�ria(termosDaS�rie, 10);               // 1.5497677311665408
        calculaEMostraSomat�ria(termosDaS�rie, 100);              // 1.6349839001848923
        calculaEMostraSomat�ria(termosDaS�rie, 1000);             // 1.6439345666815615
        calculaEMostraSomat�ria(termosDaS�rie, 10000);            // 1.6448340718480652
        calculaEMostraSomat�ria(termosDaS�rie, 100000);           // 1.6449240668982423
        calculaEMostraSomat�ria(termosDaS�rie, 1000000);          // 1.64493306684877
    }

    /**
     * O m�todo calculaEMostraSomat�ria calcula e mostra a somat�ria de um array de
     * valores de ponto flutuante passado como argumento, usando um �ndice m�ximo tamb�m
     * passado como argumento.
     */
    private static void calculaEMostraSomat�ria(
            double[] array, int �ndiceM�ximo) {
        double somat�ria = 0;
        for (int �ndice = 0; �ndice < �ndiceM�ximo; �ndice++) {
            somat�ria += array[�ndice];
        }
        System.out.println("�ndice M�ximo:" +
                �ndiceM�ximo + " Somat�ria:" + somat�ria);
    }
} // fim da classe CalculoPiQuadradoSobre6
