
import DataHora.Data;
import DataHora.DataHora;
import DataHora.Hora;

/* Esta classe precisa das classes que estão no pacote DataHora */
/**
 * A classe DemoDataHora demonstra usos de instâncias das classes que fazem
 * parte do pacote DataHora. Esta classe declara, inicializa e usa algumas instâncias
 * das classes Data, Hora e DataHora, mas tenta acessar campos destas classes que
 * só podem ser acessados por classes do mesmo pacote.
 * ESTA CLASSE NÃO PODE SER COMPILADA POR CAUSA DE ERROS INTENCIONAIS.  
 */
class DemoDataHora {

    /**
     * O método main permite a execução desta classe. Este método contém declarações de
     * algumas instâncias das classes Data, Hora e DataHora.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma instância da classe Hora
        Hora meiodia = new Hora((byte) 12, (byte) 00, (byte) 00);
        // Criamos uma instância da classe Data
        Data hoje = new Data((byte) 11, (byte) 5, (short) 2001);
        // Criamos uma instância da classe DataHora
        DataHora agora = new DataHora((byte) 22, (byte) 35, (byte) 00,
                (byte) 11, (byte) 5, (short) 2001);
        // Imprimimos as instâncias através de chamadas implícitas aos métodos toString
        System.out.println(meiodia);
        System.out.println(hoje);
        System.out.println(agora);

        // Tentamos mudar os campos das classes, que não foram declarados como private,
        // mesmo assim causando erros pois a classe DemoDataHora não pertence ao mesmo
        // pacote que as classes Data, Hora e DataHora.
//        meiodia.segundo = 17;
//        hoje.mês = 2;
//        DataHora.estaData.ano = 2000;

    } // fim do método main
} // fim da classe DemoDataHora
