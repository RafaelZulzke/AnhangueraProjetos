
import java.util.Scanner;


/**
 * A classe JogoDaForca encapsula os mecanismos de um jogo da forca simples. O 
 * objetivo do jogo � adivinhar a palavra determinada por um advers�rio em um n�mero 
 * m�nimo de tentativas. A classe implementa o construtor, um m�todo que permite a 
 * intera��o com o usu�rio, m�todos para a apresenta��o de resultados parciais e um 
 * m�todo que verifica se a palavra j� foi completamente adivinhada. 
 * Esta classe assume que os caracteres da palavra encapsulada e os caracteres
 * entrados pelo m�todo pergunta s�o todos min�sculos.
 */
class JogoDaForca // declara��o da classe
{

    /**
     * Os campos da classe.
     */
    private String palavra; // a palavra encapsulada pelo jogo, que deve ser adivinhada
    private int comprimento; // o comprimento desta palavra, em caracteres
    private boolean[] corretas; // um array de valores booleanos que indicar�, para
    // cada letra, se ela j� foi corretamente adivinhada
    private boolean[] letrasUtilizadas; // um array de valores booleanos que indicar�,
    // para cada letra do alfabeto, se ela j� foi
    // utilizada

    /**
     * O construtor da classe. O constutor receber� um argumento que � a palavra que deve
     * ser adivinhada, e preencher� os outros campos desta classe de acordo com
     * informa��es obtidas desta palavra.
     * @param aPalavra a palavra a ser adivinhada
     */
    JogoDaForca(String aPalavra) {
        // Inicializamos a palavra a ser adivinhada.
        palavra = aPalavra;
        // Calculamos e armazenamos seu comprimento, isto �, seu n�mero de caracteres.
        comprimento = palavra.length();
        // Criamos um array com um valor booleano para cada caractere na palavra.
        corretas = new boolean[comprimento];
        // Criamos um array com um valor booleano para cada letra do alfabeto.
        letrasUtilizadas = new boolean[26];
    }

    /**
     * O m�todo pergunta, que mostra o resultado do jogo at� o presente momento e
     * pergunta ao usu�rio qual � o pr�ximo caractere a ser adivinhado. Este m�todo
     * modifica os arrays encapsulados pela classe, atualizando as letras da palavra que
     * j� foram adivinhadas corretamente e as letras do alfabeto que j� foram utilizadas.
     */
    public void pergunta() {
        // Mostramos ao jogador quais letras da palavra j� foram adivinhadas
        mostraAdivinhadas();
        // Mostramos ao jogador quais letras do alfabeto j� foram utilizadas
        mostraUtilizadas();
        // Pedimos ao usu�rio que entre uma letra
        System.out.print("Entre uma letra:");
        Scanner sc = new Scanner(System.in);
        char tentativa = sc.next().charAt(0);
        // Dizemos que aquela letra j� foi utilizada
        letrasUtilizadas[tentativa - 'a'] = true;
        // Marcamos todas as letras iguais a esta no array de letras ocultas
        for (int i = 0; i < comprimento; i++) {
            if (palavra.charAt(i) == tentativa) {
                corretas[i] = true;
            }
        }
    }

    /**
     * O m�todo mostraAdivinhadas, que mostra quais letras da palavra j� foram
     * adivinhadas. Este m�todo � chamado como uma sub-rotina de outro m�todo desta
     * classe, podendo ser declarado como privado.
     */
    private void mostraAdivinhadas() {
        // Mostramos ao usu�rio as letras da palavra que j� foram adivinhadas
        System.out.print("Adivinhado at� agora: ");
        // Para cada letra na palavra...
        for (int i = 0; i < comprimento; i++) {
            if (corretas[i]) // se ela j� foi adivinhada
            {
                System.out.print(palavra.charAt(i)); // imprimimos a letra
            } else // sen�o
            {
                System.out.print("_"); // imprimimos o caractere '_'
            }
        }
        System.out.println(); // pulamos uma linha
    }

    /**
     * O m�todo mostraUtilizadas, que mostra quais letras do alfabeto j� foram
     * utilizadas. Este m�todo � chamado como uma sub-rotina de outro m�todo desta
     * classe, podendo ser declarado como privado.
     */
    private void mostraUtilizadas() {
        // Mostramos ao usu�rios as letras do alfabeto que j� foram utilizadas
        System.out.print("Letras j� utilizadas: ");
        // Para cada letra do alfabeto...
        for (int i = 0; i < 26; i++) {
            if (letrasUtilizadas[i]) // se j� foi utilizada
            {
                System.out.print((char) ('a' + i)); // imprimimos a letra
            }
        }
        System.out.println(); // pulamos uma linha
    }

    /**
     * O m�todo quantasLetrasAindaN�oAdivinhadas, que calcula e retorna o n�mero de
     * letras da palavra que ainda n�o foram adivinhadas.
     * @return o n�mero de letras da palavra que ainda n�o foram adivinhadas
     */
    public int quantasLetrasAindaN�oAdivinhadas() {
        // O total de letras n�o adivinhadas � inicialmente zero
        int quantasN�oAdivinhadas = 0;
        // Para cada letra da palavra...
        for (int i = 0; i < comprimento; i++) {
            if (!corretas[i]) // se a letra n�o tiver sido adivinhada ...
            {
                quantasN�oAdivinhadas++; // incrementamos o i.
            }
        }
        return quantasN�oAdivinhadas;
    }
} // fim da classe JogoDaForca
