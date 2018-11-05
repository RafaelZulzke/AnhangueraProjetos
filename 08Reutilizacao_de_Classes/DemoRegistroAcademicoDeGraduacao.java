
/** 
 * A classe DemoRegistroAcademicoDeGraduacao demonstra a cria��o e o uso de 
 * inst�ncias da classe RegistroAcademicoDeGraduacao.
 */
class DemoRegistroAcademicoDeGraduacao {

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es de
     * algumas inst�ncias da classe RegistroAcademicoDeGraduacao, e demonstra seu uso.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String args[]) {
        // Criaremos a primeira inst�ncia. Como o construtor da classe
        // RegistroAcademicoDeGraduacao precisa de uma inst�ncia da classe Data como
        // argumento, criaremos tamb�m esta inst�ncia explicitamente.
        Data nascimentoDoMill�r =
                new Data((byte) 10, (byte) 4,
                (short) 1940);
        RegistroAcademicoDeGraduacao mill�r =
                new RegistroAcademicoDeGraduacao(
                "Mill�r Fernandes",
                nascimentoDoMill�r,
                34990917,
                RegistroAcademicoDeGraduacao.CI�NCIADACOMPUTA��O,
                0);
        // Criaremos outra inst�ncia, desta vez usando uma inst�ncia da classe Data
        // criada especialmente para ser passada como argumento para o construtor da
        // classe RegistroAcademicoDeGraduacao.
        RegistroAcademicoDeGraduacao laerte =
                new RegistroAcademicoDeGraduacao(
                "Laerte",
                new Data((byte) 22, (byte) 9, (short) 1958),
                32990702,
                RegistroAcademicoDeGraduacao.ARQUITETURA,
                100);
        // Imprimimos as inst�ncias (chamando implicitamente o m�todo toString da
        // classe RegistroAcademicoDeGraduacao)
        System.out.println(mill�r);
        System.out.println(laerte);
    }
} // fim da classe DemoRegistroAcademicoDeGraduacao
