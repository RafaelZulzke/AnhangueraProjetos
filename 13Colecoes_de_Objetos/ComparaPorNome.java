/* Precisamos de classes e interfaces no pacote java.util */
import java.util.*;

/**
 * A classe ComparaPorNome implementa a interface Comparator e permite a 
 * compara��o de duas inst�ncias da classe AlunoDeGraduacao pelo nome do aluno.
 */
class ComparaPorNome implements Comparator
  {
 /**
  * O m�todo compare recebe duas inst�ncias de AlunoDeGraduacao e retorna um valor
  * negativo, zero ou positivo se o nome encapsulado na primeira inst�ncia for menor, 
  * igual ou maior que o nome encapsulado na segunda. As compara��es s�o feitas com o 
  * m�todo compareTo da classe String.
  * @param o1 o primeiro objeto (que deve ser uma inst�ncia de AlunoDeGraduacao)
  * @param o2 o segundo objeto (que tamb�m deve ser uma inst�ncia de AlunoDeGraduacao)
  * @return o valor da compara��o dos objetos usando a ordem dos nomes
  */
  public int compare(Object o1, Object o2) 
    {
    AlunoDeGraduacao a1 = (AlunoDeGraduacao) o1;
    AlunoDeGraduacao a2 = (AlunoDeGraduacao) o2;
    return a1.qualNome().compareTo(a2.qualNome());
    }

  } // fim da classe ComparaPorNome
