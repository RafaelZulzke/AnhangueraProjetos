/* A linha abaixo permite o uso da classe ArrayList */
import java.util.ArrayList;

/** 
 * A classe ArrayDeFloats encapsula um array de valores de ponto flutuante. Alguns métodos 
 * presentes em outras versões desta classe foram removidos para manter a listagem simples. 
 * Esta versão da classe usa uma instância da classe ArrayList para armazenar o array.
 */
class ArrayDeFloats // declaração da classe 
  {
 /**
  * Declaração dos campos da classe
  */
  private ArrayList array; // o array encapsulado

 /**
  * O construtor para a classe ArrayDeFloats, que recebe um argumento que será o
  * número de posições que a instância da classe será capaz de armazenar.
  * @param número o número de posições que serão armazenadas pelo array encapsulado
  */
  ArrayDeFloats(int número)
    {
    array = new ArrayList(); // alocamos memória para o array encapsulado
    for(int i=0;i<número;i++) // para cada posição desejada no array
      array.add(null); // devemos adicionar um objeto (no caso, null)
    }
 
 /**
  * O método tamanho retorna o tamanho do array encapsulado. 
  * @return o número de posições disponíveis no array encapsulado
  */
  public int tamanho()
    {
    return array.size(); 
    } // fim do método tamanho

 /**
  * O método modifica recebe como argumentos uma posição e um valor, modificando no
  * array encapsulado o valor na posição especificada. O valor somente será modificado
  * se a posição for maior que zero. Se a posição for maior que o tamanho do array,
  * o tamanho deste será modificado para poder conter o novo valor.
  * @param posição a posição do array que será modificada
  * @param valor o valor que será armazenado na posição especificada
  */
  public void modifica(int posição,float valor)
    {
    if (posição >= array.size()) // a posição desejada é maior que o tamanho do array
      {
      // Devemos modificar o tamanho do array e inicializar os elementos adicionais
      // com null.
      int tamanhoAnterior = array.size();
      for(int i=tamanhoAnterior;i<=posição;i++) // para cada nova posição
        array.add(null); // devemos adicionar um objeto (no caso, null)
      }
    array.set(posição, new Float(valor)); // envolvemos o valor do tipo nativo em uma
    }                                     // instância de Float para armazenamento.
 
 /**
  * O método valor retorna o valor armazenado em uma certa posição, que é passada como
  * argumento para o método. O valor armazenado somente será retornado se a posição
  * for válida, isto é, estiver entre zero e o tamanho máximo do array menos um. Caso
  * uma posição não-válida seja passada, o método retornará o valor NaN.
  * @param posição a posição do array cujo valor será retornado
  * @return o valor que estava armazenado na posição especificada
  */
  public float valor(int posição) 
    {
    if ((posição < 0) || (posição >= array.size()))
      return Float.NaN;
    Float valor = (Float)array.get(posição); // recuperamos o valor como um Float
    if (valor == null) return 0f; // se o elemento for null retornamos zero
    else return valor.floatValue(); // senão retornamos como tipo nativo
    } // fim do método valor

 /**
  * O método toString retorna os valores do array encapsulado formatados em uma
  * string.
  * @return uma string contendo uma representação dos valores do array encapsulado.
  */
  public String toString() 
    {
    // Criamos um StringBuffer com capacidade inicial proporcional ao tamanho do array
    StringBuffer sb = new StringBuffer(array.size()*12);
    sb.append("["); 
    for(int i=0;i<array.size();i++) // para cada elemento no array
      sb.append(valor(i)+" "); // devemos adicionar
    sb.append("]"); 
    return sb.toString(); // retornamos o StringBuffer convertido para String
    }

  } // fim da classe ArrayDeFloats
