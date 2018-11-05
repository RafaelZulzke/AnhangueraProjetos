
/**
 * A classe DemoDataComFabrica demonstra usos da classe DataComFabrica.
 */
class DemoDataComFabrica // declaração da classe
{

    /**
     * O método main permite a execução desta classe. Este método cria algumas
     * instâncias da classe DataComFabrica usando a fábrica de instâncias desta
     * classe.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Declaramos algumas referências a instâncias da classe DataComFabrica que serão
        // inicializadas através do método Natal (a fábrica de instâncias).
        DataComFabrica NatalDe1966 = DataComFabrica.Natal((short) 1966);
        DataComFabrica NatalDe1970 = DataComFabrica.Natal((short) 1970);
        DataComFabrica NatalDe2000 = DataComFabrica.Natal((short) 2000);
        // Imprimimos as datas através da chamada implícita ao método toString
        System.out.println(NatalDe1966);
        System.out.println(NatalDe1970);
        System.out.println(NatalDe2000);
    } // fim do método main
} // fim da classe DemoDataComFabrica            
