/** 
 * A classe ProbabilidadeBasica cont�m alguns m�todos est�ticos para c�lculos
 * b�sicos de probabilidades.
 */
class ProbabilidadeBasica // declara��o da classe 
  { 
 /**
  * O m�todo fatorial calcula o fatorial de um valor inteiro, retornando o resultado
  * como um valor do tipo double (para evitar overflow)
  * @param val o valor para o qual calcularemos o fatorial
  * @return o fatorial do valor passado como argumento
  */
  public static double fatorial(int val)
    {
    double fatorial = 1; // o acumulador para o fatorial
    for(int i=1;i<=val;i++) // contamos de um at� o valor
      fatorial = fatorial*i; // e multiplicamos cumulativamente
    return fatorial; // retornamos o resultado do fatorial
    }

 /**
  * O m�todo combina��es calcula o n�mero de combina��es que podem ser obtidas
  * quando T elementos s�o tomados de um grupo de Q elementos.
  * @param Q o n�mero total de elementos
  * @param T o tamanho do subgrupo de Q.
  * @return o n�mero de combina��es de Q elementos tomados T a T
  */
  public static double combina��es(int Q,int T)
    {
    return fatorial(Q)/(fatorial(T)*fatorial(Q-T));
    }

 /**
  * O m�todo permuta��es calcula o n�mero de permuta��es que podem ser obtidas
  * quando T elementos s�o tomados de um grupo de Q elementos.
  * @param Q o n�mero total de elementos
  * @param T o tamanho do subgrupo de Q.
  * @return o n�mero de permuta��es de T elementos tomados de um grupo de Q elementos.
  */
  public static double permuta��es(int Q,int T)
    {
    return fatorial(Q)/fatorial(Q-T);
    }

  } // fim da classe ProbabilidadeBasica
