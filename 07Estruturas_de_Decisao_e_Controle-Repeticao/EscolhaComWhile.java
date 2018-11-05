/** 
 * A classe EscolhaComWhile encapsula o mecanismo de escolha de um n�mero que 
 * deve estar entre dois n�meros tamb�m encapsulados na classe. O m�todo que pede ao 
 * usu�rio para fazer a escolha (usando um bloco while) repetir� a entrada do valor
 * at� que este esteja na faixa esperada.
 */
class EscolhaComWhile // declara��o da classe
  {
 /**
  * Declara��o dos campos da classe
  */
  private short in�cio,fim; // a faixa de valores v�lidos para escolha

 /**
  * O construtor para a classe EscolhaComWhile, que receber� como argumentos os dois
  * valores extremos (inicial e final ou menor e maior), que determinar�o a faixa de 
  * valores dos quais poderemos escolher.
  * @param i o valor inicial (ou menor valor da faixa)
  * @param f o valor final (ou maior valor da faixa)
  */
  EscolhaComWhile(short i,short f)
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
    short valorEntrado = 0; // devemos inicializar esta vari�vel com qualquer valor
    boolean valorSatisfazCondi��es = false; // inicialmente consideraremos que o 
                                            // valor entrado n�o satisfaz as condi��es 
                                            // (n�o est� dentro da faixa dos valores 
                                            // inicial e final)
    while(!valorSatisfazCondi��es) // enquanto o valor n�o satisfizer as condi��es
      {
      System.out.print("Entre um valor entre "+in�cio+" e "+fim+":"); 
      valorEntrado = Keyboard.readShort();
      if ((valorEntrado >= in�cio) && 
          (valorEntrado <= fim))        // se o valor entrado estiver na faixa, a 
        valorSatisfazCondi��es = true;  // vari�vel de controle receber� true
      }
    return valorEntrado; // retornamos o valor entrado
    } // fim do m�todo escolhe

  } // fim da classe EscolhaComWhile
