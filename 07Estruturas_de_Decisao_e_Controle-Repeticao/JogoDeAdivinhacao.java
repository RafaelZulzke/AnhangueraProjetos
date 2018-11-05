/** 
 * A classe JogoDeAdivinhacao implementa um jogo simples de adivinha��o de 
 * n�meros. Um n�mero ser� escolhido e o usu�rio dever� adivinhar este n�mero com
 * dicas da classe.
 * No momento esta classe � bem simples: o valor a ser adivinhado deve ser fornecido
 * pelo programa que criar inst�ncias da classe. Futuramente veremos como usar valores
 * aleat�rios para isto.
 */
class JogoDeAdivinhacao // declara��o da classe 
  {
 /**
  * Declara��o dos campos da classe
  */
  private int valor; // o valor a ser adivinhado

 /**
  * O construtor da classe simplesmente inicializa o campo privado com o valor 
  * passado como argumento.
  * @param val o valor passado para inicializa��o do campo valor
  */
  JogoDeAdivinhacao(int val)
    {
    valor = val;
    } // fim do construtor

 /**
  * O m�todo tenta perguntar ao usu�rio um valor e mostra se o valor encapsulado � 
  * maior ou menor do que o valor passado. A pergunta � feita at� que vinte tentativas
  * sejam feitas ou at� que o usu�rio tenha acertado o valor.
  */
  public void tenta()
    {
    byte tentativas = 20; // o n�mero m�ximo de tentativas
    byte contador = 1; // o n�mero de tentativas at� agora
    System.out.println("Tente adivinhar o n�mero secreto em "+tentativas+
                       " tentativas.");
    do // execute o bloco seguinte...
      {
      System.out.print("Tentativa n�mero "+contador+":");
      int estaTentativa = Keyboard.readInt();
      if (estaTentativa == valor) // acertou o valor !
        break; // simplesmente sai do la�o
      else if (estaTentativa < valor)
        System.out.println("O n�mero "+estaTentativa+" � menor que o n�mero secreto !");
      else
        System.out.println("O n�mero "+estaTentativa+" � maior que o n�mero secreto !");
      contador++;
      } 
    while(contador <= tentativas); // enquanto o n�mero de tentativas n�o for alcan�ado
    // Aqui sabemos que ou o usu�rio acertou o n�mero ou as tentativas se esgotaram.
    // Basta verificar o valor do contador: se for maior que o n�mero de tentativas,
    // ent�o o usu�rio n�o conseguiu adivinhar o n�mero.
    if (contador > tentativas) 
      System.out.println("Voc� n�o acertou !");
    else
      System.out.println("Parab�ns, voc� acertou o n�mero ("+valor+") !");
    }  // fim do m�todo tenta

  } // fim da classe JogoDeAdivinhacao
