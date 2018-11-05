/* Importamos as classes e interfaces do pacote java.util */

import java.util.*;

/**
 * A classe OperacoesEmConjuntos demonstra algumas operações em conjuntos (sets).
 */
class OperacoesEmConjuntos {

    /**
     * O método main permite a execução desta classe. Este método cria algumas instâncias
     * da classe e demonstra operações nestas instâncias. Alguns nomes de autores de livros
     * são usados aqui para exemplificar os conceitos de conjuntos.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
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
        // Demonstração de algumas operações
        // O conjunto de todos os autores
        HashSet todos = new HashSet(casados); // inicializamos com os casados
        todos.addAll(solteiros);          // adicionamos os solteiros
        // O conjunto dos que são nadadores e tenistas
        HashSet nadadoresETenistas = new HashSet(nadadores); // inicializamos com os nadadores
        nadadoresETenistas.retainAll(tenistas); // retemos somente os tenistas
        System.out.println(nadadoresETenistas); // Tom
        // O conjunto dos que são tenistas e casados
        HashSet tenistasCasados = new HashSet(tenistas); // inicializamos com os tenistas
        tenistasCasados.retainAll(casados); // retemos somente os casados
        System.out.println(tenistasCasados); // Jeffrey
        // O conjunto dos que são tenistas ou casados
        HashSet tenistasOuCasados = new HashSet(tenistas); // inicializamos com os tenistas
        tenistasOuCasados.addAll(casados); // adicionamos (sem repetir) os casados
        System.out.println(tenistasOuCasados); // Sriran, Randal, Larry, Tom, Jeffrey, Nathan
        // O conjunto dos que são casados mas não atletas
        HashSet casadosMasNãoAtletas = new HashSet(casados);
        casadosMasNãoAtletas.removeAll(tenistas);
        casadosMasNãoAtletas.removeAll(nadadores);
        System.out.println(casadosMasNãoAtletas); // Randal
        // Todo nadador é tenista ? (isto é, o conjunto de tenistas contém o conjunto de
        // nadadores) ?
        System.out.println(tenistas.containsAll(nadadores)); // false
        // Todo solteiro é tenista (isto é, o conjunto de tenistas contém o conjunto de
        // solteiros) ?
        System.out.println(tenistas.containsAll(solteiros)); // true
    }
} // fim da classe OperacoesEmConjuntos. 
