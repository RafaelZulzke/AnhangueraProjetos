
import java.util.Scanner;


/**
 * A classe JogoDaForca encapsula os mecanismos de um jogo da forca simples. O 
 * objetivo do jogo é adivinhar a palavra determinada por um adversário em um número 
 * mínimo de tentativas. A classe implementa o construtor, um método que permite a 
 * interação com o usuário, métodos para a apresentação de resultados parciais e um 
 * método que verifica se a palavra já foi completamente adivinhada. 
 * Esta classe assume que os caracteres da palavra encapsulada e os caracteres
 * entrados pelo método pergunta são todos minúsculos.
 */
class JogoDaForca // declaração da classe
{

    /**
     * Os campos da classe.
     */
    private String palavra; // a palavra encapsulada pelo jogo, que deve ser adivinhada
    private int comprimento; // o comprimento desta palavra, em caracteres
    private boolean[] corretas; // um array de valores booleanos que indicará, para
    // cada letra, se ela já foi corretamente adivinhada
    private boolean[] letrasUtilizadas; // um array de valores booleanos que indicará,
    // para cada letra do alfabeto, se ela já foi
    // utilizada

    /**
     * O construtor da classe. O constutor receberá um argumento que é a palavra que deve
     * ser adivinhada, e preencherá os outros campos desta classe de acordo com
     * informações obtidas desta palavra.
     * @param aPalavra a palavra a ser adivinhada
     */
    JogoDaForca(String aPalavra) {
        // Inicializamos a palavra a ser adivinhada.
        palavra = aPalavra;
        // Calculamos e armazenamos seu comprimento, isto é, seu número de caracteres.
        comprimento = palavra.length();
        // Criamos um array com um valor booleano para cada caractere na palavra.
        corretas = new boolean[comprimento];
        // Criamos um array com um valor booleano para cada letra do alfabeto.
        letrasUtilizadas = new boolean[26];
    }

    /**
     * O método pergunta, que mostra o resultado do jogo até o presente momento e
     * pergunta ao usuário qual é o próximo caractere a ser adivinhado. Este método
     * modifica os arrays encapsulados pela classe, atualizando as letras da palavra que
     * já foram adivinhadas corretamente e as letras do alfabeto que já foram utilizadas.
     */
    public void pergunta() {
        // Mostramos ao jogador quais letras da palavra já foram adivinhadas
        mostraAdivinhadas();
        // Mostramos ao jogador quais letras do alfabeto já foram utilizadas
        mostraUtilizadas();
        // Pedimos ao usuário que entre uma letra
        System.out.print("Entre uma letra:");
        Scanner sc = new Scanner(System.in);
        char tentativa = sc.next().charAt(0);
        // Dizemos que aquela letra já foi utilizada
        letrasUtilizadas[tentativa - 'a'] = true;
        // Marcamos todas as letras iguais a esta no array de letras ocultas
        for (int i = 0; i < comprimento; i++) {
            if (palavra.charAt(i) == tentativa) {
                corretas[i] = true;
            }
        }
    }

    /**
     * O método mostraAdivinhadas, que mostra quais letras da palavra já foram
     * adivinhadas. Este método é chamado como uma sub-rotina de outro método desta
     * classe, podendo ser declarado como privado.
     */
    private void mostraAdivinhadas() {
        // Mostramos ao usuário as letras da palavra que já foram adivinhadas
        System.out.print("Adivinhado até agora: ");
        // Para cada letra na palavra...
        for (int i = 0; i < comprimento; i++) {
            if (corretas[i]) // se ela já foi adivinhada
            {
                System.out.print(palavra.charAt(i)); // imprimimos a letra
            } else // senão
            {
                System.out.print("_"); // imprimimos o caractere '_'
            }
        }
        System.out.println(); // pulamos uma linha
    }

    /**
     * O método mostraUtilizadas, que mostra quais letras do alfabeto já foram
     * utilizadas. Este método é chamado como uma sub-rotina de outro método desta
     * classe, podendo ser declarado como privado.
     */
    private void mostraUtilizadas() {
        // Mostramos ao usuários as letras do alfabeto que já foram utilizadas
        System.out.print("Letras já utilizadas: ");
        // Para cada letra do alfabeto...
        for (int i = 0; i < 26; i++) {
            if (letrasUtilizadas[i]) // se já foi utilizada
            {
                System.out.print((char) ('a' + i)); // imprimimos a letra
            }
        }
        System.out.println(); // pulamos uma linha
    }

    /**
     * O método quantasLetrasAindaNãoAdivinhadas, que calcula e retorna o número de
     * letras da palavra que ainda não foram adivinhadas.
     * @return o número de letras da palavra que ainda não foram adivinhadas
     */
    public int quantasLetrasAindaNãoAdivinhadas() {
        // O total de letras não adivinhadas é inicialmente zero
        int quantasNãoAdivinhadas = 0;
        // Para cada letra da palavra...
        for (int i = 0; i < comprimento; i++) {
            if (!corretas[i]) // se a letra não tiver sido adivinhada ...
            {
                quantasNãoAdivinhadas++; // incrementamos o i.
            }
        }
        return quantasNãoAdivinhadas;
    }
} // fim da classe JogoDaForca
