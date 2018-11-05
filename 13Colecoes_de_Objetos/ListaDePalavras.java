/* Precisamos de classes e interfaces no pacotes java.util */

import java.util.*;

/** 
 * A classe ListaDePalavras encapsula uma lista de palavras sem repeti��o. A classe
 * permite algumas opera��es b�sicas nesta lista de palavras. 
 */
class ListaDePalavras {

    /**
     * Declara��o dos campos da classe
     */
    private Set lista; // a lista de palavras (representada por um Set)

    /**
     * Este construtor para a classe ListaDePalavras n�o recebe argumentos, e inicializa
     * o set que armazena as palavras.
     */
    ListaDePalavras() {
        lista = new TreeSet(); // criamos a lista como um TreeSet (ordenado)
    }

    /**
     * O m�todo adiciona recebe uma string (que possivelmente cont�m v�rias palavras separadas
     * por espa�os) e adiciona todas as palavras na string � lista.
     * @param lista string que pode conter uma ou mais palavras separadas por espa�os
     */
    public void adiciona(String listaDePalavras) {
        StringTokenizer listaDeTokens =
                new StringTokenizer(listaDePalavras);
        while (listaDeTokens.hasMoreTokens()) {
            lista.add(listaDeTokens.nextToken());  // adicionamos o token � lista de palavras
        }
    }

    /**
     * O m�todo existe retorna o valor booleano true se a palavra passada como argumento
     * existir na lista de palavras.
     * @param palavra a palavra a ser procurada na lista
     * @return true se a palavra existir na lista
     */
    public boolean existe(String palavra) {
        return lista.contains(palavra);
    }
} // fim da classe ListaDePalavras
