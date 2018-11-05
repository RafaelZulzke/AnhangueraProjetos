
import DataHora.Data;
import DataHora.DataHora;
import DataHora.Hora;

/* Esta classe precisa das classes que est�o no pacote DataHora */
/**
 * A classe DemoDataHora demonstra usos de inst�ncias das classes que fazem
 * parte do pacote DataHora. Esta classe declara, inicializa e usa algumas inst�ncias
 * das classes Data, Hora e DataHora, mas tenta acessar campos destas classes que
 * s� podem ser acessados por classes do mesmo pacote.
 * ESTA CLASSE N�O PODE SER COMPILADA POR CAUSA DE ERROS INTENCIONAIS.  
 */
class DemoDataHora {

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es de
     * algumas inst�ncias das classes Data, Hora e DataHora.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma inst�ncia da classe Hora
        Hora meiodia = new Hora((byte) 12, (byte) 00, (byte) 00);
        // Criamos uma inst�ncia da classe Data
        Data hoje = new Data((byte) 11, (byte) 5, (short) 2001);
        // Criamos uma inst�ncia da classe DataHora
        DataHora agora = new DataHora((byte) 22, (byte) 35, (byte) 00,
                (byte) 11, (byte) 5, (short) 2001);
        // Imprimimos as inst�ncias atrav�s de chamadas impl�citas aos m�todos toString
        System.out.println(meiodia);
        System.out.println(hoje);
        System.out.println(agora);

        // Tentamos mudar os campos das classes, que n�o foram declarados como private,
        // mesmo assim causando erros pois a classe DemoDataHora n�o pertence ao mesmo
        // pacote que as classes Data, Hora e DataHora.
//        meiodia.segundo = 17;
//        hoje.m�s = 2;
//        DataHora.estaData.ano = 2000;

    } // fim do m�todo main
} // fim da classe DemoDataHora
