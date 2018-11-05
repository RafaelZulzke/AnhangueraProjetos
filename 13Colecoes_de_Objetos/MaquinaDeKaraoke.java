// Importamos as classes do pacote java.util
import java.util.*;

/**
 * A classe MaquinaDeKaraoke encapsula os mecanismos básicos (simulados) de uma máquina
 * de karaokê.
 */
class MaquinaDeKaraoke
  {
 /**
  * Declaração dos campos da classe
  */
  private LinkedList listaDeMúsicas; // a lista de músicas que será tocada

 /**
  * O construtor para esta classe, que inicializa a lista das músicas.
  */
  MaquinaDeKaraoke()
    {
    listaDeMúsicas = new LinkedList();
    }

 /**
  * O método adiciona adiciona uma música no final da lista das que serão tocadas.
  */
  public void adiciona(String umaMúsica)
    {
    listaDeMúsicas.addLast(umaMúsica);
    }

 /**
  * O método tocaPróxima toca a próxima (primeira) música da lista (como é uma 
  * simulação, o nome da música será impresso no terminal e a música será eliminada 
  * da lista).
  */        
  public void tocaPróxima()
    {
    // Recuperamos o primeiro elemento da lista, convertendo para uma instância de
    // String, e o eliminamos da lista.
    String próxima = (String)listaDeMúsicas.removeFirst();
    System.out.println(próxima); // imprimimos a música
    }

 /**
  * O método remove remove a primeira ocorrência da lista cujo código é igual ao
  * passado como argumento, retornando true se a remoção realmente ocorrer.
  * @param código o código da música a ser removida
  * @return true se a música foi realmente removida
  */        
  public boolean remove(String título)
    {
    return listaDeMúsicas.remove(título);
    }

 /**
  * O método procura procura a música cujo título é passado como argumento, retornando
  * a sua posição na lista ou -1 se a música não for encontrada.
  * @param título o título da música a ser procurada
  * @return a posição da música na lista ou -1 se não for encontrada
  */        
  public int procura(String título)
    {
    int índice = listaDeMúsicas.indexOf(título);
    if (índice == -1) return -1;
    else return índice+1; // para iniciar em 1 ao invés de 0
    }

 /**
  * O método toString retorna a lista de músicas formatadas em uma string.
  * @return uma string contendo a lista de músicas.
  */
  public String toString()
    {
    // Criamos um StringBuffer com tamanho inicial estimado baseado no tamanho da lista.
    StringBuffer sb = new StringBuffer(listaDeMúsicas.size()*40);
    for(int música=0;música<listaDeMúsicas.size();música++) // para cada música na lista 
      {
      String estaMúsica = (String)listaDeMúsicas.get(música); // recuperamos a música
      sb.append((1+música)+": "+estaMúsica); // adicionamos ao StringBuffer
      sb.append("\n"); 
      }
    return sb.toString(); // retornamos o StringBuffer convertido para String
    }

  } // fim da classe MaquinaDeKaraoke
