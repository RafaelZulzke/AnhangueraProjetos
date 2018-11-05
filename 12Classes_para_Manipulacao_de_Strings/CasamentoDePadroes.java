// � necess�rio importar este pacote para usar a classe StringTokenizer
import java.util.*;

/**
 * A classe CasamentoDePadroes implementa um mecanismo simples de casamento de
 * padr�es. Esta classe encapsula um padr�o simples e cont�m um m�todo que verifica
 * se uma dada string corresponde ao padr�o.
 */
class CasamentoDePadroes // declara��o da classe        
{

    /**
     * O campo da classe, uma �nica string que armazena o padr�o.
     */
    private String padr�o;

    /**
     * O construtor da classe, que recebe como argumento uma string e usa este
     * argumento para inicializar o campo da classe.
     * @param padr�o o padr�o a ser armazenado
     */
    CasamentoDePadroes(String padr�o) {
        this.padr�o = padr�o;
    }

    /**
     * O m�todo casa, que verifica se o padr�o casa com uma string passada como
     * argumento. O algoritmo de casamento � explicado no texto.
     * @param aComparar a string a ser comparada com o padr�o.
     * @return true se a string casa com o padr�o, false caso contr�rio.
     */
    public boolean casa(String aComparar) {
        // Inicialmente consideramos que todos os tokens casam com os padr�es.
        boolean todosCasam = true;
        // Estas strings armazenar�o os tokens obtidos na string padr�o e na que conter�
        // uma lista de alternativas.
        String esteToken, esteTokenDoGrupo;
        // Criamos uma inst�ncia de StringTokenizer usando os delimitadores '{' e '}'.
        StringTokenizer oPadr�o = new StringTokenizer(padr�o, "{}");
        // Enquanto houver tokens na string padr�o...
        while (oPadr�o.hasMoreTokens()) {
            esteToken = oPadr�o.nextToken(); // recuperamos o token
            // Se este token for um singleton, comparamos a string com o token,
            // considerando somente o tamanho do token. Para ver se o token � um
            // singleton, verificamos se ele cont�m ou n�o o caractere |.
            if (esteToken.indexOf('|') == -1) // � um singleton !
            {
                // Se o token � igual ao in�cio da string
                if (aComparar.startsWith(esteToken)) {
                    // Reduzimos a string, eliminando o seu prefixo (=token)
                    aComparar = aComparar.substring(esteToken.length());
                } else // se n�o come�a, o casamento de padr�es falhou
                {
                    todosCasam = false;
                }
            } else // o token n�o � um singleton, mas uma lista de alternativas
            {
                // Criamos uma inst�ncia de StringTokenizer para analisar a lista de
                // alternativas, que devem estar separados pelo separador '|'.
                StringTokenizer grupo = new StringTokenizer(esteToken, "|");
                boolean nenhumCasa = true; // em princ�pio nenhum casa
                // Enquanto houver tokens na lista de alternativas...
                while (grupo.hasMoreTokens()) {
                    esteTokenDoGrupo = grupo.nextToken(); // recuperamos o token
                    // Se o token � igual ao in�cio da string
                    if (aComparar.startsWith(esteTokenDoGrupo)) {
                        // Reduzimos a string, eliminando o seu prefixo (=token)
                        aComparar = aComparar.substring(esteTokenDoGrupo.length());
                        nenhumCasa = false; // ao menos um deles casa com a string
                        break; // n�o precisamos verificar os outros
                    }
                } // terminamos de ver os tokens da lista de alternativas
                if (nenhumCasa) // se nenhum dos tokens da lista de alternativas casou...
                {
                    todosCasam = false; // o casamento de padr�es falhou
                }
            } // fim do processamento para o grupo de padr�es
        } // fim do while para todos os tokens cujos separadores foram '{' e '}'
        // Se ao final dos tokens ainda restam caracteres na string a comparar, ent�o
        // consideramos que ela n�o casa com o padr�o
        if (aComparar.length() > 0) {
            todosCasam = false;
        }
        return todosCasam;
    } // fim do m�todo casa

    /**
     * O m�todo toString, que simplesmente retorna o padr�o encapsulado.
     * @return o padr�o encapsulada por esta classe
     */
    public String toString() {
        return padr�o;
    }
} // fim da classe CasamentoDePadroes
