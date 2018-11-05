
/**
 * A classe DemoListaDePalavras demonstra o uso de uma instância da classe
 * ListaDePalavras.
 */
class DemoListaDePalavras {

    /**
     * O método main permite a execução desta classe. Este método cria uma instância da
     * classe ListaDePalavras e usa alguns de seus métodos.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma instância da classe ListaDePalavras com algumas frases do Millôr.
        ListaDePalavras palavrasDoMillôr =
                new ListaDePalavras();
        palavrasDoMillôr.adiciona(
                "Nunca neguei a ninguém o direito de " +
                "concordar inteiramente comigo.");
        palavrasDoMillôr.adiciona(
                "Democracia é eu mandar em você. " +
                "Ditadura é você mandar em mim.");
        palavrasDoMillôr.adiciona(
                "Com o desenvolvimento da genética, " +
                "dentro de alguns anos teremos " +
                "geneticistas bem melhores do que os atuais.");
        palavrasDoMillôr.adiciona(
                "Quando falamos mentimos muito, porque " +
                "nossa imaginação é muito " +
                "mais rápida do que nossa memória.");
        System.out.println(palavrasDoMillôr.existe("eu")); // true
        System.out.println(palavrasDoMillôr.existe("você")); // true
        System.out.println(palavrasDoMillôr.existe("nós")); // false
    }
} // fim da classe DemoListaDePalavras
