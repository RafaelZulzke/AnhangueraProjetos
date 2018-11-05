
/** 
 * A classe ArrayDeObjetosGeometricos encapsula um array de inst�ncias de qualquer
 * classe que implemente a interface ObjetosGeometricos.
 */
class ArrayDeObjetosGeometricos // declara��o da classe 
{

    /**
     * Declara��o dos campos da classe
     */
    private ObjetoGeometrico[] array; // o array encapsulado

    /**
     * O construtor para a classe ArrayDeObjetosGeometricos, que recebe um argumento
     * que ser� o n�mero de posi��es que a inst�ncia da classe ser� capaz de armazenar.
     * @param n�mero o n�mero de posi��es para armazenamento de inst�ncias de classes
     *        que implementem a interface ObjetoGeometrico
     */
    ArrayDeObjetosGeometricos(int n�mero) {
        array = new ObjetoGeometrico[n�mero]; // alocamos mem�ria para o array encapsulado
    // Sabemos que cada uma das posi��es do array apontar� para null, ent�o n�o 
    // precisamos inicializar o array.
    }

    /**
     * O m�todo tamanho retorna o tamanho do array encapsulado. Uma vez que o campo que
     * representa o array � declarado como sendo privado, � �til ter uma maneira de
     * acessar o tamanho do array de fora desta classe.
     * @return o n�mero de posi��es no array encapsulado
     */
    public int tamanho() {
        return array.length;
    }

    /**
     * O m�todo modifica recebe como argumentos uma posi��o e uma inst�ncia de uma classe
     * que implementa a inst�ncia ObjetoGeometrico, modificando no array encapsulado a
     * inst�ncia na posi��o especificada. A inst�ncia somente ser� modificada se a posi��o
     * for v�lida, isto �, estiver entre zero e o tamanho m�ximo do array menos um.
     * Caso uma posi��o n�o-v�lida seja passada, o m�todo n�o executar� nenhum comando.
     * Note que n�o dizemos qual � a classe cuja inst�ncia ser� passada como argumento,
     * o que seria restritivo demais. Em vez disto, consideramos que o argumento ser�
     * uma inst�ncia de qualquer classe que implementa a interface ObjetoGeometrico.
     * @param posi��o a posi��o do array que ser� modificada
     * @param umObjeto uma inst�ncia de uma classe que implementa a interface
     *        ObjetoGeometrico
     */
    public void modifica(
            int posi��o, ObjetoGeometrico umObjeto) {
        if ((posi��o >= 0) && (posi��o < array.length)) {
            array[posi��o] = umObjeto;
        }
    }

    /**
     * O m�todo qualObjeto retorna o objeto geom�trico armazenado em uma certa posi��o,
     * que � passada como argumento para o m�todo. O objeto geom�trico armazenado somente
     * ser� retornado se a posi��o for v�lida, isto �, estiver entre zero e o tamanho
     * m�ximo do array menos um. Caso uma posi��o n�o-v�lida seja passada, o m�todo
     * retornar� null, significando objeto n�o-v�lido. Em exemplos e exerc�cios
     * posteriores veremos maneiras mais elegantes de tratar esses tipos de problema.
     * @param posi��o a posi��o do array. Se for v�lida, o objeto armazenado nesta
     *        posi��o ser� retornado
     * @return o objeto geom�trico que estava armazenado na posi��o especificada
     */
    public ObjetoGeometrico qualObjeto(int posi��o) {
        if ((posi��o >= 0) && (posi��o < array.length)) {
            return array[posi��o];
        } else {
            return null;
        }
    }

    /**
     * O m�todo toString retorna os valores do array encapsulado formatados em uma
     * string.
     * @return uma string contendo uma representa��o dos valores do array encapsulado.
     */
    public String toString() {
        String resultado = 
                "O array tem " + array.length +
                " elementos:\n";
        for (int c = 0; c < array.length; c++) {
            resultado += " " + (c + 1) + ":" +
                    array[c] + "\n"; // implicitamente chamamos o m�todo toString
        }
        return resultado;                 // da classe que implementa o objeto geom�trico
    }
} // fim da classe ArrayDeObjetosGeometricos
