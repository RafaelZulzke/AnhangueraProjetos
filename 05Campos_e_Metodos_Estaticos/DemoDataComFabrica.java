
/**
 * A classe DemoDataComFabrica demonstra usos da classe DataComFabrica.
 */
class DemoDataComFabrica // declara��o da classe
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cria algumas
     * inst�ncias da classe DataComFabrica usando a f�brica de inst�ncias desta
     * classe.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Declaramos algumas refer�ncias a inst�ncias da classe DataComFabrica que ser�o
        // inicializadas atrav�s do m�todo Natal (a f�brica de inst�ncias).
        DataComFabrica NatalDe1966 = DataComFabrica.Natal((short) 1966);
        DataComFabrica NatalDe1970 = DataComFabrica.Natal((short) 1970);
        DataComFabrica NatalDe2000 = DataComFabrica.Natal((short) 2000);
        // Imprimimos as datas atrav�s da chamada impl�cita ao m�todo toString
        System.out.println(NatalDe1966);
        System.out.println(NatalDe1970);
        System.out.println(NatalDe2000);
    } // fim do m�todo main
} // fim da classe DemoDataComFabrica            
