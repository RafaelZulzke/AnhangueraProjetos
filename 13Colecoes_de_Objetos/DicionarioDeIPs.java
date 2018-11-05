// Importamos as classes do pacote java.util
import java.util.*;

/**
 * A classe DicionarioDeIPs cria e permite a consulta a um minidicionário de nomes
 * de servidores e seus IPs.
 */
class DicionarioDeIPs {

    /**
     * O método main permite a execução desta classe. Este método cria uma instância da
     * classe HashMap e permite a interação do usuário com este mapa.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma instância de HashMap que emulará um dicionário.
        Map dicionário = new HashMap();
        // Colocamos neste dicionário vários pares nomes/IPs de servidores.
        dicionário.put("www.sbc.org.br", "143.54.83.4");
        dicionário.put("www.usp.br", "143.107.253.62");
        dicionário.put("www.inpe.br", "150.163.12.2");
        dicionário.put("www.unicamp.br", "143.106.10.2");
        dicionário.put("www.fapesp.br", "143.108.30.103");
        dicionário.put("www.sun.com", "192.18.97.241");
        dicionário.put("java.sun.com", "192.18.97.71");
        dicionário.put("www.ibta.com.br", "200.219.192.212");
        // Executamos um laço "infinito".
        while (true) {
            // Recebemos, do usuário, o nome do servidor.
            System.out.print("Entre o nome do servidor ou ENTER para terminar:");
            String nomeDoServidor = new Scanner(System.in).next();
            if (nomeDoServidor.length() == 0) {
                break; // foi entrado ENTER
            }      // Se a chave existe no dicionário imprimimos o seu valor
            if (dicionário.containsKey(nomeDoServidor)) {
                System.out.println("O IP do servidor " + nomeDoServidor + " é " +
                        dicionário.get(nomeDoServidor) + " .");
            } else // senão imprimimos uma mensagem.
            {
                System.out.println("Este dicionário não contém o IP do servidor " +
                        nomeDoServidor + " .");
            }
        } // fim do laço "infinito"
    }
} // fim da classe DicionarioDeIPs
