
/** 
 * A classe Mapa encapsula os dados de um mapa (considerando mapas como 
 * tipos de documentos em bibliotecas, por exemplo). Para simplificar, somente alguns
 * campos e m�todos mais b�sicos s�o implementados nesta classe.
 */
class Mapa {

    /**
     * Declara��o dos campos da classe
     */
    private String t�tulo; // o t�tulo do mapa
    private float escala; // a escala em que o mapa est�
    private String descri��oSum�ria; // uma descri��o do mapa

    /**
     * O construtor para a classe Mapa, que recebe argumentos para inicializar todos
     * os campos da classe. Este � o construtor "completo".
     */
    Mapa(String tit, float esc, String ds) {
        t�tulo = tit;
        escala = esc;
        descri��oSum�ria = ds;
    }

    /**
     * O m�todo qualT�tulo retorna o t�tulo deste mapa.
     * @return o t�tulo do mapa
     */
    public String qualT�tulo() {
        return t�tulo;
    }

    /**
     * O m�todo descri��oSum�ria retorna a descri��o sum�ria deste mapa.
     * @return a descri��o descri��o sum�ria do mapa
     */
    public String descri��oSum�ria() {
        return descri��oSum�ria;
    }

    /**
     * O m�todo toString retorna os valores dos campos desta classe formatados em uma
     * string.
     * @return uma string contendo uma representa��o dos campos desta classe.
     */
    public String toString() {
        // Retorna diretamente uma string criada com os valores dos campos.
        return "T�tulo           : " + t�tulo + "\n" +
                "Escala           : " + escala + "\n" +
                "Descri��o Sum�ria: " + descri��oSum�ria + "\n";
    }
} // fim da classe Mapa
