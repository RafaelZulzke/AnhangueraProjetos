/* Esta classe faz parte do pacote DataHora */
package DataHora;

/**
 * A classe Hora encapsula os dados de uma hora qualquer e que faz parte do 
 * pacote DataHora. 
 */
public class Hora {
    // Declaração dos campos da classe.

    /**
     * Este campo representa a hora de uma instância de Hora
     */
    byte hora;
    /**
     * Este campo representa o minuto de uma instância de Hora
     */
    byte minuto;
    /**
     * Este campo representa o segundo de uma instância de Hora
     */
    byte segundo;

    /**
     * O construtor da classe, que recebe argumentos para inicializar os campos da
     * classe. Note que o construtor é declarado como sendo público, caso contrário
     * ele não poderá ser chamado de fora do pacote !
     * Nenhuma verificação é feita nos valores, para manter o exemplo simples.
     * @param h a hora a ser encapsulada por uma instância desta classe
     * @param m o minuto a ser encapsulado por uma instância desta classe
     * @param s o segundo a ser encapsulado por uma instância desta classe
     */
    public Hora(byte h, byte m, byte s) {
        hora = h;
        minuto = m;
        segundo = s;
    }

    /**
     * O método toString, que retorna uma string contendo os campos desta classe,
     * formatados de forma adequada.
     * @return uma string com os valores dos campos desta classe
     */
    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }
} // fim da classe Hora
