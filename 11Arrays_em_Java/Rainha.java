/**
 * A classe Rainha encapsula os dados e comportamento de uma rainha do jogo
 * de xadrez, para uso no algoritmo das 8 rainhas.
 */
class Rainha // declara��o da classe
  {
 /*
  * Os campos da classe
  */
  // O nome da rainha, para identifica��o e diferencia��o das outras.
  private String nome; 
  // A posi��o atual da rainha (protegido pois poder� ser herdado)
  protected int linha,coluna;
  // O tamanho do tabuleiro onde a rainha ir� se mover.
  private int linhasDoTabuleiro,colunasDoTabuleiro;
  // Este campo indica se a rainha pode se mover (ou se j� percorreu todas as
  // posi��es do tabuleiro)
  private boolean podeMover;

 /**
  * O construtor da classe, que recebe como argumentos o nome da rainha e o tamanho
  * do tabuleiro onde esta ir� se mover.
  * @param nome o nome da rainha (para identifica��o e diferencia��o das outras)
  * @param linhas o n�mero de linhas no tabuleiro onde a rainha ir� se mover.
  * @param colunas o n�mero de colunas no tabuleiro onde a rainha ir� se mover.
  */
  Rainha(String nome,int linhas,int colunas)
    {
    this.nome = nome;
    linhasDoTabuleiro = linhas;
    colunasDoTabuleiro = colunas;
    linha = 0;  // posi��o inicial � fora do tabuleiro
    coluna = 0;
    podeMover = true; 
    }

 /**
  * O m�todo tiraDoTabuleiro coloca a rainha no "canto" (0,0) (fora do tabuleiro)
  * e indica que a rainha pode se mover no tabuleiro. Este m�todo ser� chamado cada 
  * vez que retirarmos uma rainha no tabuleiro.
  */
  public void tiraDoTabuleiro()
    {
    linha = 0;
    coluna = 0;
    podeMover = true;
    }

 /**
  * O m�todo p�eNoTabuleiro coloca esta rainha no in�cio do tabuleiro (coordenadas
  * 1,1). Este m�todo ser� chamado cada vez que colocarmos uma rainha no tabuleiro.
  */
  public void p�eNoTabuleiro()
    {
    linha = 1;
    coluna = 1;
    }

 /**
  * O m�todo move, que faz com que a rainha ande uma posi��o no tabuleiro, primeiro 
  * andando nas linhas at� que estas acabem, ent�o mudando para a coluna seguinte.
  * Este m�todo verifica o tamanho do tabuleiro usando um campo est�tico p�blico da
  * classe Tabuleiro. Este m�todo pode modificar o valor do campo podeMover.
  */
  public void move()
    {
    linha = linha + 1; // move a rainha para a pr�xima linha
    if (linha > linhasDoTabuleiro) // se a linha for a �ltima do tabuleiro
      {
      coluna = coluna + 1;  // movemos a rainha para a primeira linha da pr�xima
      linha = 1;            // coluna do tabuleiro
      }
    if (coluna > colunasDoTabuleiro) // mas se a coluna for a �ltima do tabuleiro
      podeMover = false; // indicamos que esta rainha n�o pode mais se mover
    }

 /**
  * O m�todo podeAtacar recebe como argumento uma outra inst�ncia da classe Rainha e
  * retorna true se a rainha encapsulada puder atacar a rainha passada como argumento.
  * Uma rainha pode atacar outra se ambas estiverem na mesma linha, ambas estiverem 
  * na mesma coluna, ou se ambas estiverem na mesma diagonal.
  * @param outraRainha outra inst�ncia da mesma classe para compara��o de ataque
  * @return true se as duas rainhas podem se atacar, false caso contr�rio.
  */
  public boolean podeAtacar(Rainha outraRainha)
    {
    // Se a rainha ainda n�o entrou no tabuleiro, retorna falso
    if ((this.linha == 0) && (this.coluna == 0)) return false;
    // Considera que em princ�pio as rainhas n�o podem se atacar e tenta provar 
    // o contr�rio.
    boolean resultado = false;
    if (this.linha == outraRainha.linha) // se as linhas forem iguais
      resultado = true; // significa que as rainhas podem se atacar
    if (this.coluna == outraRainha.coluna) // se as colunas forem iguais
      resultado = true; // significa que as rainhas podem se atacar
    // Se a diferen�a entre linha e coluna de uma rainha for igual � de outra,
    // elas estar�o na mesma diagonal (inclinada para baixo)
    if ((this.coluna-this.linha) == 
        (outraRainha.coluna-outraRainha.linha)) 
      resultado = true; // e significa que as rainhas podem se atacar
    // Se a soma entre linha e coluna de uma rainha for igual � de outra,
    // elas estar�o na mesma diagonal (inclinada para cima)
    if ((this.coluna+this.linha) == 
        (outraRainha.coluna+outraRainha.linha))
      resultado = true; // e significa que as rainhas podem se atacar
    return resultado;
    }

 /**
  * O m�todo podeMover retorna o valor do campo podeMover.
  * @return o valor do campo podeMover.
  */
  public boolean podeMover()
    {
    return podeMover;
    }

 /** 
  * O m�todo toString retorna informa��es sobre a rainha como uma string.
  * @return os campos desta rainha, formatados 
  */
  public String toString()
    {
    return nome+" (l="+linha+",c="+coluna+")["+podeMover+"]";
    }

  } // fim da classe Rainha
