


/** 
 * A classe DemoReferencias demonstra mais exemplos de refer�ncias e sua
 * associa��o a inst�ncias da classe Data. Esta classe tamb�m demonstra o uso da
 * palavra-chave null para denotar refer�ncias que n�o apontam para nenhuma
 * inst�ncia.
 * ESTA CLASSE N�O PODE SER COMPILADA POR CAUSA DE ERROS INTENCIONAIS.
 */
class DemoReferencias // declara��o da classe 
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es
     * de algumas inst�ncias da classe Data e suas refer�ncias.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Declaramos tr�s refer�ncias a inst�ncias da classe Data, e inicializamos duas
        // com o "valor" null
        Data nascimentoDeEdgarDegas = null;                       // 19/7/1834
        Data nascimentoDeHerbertMarcuse;                          // 19/7/1898
        Data jogosOl�mpicosEmHelsinki = null;                     // 19/7/1952
        // Criamos uma nova inst�ncia da classe Data e a associamos a uma das refer�ncias
        nascimentoDeEdgarDegas = new Data();
        // Usamos a refer�ncia para inicializar os campos da inst�ncia
        nascimentoDeEdgarDegas.inicializaData((byte) 30, (byte) 1, (short) 1948);
        nascimentoDeEdgarDegas.mostraData();
        // Dereferenciamos a refer�ncia - ela volta a apontar para null
        nascimentoDeEdgarDegas = null;
        // Se o programa pudesse ser compilado, a linha abaixo causaria um erro em tempo de
        // execu��o que interromperia a execu��o do programa. A pr�xima linha causaria o
        // mesmo erro, mas nunca ser� alcan�ada.
        nascimentoDeEdgarDegas.mostraData();
        jogosOl�mpicosEmHelsinki.mostraData();
        // Uma inicializa��o condicional: a inst�ncia nascimentoDeHerbertMarcuse s�
        // ser� inicializada se true for igual a false, ou seja, nunca.
        if (true == false) {
            nascimentoDeHerbertMarcuse = new Data();
            nascimentoDeHerbertMarcuse.inicializaData((byte) 21, (byte) 6, (short) 1965);
        }
        // A linha abaixo causa um erro de compila��o, j� que a refer�ncia
        // nascimentoDeHerbertMarcuse pode n�o ter sido inicializada no bloco acima. O
        // compilador n�o tem como saber se o bloco ser� executado, mesmo nos casos mais
        // �bvios.
        nascimentoDeHerbertMarcuse.mostraData();
    } // fim do m�todo main
} // fim da classe DemoReferencias
