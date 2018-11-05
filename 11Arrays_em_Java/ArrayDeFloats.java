
/** 
 * A classe ArrayDeFloats encapsula um array de valores de ponto flutuante, com
 * v�rios m�todos que a tornam mais �til e vers�til do que um array comum.
 */
class ArrayDeFloats // declara��o da classe 
{

    /**
     * Declara��o dos campos da classe
     */
    private float[] array; // o array encapsulado

    /**
     * O construtor para a classe ArrayDeFloats, que recebe um argumento que ser� o
     * n�mero de posi��es (ou valores do tipo float) que a inst�ncia da classe ser�
     * capaz de armazenar.
     * @param n�mero o n�mero de posi��es para valores do tipo float a serem alocadas
     */
    ArrayDeFloats(int n�mero) {
        array = new float[n�mero]; // alocamos mem�ria para o array encapsulado
    }

    /**
     * O m�todo tamanho retorna o tamanho do array encapsulado. Uma vez que o campo que
     * representa o array � declarado como sendo privado, � uma boa id�ia ter uma maneira
     * de acessar o tamanho do array de fora desta classe.
     * @return o n�mero de posi��es para valores do tipo float no array encapsulado
     */
    public int tamanho() {
        return array.length;
    }

    /**
     * O m�todo modifica recebe como argumentos uma posi��o e um valor, modificando no
     * array encapsulado o valor na posi��o especificada. O valor somente ser� modificado
     * se a posi��o for v�lida, isto �, estiver entre zero e o tamanho m�ximo do array
     * menos um. Caso uma posi��o n�o-v�lida seja passada, o m�todo n�o executar� nenhum
     * comando.
     * @param posi��o a posi��o do array que ser� modificada
     * @param valor o valor que ser� armazenado na posi��o especificada
     */
    public void modifica(int posi��o, float valor) {
        if ((posi��o >= 0) && (posi��o < array.length)) {
            array[posi��o] = valor;
        }
    }

    /**
     * O m�todo valor retorna o valor armazenado em uma certa posi��o, que � passada como
     * argumento para o m�todo. O valor armazenado somente ser� retornado se a posi��o
     * for v�lida, isto �, estiver entre zero e o tamanho m�ximo do array menos um. Caso
     * uma posi��o n�o-v�lida seja passada, o m�todo retornar� a constante Float.NaN, que
     * representa um valor de ponto flutuante que n�o � um n�mero. Em exemplos e
     * exerc�cios posteriores veremos maneiras mais elegantes de tratar esses tipos de
     * problema.
     * @param posi��o a posi��o do array cujo valor ser� retornado
     * @return o valor que estava armazenado na posi��o especificada
     */
    public float valor(int posi��o) {
        if ((posi��o >= 0) && (posi��o < array.length)) {
            return array[posi��o];
        } else {
            return Float.NaN;
        }
    }

    /**
     * O m�todo paraArray retorna o array encapsulado como um array de floats. Este
     * m�todo pode ser �til caso seja necess�rio usar o array "desencapsulado", para,
     * por exemplo, pass�-lo como argumento para um m�todo que somente aceita arrays.
     * @return o array encapsulado por esta classe
     */
    public float[] paraArray() {
        return array;
    }

    /**
     * O m�todo menorValor retorna o menor valor presente no array encapsulado. Este
     * m�todo usa um algoritmo simples que considera que no seu primeiro passo o menor
     * valor encontrado � o primeiro valor do array, e varre os valores restantes,
     * modificando o menor valor armazenado se um elemento do array for menor que o
     * armazenado.
     * @return o menor valor presente no array encapsulado
     */
    public float menorValor() {
        float menorAt�Agora = array[0];
        for (int c = 1; c < array.length; c++) {
            if (array[c] < menorAt�Agora) {
                menorAt�Agora = array[c];
            }
        }
        return menorAt�Agora;
    }

    /**
     * O m�todo maiorValor retorna o maior valor presente no array encapsulado. Este
     * m�todo usa um algoritmo simples que considera que no seu primeiro passo o maior
     * valor encontrado � o primeiro valor do array, e varre os valores restantes,
     * modificando o maior valor armazenado se um elemento do array for maior que o
     * armazenado.
     * @return o maior valor presente no array encapsulado
     */
    public float maiorValor() {
        float maiorAt�Agora = array[0];
        for (int c = 1; c < array.length; c++) {
            if (array[c] > maiorAt�Agora) {
                maiorAt�Agora = array[c];
            }
        }
        return maiorAt�Agora;
    }

    /**
     * O m�todo toString retorna os valores do array encapsulado formatados em uma
     * string.
     * @return uma string contendo uma representa��o dos valores do array encapsulado.
     */
    public String toString() {
        String resultado = "O array tem " + array.length + " elementos:\n";
        for (int c = 0; c < array.length; c++) {
            resultado += array[c] + " ";
        }
        return resultado;
    }
} // fim da classe ArrayDeFloats
