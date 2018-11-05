
/** 
 * A classe Ponto2D encapsula um ponto no espaço cartesiano de duas dimensões.
 */
class Ponto2D // declaração da classe 
{

    /**
     * Declaração dos campos da classe
     */
    private double x,  y; // as coordenadas do ponto no espaço bidimensional

    /**
     * O método inicializaPonto2D recebe dois argumentos para inicializar os respectivos
     * campos da classe Ponto2D. Não existem restrições aos valores que os dados podem
     * receber, então a inicialização se limita a copiar os argumentos para os campos.
     * @param _x o argumento correspondente à coordenada horizontal
     * @param _y o argumento correspondente à coordenada vertical
     */
    public void inicializaPonto2D(double _x, double _y) {
        x = _x;
        y = _y;
    } // fim do método inicializaPonto2D

    /**
     * O método éIgual recebe uma instância da própria classe Ponto2D como argumento e
     * verifica se as coordenadas encapsuladas na classe e na instância que foi passada
     * são exatamente iguais, e retorna o valor booleano true se forem.
     * @param outroPonto2D outra instância da própria classe Ponto2D
     * @return true se as coordenadas encapsuladas forem exatamente iguais às
     *         encapsuladas na instância passada como argumento, false caso contrário
     */
    public boolean éIgual(Ponto2D outroPonto2D) {
        if ((x == outroPonto2D.x) && // se as coordenadas horizontais forem iguais E
                (y == outroPonto2D.y)) // se as coordenadas verticais forem iguais então
        {
            return true;      // o ponto é igual, retorna true
        } else {
            return false;     // o ponto é diferente, retorna false
        }
    } // fim do método éIgual

    /**
     * O método origem retorna uma nova instância da classe Ponto2D, que contém as
     * coordenadas (0,0) (origem das coordenadas). Esta instância é criada por este
     * método, e pode ser usada diretamente por aplicações ou classes que executem
     * este método sem necessidade de usar a palavra-chave new.
     * @return uma nova instância da classe Ponto2D representando a coordenada (0,0)
     */
    public Ponto2D origem() {
        Ponto2D temporário = new Ponto2D(); // a inicialização da instância é feita aqui
        temporário.inicializaPonto2D(0, 0);
        return temporário; // retornamos a referência inicializada
    } // fim do método origem

    /**
     * O método clona retorna uma nova instância da classe Ponto2D, que contém as
     * mesmas coordenadas encapsuladas na classe, ou seja, quando este método for
     * executado a partir de uma instância desta classe, ele retornará uma nova
     * instância com os mesmos valores encapsulados.
     * @return uma nova instância da classe Ponto2D contendo os valores encapsulados
     */
    public Ponto2D clona() {
        Ponto2D temporário = new Ponto2D(); // a inicialização da instância é feita aqui
        temporário.inicializaPonto2D(x, y); // os valores encapsulados são usados
        return temporário; // retornamos a referência inicializada
    } // fim do método clona

    /**
     * O método toString é um método "mágico" que não recebe argumentos, e retorna uma
     * string contendo os valores dos campos da classe formatados.
     * @return uma string com os valores dos campos formatados como (x,y)
     */
    public String toString() {
        String resultado = "(" + x + "," + y + ")";
        return resultado;
    } // fim do método toString
} // fim da classe Ponto2D
