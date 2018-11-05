/** 
 * A classe EscolhaComWhile encapsula o mecanismo de escolha de um número que 
 * deve estar entre dois números também encapsulados na classe. O método que pede ao 
 * usuário para fazer a escolha (usando um bloco while) repetirá a entrada do valor
 * até que este esteja na faixa esperada.
 */
class EscolhaComWhile // declaração da classe
  {
 /**
  * Declaração dos campos da classe
  */
  private short início,fim; // a faixa de valores válidos para escolha

 /**
  * O construtor para a classe EscolhaComWhile, que receberá como argumentos os dois
  * valores extremos (inicial e final ou menor e maior), que determinarão a faixa de 
  * valores dos quais poderemos escolher.
  * @param i o valor inicial (ou menor valor da faixa)
  * @param f o valor final (ou maior valor da faixa)
  */
  EscolhaComWhile(short i,short f)
    {
    início = i;
    fim = f;
    }

 /**
  * O método escolhe pergunta um valor ao usuário até que o valor entrado esteja
  * entre os valores inicial e final (inclusive).
  * @return o valor entrado pelo usuário
  */
  public short escolhe()
    {
    short valorEntrado = 0; // devemos inicializar esta variável com qualquer valor
    boolean valorSatisfazCondições = false; // inicialmente consideraremos que o 
                                            // valor entrado não satisfaz as condições 
                                            // (não está dentro da faixa dos valores 
                                            // inicial e final)
    while(!valorSatisfazCondições) // enquanto o valor não satisfizer as condições
      {
      System.out.print("Entre um valor entre "+início+" e "+fim+":"); 
      valorEntrado = Keyboard.readShort();
      if ((valorEntrado >= início) && 
          (valorEntrado <= fim))        // se o valor entrado estiver na faixa, a 
        valorSatisfazCondições = true;  // variável de controle receberá true
      }
    return valorEntrado; // retornamos o valor entrado
    } // fim do método escolhe

  } // fim da classe EscolhaComWhile
