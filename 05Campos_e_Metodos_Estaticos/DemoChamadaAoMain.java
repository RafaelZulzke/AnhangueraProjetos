
/** 
 * A classe DemoChamadaAoMain mostra como m�todos est�ticos (main e outros) de 
 * outras classes podem ser chamados a partir do m�todo main de uma classe.
 */
class DemoChamadaAoMain // declara��o da classe 
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo demonstra como outros
     * m�todos main, de outras classes, podem ser chamados a partir deste.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Executamos o m�todo main da classe DemoConstantesMatematicas como se fosse uma
        // sub-rotina. Como todos os m�todos main esperam um array de strings como
        // argumento, podemos simplesmente repassar os argumentos deste m�todo main para
        // o da classe DemoConstantesMatematicas.
        DemoConstantesMatematicas.main(argumentos);
        // Executamos o m�todo main da classe DemoConversaoDeUnidadesDeComprimento como
        // se fosse uma sub-rotina.
        DemoConversaoDeUnidadesDeComprimento.main(argumentos);
        // Para demonstrar a chamada de m�todos est�ticos em outras classes, vamos
        // calcular o pre�o de um terreno:
        System.out.print("O pre�o do terreno J1 � ");
        // Chamamos o m�todo e imprimimos o seu resultado
        System.out.println(CalculoDePrecoDeTerreno.pre�oDoTerreno(600, 5));
    } // fim do m�todo main
} // fim da classe DemoChamadaAoMain
