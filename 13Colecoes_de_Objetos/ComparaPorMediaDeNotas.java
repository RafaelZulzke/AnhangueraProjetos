/* Precisamos de classes e interfaces no pacote java.util */
import java.util.*;

/**
 * A classe ComparaPorMediaDeNotas implementa a interface Comparator e permite a 
 * compara��o de duas inst�ncias da classe AlunoDeGraduacao pela m�dia de notas.
 */
class ComparaPorMediaDeNotas implements Comparator
  {
 /**
  * O m�todo compare recebe duas inst�ncias de AlunoDeGraduacao e retorna um valor
  * negativo, zero ou positivo se a m�dia de notas encapsulada na primeira inst�ncia 
  * for menor, igual ou maior que a m�dia de notas encapsulada na segunda. As 
  * compara��es s�o feitas com um conjunto de ifs.
  * @param o1 o primeiro objeto (que deve ser uma inst�ncia de AlunoDeGraduacao)
  * @param o2 o segundo objeto (que tamb�m deve ser uma inst�ncia de AlunoDeGraduacao)
  * @return o valor da compara��o dos objetos usando a ordem das m�dias de notas
  */
  public int compare(Object o1, Object o2) 
    {
    AlunoDeGraduacao a1 = (AlunoDeGraduacao) o1;
    AlunoDeGraduacao a2 = (AlunoDeGraduacao) o2;
    if (a1.qualM�diaDeNotas() > a2.qualM�diaDeNotas()) return -1;
    else if (a1.qualM�diaDeNotas() < a2.qualM�diaDeNotas()) return 1;
    else return 0;
    }

  } // fim da classe ComparaPorMediaDeNotas
