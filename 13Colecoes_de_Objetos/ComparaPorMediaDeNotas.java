/* Precisamos de classes e interfaces no pacote java.util */
import java.util.*;

/**
 * A classe ComparaPorMediaDeNotas implementa a interface Comparator e permite a 
 * comparação de duas instâncias da classe AlunoDeGraduacao pela média de notas.
 */
class ComparaPorMediaDeNotas implements Comparator
  {
 /**
  * O método compare recebe duas instâncias de AlunoDeGraduacao e retorna um valor
  * negativo, zero ou positivo se a média de notas encapsulada na primeira instância 
  * for menor, igual ou maior que a média de notas encapsulada na segunda. As 
  * comparações são feitas com um conjunto de ifs.
  * @param o1 o primeiro objeto (que deve ser uma instância de AlunoDeGraduacao)
  * @param o2 o segundo objeto (que também deve ser uma instância de AlunoDeGraduacao)
  * @return o valor da comparação dos objetos usando a ordem das médias de notas
  */
  public int compare(Object o1, Object o2) 
    {
    AlunoDeGraduacao a1 = (AlunoDeGraduacao) o1;
    AlunoDeGraduacao a2 = (AlunoDeGraduacao) o2;
    if (a1.qualMédiaDeNotas() > a2.qualMédiaDeNotas()) return -1;
    else if (a1.qualMédiaDeNotas() < a2.qualMédiaDeNotas()) return 1;
    else return 0;
    }

  } // fim da classe ComparaPorMediaDeNotas
