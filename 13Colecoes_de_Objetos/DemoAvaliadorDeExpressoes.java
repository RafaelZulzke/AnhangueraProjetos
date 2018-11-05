/**
 * A classe DemoAvaliadorDeExpressoes demonstra o uso do método avaliaExpressãoPostfix
 * da classe AvaliadorDeExpressoes.
 * ESTA CLASSE PRODUZ UMA EXCEÇÃO QUE NÃO É CAPTURADA OU PROCESSADA.
 */
class DemoAvaliadorDeExpressoes
  { 
 /**
  * O método main permite a execução desta classe. Este método executa algumas vezes
  * o método estático avaliaExpressãoPostfix da classe AvaliadorDeExpressoes.
  * @param argumentos os argumentos que podem ser passados para o método via linha
  *        de comando, mas que neste caso serão ignorados.
  */
  public static void main(String[] argumentos)
    {
    double exp1 = AvaliadorDeExpressoes.avaliaExpressãoPostfix("9 5 +");
    System.out.println(exp1); // 14
    double exp2 = AvaliadorDeExpressoes.avaliaExpressãoPostfix("1 4 + 3 9 - * 8 /");
    System.out.println(exp2); // (1+4)*(3-9)/8 = -3.75
    double exp3 = AvaliadorDeExpressoes.avaliaExpressãoPostfix("9 5 1 +");
    System.out.println(exp3); // 6 (o primeiro operando não foi usado !)
    double exp4 = AvaliadorDeExpressoes.avaliaExpressãoPostfix("-9 -5 +");
    System.out.println(exp4); // Exceção: o avaliador não está preparado para operandos
                              // com sinais !
    }

  } // fim da classe DemoAvaliadorDeExpressoes
