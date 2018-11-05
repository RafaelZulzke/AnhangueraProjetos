
/** 
 * A classe MovimentoDeRobo representa um �nico movimento de um rob� (que consiste
 * de um n�mero de passos dados em uma certa dire��o). Esta classe ser� usada para
 * permitir a inst�ncias da classe RoboComMemoria o armazenamento de cada movimento
 * feito.
 */
class MovimentoDeRobo {

    /**
     * Declara��o dos campos da classe
     */
    private int passos; // o n�mero de passos dados
    private short dire��o; // a dire��o na qual os passos foram dados

    /**
     * O construtor da classe MovimentoDeRobo recebe argumentos para inicializar os campos
     * da classe.
     * @param n o nome do rob�
     * @param px a posi��o X atual
     */
    MovimentoDeRobo(int p, short dir) {
        passos = p;
        dire��o = dir;
    }

    /**
     * O m�todo toString n�o recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados.
     * @return uma string com os valores dos campos formatados.
     */
    public String toString() {
        return passos + " passos na dire��o " + dire��o;
    }

    /**
     * O m�todo quantosPassos retorna o valor do campo passos.
     * @return o valor do campo passos.
     */
    public int quantosPassos() {
        return passos;
    }

    /**
     * O m�todo qualDire��o retorna o valor do campo dire��o.
     * @return o valor do campo dire��o.
     */
    public short qualDire��o() {
        return dire��o;
    }
} // fim da classe MovimentoDeRobo
