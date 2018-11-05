/** 
 * A classe ProbabilidadeBasica contém alguns métodos estáticos para cálculos
 * básicos de probabilidades.
 */
class ProbabilidadeBasica // declaração da classe 
  { 
 /**
  * O método fatorial calcula o fatorial de um valor inteiro, retornando o resultado
  * como um valor do tipo double (para evitar overflow)
  * @param val o valor para o qual calcularemos o fatorial
  * @return o fatorial do valor passado como argumento
  */
  public static double fatorial(int val)
    {
    double fatorial = 1; // o acumulador para o fatorial
    for(int i=1;i<=val;i++) // contamos de um até o valor
      fatorial = fatorial*i; // e multiplicamos cumulativamente
    return fatorial; // retornamos o resultado do fatorial
    }

 /**
  * O método combinações calcula o número de combinações que podem ser obtidas
  * quando T elementos são tomados de um grupo de Q elementos.
  * @param Q o número total de elementos
  * @param T o tamanho do subgrupo de Q.
  * @return o número de combinações de Q elementos tomados T a T
  */
  public static double combinações(int Q,int T)
    {
    return fatorial(Q)/(fatorial(T)*fatorial(Q-T));
    }

 /**
  * O método permutações calcula o número de permutações que podem ser obtidas
  * quando T elementos são tomados de um grupo de Q elementos.
  * @param Q o número total de elementos
  * @param T o tamanho do subgrupo de Q.
  * @return o número de permutações de T elementos tomados de um grupo de Q elementos.
  */
  public static double permutações(int Q,int T)
    {
    return fatorial(Q)/fatorial(Q-T);
    }

  } // fim da classe ProbabilidadeBasica
