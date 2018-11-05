
/**
 * A classe DemoURL demonstra o uso de inst�ncias da classe URL. Esta classe
 * declara algumas inst�ncias e executa seus m�todos.
 */
class DemoURL // declara��o da classe
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m a declara��o
     * de algumas inst�ncias da classe URL, e as usa para executar m�todos da classe.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos algumas inst�ncias da classe URL.
        URL yahoo = new URL("http://www.yahoo.com");
        URL ftpCdrom = new URL("ftp://ftp.cdrom.com");
        URL tulipas = new URL("http://www.directnet.com.br/users/" +
                "rafael.santos/Fotos/img0001.jpg");
        // Usamos os m�todos para analisar as URLs.
        System.out.println(yahoo.�HTTP());      // true
        System.out.println(yahoo.�Imagem());    // false
        System.out.println(ftpCdrom.�HTTP());   // false
        System.out.println(ftpCdrom.�Imagem()); // false
        System.out.println(tulipas.�HTTP());    // true
        System.out.println(tulipas.�Imagem());  // true
    } // fim do m�todo main
} // fim da classe DemoURL
