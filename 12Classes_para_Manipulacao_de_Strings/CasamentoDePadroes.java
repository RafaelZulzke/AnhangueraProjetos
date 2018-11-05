// É necessário importar este pacote para usar a classe StringTokenizer
import java.util.*;

/**
 * A classe CasamentoDePadroes implementa um mecanismo simples de casamento de
 * padrões. Esta classe encapsula um padrão simples e contém um método que verifica
 * se uma dada string corresponde ao padrão.
 */
class CasamentoDePadroes // declaração da classe        
{

    /**
     * O campo da classe, uma única string que armazena o padrão.
     */
    private String padrão;

    /**
     * O construtor da classe, que recebe como argumento uma string e usa este
     * argumento para inicializar o campo da classe.
     * @param padrão o padrão a ser armazenado
     */
    CasamentoDePadroes(String padrão) {
        this.padrão = padrão;
    }

    /**
     * O método casa, que verifica se o padrão casa com uma string passada como
     * argumento. O algoritmo de casamento é explicado no texto.
     * @param aComparar a string a ser comparada com o padrão.
     * @return true se a string casa com o padrão, false caso contrário.
     */
    public boolean casa(String aComparar) {
        // Inicialmente consideramos que todos os tokens casam com os padrões.
        boolean todosCasam = true;
        // Estas strings armazenarão os tokens obtidos na string padrão e na que conterá
        // uma lista de alternativas.
        String esteToken, esteTokenDoGrupo;
        // Criamos uma instância de StringTokenizer usando os delimitadores '{' e '}'.
        StringTokenizer oPadrão = new StringTokenizer(padrão, "{}");
        // Enquanto houver tokens na string padrão...
        while (oPadrão.hasMoreTokens()) {
            esteToken = oPadrão.nextToken(); // recuperamos o token
            // Se este token for um singleton, comparamos a string com o token,
            // considerando somente o tamanho do token. Para ver se o token é um
            // singleton, verificamos se ele contém ou não o caractere |.
            if (esteToken.indexOf('|') == -1) // é um singleton !
            {
                // Se o token é igual ao início da string
                if (aComparar.startsWith(esteToken)) {
                    // Reduzimos a string, eliminando o seu prefixo (=token)
                    aComparar = aComparar.substring(esteToken.length());
                } else // se não começa, o casamento de padrões falhou
                {
                    todosCasam = false;
                }
            } else // o token não é um singleton, mas uma lista de alternativas
            {
                // Criamos uma instância de StringTokenizer para analisar a lista de
                // alternativas, que devem estar separados pelo separador '|'.
                StringTokenizer grupo = new StringTokenizer(esteToken, "|");
                boolean nenhumCasa = true; // em princípio nenhum casa
                // Enquanto houver tokens na lista de alternativas...
                while (grupo.hasMoreTokens()) {
                    esteTokenDoGrupo = grupo.nextToken(); // recuperamos o token
                    // Se o token é igual ao início da string
                    if (aComparar.startsWith(esteTokenDoGrupo)) {
                        // Reduzimos a string, eliminando o seu prefixo (=token)
                        aComparar = aComparar.substring(esteTokenDoGrupo.length());
                        nenhumCasa = false; // ao menos um deles casa com a string
                        break; // não precisamos verificar os outros
                    }
                } // terminamos de ver os tokens da lista de alternativas
                if (nenhumCasa) // se nenhum dos tokens da lista de alternativas casou...
                {
                    todosCasam = false; // o casamento de padrões falhou
                }
            } // fim do processamento para o grupo de padrões
        } // fim do while para todos os tokens cujos separadores foram '{' e '}'
        // Se ao final dos tokens ainda restam caracteres na string a comparar, então
        // consideramos que ela não casa com o padrão
        if (aComparar.length() > 0) {
            todosCasam = false;
        }
        return todosCasam;
    } // fim do método casa

    /**
     * O método toString, que simplesmente retorna o padrão encapsulado.
     * @return o padrão encapsulada por esta classe
     */
    public String toString() {
        return padrão;
    }
} // fim da classe CasamentoDePadroes
