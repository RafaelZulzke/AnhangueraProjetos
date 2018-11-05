
/** 
 * A classe DemoChamadaAoMain mostra como métodos estáticos (main e outros) de 
 * outras classes podem ser chamados a partir do método main de uma classe.
 */
class DemoChamadaAoMain // declaração da classe 
{

    /**
     * O método main permite a execução desta classe. Este método demonstra como outros
     * métodos main, de outras classes, podem ser chamados a partir deste.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Executamos o método main da classe DemoConstantesMatematicas como se fosse uma
        // sub-rotina. Como todos os métodos main esperam um array de strings como
        // argumento, podemos simplesmente repassar os argumentos deste método main para
        // o da classe DemoConstantesMatematicas.
        DemoConstantesMatematicas.main(argumentos);
        // Executamos o método main da classe DemoConversaoDeUnidadesDeComprimento como
        // se fosse uma sub-rotina.
        DemoConversaoDeUnidadesDeComprimento.main(argumentos);
        // Para demonstrar a chamada de métodos estáticos em outras classes, vamos
        // calcular o preço de um terreno:
        System.out.print("O preço do terreno J1 é ");
        // Chamamos o método e imprimimos o seu resultado
        System.out.println(CalculoDePrecoDeTerreno.preçoDoTerreno(600, 5));
    } // fim do método main
} // fim da classe DemoChamadaAoMain
