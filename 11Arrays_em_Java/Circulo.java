
/** 
 * A classe Circulo implementa a interface ObjetoGeometrico e representa um 
 * círculo. Esta classe encapsula o ponto central do círculo e seu raio. Todos os 
 * métodos declarados na interface ObjetoGeometrico são implementados.
 */
class Circulo implements ObjetoGeometrico // declaração da classe
{

    /**
     * Declaração dos campos da classe
     */
    private Ponto2D centro;
    private double raio;

    /**
     * O construtor para a classe Circulo, que recebe argumentos para inicializar todos
     * os campos da classe. Este é o construtor "completo".
     * @param centro o centro do círculo (uma instância da classe Ponto2D)
     * @param raio o raio do círculo
     */
    Circulo(Ponto2D centro, double raio) {
        this.centro = centro; // Note o uso da palavra-chave this para marcar os campos
        this.raio = raio;     // da classe que têm o mesmo nome dos argumentos
    }

    /**
     * O método centro retorna o ponto em duas dimensões que corresponde ao centro do
     * círculo. Neste caso, basta retornar a instância da classe Ponto2D que representa
     * o próprio centro.
     * @return uma instância da classe Ponto2D representando o centro do círculo
     */
    public Ponto2D centro() {
        return centro;
    }

    /**
     * O método calculaÁrea calcula a área do círculo e retorna a área como um valor do
     * tipo double.
     * @return a área deste círculo
     */
    public double calculaÁrea() {
        return Math.PI * raio * raio; // pi vezes o quadrado do raio
    }

    /**
     * O método calculaPerímetro calcula o perímetro do círculo e retorna o perímetro
     * como um valor do tipo double.
     * @return o perímetro deste círculo
     */
    public double calculaPerímetro() {
        return 2.0 * Math.PI * raio; // dois vezes pi vezes o raio
    }

    /**
     * O método toString retorna os valores dos campos do círculo formatados em uma
     * string.
     * @return uma string contendo uma representação dos campos do círculo
     */
    public String toString() {
        // Retorna diretamente uma string criada com os valores dos campos. O método
        // toString da classe Ponto2D é chamado implicitamente.
        return "Círculo com centro em " + centro + " e raio " + raio;
    }
} // fim da classe Circulo
