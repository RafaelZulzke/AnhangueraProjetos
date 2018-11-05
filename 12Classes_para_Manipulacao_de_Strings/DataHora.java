// É necessário importar este pacote para usar a classe StringTokenizer
import java.util.*;

/** 
 * A classe DataHora reutiliza as classes Data e Hora através de delegação.
 * O construtor desta classe usa uma instância da classe StringTokenizer para
 * obter os valores para os campos que estão formatados em uma string. 
 */
class DataHora // declaração da classe 
{

    /**
     * Declaração dos campos da classe.
     */
    private Data estaData; // uma instância da classe Data representa o dia, mês e ano
    private Hora estaHora; // uma instância da classe Hora representa a hora, minuto
    // e segundo

    /**
     * O construtor para a classe DataHora, que inicializa os campos da classe.
     * Os campos são passados como formatados em uma string com o formato
     * "dia/mês/ano hora:minuto:segundo".
     * @param formatada a string formatada com os dados
     */
    DataHora(String formatada) {
        // Declaração de variáveis locais
        byte aHora, oMinuto, oSegundo, oDia, oMês;
        short oAno;
        // A string formatada tem como separadores espaços, barra e dois-pontos.
        // Criamos uma instância de StringTokenizer para quebrar a string usando estes
        // separadores.
        StringTokenizer campos = new StringTokenizer(formatada, " :/");
        // Esperamos seis tokens - caso não existam seis, vamos considerar
        // a data como incorreta e preencher os campos com valores padrão.
        if (campos.countTokens() != 6) {
            oDia = 1;
            oMês = 1;
            oAno = 1970;       // meia-noite de 1/1/1970
            aHora = 0;
            oMinuto = 0;
            oSegundo = 0;
        } // Temos seis tokens, vamos pegar um por um e converter para tipos nativos.
        else {
            oDia = Byte.parseByte(campos.nextToken());
            oMês = Byte.parseByte(campos.nextToken());
            oAno = Short.parseShort(campos.nextToken());
            aHora = Byte.parseByte(campos.nextToken());
            oMinuto = Byte.parseByte(campos.nextToken());
            oSegundo = Byte.parseByte(campos.nextToken());
        }
        // Com os campos preenchidos, inicializamos as instâncias.
        estaData = new Data(oDia, oMês, oAno);
        estaHora = new Hora(aHora, oMinuto, oSegundo);
    }

    /**
     * O método toString não recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados. Os valores são obtidos através da chamada
     * implícita aos métodos toString das instâncias das classes embutidas. Note que o
     * formato retornado é o mesmo esperado pelo construtor da classe.
     * @return uma string com os valores dos campos formatados.
     */
    public String toString() {
        return estaData + " " + estaHora;
    }
} // fim da classe DataHora
