
/** 
 * A classe Ponto2D encapsula um ponto no espa�o cartesiano de duas dimens�es.
 */
class Ponto2D // declara��o da classe 
{

    /**
     * Declara��o dos campos da classe
     */
    private double x,  y; // as coordenadas do ponto no espa�o bidimensional

    public Ponto2D() {
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * O m�todo inicializaPonto2D recebe dois argumentos para inicializar os respectivos
     * campos da classe Ponto2D. N�o existem restri��es aos valores que os dados podem
     * receber, ent�o a inicializa��o se limita a copiar os argumentos para os campos.
     * @param _x o argumento correspondente � coordenada horizontal
     * @param _y o argumento correspondente � coordenada vertical
     */
    public void inicializaPonto2D(double _x, double _y) {
        setX(_x);
        setY(_y);
    } // fim do m�todo inicializaPonto2D

    /**
     * O m�todo �Igual recebe uma inst�ncia da pr�pria classe Ponto2D como argumento e
     * verifica se as coordenadas encapsuladas na classe e na inst�ncia que foi passada
     * s�o exatamente iguais, e retorna o valor booleano true se forem.
     * @param outroPonto2D outra inst�ncia da pr�pria classe Ponto2D
     * @return true se as coordenadas encapsuladas forem exatamente iguais �s
     *         encapsuladas na inst�ncia passada como argumento, false caso contr�rio
     */
    public boolean �Igual(Ponto2D outroPonto2D) {
        if ((getX() == outroPonto2D.getX()) && // se as coordenadas horizontais forem iguais E
                (getY() == outroPonto2D.getY())) // se as coordenadas verticais forem iguais ent�o
        {
            return true;      // o ponto � igual, retorna true
        } else {
            return false;     // o ponto � diferente, retorna false
        }
    } // fim do m�todo �Igual

    /**
     * O m�todo origem retorna uma nova inst�ncia da classe Ponto2D, que cont�m as
     * coordenadas (0,0) (origem das coordenadas). Esta inst�ncia � criada por este
     * m�todo, e pode ser usada diretamente por aplica��es ou classes que executem
     * este m�todo sem necessidade de usar a palavra-chave new.
     * @return uma nova inst�ncia da classe Ponto2D representando a coordenada (0,0)
     */
    public Ponto2D origem() {
        Ponto2D tempor�rio = new Ponto2D(); // a inicializa��o da inst�ncia � feita aqui
        tempor�rio.inicializaPonto2D(0, 0);
        return tempor�rio; // retornamos a refer�ncia inicializada
    } // fim do m�todo origem

    /**
     * O m�todo clona retorna uma nova inst�ncia da classe Ponto2D, que cont�m as
     * mesmas coordenadas encapsuladas na classe, ou seja, quando este m�todo for
     * executado a partir de uma inst�ncia desta classe, ele retornar� uma nova
     * inst�ncia com os mesmos valores encapsulados.
     * @return uma nova inst�ncia da classe Ponto2D contendo os valores encapsulados
     */
    public Ponto2D clona() {
        Ponto2D tempor�rio = new Ponto2D(); // a inicializa��o da inst�ncia � feita aqui
        tempor�rio.inicializaPonto2D(getX(), getY()); // os valores encapsulados s�o usados
        return tempor�rio; // retornamos a refer�ncia inicializada
    } // fim do m�todo clona

    /**
     * O m�todo toString � um m�todo "m�gico" que n�o recebe argumentos, e retorna uma
     * string contendo os valores dos campos da classe formatados.
     * @return uma string com os valores dos campos formatados como (x,y)
     */
    public String toString() {
        String resultado = "(" + getX() + "," + getY() + ")";
        return resultado;
    } // fim do m�todo toString

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
} // fim da classe Ponto2D
