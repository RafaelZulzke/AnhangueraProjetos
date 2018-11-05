
/** 
 * A classe DemoRegistroAcademicoDeGraduacao demonstra a criação e o uso de 
 * instâncias da classe RegistroAcademicoDeGraduacao.
 */
class DemoRegistroAcademicoDeGraduacao {

    /**
     * O método main permite a execução desta classe. Este método contém declarações de
     * algumas instâncias da classe RegistroAcademicoDeGraduacao, e demonstra seu uso.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String args[]) {
        // Criaremos a primeira instância. Como o construtor da classe
        // RegistroAcademicoDeGraduacao precisa de uma instância da classe Data como
        // argumento, criaremos também esta instância explicitamente.
        Data nascimentoDoMillôr =
                new Data((byte) 10, (byte) 4,
                (short) 1940);
        RegistroAcademicoDeGraduacao millôr =
                new RegistroAcademicoDeGraduacao(
                "Millôr Fernandes",
                nascimentoDoMillôr,
                34990917,
                RegistroAcademicoDeGraduacao.CIÊNCIADACOMPUTAÇÃO,
                0);
        // Criaremos outra instância, desta vez usando uma instância da classe Data
        // criada especialmente para ser passada como argumento para o construtor da
        // classe RegistroAcademicoDeGraduacao.
        RegistroAcademicoDeGraduacao laerte =
                new RegistroAcademicoDeGraduacao(
                "Laerte",
                new Data((byte) 22, (byte) 9, (short) 1958),
                32990702,
                RegistroAcademicoDeGraduacao.ARQUITETURA,
                100);
        // Imprimimos as instâncias (chamando implicitamente o método toString da
        // classe RegistroAcademicoDeGraduacao)
        System.out.println(millôr);
        System.out.println(laerte);
    }
} // fim da classe DemoRegistroAcademicoDeGraduacao
