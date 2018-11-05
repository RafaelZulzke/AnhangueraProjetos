/** 
 * A classe DemoProbabilidadeBasica demonstra o uso dos m�todos est�ticos da 
 * classe ProbabilidadeBasica.
 */
class DemoProbabilidadeBasica // declara��o da classe 
  { 
 /**
  * O m�todo main permite a execu��o desta classe. Este m�todo chama os m�todos
  * est�ticos da classe ProbabilidadeBasica para sua demonstra��o.
  * @param argumentos os argumentos que podem ser passados para o m�todo via linha 
  *        de comando, mas que neste caso ser�o ignorados.
  */
  public static void main(String[] argumentos)
    {
    // Problema de combina��es: quantos conjuntos diferentes de tr�s pessoas
    // podemos criar de um grupo de seis pessoas ?
    System.out.println(ProbabilidadeBasica.combina��es(6,3));   // 20
    // Problema de combina��es: quantos times diferentes de futebol (titulares) podemos
    // fazer se temos vinte e dois jogadores ?
    System.out.println(ProbabilidadeBasica.combina��es(22,11)); // 705432
    // Problema de permuta��es: de quantas maneiras diferentes podemos sentar seis
    // pessoas em uma mesa ?
    System.out.println(ProbabilidadeBasica.permuta��es(6,6));   // 720
    // Problema de permuta��es: e se tivermos dez pessoas mas s� cinco assentos ?
    System.out.println(ProbabilidadeBasica.permuta��es(10,5));  // 30240 
    } // fim do m�todo main

  } // fim da classe DemoProbabilidadeBasica
