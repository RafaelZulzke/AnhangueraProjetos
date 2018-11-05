
/**
 * A classe TrianguloDePascal demonstra como arrays multidimensionais podem ser 
 * irregulares. Esta classe calcula os valores do tri�ngulo de Pascal.
 */
class TrianguloDePascal // declara��o da classe
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo declara e preenche um
     * array triangular (irregular) com os valores do tri�ngulo de Pascal.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Consideramos o n�mero de linhas constante
        int n�meroDeLinhas = 10;
        // Declaramos o array bidimensional para conter o tri�ngulo de Pascal, mas s�
        // alocamos as linhas do array - as colunas ser�o alocadas depois, cada uma
        // com um tamanho diferente. Note que a segunda dimens�o do array n�o foi
        // especificada.
        long[][] tri�nguloDePascal = new long[n�meroDeLinhas][];
        // Alocamos cada linha do tri�ngulo separadamente. Cada linha L ter� L+2 colunas.
        // Chamamos o operador new para cada linha do tri�ngulo, n�o para toda a matriz.
        for (int linha = 0; linha < n�meroDeLinhas; linha++) {
            tri�nguloDePascal[linha] = new long[2 + linha];
        }
        // Criamos a primeira linha do tri�ngulo de Pascal usando constantes
        tri�nguloDePascal[0][0] = 1;
        tri�nguloDePascal[0][1] = 1;
        // Executamos um la�o para cada linha do tri�ngulo (exceto a primeira)
        for (int linha = 1; linha < n�meroDeLinhas; linha++) {
            // O primeiro elemento de cada linha do tri�ngulo de Pascal � sempre igual a 1
            tri�nguloDePascal[linha][0] = 1;
            // Cada elemento entre o primeiro e o pen�ltimo ser� calculado como a soma do
            // elemento acima e acima � esquerda
            for (int coluna = 1; coluna < tri�nguloDePascal[linha].length - 1; coluna++) {
                tri�nguloDePascal[linha][coluna] = tri�nguloDePascal[linha - 1][coluna] +
                        tri�nguloDePascal[linha - 1][coluna - 1];
            }
            // O �ltimo elemento de cada linha do tri�ngulo de Pascal � sempre igual a 1
            tri�nguloDePascal[linha][tri�nguloDePascal[linha].length - 1] = 1;
        }
        // Imprimimos o tri�ngulo de Pascal, usando um la�o para as linhas...
        for (int linha = 0; linha < n�meroDeLinhas; linha++) {
            // ... e um para as colunas, que ser� diferente para cada linha
            for (int coluna = 0; coluna < tri�nguloDePascal[linha].length; coluna++) {
                System.out.print(tri�nguloDePascal[linha][coluna] + " ");
            }
            System.out.println(); // quebra de linhas ap�s cada linha do tri�ngulo
        }
    } // fim do m�todo main
} // fim da classe TrianguloDePascal
