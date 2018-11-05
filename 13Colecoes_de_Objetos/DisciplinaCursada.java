/**
 * A classe DisciplinaCursada encapsula os dados referentes a uma disciplina que já tenha
 * sido cursada por um aluno em uma universidade.
 */
class DisciplinaCursada
  {
 /**
  * Os campos da classe
  */
  private int código;
  private float notaFinal;

 /**
  * O construtor para a classe DisciplinaCursada que inicializa os campos da classe.
  * @param código o código da disciplina
  * @param notaFinal a nota final obtida na disciplina
  */
  DisciplinaCursada(int código,float notaFinal)
    {
    this.código = código;
    this.notaFinal = notaFinal;
    }

 /**
  * O método qualNotaFinal retorna a nota final para esta disciplina
  * @return a nota final para esta disciplina
  */
  public float qualNotaFinal()
    {
    return notaFinal;
    }

 /**
  * O método toString retorna os campos desta classe formatados em uma string.
  * @return uma string contendo os campos desta classe
  */
  public String toString()
    {
    return "Código: "+código+" Nota Final:"+notaFinal;
    }

  } // fim da classe DisciplinaCursada
