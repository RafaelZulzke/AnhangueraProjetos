
/**
 * A classe TrianguloDePascal demonstra como arrays multidimensionais podem ser 
 * irregulares. Esta classe calcula os valores do triângulo de Pascal.
 */
class TrianguloDePascal // declaração da classe
{

    /**
     * O método main permite a execução desta classe. Este método declara e preenche um
     * array triangular (irregular) com os valores do triângulo de Pascal.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Consideramos o número de linhas constante
        int númeroDeLinhas = 10;
        // Declaramos o array bidimensional para conter o triângulo de Pascal, mas só
        // alocamos as linhas do array - as colunas serão alocadas depois, cada uma
        // com um tamanho diferente. Note que a segunda dimensão do array não foi
        // especificada.
        long[][] triânguloDePascal = new long[númeroDeLinhas][];
        // Alocamos cada linha do triângulo separadamente. Cada linha L terá L+2 colunas.
        // Chamamos o operador new para cada linha do triângulo, não para toda a matriz.
        for (int linha = 0; linha < númeroDeLinhas; linha++) {
            triânguloDePascal[linha] = new long[2 + linha];
        }
        // Criamos a primeira linha do triângulo de Pascal usando constantes
        triânguloDePascal[0][0] = 1;
        triânguloDePascal[0][1] = 1;
        // Executamos um laço para cada linha do triângulo (exceto a primeira)
        for (int linha = 1; linha < númeroDeLinhas; linha++) {
            // O primeiro elemento de cada linha do triângulo de Pascal é sempre igual a 1
            triânguloDePascal[linha][0] = 1;
            // Cada elemento entre o primeiro e o penúltimo será calculado como a soma do
            // elemento acima e acima à esquerda
            for (int coluna = 1; coluna < triânguloDePascal[linha].length - 1; coluna++) {
                triânguloDePascal[linha][coluna] = triânguloDePascal[linha - 1][coluna] +
                        triânguloDePascal[linha - 1][coluna - 1];
            }
            // O último elemento de cada linha do triângulo de Pascal é sempre igual a 1
            triânguloDePascal[linha][triânguloDePascal[linha].length - 1] = 1;
        }
        // Imprimimos o triângulo de Pascal, usando um laço para as linhas...
        for (int linha = 0; linha < númeroDeLinhas; linha++) {
            // ... e um para as colunas, que será diferente para cada linha
            for (int coluna = 0; coluna < triânguloDePascal[linha].length; coluna++) {
                System.out.print(triânguloDePascal[linha][coluna] + " ");
            }
            System.out.println(); // quebra de linhas após cada linha do triângulo
        }
    } // fim do método main
} // fim da classe TrianguloDePascal
