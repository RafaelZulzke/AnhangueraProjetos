
/** 
 * A classe Livro encapsula os dados de um livro. Para simplificar, somente os
 * campos e m�todos mais b�sicos s�o implementados nesta classe.
 */
class Livro {

    /**
     * Declara��o dos campos da classe
     */
    private String t�tulo,  autor; // o t�tulo e autor do livro
    private short n�meroDeP�ginas; // o n�mero de p�ginas do livro
    private short anoDaEdi��o; // o ano da edi��o do livro

    /**
     * O construtor para a classe Livro, que recebe argumentos para inicializar todos
     * os campos da classe. Este � o construtor "completo".
     * @param tit o t�tulo do livro
     * @param aut o(s) nome(s) do(s) autor(es) do livro
     * @param np o n�mero de p�ginas do livro
     * @param ae o ano da edi��o do livro
     */
    Livro(String tit, String aut, short np, short ae) {
        t�tulo = tit;
        autor = aut;
        n�meroDeP�ginas = np;
        anoDaEdi��o = ae;
    }

    /**
     * O m�todo qualT�tulo retorna o t�tulo deste livro.
     * @return o t�tulo do livro
     */
    public String qualT�tulo() {
        return t�tulo;
    }

    /**
     * O m�todo qualAutor retorna o autor deste livro.
     * @return o autor do livro
     */
    public String qualAutor() {
        return autor;
    }

    /**
     * O m�todo toString retorna os valores dos campos desta classe formatados em uma
     * string.
     * @return uma string contendo uma representa��o dos campos desta classe.
     */
    public String toString() {
        // Retorna diretamente uma string criada com os valores dos campos.
        return "T�tulo            : " + t�tulo + "\n" +
                "Autor             : " + autor + "\n" +
                "N�mero de P�ginas : " + n�meroDeP�ginas + "\n" +
                "Ano da Edi��o     : " + anoDaEdi��o + "\n";
    }
} // fim da classe Livro
