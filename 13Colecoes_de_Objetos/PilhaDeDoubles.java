/* Importamos as classes e interfaces do pacote java.util */  
import java.util.*;

/**
 * A classe PilhaDeDoubles representa uma pilha onde podemos armazenar e recuperar 
 * valores do tipo double. Esta classe contém somente métodos correspondentes a 
 * operações estritamente relacionadas a pilhas.
 */
class PilhaDeDoubles
  {
 /**
  * Declaração dos campos da classe
  */
  private LinkedList pilha; // a pilha será representada por uma lista.

 /**
  * O construtor para a classe PilhaDeDoubles não recebe argumentos e inicializa
  * a estrutura que representa a pilha.
  */
  PilhaDeDoubles()
    {
    pilha = new LinkedList();
    }

 /**
  * O método push coloca um valor do tipo double na primeira posição da pilha, 
  * movendo os outros elementos para "baixo". O valor é encapsulado em uma instância 
  * da classe Double.
  * @param valor o valor a ser armazenado no topo da pilha
  */
  public void push(double valor)
    {
    Double envelope = new Double(valor); // encapsulamos o valor 
    pilha.addFirst(envelope); // adicionamos à pilha
    }

 /**
  * O método pop retira o primeiro elemento da pilha e o retorna como um double.
  * Os outros elementos da pilha são movidos para "cima".
  * @return o valor armazenado no topo da pilha.
  */
  public double pop()
    {
    // Recuperamos o primeiro elemento da pilha como uma instância de Double
    Double envelope = (Double)pilha.getFirst();
    pilha.removeFirst(); // removemos o primeiro elemento da pilha
    return envelope.doubleValue(); // retornamos o valor encapsulado no Double
    }

 /**
  * O método estáVazia retorna o valor booleano true se a pilha estiver vazia (isto
  * é, sem elementos) ou false se não estiver.
  * @return true se a pilha estiver vazia.
  */
  public boolean estáVazia()
    {
    return (pilha.size() == 0);
    }

 /**
  * O método toString retorna uma representação da pilha encapsulada como uma string.
  * @return uma string representando a pilha encapsulada.
  */
  public String toString()
    {
    return pilha.toString(); // retorna a representação da lista encapsulada.
    }

  } // fim da classe PilhaDeDoubles
