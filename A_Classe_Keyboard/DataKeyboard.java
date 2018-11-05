/** 
 * A classe DataKeyboard cont�m um construtor que inicializa a data lendo os
 * seus valores do teclado usando a classe Keyboard. Alguns m�todos essenciais e 
 * interessantes foram deixados de lado para simplificar - verifique os exerc�cios
 * do livro para ver como implement�-los. Em particular, esta classe n�o verifica 
 * validade de dias e meses corretamente - ela aceita datas como 31/2/2000.
 */
class DataKeyboard // declara��o da classe 
  {
 /**
  * Declara��o dos campos da classe
  */
  private byte dia,m�s; // dia e m�s s�o representados por bytes
  private short ano; // ano � representado por um short

 /** 
  * O construtor da classe n�o recebe argumentos, e l� os valores dos campos usando os 
  * m�todos da classe Keyboard, verificando at� que os valores aceit�veis sejam 
  * passados.
  */
  DataKeyboard()
    {
    do // l� o valor do dia at� que seja v�lido
      {
      System.out.print("Entre o dia:");
      dia = Keyboard.readByte();
      }
    while ((dia < 1) || (dia > 31));
    do
      {
      System.out.print("Entre o m�s:");
      m�s = Keyboard.readByte();
      }
    while ((m�s < 1) || (m�s > 12));
    System.out.print("Entre o ano:");
    ano = Keyboard.readShort();
    } // fim do construtor

 /**
  * O m�todo mostraData n�o recebe argumentos nem retorna valores. Este m�todo somente
  * imprime os valores dos campos, formatados de forma que uma barra ("/") seja
  * impressa entre eles. Quando o valor do ano for impresso, uma quebra de linha 
  * tamb�m ser� impressa.
  */
  public void mostraData()
    {
    System.out.print(dia);
    System.out.print("/");
    System.out.print(m�s);
    System.out.print("/");
    System.out.println(ano);
    } // fim do m�todo mostraData

  } // fim da classe DataKeyboard
