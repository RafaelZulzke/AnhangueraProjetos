/** 
 * A classe DemoProbabilidadeBasica demonstra o uso dos métodos estáticos da 
 * classe ProbabilidadeBasica.
 */
class DemoProbabilidadeBasica // declaração da classe 
  { 
 /**
  * O método main permite a execução desta classe. Este método chama os métodos
  * estáticos da classe ProbabilidadeBasica para sua demonstração.
  * @param argumentos os argumentos que podem ser passados para o método via linha 
  *        de comando, mas que neste caso serão ignorados.
  */
  public static void main(String[] argumentos)
    {
    // Problema de combinações: quantos conjuntos diferentes de três pessoas
    // podemos criar de um grupo de seis pessoas ?
    System.out.println(ProbabilidadeBasica.combinações(6,3));   // 20
    // Problema de combinações: quantos times diferentes de futebol (titulares) podemos
    // fazer se temos vinte e dois jogadores ?
    System.out.println(ProbabilidadeBasica.combinações(22,11)); // 705432
    // Problema de permutações: de quantas maneiras diferentes podemos sentar seis
    // pessoas em uma mesa ?
    System.out.println(ProbabilidadeBasica.permutações(6,6));   // 720
    // Problema de permutações: e se tivermos dez pessoas mas só cinco assentos ?
    System.out.println(ProbabilidadeBasica.permutações(10,5));  // 30240 
    } // fim do método main

  } // fim da classe DemoProbabilidadeBasica
