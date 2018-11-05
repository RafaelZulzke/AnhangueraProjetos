
/** 
 * A classe ConcessionariaDeAutomoveis implementa o processo de venda de 
 * autom�veis em uma concession�ria. Para cada tipo de autom�vel, o pre�o e n�mero de
 * suas presta��es ser� impresso. O modelo representado � extremamente simples, e a
 * concession�ria somente tem cinco autom�veis � venda.
 * Esta classe demonstra polimorfismo de classes usando inst�ncias das classes 
 * herdeiras da classe Automovel. Um m�todo da classe aceitar� inst�ncias de qualquer
 * classe herdeira de Automovel.
 */
class ConcessionariaDeAutomoveisJE {

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es de
     * algumas inst�ncias das classes Automovel, AutomovelBasico e AutomovelDeLuxo, e as
     * usa para mostrar o valor da presta��o de cada autom�vel.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma inst�ncia da classe Automovel
        Automovel a1 = new Automovel("Fiat", "bege", Automovel.MOVIDOAALCOOL);
        // Criamos duas inst�ncias da classe AutomovelBasico
        // Uma com o construtor b�sico
        Automovel a2 = new AutomovelBasico("Corsa", "cinza",
                Automovel.MOVIDOAGASOLINA);
        // E outra com o construtor mais completo
        Automovel a3 = new AutomovelBasico("Gol", "branco", Automovel.MOVIDOAGASOLINA,
                false, false, true);
        // Criamos duas inst�ncias da classe AutomovelDeLuxo
        // Uma com o construtor b�sico
        Automovel a4 = new AutomovelDeLuxo("Ibiza", "vermelho",
                Automovel.MOVIDOAGASOLINA);
        // E outra com o construtor mais completo
        Automovel a5 = new AutomovelDeLuxo("Honda", "prata", Automovel.MOVIDOAGASOLINA,
                true, true, false,
                true, false, true);
        // Imprimimos o "cat�logo" da concession�ria, ou seja, os dados dos autom�veis,
        // pre�os e condi��es de pagamento.
        imprime(a1);
        imprime(a2);
        imprime(a3);
        imprime(a4);
        imprime(a5);
    } // fim do m�todo main

    /**
     * O m�todo imprime mostra os dados de uma inst�ncia de qualquer classe que
     * descenda da classe Automovel. Os m�todos quantoCusta, quantasPresta��es e
     * toString das inst�ncias ser�o chamados.
     * @param a uma inst�ncia de qualquer classe que herde da classe Automovel.
     */
    public static void imprime(Automovel a) {
        System.out.println("\nSeguem os dados do autom�vel escolhido:");
        System.out.print(a); // chamada impl�cita a toString
        System.out.println("Valor: " + a.quantoCusta());
        System.out.println(a.quantasPresta��es() + " presta��es de " +
                (a.quantoCusta() / a.quantasPresta��es()));
    } // fim do m�todo imprime
} // fim da classe ConcessionariaDeAutomoveis
