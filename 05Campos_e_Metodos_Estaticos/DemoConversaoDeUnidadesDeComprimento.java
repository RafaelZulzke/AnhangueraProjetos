
/** 
 * A classe DemoConversaoDeUnidadesDeComprimento demonstra usos dos métodos 
 * estáticos da classe ConversaoDeUnidadesDeComprimento.
 */
class DemoConversaoDeUnidadesDeComprimento // declaração da classe 
{

    /**
     * O método main permite a execução desta classe. Este método demonstra o uso de
     * métodos estáticos da classe ConversaoDeUnidadesDeComprimento, através da criação
     * de instâncias e através do acesso direto.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma instância da classe ConversaoDeUnidadesDeComprimento. Como a classe
        // não contém campos e os métodos são estáticos, não existe real diferença entre
        // chamar os métodos de uma ou outra instância da classe.
        ConversaoDeUnidadesDeComprimento conv =
                new ConversaoDeUnidadesDeComprimento();
        // Vamos converter alguns valores:
        System.out.println("vinte pés são " + conv.pésParaCentímetros(20) +
                " centímetros");
        System.out.println("cinco polegadas são " +
                conv.polegadasParaCentímetros(5) +
                " centímetros");
        // É muito mais prático acessar os métodos diretamente a partir da classe:
        System.out.println("vinte pés são " +
                ConversaoDeUnidadesDeComprimento.pésParaCentímetros(20) +
                " centímetros");
        System.out.println("cinco polegadas são " +
                ConversaoDeUnidadesDeComprimento.polegadasParaCentímetros(5) +
                " centímetros");
    } // fim do método main
} // fim da classe DemoConversaoDeUnidadesDeComprimento
