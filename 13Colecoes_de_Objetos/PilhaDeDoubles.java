/* Importamos as classes e interfaces do pacote java.util */  
import java.util.*;

/**
 * A classe PilhaDeDoubles representa uma pilha onde podemos armazenar e recuperar 
 * valores do tipo double. Esta classe cont�m somente m�todos correspondentes a 
 * opera��es estritamente relacionadas a pilhas.
 */
class PilhaDeDoubles
  {
 /**
  * Declara��o dos campos da classe
  */
  private LinkedList pilha; // a pilha ser� representada por uma lista.

 /**
  * O construtor para a classe PilhaDeDoubles n�o recebe argumentos e inicializa
  * a estrutura que representa a pilha.
  */
  PilhaDeDoubles()
    {
    pilha = new LinkedList();
    }

 /**
  * O m�todo push coloca um valor do tipo double na primeira posi��o da pilha, 
  * movendo os outros elementos para "baixo". O valor � encapsulado em uma inst�ncia 
  * da classe Double.
  * @param valor o valor a ser armazenado no topo da pilha
  */
  public void push(double valor)
    {
    Double envelope = new Double(valor); // encapsulamos o valor 
    pilha.addFirst(envelope); // adicionamos � pilha
    }

 /**
  * O m�todo pop retira o primeiro elemento da pilha e o retorna como um double.
  * Os outros elementos da pilha s�o movidos para "cima".
  * @return o valor armazenado no topo da pilha.
  */
  public double pop()
    {
    // Recuperamos o primeiro elemento da pilha como uma inst�ncia de Double
    Double envelope = (Double)pilha.getFirst();
    pilha.removeFirst(); // removemos o primeiro elemento da pilha
    return envelope.doubleValue(); // retornamos o valor encapsulado no Double
    }

 /**
  * O m�todo est�Vazia retorna o valor booleano true se a pilha estiver vazia (isto
  * �, sem elementos) ou false se n�o estiver.
  * @return true se a pilha estiver vazia.
  */
  public boolean est�Vazia()
    {
    return (pilha.size() == 0);
    }

 /**
  * O m�todo toString retorna uma representa��o da pilha encapsulada como uma string.
  * @return uma string representando a pilha encapsulada.
  */
  public String toString()
    {
    return pilha.toString(); // retorna a representa��o da lista encapsulada.
    }

  } // fim da classe PilhaDeDoubles
