// Importamos as classes do pacote java.util
import java.util.*;

/**
 * A classe MaquinaDeKaraoke encapsula os mecanismos b�sicos (simulados) de uma m�quina
 * de karaok�.
 */
class MaquinaDeKaraoke
  {
 /**
  * Declara��o dos campos da classe
  */
  private LinkedList listaDeM�sicas; // a lista de m�sicas que ser� tocada

 /**
  * O construtor para esta classe, que inicializa a lista das m�sicas.
  */
  MaquinaDeKaraoke()
    {
    listaDeM�sicas = new LinkedList();
    }

 /**
  * O m�todo adiciona adiciona uma m�sica no final da lista das que ser�o tocadas.
  */
  public void adiciona(String umaM�sica)
    {
    listaDeM�sicas.addLast(umaM�sica);
    }

 /**
  * O m�todo tocaPr�xima toca a pr�xima (primeira) m�sica da lista (como � uma 
  * simula��o, o nome da m�sica ser� impresso no terminal e a m�sica ser� eliminada 
  * da lista).
  */        
  public void tocaPr�xima()
    {
    // Recuperamos o primeiro elemento da lista, convertendo para uma inst�ncia de
    // String, e o eliminamos da lista.
    String pr�xima = (String)listaDeM�sicas.removeFirst();
    System.out.println(pr�xima); // imprimimos a m�sica
    }

 /**
  * O m�todo remove remove a primeira ocorr�ncia da lista cujo c�digo � igual ao
  * passado como argumento, retornando true se a remo��o realmente ocorrer.
  * @param c�digo o c�digo da m�sica a ser removida
  * @return true se a m�sica foi realmente removida
  */        
  public boolean remove(String t�tulo)
    {
    return listaDeM�sicas.remove(t�tulo);
    }

 /**
  * O m�todo procura procura a m�sica cujo t�tulo � passado como argumento, retornando
  * a sua posi��o na lista ou -1 se a m�sica n�o for encontrada.
  * @param t�tulo o t�tulo da m�sica a ser procurada
  * @return a posi��o da m�sica na lista ou -1 se n�o for encontrada
  */        
  public int procura(String t�tulo)
    {
    int �ndice = listaDeM�sicas.indexOf(t�tulo);
    if (�ndice == -1) return -1;
    else return �ndice+1; // para iniciar em 1 ao inv�s de 0
    }

 /**
  * O m�todo toString retorna a lista de m�sicas formatadas em uma string.
  * @return uma string contendo a lista de m�sicas.
  */
  public String toString()
    {
    // Criamos um StringBuffer com tamanho inicial estimado baseado no tamanho da lista.
    StringBuffer sb = new StringBuffer(listaDeM�sicas.size()*40);
    for(int m�sica=0;m�sica<listaDeM�sicas.size();m�sica++) // para cada m�sica na lista 
      {
      String estaM�sica = (String)listaDeM�sicas.get(m�sica); // recuperamos a m�sica
      sb.append((1+m�sica)+": "+estaM�sica); // adicionamos ao StringBuffer
      sb.append("\n"); 
      }
    return sb.toString(); // retornamos o StringBuffer convertido para String
    }

  } // fim da classe MaquinaDeKaraoke
