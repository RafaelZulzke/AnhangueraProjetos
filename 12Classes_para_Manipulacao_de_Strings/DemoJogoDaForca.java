
/**
 * A classe DemoJogoDaForca demonstra o uso da classe JogoDaForca. 
 */
class DemoJogoDaForca // declaração da classe
{

    /**
     * O método main permite a execução desta classe. Este método contém a declaração
     * de uma instância da classe JogoDaForca, e executa métodos desta classe
     * que implementam um jogo simples de Forca.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma instância da classe, passando para o construtor a palavra
        // a ser adivinhada
        JogoDaForca jf = new JogoDaForca("miraculosamente");
        // Enquanto o jogador não acerta a palavra (isto é, enquanto ainda existem
        // letras que não foram adivinhadas)...
        while (jf.quantasLetrasAindaNãoAdivinhadas() > 0) {
            jf.pergunta(); // perguntamos a nova letra
        }
    } // fim do método main 
} // fim da classe DemoJogoDaForca
