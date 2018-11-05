
/** 
 * A classe DemoEventoAcademico demonstra o uso de inst�ncias da classe 
 * EventoAcademico.
 */
class DemoEventoAcademico // declara��o da classe 
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es de
     * algumas inst�ncias da classe EventoAcademico, e demonstra seu uso. Algumas
     * inst�ncias da classe Data dever�o ser criadas e passadas como argumento para o
     * construtor da classe EventoAcademico.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Declaramos algumas refer�ncias a inst�ncias da classe EventoAcademico
        // mas ainda n�o as inicializamos
        EventoAcademico SBED1998;
        EventoAcademico ISER1999;
        // Algumas inst�ncias da classe Data ser�o �teis para inicializar as inst�ncias
        // da classe EventoAcademico.
        Data data1 = new Data();
        Data data2 = new Data();
        // Inicializamos as datas e a inst�ncia SBED1998
        data1.inicializaData((byte) 20, (byte) 4, (short) 1998);
        data2.inicializaData((byte) 27, (byte) 4, (short) 1998);
        SBED1998 = new EventoAcademico("Simp�sio Brasileiro de Educa��o � Dist�ncia",
                "Londrina (PR)",
                data1, data2, 940);
        // Reaproveitando as datas, inicializamos a inst�ncia ISER1999
        data1.inicializaData((byte) 28, (byte) 11, (short) 1999);
        data2.inicializaData((byte) 4, (byte) 12, (short) 1999);
        ISER1999 = new EventoAcademico("International Symposium on Educational Robotics",
                "Taipei, Taiwan",
                data1, data2, 1308);
        // Imprimimos os dados das inst�ncias atrav�s de chamadas impl�citas ao m�todo
        // toString da classe EventoAcademico
        System.out.println(SBED1998);
        System.out.println(ISER1999);
    } // fim do m�todo main
} // fim da classe DemoEventoAcademico
