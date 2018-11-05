
/** 
 * A classe Retangulo implementa a interface ObjetoGeometrico e representa um 
 * retângulo. Esta classe encapsula os dois pontos extremos do retângulo. Todos os 
 * métodos declarados na interface ObjetoGeometrico são implementados.
 */
class Retangulo implements ObjetoGeometrico // declaração da classe
{

    /**
     * Declaração dos campos da classe
     */
    private Ponto2D primeiroCanto,  segundoCanto;

    /**
     * O construtor para a classe Retangulo, que recebe argumentos para inicializar todos
     * os campos da classe. Este é o construtor "completo".
     * @param pc o primeiro canto do retângulo (uma instância da classe Ponto2D)
     * @param sc o segundo canto do retângulo (outra instância da classe Ponto2D)
     */
    Retangulo(Ponto2D pc, Ponto2D sc) {
        primeiroCanto = pc;
        segundoCanto = sc;
    }

    /**
     * O método centro retorna o ponto em duas dimensões que corresponde ao centro do
     * retângulo. Neste caso, basta calcular o ponto equidistante dos dois pontos que
     * delimitam o retângulo, que é calculado usando a média das coordenadas X e Y dos
     * cantos.
     * @return uma instância da classe Ponto2D representando o centro do retângulo
     */
    public Ponto2D centro() {
        double coordX = (primeiroCanto.getX() + segundoCanto.getX()) / 2.;
        double coordY = (primeiroCanto.getY() + segundoCanto.getY()) / 2.;
        return new Ponto2D(coordX, coordY);
    }

    /**
     * O método calculaÁrea calcula a área do retângulo e retorna a área como um valor do
     * tipo double.
     * @return a área deste retângulo
     */
    public double calculaÁrea() {
        // Calcula o lado X do retângulo, que é a diferença entre as coordenadas X do
        // do primeiro e segundo canto do retângulo. O método Math.abs garante que o valor
        // será positivo.
        double ladoX = Math.abs(primeiroCanto.getX() - segundoCanto.getX());
        // Calcula o lado Y do retângulo (diferença entre as coordenadas Y dos cantos)
        double ladoY = Math.abs(primeiroCanto.getY() - segundoCanto.getY());
        return ladoX * ladoY; // multiplicação dos comprimentos dos lados
    }

    /**
     * O método calculaPerímetro calcula o perímetro do retângulo e retorna o perímetro
     * como um valor do tipo double.
     * @return o perímetro deste retângulo
     */
    public double calculaPerímetro() {
        // Calcula o lado X do retângulo, que é a diferença entre as coordenadas X do
        // do primeiro e segundo canto do retângulo. O método Math.abs garante que o valor
        // será positivo.
        double ladoX = Math.abs(primeiroCanto.getX() - segundoCanto.getX());
        // Calcula o lado Y do retângulo (diferença entre as coordenadas Y dos cantos)
        double ladoY = Math.abs(primeiroCanto.getY() - segundoCanto.getY());
        return 2 * ladoX + 2 * ladoY; // soma do dobro dos lados
    }

    /**
     * O método toString retorna os valores dos campos do retângulo formatados em uma
     * string.
     * @return uma string contendo uma representação dos campos do retângulo
     */
    public String toString() {
        // Retorna diretamente uma string criada com os valores dos campos. O método
        // toString da classe Ponto2D é chamado implicitamente.
        return "Retângulo com cantos " + primeiroCanto +
                " e " + segundoCanto;
    }
} // fim da classe Retangulo
