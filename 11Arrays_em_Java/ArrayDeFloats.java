
/** 
 * A classe ArrayDeFloats encapsula um array de valores de ponto flutuante, com
 * vários métodos que a tornam mais útil e versátil do que um array comum.
 */
class ArrayDeFloats // declaração da classe 
{

    /**
     * Declaração dos campos da classe
     */
    private float[] array; // o array encapsulado

    /**
     * O construtor para a classe ArrayDeFloats, que recebe um argumento que será o
     * número de posições (ou valores do tipo float) que a instância da classe será
     * capaz de armazenar.
     * @param número o número de posições para valores do tipo float a serem alocadas
     */
    ArrayDeFloats(int número) {
        array = new float[número]; // alocamos memória para o array encapsulado
    }

    /**
     * O método tamanho retorna o tamanho do array encapsulado. Uma vez que o campo que
     * representa o array é declarado como sendo privado, é uma boa idéia ter uma maneira
     * de acessar o tamanho do array de fora desta classe.
     * @return o número de posições para valores do tipo float no array encapsulado
     */
    public int tamanho() {
        return array.length;
    }

    /**
     * O método modifica recebe como argumentos uma posição e um valor, modificando no
     * array encapsulado o valor na posição especificada. O valor somente será modificado
     * se a posição for válida, isto é, estiver entre zero e o tamanho máximo do array
     * menos um. Caso uma posição não-válida seja passada, o método não executará nenhum
     * comando.
     * @param posição a posição do array que será modificada
     * @param valor o valor que será armazenado na posição especificada
     */
    public void modifica(int posição, float valor) {
        if ((posição >= 0) && (posição < array.length)) {
            array[posição] = valor;
        }
    }

    /**
     * O método valor retorna o valor armazenado em uma certa posição, que é passada como
     * argumento para o método. O valor armazenado somente será retornado se a posição
     * for válida, isto é, estiver entre zero e o tamanho máximo do array menos um. Caso
     * uma posição não-válida seja passada, o método retornará a constante Float.NaN, que
     * representa um valor de ponto flutuante que não é um número. Em exemplos e
     * exercícios posteriores veremos maneiras mais elegantes de tratar esses tipos de
     * problema.
     * @param posição a posição do array cujo valor será retornado
     * @return o valor que estava armazenado na posição especificada
     */
    public float valor(int posição) {
        if ((posição >= 0) && (posição < array.length)) {
            return array[posição];
        } else {
            return Float.NaN;
        }
    }

    /**
     * O método paraArray retorna o array encapsulado como um array de floats. Este
     * método pode ser útil caso seja necessário usar o array "desencapsulado", para,
     * por exemplo, passá-lo como argumento para um método que somente aceita arrays.
     * @return o array encapsulado por esta classe
     */
    public float[] paraArray() {
        return array;
    }

    /**
     * O método menorValor retorna o menor valor presente no array encapsulado. Este
     * método usa um algoritmo simples que considera que no seu primeiro passo o menor
     * valor encontrado é o primeiro valor do array, e varre os valores restantes,
     * modificando o menor valor armazenado se um elemento do array for menor que o
     * armazenado.
     * @return o menor valor presente no array encapsulado
     */
    public float menorValor() {
        float menorAtéAgora = array[0];
        for (int c = 1; c < array.length; c++) {
            if (array[c] < menorAtéAgora) {
                menorAtéAgora = array[c];
            }
        }
        return menorAtéAgora;
    }

    /**
     * O método maiorValor retorna o maior valor presente no array encapsulado. Este
     * método usa um algoritmo simples que considera que no seu primeiro passo o maior
     * valor encontrado é o primeiro valor do array, e varre os valores restantes,
     * modificando o maior valor armazenado se um elemento do array for maior que o
     * armazenado.
     * @return o maior valor presente no array encapsulado
     */
    public float maiorValor() {
        float maiorAtéAgora = array[0];
        for (int c = 1; c < array.length; c++) {
            if (array[c] > maiorAtéAgora) {
                maiorAtéAgora = array[c];
            }
        }
        return maiorAtéAgora;
    }

    /**
     * O método toString retorna os valores do array encapsulado formatados em uma
     * string.
     * @return uma string contendo uma representação dos valores do array encapsulado.
     */
    public String toString() {
        String resultado = "O array tem " + array.length + " elementos:\n";
        for (int c = 0; c < array.length; c++) {
            resultado += array[c] + " ";
        }
        return resultado;
    }
} // fim da classe ArrayDeFloats
