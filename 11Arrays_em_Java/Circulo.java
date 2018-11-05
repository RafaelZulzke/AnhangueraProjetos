
/** 
 * A classe Circulo implementa a interface ObjetoGeometrico e representa um 
 * c�rculo. Esta classe encapsula o ponto central do c�rculo e seu raio. Todos os 
 * m�todos declarados na interface ObjetoGeometrico s�o implementados.
 */
class Circulo implements ObjetoGeometrico // declara��o da classe
{

    /**
     * Declara��o dos campos da classe
     */
    private Ponto2D centro;
    private double raio;

    /**
     * O construtor para a classe Circulo, que recebe argumentos para inicializar todos
     * os campos da classe. Este � o construtor "completo".
     * @param centro o centro do c�rculo (uma inst�ncia da classe Ponto2D)
     * @param raio o raio do c�rculo
     */
    Circulo(Ponto2D centro, double raio) {
        this.centro = centro; // Note o uso da palavra-chave this para marcar os campos
        this.raio = raio;     // da classe que t�m o mesmo nome dos argumentos
    }

    /**
     * O m�todo centro retorna o ponto em duas dimens�es que corresponde ao centro do
     * c�rculo. Neste caso, basta retornar a inst�ncia da classe Ponto2D que representa
     * o pr�prio centro.
     * @return uma inst�ncia da classe Ponto2D representando o centro do c�rculo
     */
    public Ponto2D centro() {
        return centro;
    }

    /**
     * O m�todo calcula�rea calcula a �rea do c�rculo e retorna a �rea como um valor do
     * tipo double.
     * @return a �rea deste c�rculo
     */
    public double calcula�rea() {
        return Math.PI * raio * raio; // pi vezes o quadrado do raio
    }

    /**
     * O m�todo calculaPer�metro calcula o per�metro do c�rculo e retorna o per�metro
     * como um valor do tipo double.
     * @return o per�metro deste c�rculo
     */
    public double calculaPer�metro() {
        return 2.0 * Math.PI * raio; // dois vezes pi vezes o raio
    }

    /**
     * O m�todo toString retorna os valores dos campos do c�rculo formatados em uma
     * string.
     * @return uma string contendo uma representa��o dos campos do c�rculo
     */
    public String toString() {
        // Retorna diretamente uma string criada com os valores dos campos. O m�todo
        // toString da classe Ponto2D � chamado implicitamente.
        return "C�rculo com centro em " + centro + " e raio " + raio;
    }
} // fim da classe Circulo
