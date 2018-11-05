
/** 
 * A classe ConversaoDeUnidadesDeComprimento contém vários métodos estáticos que 
 * convertem unidades de comprimento. Esta classe não tem campos, e todos os seus 
 * métodos são declarados como static, assim não é necessário criar instâncias desta 
 * classe para usar os métodos. Para que os métodos possam ser acessados de qualquer 
 * outra classe eles são declarados como public.
 */
class ConversaoDeUnidadesDeComprimento // declaração da classe 
{

    /**
     * O método polegadasParaCentímetros converte o valor passado em polegadas para
     * centímetros.
     * @param polegadas o número de polegadas
     * @return o número de centímetros correspondente ao número de polegadas
     */
    public static double polegadasParaCentímetros(double polegadas) {
        double centímetros = polegadas * 2.54;
        return centímetros;
    }

    /**
     * O método pésParaCentímetros converte o valor passado em pés para centímetros.
     * @param pés o número de pés
     * @return o número de centímetros correspondente ao número de pés
     */
    public static double pésParaCentímetros(double pés) {
        double centímetros = pés * 30.48;
        return centímetros;
    }

    /**
     * O método milhasParaQuilômetros converte o valor passado em milhas para quilômetros.
     * @param milhas o número de milhas
     * @return o número de quilômetros correspondente ao número de milhas
     */
    public static double milhasParaQuilômetros(double milhas) {
        double quilômetros = milhas * 1.609;
        return quilômetros;
    }
} // fim da classe ConversaoDeUnidadesDeComprimento 

// Fórmulas obtidas no livro Manual de Fórmulas e Tabelas Matemáticas, Murray R. 
// Spiegel, Coleção Schaum, Editora McGraw-Hill
