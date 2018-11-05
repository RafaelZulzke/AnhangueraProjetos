
/**
 * A classe DemoListaDePalavras demonstra o uso de uma inst�ncia da classe
 * ListaDePalavras.
 */
class DemoListaDePalavras {

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cria uma inst�ncia da
     * classe ListaDePalavras e usa alguns de seus m�todos.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma inst�ncia da classe ListaDePalavras com algumas frases do Mill�r.
        ListaDePalavras palavrasDoMill�r =
                new ListaDePalavras();
        palavrasDoMill�r.adiciona(
                "Nunca neguei a ningu�m o direito de " +
                "concordar inteiramente comigo.");
        palavrasDoMill�r.adiciona(
                "Democracia � eu mandar em voc�. " +
                "Ditadura � voc� mandar em mim.");
        palavrasDoMill�r.adiciona(
                "Com o desenvolvimento da gen�tica, " +
                "dentro de alguns anos teremos " +
                "geneticistas bem melhores do que os atuais.");
        palavrasDoMill�r.adiciona(
                "Quando falamos mentimos muito, porque " +
                "nossa imagina��o � muito " +
                "mais r�pida do que nossa mem�ria.");
        System.out.println(palavrasDoMill�r.existe("eu")); // true
        System.out.println(palavrasDoMill�r.existe("voc�")); // true
        System.out.println(palavrasDoMill�r.existe("n�s")); // false
    }
} // fim da classe DemoListaDePalavras
