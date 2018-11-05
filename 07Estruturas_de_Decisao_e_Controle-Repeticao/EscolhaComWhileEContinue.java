/** 
 * A classe EscolhaComWhileEContinue encapsula o mecanismo de escolha de um número que 
 * deve estar entre dois números também encapsulados na classe. Esta versão da classe
 * usa um comando continue para controlar o laço que implementa a escolha - se o valor
 * entrado estiver fora da faixa de valores válidos o controle de execução voltará ao
 */
class EscolhaComWhileEContinue // declaração da classe
  {
 /**
  * Declaração dos campos da classe
  */
  private short início,fim; // a faixa de valores válidos para escolha

 /**
  * O construtor para a classe EscolhaComWhileEContinue, que receberá como argumentos os dois
  * valores extremos (inicial e final ou menor e maior), que determinarão a faixa de 
  * valores dos quais poderemos escolher.
  * @param i o valor inicial (ou menor valor da faixa)
  * @param f o valor final (ou maior valor da faixa)
  */
  EscolhaComWhileEContinue(short i,short f)
    {
    início = i;
    fim = f;
    }

 /**
  * O método escolhe pergunta um valor ao usuário enquanto o valor entrado estiver fora da
  * faixa de valores extremos (menor que o valor inicial OU maior que o valor final).
  * @return o valor entrado pelo usuário
  */
  public short escolhe()
    {
    short valorEntrado; // não precisamos inicializar esta variável !
    while(true) // em princípio, executamos "para sempre"
      {
      System.out.print("Entre um valor entre "+início+" e "+fim+":"); 
      valorEntrado = Keyboard.readShort(); // lemos o valor
      if ((valorEntrado < início) || // se o valor for menor que o inicial
          (valorEntrado > fim))      // ou maior que o final
          continue;                  // voltamos ao início do laço
      break; // se chegamos neste ponto podemos interromper o laço
      }
    return valorEntrado; // retornamos o valor entrado
    } // fim do método escolhe

  } // fim da classe EscolhaComWhileEContinue
