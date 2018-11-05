/** 
 * A classe DemoRegistroAcademicoSemConstrutor demonstra o uso de inst�ncias da 
 * classe RegistroAcademicoSemConstrutor.
 */
class DemoRegistroAcademicoSemConstrutor // declara��o da classe 
  {
  /**
   * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es de
   * algumas inst�ncias da classe RegistroAcademicoSemConstrutor, e demonstra seu uso.
   * @param argumentos os argumentos que podem ser passados para o m�todo via linha 
   *        de comando, mas que neste caso ser�o ignorados.
   */
  public static void main(String[] argumentos)
    {
    // Declaramos duas refer�ncias a inst�ncias da classe 
    // RegistroAcademicoSemConstrutor, e as inicializamos com a palavra-chave new
    RegistroAcademicoSemConstrutor michael = new RegistroAcademicoSemConstrutor();
    RegistroAcademicoSemConstrutor roberto = new RegistroAcademicoSemConstrutor();
    // Chamamos o m�todo de inicializa��o somente para uma das inst�ncias
    michael.inicializaRegistroAcademicoSemConstrutor("Michael Goodrich",34980030,
                                                     (byte)2,100.0);
    // Calculamos a mensalidade dos dois alunos - mesmo que um n�o tenha sido
    // inicializado !
    System.out.println("A mensalidade do Michael � "+michael.calculaMensalidade());
    System.out.println("A mensalidade do Roberto � "+roberto.calculaMensalidade());
    } // fim do m�todo main

  } // fim da classe DemoRegistroAcademicoSemConstrutor
