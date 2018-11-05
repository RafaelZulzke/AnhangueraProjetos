/** 
 * A classe EscolhaComWhileEContinue encapsula o mecanismo de escolha de um n�mero que 
 * deve estar entre dois n�meros tamb�m encapsulados na classe. Esta vers�o da classe
 * usa um comando continue para controlar o la�o que implementa a escolha - se o valor
 * entrado estiver fora da faixa de valores v�lidos o controle de execu��o voltar� ao
 */
class EscolhaComWhileEContinue // declara��o da classe
  {
 /**
  * Declara��o dos campos da classe
  */
  private short in�cio,fim; // a faixa de valores v�lidos para escolha

 /**
  * O construtor para a classe EscolhaComWhileEContinue, que receber� como argumentos os dois
  * valores extremos (inicial e final ou menor e maior), que determinar�o a faixa de 
  * valores dos quais poderemos escolher.
  * @param i o valor inicial (ou menor valor da faixa)
  * @param f o valor final (ou maior valor da faixa)
  */
  EscolhaComWhileEContinue(short i,short f)
    {
    in�cio = i;
    fim = f;
    }

 /**
  * O m�todo escolhe pergunta um valor ao usu�rio enquanto o valor entrado estiver fora da
  * faixa de valores extremos (menor que o valor inicial OU maior que o valor final).
  * @return o valor entrado pelo usu�rio
  */
  public short escolhe()
    {
    short valorEntrado; // n�o precisamos inicializar esta vari�vel !
    while(true) // em princ�pio, executamos "para sempre"
      {
      System.out.print("Entre um valor entre "+in�cio+" e "+fim+":"); 
      valorEntrado = Keyboard.readShort(); // lemos o valor
      if ((valorEntrado < in�cio) || // se o valor for menor que o inicial
          (valorEntrado > fim))      // ou maior que o final
          continue;                  // voltamos ao in�cio do la�o
      break; // se chegamos neste ponto podemos interromper o la�o
      }
    return valorEntrado; // retornamos o valor entrado
    } // fim do m�todo escolhe

  } // fim da classe EscolhaComWhileEContinue
