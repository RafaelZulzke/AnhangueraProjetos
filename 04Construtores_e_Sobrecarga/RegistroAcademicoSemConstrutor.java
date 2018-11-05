/** 
 * A classe RegistroAcademicoSemConstrutor cont�m campos para representar
 * dados simples sobre um registro acad�mico.
 */
class RegistroAcademicoSemConstrutor // declara��o da classe 
  {
 /**
  * Declara��o dos campos da classe
  */
  private String nomeDoAluno; // O nome do aluno 
  private int n�meroDeMatr�cula; // O n�mero de matr�cula
  private byte c�digoDoCurso; // O c�digo do curso do aluno (1..4)
  private double percentualDeCobran�a; // O percentual a ser cobrado do aluno, 0 a 100%

 /**
  * O m�todo inicializaRegistroAcademicoSemConstrutor recebe argumentos para 
  * inicializar os campos da classe RegistroAcademicoSemConstrutor.
  * @param n o nome do aluno
  * @param m o n�mero de matr�cula
  * @param c o c�digo do curso
  * @param p o percentual de bolsa
  */
  public void inicializaRegistroAcademicoSemConstrutor(String n,int m,byte c,double p)
    {
    nomeDoAluno = n; n�meroDeMatr�cula = m; 
    c�digoDoCurso = c; percentualDeCobran�a = p;
    } // fim do m�todo inicializaRegistroAcademicoSemConstrutor

 /**
  * O m�todo calculaMensalidade calcula e retorna a mensalidade do aluno usando
  * o c�digo do seu curso e o percentual de cobran�a.
  * @return o valor da mensalidade do aluno
  */
  public double calculaMensalidade()
    {
    double mensalidade = 0; // valor deve ser inicializado 
    // Primeiro, dependendo do curso do aluno, determina a mensalidade b�sica
    if (c�digoDoCurso == 1) // Arquitetura
      mensalidade = 450.00;
    if (c�digoDoCurso == 2) // Ci�ncia da Computa��o
      mensalidade = 500.00;
    if (c�digoDoCurso == 3) // Engenharia da Computa��o
      mensalidade = 550.00;
    if (c�digoDoCurso == 4) // Zootecnia
      mensalidade = 380.00;
    // Agora calcula o desconto com o percentual de cobran�a. Se o percentual de
    // cobran�a for zero, a mensalidade tamb�m o ser�.
    if (percentualDeCobran�a == 0) mensalidade = 0; 
    // Sen�o, calculamos com uma f�rmula simples.
    else mensalidade = mensalidade * 100.0 / percentualDeCobran�a;
    return mensalidade;
    } // fim do m�todo calculaMensalidade

  } // fim da classe RegistroAcademicoSemConstrutor
