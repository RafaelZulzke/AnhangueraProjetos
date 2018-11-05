
/** 
 * A classe DemoConversaoDeUnidadesDeComprimento demonstra usos dos m�todos 
 * est�ticos da classe ConversaoDeUnidadesDeComprimento.
 */
class DemoConversaoDeUnidadesDeComprimento // declara��o da classe 
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo demonstra o uso de
     * m�todos est�ticos da classe ConversaoDeUnidadesDeComprimento, atrav�s da cria��o
     * de inst�ncias e atrav�s do acesso direto.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma inst�ncia da classe ConversaoDeUnidadesDeComprimento. Como a classe
        // n�o cont�m campos e os m�todos s�o est�ticos, n�o existe real diferen�a entre
        // chamar os m�todos de uma ou outra inst�ncia da classe.
        ConversaoDeUnidadesDeComprimento conv =
                new ConversaoDeUnidadesDeComprimento();
        // Vamos converter alguns valores:
        System.out.println("vinte p�s s�o " + conv.p�sParaCent�metros(20) +
                " cent�metros");
        System.out.println("cinco polegadas s�o " +
                conv.polegadasParaCent�metros(5) +
                " cent�metros");
        // � muito mais pr�tico acessar os m�todos diretamente a partir da classe:
        System.out.println("vinte p�s s�o " +
                ConversaoDeUnidadesDeComprimento.p�sParaCent�metros(20) +
                " cent�metros");
        System.out.println("cinco polegadas s�o " +
                ConversaoDeUnidadesDeComprimento.polegadasParaCent�metros(5) +
                " cent�metros");
    } // fim do m�todo main
} // fim da classe DemoConversaoDeUnidadesDeComprimento
