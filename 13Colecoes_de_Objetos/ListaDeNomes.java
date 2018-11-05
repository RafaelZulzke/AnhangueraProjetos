/* Precisamos de classes e interfaces no pacote java.util */
import java.util.*;

/**
 * A classe ListaDeNomes demonstra usos de métodos estáticos da classe Collections.
 */
class ListaDeNomes
  {
 /**
  * O método main permite a execução desta classe. Este método cria uma lista de nomes
  * (instâncias da classe String) e demonstra alguns métodos da classe Collections.
  * @param argumentos os argumentos que podem ser passados para o método via linha
  *        de comando, mas que neste caso serão ignorados.
  */
  public static void main(String[] argumentos)
    {
    // Criamos uma lista e adicionamos alguns nomes à ela
    List nomes = new LinkedList();
    nomes.add("Lisa Friendly");
    nomes.add("Mary Campione");
    nomes.add("Kathy Walrath");
    nomes.add("Alison Huml");
    nomes.add("Joshua Bloch");
    nomes.add("Ann Wollrath");
    nomes.add("Jim Waldo");
    // Imprimimos o conteúdo da lista 
    System.out.println(nomes);
    // Ordenamos a lista e a imprimimos
    Collections.sort(nomes);
    System.out.println(nomes);
    // Revertemos a lista ordenada e a imprimimos
    Collections.reverse(nomes);
    System.out.println(nomes);
    }

  } // fim da classe ListaDeNomes
