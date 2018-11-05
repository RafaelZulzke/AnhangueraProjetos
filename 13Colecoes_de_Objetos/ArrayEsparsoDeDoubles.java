/* Precisamos de classes e interfaces no pacote java.util */
import java.util.*;

/** 
 * A classe ArrayEsparsoDeDoubles encapsula um array esparso de valores de ponto 
 * flutuante (doubles), com v�rios m�todos que a tornam mais �til e vers�til do que 
 * um array comum. Em um array esparso somente os valores diferentes de zero s�o
 * armazenados.
 */
class ArrayEsparsoDeDoubles // declara��o da classe 
  {
 /**
  * Declara��o dos campos da classe
  */
  protected Map mapa; // o array encapsulado (como um Map)

 /**
  * O construtor para a classe ArrayEsparsoDeDoubles n�o recebe argumentos, e inicializa
  * o mapa para armazenar os elementos do array.
  */
  ArrayEsparsoDeDoubles()
    {
    mapa = new HashMap(); // criamos o mapa como um HashMap
    }

 /**
  * O m�todo modifica recebe como argumentos uma posi��o e um valor, modificando o valor
  * naquela posi��o para o passado como argumento. Nenhuma verifica��o � feita quanto
  * � validade do �ndice usado. O �ndice � considerado como sendo do tipo long.
  * @param posi��o a posi��o do array que ser� modificada
  * @param valor o valor que ser� armazenado na posi��o especificada
  */
  public void modifica(long posi��o,double valor)
    {
    Long qualPosi��o = new Long(posi��o); // "embrulhamos" o �ndice e o valor em 
    Double qualValor = new Double(valor); // inst�ncias das classes adequadas
    mapa.put(qualPosi��o,qualValor); // adicionamos o par �ndice-valor ao mapa
    }

 /**
  * O m�todo valor retorna o valor armazenado em uma certa posi��o, que � passada como
  * argumento para o m�todo. Este m�todo considera que valores no array esparso que n�o
  * sejam explicitamente declarados s�o implicitamente iguais a zero.
  * @param posi��o a posi��o do array cujo valor ser� retornado
  * @return o valor que estava armazenado na posi��o especificada
  */
  public double valor(long posi��o)
    {
    Long qualPosi��o = new Long(posi��o); // "embrulhamos" o �ndice 
    if (mapa.containsKey(qualPosi��o)) // se existe chave no mapa igual a este �ndice
      {
      Double qualValor = (Double)mapa.get(qualPosi��o); // recuperamos o valor 
      return qualValor.doubleValue(); // e retornamos o double encapsulado
      }
    else return 0.0; // sen�o retornamos zero
    }

 /**
  * O m�todo toString retorna os valores do array encapsulado formatados em uma string.
  * @return uma string contendo uma representa��o dos valores do array encapsulado.
  */
  public String toString()
    {
    String resultado = "O array tem "+mapa.size()+
        " elementos explicitamente definidos:\n";
    Iterator i = mapa.keySet().iterator(); // recuperamos um iterator para as chaves
    while(i.hasNext()) // para cada chave no mapa
      {
      Long qualPosi��o = (Long)i.next(); // recuperamos a chave como um Long
      Double qualValor = (Double)mapa.get(qualPosi��o); // recuperamos o valor
      resultado += "\t"+qualPosi��o+"->"+qualValor+"\n"; // e concatenamos na string
      }
    return resultado; // retornamos a string resultante
    }

  } // fim da classe ArrayEsparsoDeDoubles
