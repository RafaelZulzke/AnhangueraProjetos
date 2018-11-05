
/**
 * A classe DemoURL demonstra o uso de instâncias da classe URL. Esta classe
 * declara algumas instâncias e executa seus métodos.
 */
class DemoURL // declaração da classe
{

    /**
     * O método main permite a execução desta classe. Este método contém a declaração
     * de algumas instâncias da classe URL, e as usa para executar métodos da classe.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos algumas instâncias da classe URL.
        URL yahoo = new URL("http://www.yahoo.com");
        URL ftpCdrom = new URL("ftp://ftp.cdrom.com");
        URL tulipas = new URL("http://www.directnet.com.br/users/" +
                "rafael.santos/Fotos/img0001.jpg");
        // Usamos os métodos para analisar as URLs.
        System.out.println(yahoo.éHTTP());      // true
        System.out.println(yahoo.éImagem());    // false
        System.out.println(ftpCdrom.éHTTP());   // false
        System.out.println(ftpCdrom.éImagem()); // false
        System.out.println(tulipas.éHTTP());    // true
        System.out.println(tulipas.éImagem());  // true
    } // fim do método main
} // fim da classe DemoURL
