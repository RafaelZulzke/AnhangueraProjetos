/* Precisamos de classes e interfaces no pacote java.util */
import java.util.*;

/** 
 * A classe ArrayEsparsoDeDoubles encapsula um array esparso de valores de ponto 
 * flutuante (doubles), com vários métodos que a tornam mais útil e versátil do que 
 * um array comum. Em um array esparso somente os valores diferentes de zero são
 * armazenados.
 */
class ArrayEsparsoDeDoubles // declaração da classe 
  {
 /**
  * Declaração dos campos da classe
  */
  protected Map mapa; // o array encapsulado (como um Map)

 /**
  * O construtor para a classe ArrayEsparsoDeDoubles não recebe argumentos, e inicializa
  * o mapa para armazenar os elementos do array.
  */
  ArrayEsparsoDeDoubles()
    {
    mapa = new HashMap(); // criamos o mapa como um HashMap
    }

 /**
  * O método modifica recebe como argumentos uma posição e um valor, modificando o valor
  * naquela posição para o passado como argumento. Nenhuma verificação é feita quanto
  * à validade do índice usado. O índice é considerado como sendo do tipo long.
  * @param posição a posição do array que será modificada
  * @param valor o valor que será armazenado na posição especificada
  */
  public void modifica(long posição,double valor)
    {
    Long qualPosição = new Long(posição); // "embrulhamos" o índice e o valor em 
    Double qualValor = new Double(valor); // instâncias das classes adequadas
    mapa.put(qualPosição,qualValor); // adicionamos o par índice-valor ao mapa
    }

 /**
  * O método valor retorna o valor armazenado em uma certa posição, que é passada como
  * argumento para o método. Este método considera que valores no array esparso que não
  * sejam explicitamente declarados são implicitamente iguais a zero.
  * @param posição a posição do array cujo valor será retornado
  * @return o valor que estava armazenado na posição especificada
  */
  public double valor(long posição)
    {
    Long qualPosição = new Long(posição); // "embrulhamos" o índice 
    if (mapa.containsKey(qualPosição)) // se existe chave no mapa igual a este índice
      {
      Double qualValor = (Double)mapa.get(qualPosição); // recuperamos o valor 
      return qualValor.doubleValue(); // e retornamos o double encapsulado
      }
    else return 0.0; // senão retornamos zero
    }

 /**
  * O método toString retorna os valores do array encapsulado formatados em uma string.
  * @return uma string contendo uma representação dos valores do array encapsulado.
  */
  public String toString()
    {
    String resultado = "O array tem "+mapa.size()+
        " elementos explicitamente definidos:\n";
    Iterator i = mapa.keySet().iterator(); // recuperamos um iterator para as chaves
    while(i.hasNext()) // para cada chave no mapa
      {
      Long qualPosição = (Long)i.next(); // recuperamos a chave como um Long
      Double qualValor = (Double)mapa.get(qualPosição); // recuperamos o valor
      resultado += "\t"+qualPosição+"->"+qualValor+"\n"; // e concatenamos na string
      }
    return resultado; // retornamos a string resultante
    }

  } // fim da classe ArrayEsparsoDeDoubles
