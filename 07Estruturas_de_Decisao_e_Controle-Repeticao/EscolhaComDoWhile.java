/** 
 * A classe EscolhaComDoWhile encapsula o mecanismo de escolha de um número 
 * que deve estar entre dois números também encapsulados na classe. O método que 
 * pede ao usuário para fazer a escolha repete a entrada do valor escolhido 
 * (usando um bloco do-while) até que o valor esteja na faixa esperada.
 */
class EscolhaComDoWhile // declaração da classe
  {
 /**
  * Declaração dos campos da classe
  */
  private short início,fim; // a faixa de valores válidos para escolha

 /**
  * O construtor para a classe EscolhaComDoWhile, que receberá como argumentos os dois 
  * valores extremos (inicial e final ou menor e maior), que determinarão a faixa de 
  * valores dos quais poderemos escolher.
  * @param i o valor inicial (ou menor valor da faixa)
  * @param f o valor final (ou maior valor da faixa)
  */
  EscolhaComDoWhile(short i,short f)
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
    short valorEntrado; 
    boolean valorSatisfazCondições; // inicialmente pode ter valor indefinido
    do // execute o seguinte bloco 
      {
      System.out.print("Entre um valor entre "+início+" e "+fim+":"); 
      valorEntrado = Keyboard.readShort();
      if ((valorEntrado >= início) && 
          (valorEntrado <= fim))        // se o valor entrado estiver na faixa, a 
        valorSatisfazCondições = true;  // variável de controle receberá true
      else valorSatisfazCondições = false; // senão, receberá false - neste caso,
      }                                    // devemos atribuir um valor à variável 
    while(!valorSatisfazCondições); // execute enquanto esta condição for verdadeira
    return valorEntrado; // retornamos o valor entrado
    } // fim do método escolhe

  } // fim da classe EscolhaComDoWhile
