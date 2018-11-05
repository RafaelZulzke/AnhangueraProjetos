
/**
 * A classe DemoJogoDaForca demonstra o uso da classe JogoDaForca. 
 */
class DemoJogoDaForca // declara��o da classe
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m a declara��o
     * de uma inst�ncia da classe JogoDaForca, e executa m�todos desta classe
     * que implementam um jogo simples de Forca.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma inst�ncia da classe, passando para o construtor a palavra
        // a ser adivinhada
        JogoDaForca jf = new JogoDaForca("miraculosamente");
        // Enquanto o jogador n�o acerta a palavra (isto �, enquanto ainda existem
        // letras que n�o foram adivinhadas)...
        while (jf.quantasLetrasAindaN�oAdivinhadas() > 0) {
            jf.pergunta(); // perguntamos a nova letra
        }
    } // fim do m�todo main 
} // fim da classe DemoJogoDaForca
