/* Precisamos de classes e interfaces no pacote java.util */
import java.util.*;

/**
 * A classe ListaDeNomes demonstra usos de m�todos est�ticos da classe Collections.
 */
class ListaDeNomes
  {
 /**
  * O m�todo main permite a execu��o desta classe. Este m�todo cria uma lista de nomes
  * (inst�ncias da classe String) e demonstra alguns m�todos da classe Collections.
  * @param argumentos os argumentos que podem ser passados para o m�todo via linha
  *        de comando, mas que neste caso ser�o ignorados.
  */
  public static void main(String[] argumentos)
    {
    // Criamos uma lista e adicionamos alguns nomes � ela
    List nomes = new LinkedList();
    nomes.add("Lisa Friendly");
    nomes.add("Mary Campione");
    nomes.add("Kathy Walrath");
    nomes.add("Alison Huml");
    nomes.add("Joshua Bloch");
    nomes.add("Ann Wollrath");
    nomes.add("Jim Waldo");
    // Imprimimos o conte�do da lista 
    System.out.println(nomes);
    // Ordenamos a lista e a imprimimos
    Collections.sort(nomes);
    System.out.println(nomes);
    // Revertemos a lista ordenada e a imprimimos
    Collections.reverse(nomes);
    System.out.println(nomes);
    }

  } // fim da classe ListaDeNomes
