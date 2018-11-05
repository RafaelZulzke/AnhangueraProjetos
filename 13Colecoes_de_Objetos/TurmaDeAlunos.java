/* Precisamos de classes e interfaces no pacote java.util */
import java.util.*;

/**
 * A classe TurmaDeAlunos demonstra algumas opera��es em uma turma de alunos
 * (representada por uma lista de inst�ncias da classe AlunoDeGraduacao).
 * universidade.
 */
class TurmaDeAlunos
  {
 /**
  * O m�todo main permite a execu��o desta classe. Este m�todo cria uma lista
  * contendo v�rias inst�ncias da classe AlunoDeGraduacao e imprime a lista
  * ordenada de diversas maneiras.
  * @param argumentos os argumentos que podem ser passados para o m�todo via linha
  *        de comando, mas que neste caso ser�o ignorados.
  */ 
  public static void main(String[] argumentos)
    {
    // Criamos uma lista para os alunos
    List turma = new LinkedList();
    // Criamos v�rias inst�ncias de AlunoDeGraduacao, cada uma com um
    // diferente n�mero de inst�ncias de DisciplinaCursada
    AlunoDeGraduacao a1 = new AlunoDeGraduacao("Albert Einstein",23);
    a1.adicionaDisciplina(new DisciplinaCursada(21012,7.5f));
    a1.adicionaDisciplina(new DisciplinaCursada(21013,5.5f));
    a1.adicionaDisciplina(new DisciplinaCursada(21014,9.8f));
    AlunoDeGraduacao a2 = new AlunoDeGraduacao("Salvador Dali",21);
    a2.adicionaDisciplina(new DisciplinaCursada(32027,6.4f));
    AlunoDeGraduacao a3 = new AlunoDeGraduacao("Cesar Lattes",18);
    a3.adicionaDisciplina(new DisciplinaCursada(21012,7.2f));
    a3.adicionaDisciplina(new DisciplinaCursada(21014,8.8f));
    AlunoDeGraduacao a4 = new AlunoDeGraduacao("Ronaldo Mour�o",25);
    a4.adicionaDisciplina(new DisciplinaCursada(21012,6.8f));
    a4.adicionaDisciplina(new DisciplinaCursada(21013,7.6f));
    a4.adicionaDisciplina(new DisciplinaCursada(21014,9.0f));
    a4.adicionaDisciplina(new DisciplinaCursada(21018,9.0f));
    // Adicionamos as inst�ncias de AlunoDeGraduacao � lista
    turma.add(a1);
    turma.add(a2);
    turma.add(a3);
    turma.add(a4);
    // Ordenamos a lista por nome e a imprimimos
    Collections.sort(turma,new ComparaPorNome());
    System.out.println(turma); // Albert, Cesar, Ronaldo, Salvador
    // Ordenamos a lista por m�dia de notas e a imprimimos
    Collections.sort(turma,new ComparaPorMediaDeNotas());
    System.out.println(turma); // Ronaldo, Cesar, Albert, Salvador
    }

  } // fim da classe TurmaDeAlunos
