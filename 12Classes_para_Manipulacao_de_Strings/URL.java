
/**
 * A classe URL representa um URL (Uniform Resource Locator), que representa a
 * localiza��o de um recurso na Internet. Esta classe cont�m o construtor e alguns 
 * m�todos que s�o �teis para analisar URLs.
 */
class URL // declara��o da classe        
{

    /**
     * O campo da classe, uma �nica string que armazena a localiza��o do recurso.
     */
    private String localiza��o;

    /**
     * O construtor da classe, que recebe como argumento uma string contendo a
     * localiza��o do recurso e usa este argumento para inicializar o campo da classe.
     * @param localiza��o a localiza��o do recurso na Internet
     */
    URL(String localiza��o) {
        this.localiza��o = localiza��o;
    }

    /**
     * O m�todo �Imagem, que retorna o valor booleano true se o URL apontar para uma
     * imagem est�tica. A avalia��o � feita considerando-se o sufixo do URL.
     * @return true se o URL apontar para uma imagem, false caso contr�rio
     */
    public boolean �Imagem() {
        if (localiza��o.endsWith(".gif") || // se o URL terminar com uma destas
                localiza��o.endsWith(".jpg") || // extens�es (mai�sculas ou min�sculas)
                localiza��o.endsWith(".png") || // consideraremos que ele aponta para uma
                localiza��o.endsWith(".GIF") || // imagem
                localiza��o.endsWith(".JPG") ||
                localiza��o.endsWith(".PNG")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * O m�todo �HTTP, que retorna o valor booleano true se o protocolo do URL for http
     * (seguro ou n�o). A avalia��o � feita considerando-se o prefixo do URL.
     * @return true se o protocolo do URL for http, false caso contr�rio
     */
    public boolean �HTTP() {
        if (localiza��o.startsWith("http://") ||
                localiza��o.startsWith("HTTP://") ||
                    localiza��o.startsWith("https://") ||
                    localiza��o.startsWith("HTTPS://")) {
            return true;
        }
        return false;

    }

    /**
     * O m�todo toString, que simplesmente retorna a string encapsulada por esta classe.
     * @return a string encapsulada por esta classe
     */
    public String toString() {
        return localiza��o;
    }
} // fim da classe URL
