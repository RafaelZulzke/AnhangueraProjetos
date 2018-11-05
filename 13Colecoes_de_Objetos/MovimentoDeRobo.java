
/** 
 * A classe MovimentoDeRobo representa um único movimento de um robô (que consiste
 * de um número de passos dados em uma certa direção). Esta classe será usada para
 * permitir a instâncias da classe RoboComMemoria o armazenamento de cada movimento
 * feito.
 */
class MovimentoDeRobo {

    /**
     * Declaração dos campos da classe
     */
    private int passos; // o número de passos dados
    private short direção; // a direção na qual os passos foram dados

    /**
     * O construtor da classe MovimentoDeRobo recebe argumentos para inicializar os campos
     * da classe.
     * @param n o nome do robô
     * @param px a posição X atual
     */
    MovimentoDeRobo(int p, short dir) {
        passos = p;
        direção = dir;
    }

    /**
     * O método toString não recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados.
     * @return uma string com os valores dos campos formatados.
     */
    public String toString() {
        return passos + " passos na direção " + direção;
    }

    /**
     * O método quantosPassos retorna o valor do campo passos.
     * @return o valor do campo passos.
     */
    public int quantosPassos() {
        return passos;
    }

    /**
     * O método qualDireção retorna o valor do campo direção.
     * @return o valor do campo direção.
     */
    public short qualDireção() {
        return direção;
    }
} // fim da classe MovimentoDeRobo
