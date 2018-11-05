
/**
 * A classe JogoDeDamas encapsula um tabuleiro de jogo de damas usando um
 * array de duas dimens�es. Casas vazias no tabuleiro s�o representadas pelo
 * caractere '.', e casas com pe�as pelos caracteres 'o' e 'x'. Esta vers�o da 
 * classe n�o prev� a representa��o de pe�as duplas (damas), que poderiam ser
 * representadas por '@' e '*'.
 */
class JogoDeDamas // declara��o da classe
{
    /*
     * O tabuleiro � representado por um array de caracteres de duas dimens�es, com o
     * tamanho 8x8. Para evitar a manipula��o direta do tabuleiro, o campo que o
     * representa � declarado como private.
     */

    private char tabuleiro[][];

    /**
     * O construtor da classe, que n�o recebe nenhum argumento. O construtor alocar�
     * o array de duas dimens�es que representa o tabuleiro e inicializar� as posi��es
     * do tabuleiro de forma a representar o jogo em seu in�cio.
     */
    JogoDeDamas() {
        // A aloca��o � simples, o tabuleiro tem sempre 8x8 posi��es
        tabuleiro = new char[8][8];
        // Inicializamos todas as posi��es do tabuleiro com o caractere ponto ('.')
        // que representa a aus�ncia de pe�as na posi��o.
        for (int linha = 0; linha < 8; linha++) {
            for (int coluna = 0; coluna < 8; coluna++) {
                tabuleiro[linha][coluna] = '.'; // todas as posi��es inicializadas com pontos
            }    // Inicialmente, todas as pe�as est�o em posi��es predefinidas: as do jogador
        }    // que est� de frente para o tabuleiro s�o marcadas com o caractere 'o' ...
        for (int linha = 0; linha <= 1; linha++) // somente as duas primeiras linhas
        {
            for (int coluna = 0; coluna < 8; coluna++) {
                tabuleiro[linha][coluna] = 'o';
            }
        }
        // ... e as do outro jogador (que est� do lado oposto do tabuleiro) s�o marcadas
        // com o caractere 'x'.
        for (int linha = 6; linha <= 7; linha++) // somente as duas �ltimas linhas
        {
            for (int coluna = 0; coluna < 8; coluna++) {
                tabuleiro[linha][coluna] = 'x';
            }
        }
    } // fim do construtor

    /**
     * O m�todo toString n�o recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados. No caso desta classe, o array de duas dimens�es
     * ser� formatado como se fosse um pequeno tabuleiro de damas.
     * @return uma string contendo uma representa��o do tabuleiro de damas
     */
    public String toString() {
        String resultado = ""; // esta string receber� o resultado
        for (int linha = 0; linha < 8; linha++) // para todas as linhas do tabuleiro...
        {
            for (int coluna = 0; coluna < 8; coluna++) // para cada coluna do tabuleiro
            {
                resultado += tabuleiro[linha][coluna]; // concatena a pe�a naquela posi��o
            }      // e inclui uma quebra de linha no final de cada linha do tabuleiro
            resultado += "\n";
        }
        return resultado;
    } // fim do m�todo toString
} // fim da classe JogoDeDamas
