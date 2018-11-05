/**
 * A classe DemoAvaliadorDeExpressoes demonstra o uso do m�todo avaliaExpress�oPostfix
 * da classe AvaliadorDeExpressoes.
 * ESTA CLASSE PRODUZ UMA EXCE��O QUE N�O � CAPTURADA OU PROCESSADA.
 */
class DemoAvaliadorDeExpressoes
  { 
 /**
  * O m�todo main permite a execu��o desta classe. Este m�todo executa algumas vezes
  * o m�todo est�tico avaliaExpress�oPostfix da classe AvaliadorDeExpressoes.
  * @param argumentos os argumentos que podem ser passados para o m�todo via linha
  *        de comando, mas que neste caso ser�o ignorados.
  */
  public static void main(String[] argumentos)
    {
    double exp1 = AvaliadorDeExpressoes.avaliaExpress�oPostfix("9 5 +");
    System.out.println(exp1); // 14
    double exp2 = AvaliadorDeExpressoes.avaliaExpress�oPostfix("1 4 + 3 9 - * 8 /");
    System.out.println(exp2); // (1+4)*(3-9)/8 = -3.75
    double exp3 = AvaliadorDeExpressoes.avaliaExpress�oPostfix("9 5 1 +");
    System.out.println(exp3); // 6 (o primeiro operando n�o foi usado !)
    double exp4 = AvaliadorDeExpressoes.avaliaExpress�oPostfix("-9 -5 +");
    System.out.println(exp4); // Exce��o: o avaliador n�o est� preparado para operandos
                              // com sinais !
    }

  } // fim da classe DemoAvaliadorDeExpressoes
