// � necess�rio importar este pacote para usar a classe StringTokenizer
import java.util.*;

/** 
 * A classe DataHora reutiliza as classes Data e Hora atrav�s de delega��o.
 * O construtor desta classe usa uma inst�ncia da classe StringTokenizer para
 * obter os valores para os campos que est�o formatados em uma string. 
 */
class DataHora // declara��o da classe 
{

    /**
     * Declara��o dos campos da classe.
     */
    private Data estaData; // uma inst�ncia da classe Data representa o dia, m�s e ano
    private Hora estaHora; // uma inst�ncia da classe Hora representa a hora, minuto
    // e segundo

    /**
     * O construtor para a classe DataHora, que inicializa os campos da classe.
     * Os campos s�o passados como formatados em uma string com o formato
     * "dia/m�s/ano hora:minuto:segundo".
     * @param formatada a string formatada com os dados
     */
    DataHora(String formatada) {
        // Declara��o de vari�veis locais
        byte aHora, oMinuto, oSegundo, oDia, oM�s;
        short oAno;
        // A string formatada tem como separadores espa�os, barra e dois-pontos.
        // Criamos uma inst�ncia de StringTokenizer para quebrar a string usando estes
        // separadores.
        StringTokenizer campos = new StringTokenizer(formatada, " :/");
        // Esperamos seis tokens - caso n�o existam seis, vamos considerar
        // a data como incorreta e preencher os campos com valores padr�o.
        if (campos.countTokens() != 6) {
            oDia = 1;
            oM�s = 1;
            oAno = 1970;       // meia-noite de 1/1/1970
            aHora = 0;
            oMinuto = 0;
            oSegundo = 0;
        } // Temos seis tokens, vamos pegar um por um e converter para tipos nativos.
        else {
            oDia = Byte.parseByte(campos.nextToken());
            oM�s = Byte.parseByte(campos.nextToken());
            oAno = Short.parseShort(campos.nextToken());
            aHora = Byte.parseByte(campos.nextToken());
            oMinuto = Byte.parseByte(campos.nextToken());
            oSegundo = Byte.parseByte(campos.nextToken());
        }
        // Com os campos preenchidos, inicializamos as inst�ncias.
        estaData = new Data(oDia, oM�s, oAno);
        estaHora = new Hora(aHora, oMinuto, oSegundo);
    }

    /**
     * O m�todo toString n�o recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados. Os valores s�o obtidos atrav�s da chamada
     * impl�cita aos m�todos toString das inst�ncias das classes embutidas. Note que o
     * formato retornado � o mesmo esperado pelo construtor da classe.
     * @return uma string com os valores dos campos formatados.
     */
    public String toString() {
        return estaData + " " + estaHora;
    }
} // fim da classe DataHora
