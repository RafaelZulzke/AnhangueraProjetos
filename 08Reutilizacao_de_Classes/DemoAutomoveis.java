
/** 
 * A classe DemoAutomoveis demonstra inst�ncias das classes Automovel, 
 * AutomovelBasico e AutomovelDeLuxo.
 */
class DemoAutomoveis {

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es de
     * algumas inst�ncias das classes Automovel, AutomovelBasico e AutomovelDeLuxo, e
     * chamadas a m�todos destas classes.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma inst�ncia da classe Automovel, cujo construtor somente recebe como
        // argumentos o modelo, a cor e o combust�vel. Note como podemos usar as
        // constantes finais declaradas na classe Automovel como mnem�nicos para o tipo
        // de combust�vel.
        Automovel a = new Automovel(
                "Fusca", "verde", Automovel.MOVIDOAALCOOL);
        // Executamos alguns m�todos da classe Automovel
        System.out.println(a); // toString (implicitamente)
        System.out.println(a.quantoCusta());
        System.out.println(a.quantasPresta��es());

        // Criamos uma inst�ncia da classe AutomovelBasico. Usamos o construtor que recebe
        // como argumentos o modelo, a cor e o combust�vel (que ser�o repassados para o
        // construtor da classe ancestral), al�m de booleanos para representar a exist�ncia
        // de retrovisores do lado do passageiro, limpador de p�ra-brisas e r�dio AM/FM.
        // A mesma classe tem um construtor que considera estes tr�s acess�rios como
        // existentes por default.
        AutomovelBasico ab = new AutomovelBasico(
                "Corsa", "cinza", Automovel.MOVIDOAGASOLINA,
                true, true, false);
        // Executamos alguns m�todos da classe AutomovelBasico
        System.out.println(ab); // toString (implicitamente)
        System.out.println(ab.quantoCusta());
        System.out.println(ab.quantasPresta��es()); // m�todo herdado, sem modifica��es

        // Criamos uma inst�ncia da classe AutomovelDeLuxo. Usamos o construtor que recebe
        // como argumentos somente o modelo, a cor e o combust�vel (que ser�o repassados
        // para o construtor da classe ancestral, em cascata). Este construtor considera
        // que todos os acess�rios s�o instalados por default. A mesma classe tem um
        // construtor que recebe valores booleanos indicando a exist�ncia ou n�o de cada
        // um dos acess�rios.
        AutomovelDeLuxo al = new AutomovelDeLuxo(
                "Classe A", "azul",
                Automovel.MOVIDOAGASOLINA);
        // Executamos alguns m�todos da classe AutomovelDeLuxo
        System.out.println(al); // toString (implicitamente)
        System.out.println(al.quantoCusta());
        System.out.println(al.quantasPresta��es()); // m�todo superposto
    }
} // fim da classe DemoAutomoveis
