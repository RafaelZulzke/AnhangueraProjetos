/**
 * A classe OitoRainhas tenta resolver o problema das oito rainhas. Esta classe
 * cont�m um m�todo main que permite a sua execu��o e alguns m�todos auxilares 
 * (sub-rotinas) para facilitar a implementa��o do algoritmo.
 */
class OitoRainhas
  {
 /*
  * O array que conter� as inst�ncias da classe Rainha ser� declarado fora dos m�todos
  * para que todos os m�todos possam acess�-lo.
  */
  private static Rainha[] rainhas;

 /**
  * O m�todo main permite a execu��o desta classe. Este m�todo inicializa o array de
  * inst�ncias da classe Rainha e movimenta-as tentando achar uma solu��o para o 
  * problema.
  * @param argumentos os argumentos que podem ser passados para o m�todo via linha
  *        de comando, mas que neste caso ser�o ignorados.
  */
 public static void main(String[] argumentos)
    {
    // Inicializamos o array que foi declarado como global para a classe.
    rainhas = new Rainha[8];
    // Inicializamos cada inst�ncia da classe Rainha no array. Cada inst�ncia ter�
    // um nome composto da palavra "Rainha" mais um n�mero de um a oito.
    for(int rainha=0;rainha<8;rainha++)
      rainhas[rainha] = new Rainha("Rainha "+(rainha+1),8,8);
    // Consideramos a rainha da vez como sendo a primeira, de �ndice zero, e a
    // posicionamos no tabuleiro na primeira posi��o.
    int rainhaDaVez = 0;
    rainhas[rainhaDaVez].p�eNoTabuleiro();
    // Consideramos a rainha da vez como sendo a segunda, de �ndice um, e a
    // posicionamos no tabuleiro na primeira posi��o. Isto gera uma possibilidade de
    // ataque, que ser� resolvida logo no la�o principal do algoritmo.
    rainhaDaVez++;
    rainhas[rainhaDaVez].p�eNoTabuleiro();
    // Enquanto ainda houver rainhas a ser posicionadas
    while(rainhaDaVez < 8)
      {
      // Enquanto a rainha da vez puder ser atacada e enquanto ela puder se mover
      while (podeSerAtacada(rainhas[rainhaDaVez]) && rainhas[rainhaDaVez].podeMover())
        {
        rainhas[rainhaDaVez].move(); // procuramos uma nova posi��o para esta rainha
        }
      // Neste ponto, uma de duas situa��es deve ter acontecido: se a rainha ainda 
      // puder se mover, quer dizer que ela foi posicionada com sucesso (livre de
      // ataques). Neste caso, fazemos a pr�xima rainha ser a da vez, a n�o ser que
      // esta tenha sido a �ltima.
      if (rainhas[rainhaDaVez].podeMover())
        {
        rainhaDaVez++;
        if (rainhaDaVez < 8) // n�o podemos p�r a pr�xima rainha se esta foi a �ltima
            rainhas[rainhaDaVez].p�eNoTabuleiro();
        }
      // Se a rainha n�o puder mais se mover, quer dizer que esgotamos as possibili-
      // dades de posicionamento. Tiramos esta rainha do tabuleiro e consideramos
      // a rainha da vez como sendo a rainha anterior, que ser� movida imediatamente
      // (pois a sua posi��o atual n�o permitiu uma solu��o para o problema).
      else
        {
        rainhas[rainhaDaVez].tiraDoTabuleiro();
        rainhaDaVez--;
        rainhas[rainhaDaVez].move();
        }
      // Independente do que houve, se a rainha da vez for a primeira, e n�o puder 
      // mais se mover, consideramos que o algoritmo falhou em achar uma solu��o e 
      // o interrompemos.
      if ((rainhaDaVez == 0) && (!rainhas[rainhaDaVez].podeMover()))
        {
        break;
        }
      } // fim do la�o principal
    // Imprimimos a solu��o encontrada
    System.out.println("Solu��o encontrada:");
    for(int rainha=0;rainha<8;rainha++) 
      System.out.println(rainhas[rainha]);
    } // fim do m�todo main
     
 /**
  * O m�todo podeSerAtacada recebe como argumento uma inst�ncia da classe Rainha e
  * verifica se esta pode ser atacada pelas outras rainhas posicionadas no tabuleiro.
  * @param esta a inst�ncia da classe Rainha que est� sendo verificada
  * @return true se a rainha puder ser atacada por qualquer outra que j� esteja
  *         posicionada no tabuleiro, false se estiver segura.
  */
  private static boolean podeSerAtacada(Rainha esta)
    {
    // Em princ�pio consideramos que a rainha n�o pode ser atacada e vamos tentar 
    // provar o contr�rio.
    boolean podeSerAtacada = false;
    // Para todas as rainhas do problema, verificamos
    for(int qual=0;qual<8;qual++) 
      {
      // N�o devemos considerar ataques da rainha para ela mesma: procuramos a pr�xima.
      if (rainhas[qual] == esta) continue; // voltamos ao in�cio do la�o 
      if (rainhas[qual].podeAtacar(esta)) // Se a rainha do array puder atacar esta,
        podeSerAtacada = true;            // marcamos a vari�vel como true.
      }
    return podeSerAtacada;
    }
    
  } // fim da classe OitoRainhas
