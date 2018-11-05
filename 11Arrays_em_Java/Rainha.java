/**
 * A classe Rainha encapsula os dados e comportamento de uma rainha do jogo
 * de xadrez, para uso no algoritmo das 8 rainhas.
 */
class Rainha // declaração da classe
  {
 /*
  * Os campos da classe
  */
  // O nome da rainha, para identificação e diferenciação das outras.
  private String nome; 
  // A posição atual da rainha (protegido pois poderá ser herdado)
  protected int linha,coluna;
  // O tamanho do tabuleiro onde a rainha irá se mover.
  private int linhasDoTabuleiro,colunasDoTabuleiro;
  // Este campo indica se a rainha pode se mover (ou se já percorreu todas as
  // posições do tabuleiro)
  private boolean podeMover;

 /**
  * O construtor da classe, que recebe como argumentos o nome da rainha e o tamanho
  * do tabuleiro onde esta irá se mover.
  * @param nome o nome da rainha (para identificação e diferenciação das outras)
  * @param linhas o número de linhas no tabuleiro onde a rainha irá se mover.
  * @param colunas o número de colunas no tabuleiro onde a rainha irá se mover.
  */
  Rainha(String nome,int linhas,int colunas)
    {
    this.nome = nome;
    linhasDoTabuleiro = linhas;
    colunasDoTabuleiro = colunas;
    linha = 0;  // posição inicial é fora do tabuleiro
    coluna = 0;
    podeMover = true; 
    }

 /**
  * O método tiraDoTabuleiro coloca a rainha no "canto" (0,0) (fora do tabuleiro)
  * e indica que a rainha pode se mover no tabuleiro. Este método será chamado cada 
  * vez que retirarmos uma rainha no tabuleiro.
  */
  public void tiraDoTabuleiro()
    {
    linha = 0;
    coluna = 0;
    podeMover = true;
    }

 /**
  * O método põeNoTabuleiro coloca esta rainha no início do tabuleiro (coordenadas
  * 1,1). Este método será chamado cada vez que colocarmos uma rainha no tabuleiro.
  */
  public void põeNoTabuleiro()
    {
    linha = 1;
    coluna = 1;
    }

 /**
  * O método move, que faz com que a rainha ande uma posição no tabuleiro, primeiro 
  * andando nas linhas até que estas acabem, então mudando para a coluna seguinte.
  * Este método verifica o tamanho do tabuleiro usando um campo estático público da
  * classe Tabuleiro. Este método pode modificar o valor do campo podeMover.
  */
  public void move()
    {
    linha = linha + 1; // move a rainha para a próxima linha
    if (linha > linhasDoTabuleiro) // se a linha for a última do tabuleiro
      {
      coluna = coluna + 1;  // movemos a rainha para a primeira linha da próxima
      linha = 1;            // coluna do tabuleiro
      }
    if (coluna > colunasDoTabuleiro) // mas se a coluna for a última do tabuleiro
      podeMover = false; // indicamos que esta rainha não pode mais se mover
    }

 /**
  * O método podeAtacar recebe como argumento uma outra instância da classe Rainha e
  * retorna true se a rainha encapsulada puder atacar a rainha passada como argumento.
  * Uma rainha pode atacar outra se ambas estiverem na mesma linha, ambas estiverem 
  * na mesma coluna, ou se ambas estiverem na mesma diagonal.
  * @param outraRainha outra instância da mesma classe para comparação de ataque
  * @return true se as duas rainhas podem se atacar, false caso contrário.
  */
  public boolean podeAtacar(Rainha outraRainha)
    {
    // Se a rainha ainda não entrou no tabuleiro, retorna falso
    if ((this.linha == 0) && (this.coluna == 0)) return false;
    // Considera que em princípio as rainhas não podem se atacar e tenta provar 
    // o contrário.
    boolean resultado = false;
    if (this.linha == outraRainha.linha) // se as linhas forem iguais
      resultado = true; // significa que as rainhas podem se atacar
    if (this.coluna == outraRainha.coluna) // se as colunas forem iguais
      resultado = true; // significa que as rainhas podem se atacar
    // Se a diferença entre linha e coluna de uma rainha for igual à de outra,
    // elas estarão na mesma diagonal (inclinada para baixo)
    if ((this.coluna-this.linha) == 
        (outraRainha.coluna-outraRainha.linha)) 
      resultado = true; // e significa que as rainhas podem se atacar
    // Se a soma entre linha e coluna de uma rainha for igual à de outra,
    // elas estarão na mesma diagonal (inclinada para cima)
    if ((this.coluna+this.linha) == 
        (outraRainha.coluna+outraRainha.linha))
      resultado = true; // e significa que as rainhas podem se atacar
    return resultado;
    }

 /**
  * O método podeMover retorna o valor do campo podeMover.
  * @return o valor do campo podeMover.
  */
  public boolean podeMover()
    {
    return podeMover;
    }

 /** 
  * O método toString retorna informações sobre a rainha como uma string.
  * @return os campos desta rainha, formatados 
  */
  public String toString()
    {
    return nome+" (l="+linha+",c="+coluna+")["+podeMover+"]";
    }

  } // fim da classe Rainha
