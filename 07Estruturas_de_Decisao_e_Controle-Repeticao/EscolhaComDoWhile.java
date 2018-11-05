/** 
 * A classe EscolhaComDoWhile encapsula o mecanismo de escolha de um n�mero 
 * que deve estar entre dois n�meros tamb�m encapsulados na classe. O m�todo que 
 * pede ao usu�rio para fazer a escolha repete a entrada do valor escolhido 
 * (usando um bloco do-while) at� que o valor esteja na faixa esperada.
 */
class EscolhaComDoWhile // declara��o da classe
  {
 /**
  * Declara��o dos campos da classe
  */
  private short in�cio,fim; // a faixa de valores v�lidos para escolha

 /**
  * O construtor para a classe EscolhaComDoWhile, que receber� como argumentos os dois 
  * valores extremos (inicial e final ou menor e maior), que determinar�o a faixa de 
  * valores dos quais poderemos escolher.
  * @param i o valor inicial (ou menor valor da faixa)
  * @param f o valor final (ou maior valor da faixa)
  */
  EscolhaComDoWhile(short i,short f)
    {
    in�cio = i;
    fim = f;
    }

 /**
  * O m�todo escolhe pergunta um valor ao usu�rio at� que o valor entrado esteja
  * entre os valores inicial e final (inclusive).
  * @return o valor entrado pelo usu�rio
  */
  public short escolhe()
    {
    short valorEntrado; 
    boolean valorSatisfazCondi��es; // inicialmente pode ter valor indefinido
    do // execute o seguinte bloco 
      {
      System.out.print("Entre um valor entre "+in�cio+" e "+fim+":"); 
      valorEntrado = Keyboard.readShort();
      if ((valorEntrado >= in�cio) && 
          (valorEntrado <= fim))        // se o valor entrado estiver na faixa, a 
        valorSatisfazCondi��es = true;  // vari�vel de controle receber� true
      else valorSatisfazCondi��es = false; // sen�o, receber� false - neste caso,
      }                                    // devemos atribuir um valor � vari�vel 
    while(!valorSatisfazCondi��es); // execute enquanto esta condi��o for verdadeira
    return valorEntrado; // retornamos o valor entrado
    } // fim do m�todo escolhe

  } // fim da classe EscolhaComDoWhile
