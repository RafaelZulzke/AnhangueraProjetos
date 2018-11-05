
/** 
 * A classe MatrizDeDoubles encapsula uma matriz bidimensional (matriz) de 
 * valores do tipo double. 
 */
class MatrizDeDoubles // declaração da classe 
{

    /**
     * Declaração dos campos da classe
     */
    private int colunas; // o número de colunas da matriz
    private int linhas;  // o número de linhas da matriz
    double[][] matriz; // o array bidimensional (matriz) encapsulado

    /**
     * O construtor da classe MatrizDeDoubles, que receberá as dimensões da matriz como
     * argumentos, alocará a matriz e inicializará os valores da matriz para zero.
     * @param colunas O número de colunas na matriz
     * @param linhas O número de linhas na matriz
     */
    MatrizDeDoubles(int colunas, int linhas) {
        // Inicializa as variáveis locais da classe com as passadas como argumentos
        this.colunas = colunas;
        this.linhas = linhas;
        // Aloca memória para a matriz
        matriz = new double[linhas][colunas];
        // Preenche a matriz com zeros
        preencheMatriz(0);
    } // fim do construtor

    /**
     * O método preencheMatriz, que preenche a matriz encapsulada pela classe com um
     * valor passado como argumento.
     * @param valor o valor a ser usado para preencher a matriz.
     */
    public void preencheMatriz(double valor) {
        // Cada elemento da matriz...
        for (int lin = 0; lin < linhas; lin++) {
            for (int col = 0; col < colunas; col++) {
                matriz[lin][col] = valor; // ... receberá o valor constante
            }
        }
    } // fim do método preencheMatriz

    /**
     * O método maiorValor retorna o maior elemento presente na matriz encapsulada. Este
     * método usa um algoritmo simples que considera que no seu primeiro passo o maior
     * valor encontrado é o primeiro valor do array, e varre os valores restantes,
     * modificando o maior valor armazenado se um elemento do array for maior que o
     * armazenado.
     * @return o maior elemento da matriz
     */
    public double maiorValor() {
        // Considera o primeiro valor como maior até agora
        double maiorAtéAgora = matriz[0][0];
        // Para cada elemento da matriz...
        for (int lin = 0; lin < linhas; lin++) {
            for (int col = 0; col < colunas; col++) {
                if (matriz[lin][col] > maiorAtéAgora) // se for maior que o maior até agora
                {
                    maiorAtéAgora = matriz[lin][col];   // armazena o novo maior valor
                }
            }
        }
        return maiorAtéAgora;
    } // fim do método maior

    public String toString() {
        String resultado = matriz.length * matriz[0].length + " elementos";
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado += "\n" + matriz[i][j];
            }
        }
        return resultado;
    }


} // fim da classe MatrizDeDoubles
