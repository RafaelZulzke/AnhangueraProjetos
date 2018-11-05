/* Importamos as classes e interfaces do pacote java.util */  
import java.util.*;

/**
 * A classe AvaliadorDeExpressoes cont�m um m�todo est�tico que permite a avalia��o
 * de express�es matem�ticas do tipo postfix (onde operadores s�o colocados depois 
 * de pares de operandos e par�nteses n�o s�o necess�rios). 
 */
class AvaliadorDeExpressoes
  {
 /**
  * O m�todo avaliaExpress�oPostfix recebe uma string como argumento, quebra a string
  * em seus componentes (tokens) e usa uma inst�ncia da classe PilhaDeDoubles para
  * avaliar a express�o no formato postfix contida na string.
  * O algoritmo de avalia��o � simples: para cada token da string, verificamos se
  * ele � um operador ou operando. Se for um operador retiramos da pilha os dois
  * primeiros elementos, efetuamos a opera��o e colocamos o resultado no topo da pilha.
  * Se o token for um operando simplesmente o armazenamos no topo da pilha.
  * Ao final do processamento a pilha dever� ter um �nico valor que � o resultado da
  * express�o.
  * @param express�o a express�o que deve ser avaliada
  * @return o resultado da avalia��o da express�o
  */
  public static double avaliaExpress�oPostfix(String express�o)
    {
    // Criamos uma pilha para armazenar os operandos e resultados
    PilhaDeDoubles pilha = new PilhaDeDoubles(); 
    // Criamos uma inst�ncia de StringTokenizer para separar operadores e operandos
    // na string passada como argumento.
    StringTokenizer st = new StringTokenizer(express�o);
    while(st.hasMoreTokens()) // para cada token...
      {
      String nextOp = st.nextToken(); 
      if ("+-*/".indexOf(nextOp.charAt(0)) >= 0) // pequeno truque: verificamos se � um operador
        {                                        // vendo se o caractere faz parte da string "+-*/"
        double op1 = pilha.pop(); // obtemos dois operandos da pilha
        double op2 = pilha.pop();
        double resultado = 0;
        switch(nextOp.charAt(0)) // calculamos o resultado usando o operador
          {
          case '+' : resultado = op2+op1; break; // notem que usamos o segundo operador
          case '-' : resultado = op2-op1; break; // antes do primeiro, considerando a
          case '*' : resultado = op2*op1; break; // ordem de inser��o na pilha
          case '/' : resultado = op2/op1; break; 
          }
        pilha.push(resultado); // colocamos o resultado no topo da pilha
        }    
      else // o pr�ximo token n�o � um operador, deve ser um operando
        {
        double op = Double.parseDouble(nextOp); // convertemos de string para double
        pilha.push(op); // colocamos no topo da pilha
        }
      }
    // Ao final do processamento dos tokens, a pilha dever� conter um �nico elemento
    // que � o resultado da express�o.
    return pilha.pop();
    }

  } // fim da classe AvaliadorDeExpressoes
