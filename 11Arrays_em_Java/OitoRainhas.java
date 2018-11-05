/**
 * A classe OitoRainhas tenta resolver o problema das oito rainhas. Esta classe
 * contém um método main que permite a sua execução e alguns métodos auxilares 
 * (sub-rotinas) para facilitar a implementação do algoritmo.
 */
class OitoRainhas
  {
 /*
  * O array que conterá as instâncias da classe Rainha será declarado fora dos métodos
  * para que todos os métodos possam acessá-lo.
  */
  private static Rainha[] rainhas;

 /**
  * O método main permite a execução desta classe. Este método inicializa o array de
  * instâncias da classe Rainha e movimenta-as tentando achar uma solução para o 
  * problema.
  * @param argumentos os argumentos que podem ser passados para o método via linha
  *        de comando, mas que neste caso serão ignorados.
  */
 public static void main(String[] argumentos)
    {
    // Inicializamos o array que foi declarado como global para a classe.
    rainhas = new Rainha[8];
    // Inicializamos cada instância da classe Rainha no array. Cada instância terá
    // um nome composto da palavra "Rainha" mais um número de um a oito.
    for(int rainha=0;rainha<8;rainha++)
      rainhas[rainha] = new Rainha("Rainha "+(rainha+1),8,8);
    // Consideramos a rainha da vez como sendo a primeira, de índice zero, e a
    // posicionamos no tabuleiro na primeira posição.
    int rainhaDaVez = 0;
    rainhas[rainhaDaVez].põeNoTabuleiro();
    // Consideramos a rainha da vez como sendo a segunda, de índice um, e a
    // posicionamos no tabuleiro na primeira posição. Isto gera uma possibilidade de
    // ataque, que será resolvida logo no laço principal do algoritmo.
    rainhaDaVez++;
    rainhas[rainhaDaVez].põeNoTabuleiro();
    // Enquanto ainda houver rainhas a ser posicionadas
    while(rainhaDaVez < 8)
      {
      // Enquanto a rainha da vez puder ser atacada e enquanto ela puder se mover
      while (podeSerAtacada(rainhas[rainhaDaVez]) && rainhas[rainhaDaVez].podeMover())
        {
        rainhas[rainhaDaVez].move(); // procuramos uma nova posição para esta rainha
        }
      // Neste ponto, uma de duas situações deve ter acontecido: se a rainha ainda 
      // puder se mover, quer dizer que ela foi posicionada com sucesso (livre de
      // ataques). Neste caso, fazemos a próxima rainha ser a da vez, a não ser que
      // esta tenha sido a última.
      if (rainhas[rainhaDaVez].podeMover())
        {
        rainhaDaVez++;
        if (rainhaDaVez < 8) // não podemos pôr a próxima rainha se esta foi a última
            rainhas[rainhaDaVez].põeNoTabuleiro();
        }
      // Se a rainha não puder mais se mover, quer dizer que esgotamos as possibili-
      // dades de posicionamento. Tiramos esta rainha do tabuleiro e consideramos
      // a rainha da vez como sendo a rainha anterior, que será movida imediatamente
      // (pois a sua posição atual não permitiu uma solução para o problema).
      else
        {
        rainhas[rainhaDaVez].tiraDoTabuleiro();
        rainhaDaVez--;
        rainhas[rainhaDaVez].move();
        }
      // Independente do que houve, se a rainha da vez for a primeira, e não puder 
      // mais se mover, consideramos que o algoritmo falhou em achar uma solução e 
      // o interrompemos.
      if ((rainhaDaVez == 0) && (!rainhas[rainhaDaVez].podeMover()))
        {
        break;
        }
      } // fim do laço principal
    // Imprimimos a solução encontrada
    System.out.println("Solução encontrada:");
    for(int rainha=0;rainha<8;rainha++) 
      System.out.println(rainhas[rainha]);
    } // fim do método main
     
 /**
  * O método podeSerAtacada recebe como argumento uma instância da classe Rainha e
  * verifica se esta pode ser atacada pelas outras rainhas posicionadas no tabuleiro.
  * @param esta a instância da classe Rainha que está sendo verificada
  * @return true se a rainha puder ser atacada por qualquer outra que já esteja
  *         posicionada no tabuleiro, false se estiver segura.
  */
  private static boolean podeSerAtacada(Rainha esta)
    {
    // Em princípio consideramos que a rainha não pode ser atacada e vamos tentar 
    // provar o contrário.
    boolean podeSerAtacada = false;
    // Para todas as rainhas do problema, verificamos
    for(int qual=0;qual<8;qual++) 
      {
      // Não devemos considerar ataques da rainha para ela mesma: procuramos a próxima.
      if (rainhas[qual] == esta) continue; // voltamos ao início do laço 
      if (rainhas[qual].podeAtacar(esta)) // Se a rainha do array puder atacar esta,
        podeSerAtacada = true;            // marcamos a variável como true.
      }
    return podeSerAtacada;
    }
    
  } // fim da classe OitoRainhas
