/* A linha abaixo permite o uso da classe ArrayList */
import java.util.ArrayList;

/** 
 * A classe ArrayDeFloats encapsula um array de valores de ponto flutuante. Alguns m�todos 
 * presentes em outras vers�es desta classe foram removidos para manter a listagem simples. 
 * Esta vers�o da classe usa uma inst�ncia da classe ArrayList para armazenar o array.
 */
class ArrayDeFloats // declara��o da classe 
  {
 /**
  * Declara��o dos campos da classe
  */
  private ArrayList array; // o array encapsulado

 /**
  * O construtor para a classe ArrayDeFloats, que recebe um argumento que ser� o
  * n�mero de posi��es que a inst�ncia da classe ser� capaz de armazenar.
  * @param n�mero o n�mero de posi��es que ser�o armazenadas pelo array encapsulado
  */
  ArrayDeFloats(int n�mero)
    {
    array = new ArrayList(); // alocamos mem�ria para o array encapsulado
    for(int i=0;i<n�mero;i++) // para cada posi��o desejada no array
      array.add(null); // devemos adicionar um objeto (no caso, null)
    }
 
 /**
  * O m�todo tamanho retorna o tamanho do array encapsulado. 
  * @return o n�mero de posi��es dispon�veis no array encapsulado
  */
  public int tamanho()
    {
    return array.size(); 
    } // fim do m�todo tamanho

 /**
  * O m�todo modifica recebe como argumentos uma posi��o e um valor, modificando no
  * array encapsulado o valor na posi��o especificada. O valor somente ser� modificado
  * se a posi��o for maior que zero. Se a posi��o for maior que o tamanho do array,
  * o tamanho deste ser� modificado para poder conter o novo valor.
  * @param posi��o a posi��o do array que ser� modificada
  * @param valor o valor que ser� armazenado na posi��o especificada
  */
  public void modifica(int posi��o,float valor)
    {
    if (posi��o >= array.size()) // a posi��o desejada � maior que o tamanho do array
      {
      // Devemos modificar o tamanho do array e inicializar os elementos adicionais
      // com null.
      int tamanhoAnterior = array.size();
      for(int i=tamanhoAnterior;i<=posi��o;i++) // para cada nova posi��o
        array.add(null); // devemos adicionar um objeto (no caso, null)
      }
    array.set(posi��o, new Float(valor)); // envolvemos o valor do tipo nativo em uma
    }                                     // inst�ncia de Float para armazenamento.
 
 /**
  * O m�todo valor retorna o valor armazenado em uma certa posi��o, que � passada como
  * argumento para o m�todo. O valor armazenado somente ser� retornado se a posi��o
  * for v�lida, isto �, estiver entre zero e o tamanho m�ximo do array menos um. Caso
  * uma posi��o n�o-v�lida seja passada, o m�todo retornar� o valor NaN.
  * @param posi��o a posi��o do array cujo valor ser� retornado
  * @return o valor que estava armazenado na posi��o especificada
  */
  public float valor(int posi��o) 
    {
    if ((posi��o < 0) || (posi��o >= array.size()))
      return Float.NaN;
    Float valor = (Float)array.get(posi��o); // recuperamos o valor como um Float
    if (valor == null) return 0f; // se o elemento for null retornamos zero
    else return valor.floatValue(); // sen�o retornamos como tipo nativo
    } // fim do m�todo valor

 /**
  * O m�todo toString retorna os valores do array encapsulado formatados em uma
  * string.
  * @return uma string contendo uma representa��o dos valores do array encapsulado.
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
