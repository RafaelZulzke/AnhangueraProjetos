
/** 
 * A classe ArrayDeObjetosGeometricos encapsula um array de instâncias de qualquer
 * classe que implemente a interface ObjetosGeometricos.
 */
class ArrayDeObjetosGeometricos // declaração da classe 
{

    /**
     * Declaração dos campos da classe
     */
    private ObjetoGeometrico[] array; // o array encapsulado

    /**
     * O construtor para a classe ArrayDeObjetosGeometricos, que recebe um argumento
     * que será o número de posições que a instância da classe será capaz de armazenar.
     * @param número o número de posições para armazenamento de instâncias de classes
     *        que implementem a interface ObjetoGeometrico
     */
    ArrayDeObjetosGeometricos(int número) {
        array = new ObjetoGeometrico[número]; // alocamos memória para o array encapsulado
    // Sabemos que cada uma das posições do array apontará para null, então não 
    // precisamos inicializar o array.
    }

    /**
     * O método tamanho retorna o tamanho do array encapsulado. Uma vez que o campo que
     * representa o array é declarado como sendo privado, é útil ter uma maneira de
     * acessar o tamanho do array de fora desta classe.
     * @return o número de posições no array encapsulado
     */
    public int tamanho() {
        return array.length;
    }

    /**
     * O método modifica recebe como argumentos uma posição e uma instância de uma classe
     * que implementa a instância ObjetoGeometrico, modificando no array encapsulado a
     * instância na posição especificada. A instância somente será modificada se a posição
     * for válida, isto é, estiver entre zero e o tamanho máximo do array menos um.
     * Caso uma posição não-válida seja passada, o método não executará nenhum comando.
     * Note que não dizemos qual é a classe cuja instância será passada como argumento,
     * o que seria restritivo demais. Em vez disto, consideramos que o argumento será
     * uma instância de qualquer classe que implementa a interface ObjetoGeometrico.
     * @param posição a posição do array que será modificada
     * @param umObjeto uma instância de uma classe que implementa a interface
     *        ObjetoGeometrico
     */
    public void modifica(
            int posição, ObjetoGeometrico umObjeto) {
        if ((posição >= 0) && (posição < array.length)) {
            array[posição] = umObjeto;
        }
    }

    /**
     * O método qualObjeto retorna o objeto geométrico armazenado em uma certa posição,
     * que é passada como argumento para o método. O objeto geométrico armazenado somente
     * será retornado se a posição for válida, isto é, estiver entre zero e o tamanho
     * máximo do array menos um. Caso uma posição não-válida seja passada, o método
     * retornará null, significando objeto não-válido. Em exemplos e exercícios
     * posteriores veremos maneiras mais elegantes de tratar esses tipos de problema.
     * @param posição a posição do array. Se for válida, o objeto armazenado nesta
     *        posição será retornado
     * @return o objeto geométrico que estava armazenado na posição especificada
     */
    public ObjetoGeometrico qualObjeto(int posição) {
        if ((posição >= 0) && (posição < array.length)) {
            return array[posição];
        } else {
            return null;
        }
    }

    /**
     * O método toString retorna os valores do array encapsulado formatados em uma
     * string.
     * @return uma string contendo uma representação dos valores do array encapsulado.
     */
    public String toString() {
        String resultado = 
                "O array tem " + array.length +
                " elementos:\n";
        for (int c = 0; c < array.length; c++) {
            resultado += " " + (c + 1) + ":" +
                    array[c] + "\n"; // implicitamente chamamos o método toString
        }
        return resultado;                 // da classe que implementa o objeto geométrico
    }
} // fim da classe ArrayDeObjetosGeometricos
