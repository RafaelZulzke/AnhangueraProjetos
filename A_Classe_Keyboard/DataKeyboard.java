/** 
 * A classe DataKeyboard contém um construtor que inicializa a data lendo os
 * seus valores do teclado usando a classe Keyboard. Alguns métodos essenciais e 
 * interessantes foram deixados de lado para simplificar - verifique os exercícios
 * do livro para ver como implementá-los. Em particular, esta classe não verifica 
 * validade de dias e meses corretamente - ela aceita datas como 31/2/2000.
 */
class DataKeyboard // declaração da classe 
  {
 /**
  * Declaração dos campos da classe
  */
  private byte dia,mês; // dia e mês são representados por bytes
  private short ano; // ano é representado por um short

 /** 
  * O construtor da classe não recebe argumentos, e lê os valores dos campos usando os 
  * métodos da classe Keyboard, verificando até que os valores aceitáveis sejam 
  * passados.
  */
  DataKeyboard()
    {
    do // lê o valor do dia até que seja válido
      {
      System.out.print("Entre o dia:");
      dia = Keyboard.readByte();
      }
    while ((dia < 1) || (dia > 31));
    do
      {
      System.out.print("Entre o mês:");
      mês = Keyboard.readByte();
      }
    while ((mês < 1) || (mês > 12));
    System.out.print("Entre o ano:");
    ano = Keyboard.readShort();
    } // fim do construtor

 /**
  * O método mostraData não recebe argumentos nem retorna valores. Este método somente
  * imprime os valores dos campos, formatados de forma que uma barra ("/") seja
  * impressa entre eles. Quando o valor do ano for impresso, uma quebra de linha 
  * também será impressa.
  */
  public void mostraData()
    {
    System.out.print(dia);
    System.out.print("/");
    System.out.print(mês);
    System.out.print("/");
    System.out.println(ano);
    } // fim do método mostraData

  } // fim da classe DataKeyboard
