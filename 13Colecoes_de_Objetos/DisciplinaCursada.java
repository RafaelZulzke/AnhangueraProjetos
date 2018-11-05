/**
 * A classe DisciplinaCursada encapsula os dados referentes a uma disciplina que j� tenha
 * sido cursada por um aluno em uma universidade.
 */
class DisciplinaCursada
  {
 /**
  * Os campos da classe
  */
  private int c�digo;
  private float notaFinal;

 /**
  * O construtor para a classe DisciplinaCursada que inicializa os campos da classe.
  * @param c�digo o c�digo da disciplina
  * @param notaFinal a nota final obtida na disciplina
  */
  DisciplinaCursada(int c�digo,float notaFinal)
    {
    this.c�digo = c�digo;
    this.notaFinal = notaFinal;
    }

 /**
  * O m�todo qualNotaFinal retorna a nota final para esta disciplina
  * @return a nota final para esta disciplina
  */
  public float qualNotaFinal()
    {
    return notaFinal;
    }

 /**
  * O m�todo toString retorna os campos desta classe formatados em uma string.
  * @return uma string contendo os campos desta classe
  */
  public String toString()
    {
    return "C�digo: "+c�digo+" Nota Final:"+notaFinal;
    }

  } // fim da classe DisciplinaCursada
