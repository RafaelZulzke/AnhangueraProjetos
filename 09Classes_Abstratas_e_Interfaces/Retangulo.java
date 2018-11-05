
/** 
 * A classe Retangulo implementa a interface ObjetoGeometrico e representa um 
 * ret�ngulo. Esta classe encapsula os dois pontos extremos do ret�ngulo. Todos os 
 * m�todos declarados na interface ObjetoGeometrico s�o implementados.
 */
class Retangulo implements ObjetoGeometrico // declara��o da classe
{

    /**
     * Declara��o dos campos da classe
     */
    private Ponto2D primeiroCanto,  segundoCanto;

    /**
     * O construtor para a classe Retangulo, que recebe argumentos para inicializar todos
     * os campos da classe. Este � o construtor "completo".
     * @param pc o primeiro canto do ret�ngulo (uma inst�ncia da classe Ponto2D)
     * @param sc o segundo canto do ret�ngulo (outra inst�ncia da classe Ponto2D)
     */
    Retangulo(Ponto2D pc, Ponto2D sc) {
        primeiroCanto = pc;
        segundoCanto = sc;
    }

    /**
     * O m�todo centro retorna o ponto em duas dimens�es que corresponde ao centro do
     * ret�ngulo. Neste caso, basta calcular o ponto equidistante dos dois pontos que
     * delimitam o ret�ngulo, que � calculado usando a m�dia das coordenadas X e Y dos
     * cantos.
     * @return uma inst�ncia da classe Ponto2D representando o centro do ret�ngulo
     */
    public Ponto2D centro() {
        double coordX = (primeiroCanto.getX() + segundoCanto.getX()) / 2.;
        double coordY = (primeiroCanto.getY() + segundoCanto.getY()) / 2.;
        return new Ponto2D(coordX, coordY);
    }

    /**
     * O m�todo calcula�rea calcula a �rea do ret�ngulo e retorna a �rea como um valor do
     * tipo double.
     * @return a �rea deste ret�ngulo
     */
    public double calcula�rea() {
        // Calcula o lado X do ret�ngulo, que � a diferen�a entre as coordenadas X do
        // do primeiro e segundo canto do ret�ngulo. O m�todo Math.abs garante que o valor
        // ser� positivo.
        double ladoX = Math.abs(primeiroCanto.getX() - segundoCanto.getX());
        // Calcula o lado Y do ret�ngulo (diferen�a entre as coordenadas Y dos cantos)
        double ladoY = Math.abs(primeiroCanto.getY() - segundoCanto.getY());
        return ladoX * ladoY; // multiplica��o dos comprimentos dos lados
    }

    /**
     * O m�todo calculaPer�metro calcula o per�metro do ret�ngulo e retorna o per�metro
     * como um valor do tipo double.
     * @return o per�metro deste ret�ngulo
     */
    public double calculaPer�metro() {
        // Calcula o lado X do ret�ngulo, que � a diferen�a entre as coordenadas X do
        // do primeiro e segundo canto do ret�ngulo. O m�todo Math.abs garante que o valor
        // ser� positivo.
        double ladoX = Math.abs(primeiroCanto.getX() - segundoCanto.getX());
        // Calcula o lado Y do ret�ngulo (diferen�a entre as coordenadas Y dos cantos)
        double ladoY = Math.abs(primeiroCanto.getY() - segundoCanto.getY());
        return 2 * ladoX + 2 * ladoY; // soma do dobro dos lados
    }

    /**
     * O m�todo toString retorna os valores dos campos do ret�ngulo formatados em uma
     * string.
     * @return uma string contendo uma representa��o dos campos do ret�ngulo
     */
    public String toString() {
        // Retorna diretamente uma string criada com os valores dos campos. O m�todo
        // toString da classe Ponto2D � chamado implicitamente.
        return "Ret�ngulo com cantos " + primeiroCanto +
                " e " + segundoCanto;
    }
} // fim da classe Retangulo
