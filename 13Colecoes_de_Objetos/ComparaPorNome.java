/* Precisamos de classes e interfaces no pacote java.util */
import java.util.*;

/**
 * A classe ComparaPorNome implementa a interface Comparator e permite a 
 * comparação de duas instâncias da classe AlunoDeGraduacao pelo nome do aluno.
 */
class ComparaPorNome implements Comparator
  {
 /**
  * O método compare recebe duas instâncias de AlunoDeGraduacao e retorna um valor
  * negativo, zero ou positivo se o nome encapsulado na primeira instância for menor, 
  * igual ou maior que o nome encapsulado na segunda. As comparações são feitas com o 
  * método compareTo da classe String.
  * @param o1 o primeiro objeto (que deve ser uma instância de AlunoDeGraduacao)
  * @param o2 o segundo objeto (que também deve ser uma instância de AlunoDeGraduacao)
  * @return o valor da comparação dos objetos usando a ordem dos nomes
  */
  public int compare(Object o1, Object o2) 
    {
    AlunoDeGraduacao a1 = (AlunoDeGraduacao) o1;
    AlunoDeGraduacao a2 = (AlunoDeGraduacao) o2;
    return a1.qualNome().compareTo(a2.qualNome());
    }

  } // fim da classe ComparaPorNome
