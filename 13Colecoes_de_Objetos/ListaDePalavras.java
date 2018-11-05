/* Precisamos de classes e interfaces no pacotes java.util */

import java.util.*;

/** 
 * A classe ListaDePalavras encapsula uma lista de palavras sem repetição. A classe
 * permite algumas operações básicas nesta lista de palavras. 
 */
class ListaDePalavras {

    /**
     * Declaração dos campos da classe
     */
    private Set lista; // a lista de palavras (representada por um Set)

    /**
     * Este construtor para a classe ListaDePalavras não recebe argumentos, e inicializa
     * o set que armazena as palavras.
     */
    ListaDePalavras() {
        lista = new TreeSet(); // criamos a lista como um TreeSet (ordenado)
    }

    /**
     * O método adiciona recebe uma string (que possivelmente contém várias palavras separadas
     * por espaços) e adiciona todas as palavras na string à lista.
     * @param lista string que pode conter uma ou mais palavras separadas por espaços
     */
    public void adiciona(String listaDePalavras) {
        StringTokenizer listaDeTokens =
                new StringTokenizer(listaDePalavras);
        while (listaDeTokens.hasMoreTokens()) {
            lista.add(listaDeTokens.nextToken());  // adicionamos o token à lista de palavras
        }
    }

    /**
     * O método existe retorna o valor booleano true se a palavra passada como argumento
     * existir na lista de palavras.
     * @param palavra a palavra a ser procurada na lista
     * @return true se a palavra existir na lista
     */
    public boolean existe(String palavra) {
        return lista.contains(palavra);
    }
} // fim da classe ListaDePalavras
