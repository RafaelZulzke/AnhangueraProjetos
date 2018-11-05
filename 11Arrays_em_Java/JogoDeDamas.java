
/**
 * A classe JogoDeDamas encapsula um tabuleiro de jogo de damas usando um
 * array de duas dimensões. Casas vazias no tabuleiro são representadas pelo
 * caractere '.', e casas com peças pelos caracteres 'o' e 'x'. Esta versão da 
 * classe não prevê a representação de peças duplas (damas), que poderiam ser
 * representadas por '@' e '*'.
 */
class JogoDeDamas // declaração da classe
{
    /*
     * O tabuleiro é representado por um array de caracteres de duas dimensões, com o
     * tamanho 8x8. Para evitar a manipulação direta do tabuleiro, o campo que o
     * representa é declarado como private.
     */

    private char tabuleiro[][];

    /**
     * O construtor da classe, que não recebe nenhum argumento. O construtor alocará
     * o array de duas dimensões que representa o tabuleiro e inicializará as posições
     * do tabuleiro de forma a representar o jogo em seu início.
     */
    JogoDeDamas() {
        // A alocação é simples, o tabuleiro tem sempre 8x8 posições
        tabuleiro = new char[8][8];
        // Inicializamos todas as posições do tabuleiro com o caractere ponto ('.')
        // que representa a ausência de peças na posição.
        for (int linha = 0; linha < 8; linha++) {
            for (int coluna = 0; coluna < 8; coluna++) {
                tabuleiro[linha][coluna] = '.'; // todas as posições inicializadas com pontos
            }    // Inicialmente, todas as peças estão em posições predefinidas: as do jogador
        }    // que está de frente para o tabuleiro são marcadas com o caractere 'o' ...
        for (int linha = 0; linha <= 1; linha++) // somente as duas primeiras linhas
        {
            for (int coluna = 0; coluna < 8; coluna++) {
                tabuleiro[linha][coluna] = 'o';
            }
        }
        // ... e as do outro jogador (que está do lado oposto do tabuleiro) são marcadas
        // com o caractere 'x'.
        for (int linha = 6; linha <= 7; linha++) // somente as duas últimas linhas
        {
            for (int coluna = 0; coluna < 8; coluna++) {
                tabuleiro[linha][coluna] = 'x';
            }
        }
    } // fim do construtor

    /**
     * O método toString não recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados. No caso desta classe, o array de duas dimensões
     * será formatado como se fosse um pequeno tabuleiro de damas.
     * @return uma string contendo uma representação do tabuleiro de damas
     */
    public String toString() {
        String resultado = ""; // esta string receberá o resultado
        for (int linha = 0; linha < 8; linha++) // para todas as linhas do tabuleiro...
        {
            for (int coluna = 0; coluna < 8; coluna++) // para cada coluna do tabuleiro
            {
                resultado += tabuleiro[linha][coluna]; // concatena a peça naquela posição
            }      // e inclui uma quebra de linha no final de cada linha do tabuleiro
            resultado += "\n";
        }
        return resultado;
    } // fim do método toString
} // fim da classe JogoDeDamas
