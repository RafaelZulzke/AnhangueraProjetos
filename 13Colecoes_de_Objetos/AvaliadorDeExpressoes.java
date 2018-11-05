/* Importamos as classes e interfaces do pacote java.util */  
import java.util.*;

/**
 * A classe AvaliadorDeExpressoes contém um método estático que permite a avaliação
 * de expressões matemáticas do tipo postfix (onde operadores são colocados depois 
 * de pares de operandos e parênteses não são necessários). 
 */
class AvaliadorDeExpressoes
  {
 /**
  * O método avaliaExpressãoPostfix recebe uma string como argumento, quebra a string
  * em seus componentes (tokens) e usa uma instância da classe PilhaDeDoubles para
  * avaliar a expressão no formato postfix contida na string.
  * O algoritmo de avaliação é simples: para cada token da string, verificamos se
  * ele é um operador ou operando. Se for um operador retiramos da pilha os dois
  * primeiros elementos, efetuamos a operação e colocamos o resultado no topo da pilha.
  * Se o token for um operando simplesmente o armazenamos no topo da pilha.
  * Ao final do processamento a pilha deverá ter um único valor que é o resultado da
  * expressão.
  * @param expressão a expressão que deve ser avaliada
  * @return o resultado da avaliação da expressão
  */
  public static double avaliaExpressãoPostfix(String expressão)
    {
    // Criamos uma pilha para armazenar os operandos e resultados
    PilhaDeDoubles pilha = new PilhaDeDoubles(); 
    // Criamos uma instância de StringTokenizer para separar operadores e operandos
    // na string passada como argumento.
    StringTokenizer st = new StringTokenizer(expressão);
    while(st.hasMoreTokens()) // para cada token...
      {
      String nextOp = st.nextToken(); 
      if ("+-*/".indexOf(nextOp.charAt(0)) >= 0) // pequeno truque: verificamos se é um operador
        {                                        // vendo se o caractere faz parte da string "+-*/"
        double op1 = pilha.pop(); // obtemos dois operandos da pilha
        double op2 = pilha.pop();
        double resultado = 0;
        switch(nextOp.charAt(0)) // calculamos o resultado usando o operador
          {
          case '+' : resultado = op2+op1; break; // notem que usamos o segundo operador
          case '-' : resultado = op2-op1; break; // antes do primeiro, considerando a
          case '*' : resultado = op2*op1; break; // ordem de inserção na pilha
          case '/' : resultado = op2/op1; break; 
          }
        pilha.push(resultado); // colocamos o resultado no topo da pilha
        }    
      else // o próximo token não é um operador, deve ser um operando
        {
        double op = Double.parseDouble(nextOp); // convertemos de string para double
        pilha.push(op); // colocamos no topo da pilha
        }
      }
    // Ao final do processamento dos tokens, a pilha deverá conter um único elemento
    // que é o resultado da expressão.
    return pilha.pop();
    }

  } // fim da classe AvaliadorDeExpressoes
