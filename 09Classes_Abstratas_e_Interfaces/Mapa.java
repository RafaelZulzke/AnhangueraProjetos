
/** 
 * A classe Mapa encapsula os dados de um mapa (considerando mapas como 
 * tipos de documentos em bibliotecas, por exemplo). Para simplificar, somente alguns
 * campos e métodos mais básicos são implementados nesta classe.
 */
class Mapa {

    /**
     * Declaração dos campos da classe
     */
    private String título; // o título do mapa
    private float escala; // a escala em que o mapa está
    private String descriçãoSumária; // uma descrição do mapa

    /**
     * O construtor para a classe Mapa, que recebe argumentos para inicializar todos
     * os campos da classe. Este é o construtor "completo".
     */
    Mapa(String tit, float esc, String ds) {
        título = tit;
        escala = esc;
        descriçãoSumária = ds;
    }

    /**
     * O método qualTítulo retorna o título deste mapa.
     * @return o título do mapa
     */
    public String qualTítulo() {
        return título;
    }

    /**
     * O método descriçãoSumária retorna a descrição sumária deste mapa.
     * @return a descrição descrição sumária do mapa
     */
    public String descriçãoSumária() {
        return descriçãoSumária;
    }

    /**
     * O método toString retorna os valores dos campos desta classe formatados em uma
     * string.
     * @return uma string contendo uma representação dos campos desta classe.
     */
    public String toString() {
        // Retorna diretamente uma string criada com os valores dos campos.
        return "Título           : " + título + "\n" +
                "Escala           : " + escala + "\n" +
                "Descrição Sumária: " + descriçãoSumária + "\n";
    }
} // fim da classe Mapa
