/* Precisamos de classes e interfaces no pacote java.util */
import java.util.*;

/**
 * A classe AlunoDeGraduacao representa um aluno de gradua��o matriculado em uma
 * universidade.
 */
class AlunoDeGraduacao
  {
 /**
  * Os campos da classe
  */
  private String nome;
  private int idade;
  private float m�diaDeNotas;
  private Set disciplinasCursadas; // o conjunto de disciplinas que j� foram cursadas

 /**
  * O construtor para a classe AlunoDeGraduacao que inicializa alguns campos com 
  * argumentos e outros com valores vazios.
  * @param nome o nome do aluno
  * @param idade a idade do aluno
  */
  AlunoDeGraduacao(String nome,int idade)
    {
    this.nome = nome;
    this.idade = idade;
    m�diaDeNotas = 0;
    disciplinasCursadas = new HashSet();
    }

 /**
  * O m�todo qualNome retorna o nome encapsulado nesta classe.
  * @return o nome do aluno
  */
 public String qualNome()
   {
   return nome;
   }

 /**
  * O m�todo qualM�diaDeNotas retorna a m�dia de notas encapsulada nesta classe.
  * @return a m�dia de notas do aluno
  */
 public float qualM�diaDeNotas()
   {
   return m�diaDeNotas;
   }

 /**
  * O m�todo adicionaDisciplina adiciona uma disciplina ao conjunto de disciplinas que
  * j� foram cursadas pelo aluno. O m�todo tamb�m recalcula a m�dia de notas do aluno.
  * @param umaDisciplina uma disciplina que j� foi cursada pelo aluno
  */
  public void adicionaDisciplina(DisciplinaCursada umaDisciplina)
    {
    disciplinasCursadas.add(umaDisciplina);
    // Recalculamos a m�dia de notas
    int totalDeDisciplinas = 0;
    float totalDeNotas = 0;
    // Percorremos a lista de disciplinas, usando um Iterator
    Iterator i = disciplinasCursadas.iterator();
    while(i.hasNext()) // para cada elemento do Iterator
      {
      DisciplinaCursada dc = (DisciplinaCursada)i.next();
      totalDeNotas += dc.qualNotaFinal();
      totalDeDisciplinas++;
      }
    m�diaDeNotas = totalDeNotas/totalDeDisciplinas;
    }

 /**
  * O m�todo toString retorna os campos desta classe formatados em uma string.
  * @return uma string contendo os campos desta classe
  */
  public String toString()
    {
    // Para melhor performance, usamos internamente um StringBuffer
    StringBuffer resultado = new StringBuffer(1024); 
    // Adicionamos dados b�sicos do aluno
    resultado.append("Nome: "+nome+" idade: "+idade+
                     " m�dia de notas:"+m�diaDeNotas+"\n");
    resultado.append("\t");
    // Percorremos a lista de disciplinas, usando um Iterator
    Iterator i = disciplinasCursadas.iterator();
    while(i.hasNext()) // para cada elemento do Iterator
      {
      resultado.append(i.next()); // concatenamos uma string contendo dados da disciplina
      resultado.append(" ");      // (usando o m�todo toString da classe DisciplinaCursada) 
      }                           
    resultado.append("\n");
    return resultado.toString(); // convertemos para string para retornar
    }

  } // fim da classe AlunoDeGradua��o
