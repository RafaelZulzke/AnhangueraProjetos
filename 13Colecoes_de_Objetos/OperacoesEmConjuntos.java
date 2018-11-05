/* Importamos as classes e interfaces do pacote java.util */

import java.util.*;

/**
 * A classe OperacoesEmConjuntos demonstra algumas opera��es em conjuntos (sets).
 */
class OperacoesEmConjuntos {

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cria algumas inst�ncias
     * da classe e demonstra opera��es nestas inst�ncias. Alguns nomes de autores de livros
     * s�o usados aqui para exemplificar os conceitos de conjuntos.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // O conjunto de autores solteiros
        HashSet solteiros = new HashSet();
        solteiros.add("Tom Christiansen");
        solteiros.add("Larry Wall");
        // O conjunto de autores casados
        HashSet casados = new HashSet();
        casados.add("Nathan Torkington");
        casados.add("Jeffrey Friedl");
        casados.add("Randal Schwartz");
        casados.add("Sriram Srinivasan");
        // O conjunto de todos os tenistas
        HashSet tenistas = new HashSet();
        tenistas.add("Tom Christiansen");
        tenistas.add("Jeffrey Friedl");
        tenistas.add("Larry Wall");
        // O conjunto de todos os nadadores
        HashSet nadadores = new HashSet();
        nadadores.add("Nathan Torkington");
        nadadores.add("Sriram Srinivasan");
        nadadores.add("Tom Christiansen");
        // Demonstra��o de algumas opera��es
        // O conjunto de todos os autores
        HashSet todos = new HashSet(casados); // inicializamos com os casados
        todos.addAll(solteiros);          // adicionamos os solteiros
        // O conjunto dos que s�o nadadores e tenistas
        HashSet nadadoresETenistas = new HashSet(nadadores); // inicializamos com os nadadores
        nadadoresETenistas.retainAll(tenistas); // retemos somente os tenistas
        System.out.println(nadadoresETenistas); // Tom
        // O conjunto dos que s�o tenistas e casados
        HashSet tenistasCasados = new HashSet(tenistas); // inicializamos com os tenistas
        tenistasCasados.retainAll(casados); // retemos somente os casados
        System.out.println(tenistasCasados); // Jeffrey
        // O conjunto dos que s�o tenistas ou casados
        HashSet tenistasOuCasados = new HashSet(tenistas); // inicializamos com os tenistas
        tenistasOuCasados.addAll(casados); // adicionamos (sem repetir) os casados
        System.out.println(tenistasOuCasados); // Sriran, Randal, Larry, Tom, Jeffrey, Nathan
        // O conjunto dos que s�o casados mas n�o atletas
        HashSet casadosMasN�oAtletas = new HashSet(casados);
        casadosMasN�oAtletas.removeAll(tenistas);
        casadosMasN�oAtletas.removeAll(nadadores);
        System.out.println(casadosMasN�oAtletas); // Randal
        // Todo nadador � tenista ? (isto �, o conjunto de tenistas cont�m o conjunto de
        // nadadores) ?
        System.out.println(tenistas.containsAll(nadadores)); // false
        // Todo solteiro � tenista (isto �, o conjunto de tenistas cont�m o conjunto de
        // solteiros) ?
        System.out.println(tenistas.containsAll(solteiros)); // true
    }
} // fim da classe OperacoesEmConjuntos. 
