
/**
 * A classe URL representa um URL (Uniform Resource Locator), que representa a
 * localização de um recurso na Internet. Esta classe contém o construtor e alguns 
 * métodos que são úteis para analisar URLs.
 */
class URL // declaração da classe        
{

    /**
     * O campo da classe, uma única string que armazena a localização do recurso.
     */
    private String localização;

    /**
     * O construtor da classe, que recebe como argumento uma string contendo a
     * localização do recurso e usa este argumento para inicializar o campo da classe.
     * @param localização a localização do recurso na Internet
     */
    URL(String localização) {
        this.localização = localização;
    }

    /**
     * O método éImagem, que retorna o valor booleano true se o URL apontar para uma
     * imagem estática. A avaliação é feita considerando-se o sufixo do URL.
     * @return true se o URL apontar para uma imagem, false caso contrário
     */
    public boolean éImagem() {
        if (localização.endsWith(".gif") || // se o URL terminar com uma destas
                localização.endsWith(".jpg") || // extensões (maiúsculas ou minúsculas)
                localização.endsWith(".png") || // consideraremos que ele aponta para uma
                localização.endsWith(".GIF") || // imagem
                localização.endsWith(".JPG") ||
                localização.endsWith(".PNG")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * O método éHTTP, que retorna o valor booleano true se o protocolo do URL for http
     * (seguro ou não). A avaliação é feita considerando-se o prefixo do URL.
     * @return true se o protocolo do URL for http, false caso contrário
     */
    public boolean éHTTP() {
        if (localização.startsWith("http://") ||
                localização.startsWith("HTTP://") ||
                    localização.startsWith("https://") ||
                    localização.startsWith("HTTPS://")) {
            return true;
        }
        return false;

    }

    /**
     * O método toString, que simplesmente retorna a string encapsulada por esta classe.
     * @return a string encapsulada por esta classe
     */
    public String toString() {
        return localização;
    }
} // fim da classe URL
