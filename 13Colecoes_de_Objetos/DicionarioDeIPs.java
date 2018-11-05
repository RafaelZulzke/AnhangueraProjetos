// Importamos as classes do pacote java.util
import java.util.*;

/**
 * A classe DicionarioDeIPs cria e permite a consulta a um minidicion�rio de nomes
 * de servidores e seus IPs.
 */
class DicionarioDeIPs {

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cria uma inst�ncia da
     * classe HashMap e permite a intera��o do usu�rio com este mapa.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma inst�ncia de HashMap que emular� um dicion�rio.
        Map dicion�rio = new HashMap();
        // Colocamos neste dicion�rio v�rios pares nomes/IPs de servidores.
        dicion�rio.put("www.sbc.org.br", "143.54.83.4");
        dicion�rio.put("www.usp.br", "143.107.253.62");
        dicion�rio.put("www.inpe.br", "150.163.12.2");
        dicion�rio.put("www.unicamp.br", "143.106.10.2");
        dicion�rio.put("www.fapesp.br", "143.108.30.103");
        dicion�rio.put("www.sun.com", "192.18.97.241");
        dicion�rio.put("java.sun.com", "192.18.97.71");
        dicion�rio.put("www.ibta.com.br", "200.219.192.212");
        // Executamos um la�o "infinito".
        while (true) {
            // Recebemos, do usu�rio, o nome do servidor.
            System.out.print("Entre o nome do servidor ou ENTER para terminar:");
            String nomeDoServidor = new Scanner(System.in).next();
            if (nomeDoServidor.length() == 0) {
                break; // foi entrado ENTER
            }      // Se a chave existe no dicion�rio imprimimos o seu valor
            if (dicion�rio.containsKey(nomeDoServidor)) {
                System.out.println("O IP do servidor " + nomeDoServidor + " � " +
                        dicion�rio.get(nomeDoServidor) + " .");
            } else // sen�o imprimimos uma mensagem.
            {
                System.out.println("Este dicion�rio n�o cont�m o IP do servidor " +
                        nomeDoServidor + " .");
            }
        } // fim do la�o "infinito"
    }
} // fim da classe DicionarioDeIPs
