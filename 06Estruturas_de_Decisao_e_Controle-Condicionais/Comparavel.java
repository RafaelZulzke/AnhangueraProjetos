
/** 
 * A classe Comparavel encapsula um valor do tipo double e tem mÈtodos que
 * permitem comparar este valor com outros passados como argumentos de diversas 
 * formas, exemplificando o uso dos comparadores de Java.
 */
class Comparavel // declaraÁ„o da classe
{

    /**
     * DeclaraÁ„o dos campos da classe
     */
    private double valor; // o valor encapsulado, que ser· comparado com outros

    /**
     * O construtor para a classe Comparavel, que recebe um argumento do tipo double
     * para inicializar o ˙nico campo da classe.
     * @param v o valor a ser encapsulado
     */
    Comparavel(double v) {
        valor = v;
    } // fim do construtor com um argumento

    /**
     * O mÈtodo toString possibilita a impress„o de inst‚ncias desta classe.
     * @return o valor encapsulado convertido para uma string
     */
    public String toString() {
        return "" + valor; // converte para string via concatenaÁ„o
    } // fim do mÈtodo toString

    /**
     * O mÈtodo ÈIgualA retorna o valor booleano true se o valor encapsulado nesta classe
     * for igual ao passado como argumento.
     * @param v1 o valor a ser comparado para igualdade
     * @return true se os valores forem iguais, false se forem diferentes
     */
    public boolean ÈIgualA(double v1) {
        if (valor == v1) {
            return true; // comparaÁ„o de igualdade de valores
        } else {
            return false;
        }
    } // fim do mÈtodo ÈIgualA

    /**
     * O mÈtodo ÈIgualA retorna o valor booleano true se o valor encapsulado nesta classe
     * for igual aos passados como argumento.
     * @param v1 um valor a ser comparado para igualdade
     * @param v2 outro valor a ser comparado para igualdade
     * @return true se os valores forem iguais, false se forem diferentes
     */
    public boolean ÈIgualA(double v1, double v2) {
        if ((valor == v1) && (valor == v2)) // ambos os valores s„o iguais ao encapsulado
        {
            return true;
        } else {
            return false;
        }
    } // fim do mÈtodo ÈIgualA

    /**
     * O mÈtodo ÈMaiorQue retorna o valor booleano true se o valor encapsulado nesta
     * classe for maior que o passado como argumento.
     * @param v1 o valor a ser comparado
     * @return true se o valor encapsulado for maior que o passado como argumento,
     *         false caso contr·rio
     */
    public boolean ÈMaiorQue(double v1) {
        if (valor > v1) {
            return true; // o valor encapsulado È maior que o argumento
        } else {
            return false;
        }
    } // fim do mÈtodo ÈMaiorQue

    /**
     * O mÈtodo ÈMaiorQue retorna o valor booleano true se o valor encapsulado nesta
     * classe for maior que os passados como argumentos.
     * @param v1 um valor a ser comparado
     * @param v2 outro valor a ser comparado
     * @return true se o valor encapsulado for maior que os passados como argumentos,
     *         false caso contr·rio
     */
    public boolean ÈMaiorQue(double v1, double v2) {
        if ((valor > v1) && (valor > v2)) // o valor encapsulado È maior que os argumentos
        {
            return true;
        } else {
            return false;
        }
    } // fim do mÈtodo ÈMaiorQue

    /**
     * O mÈtodo ÈMenorQue retorna o valor booleano true se o valor encapsulado nesta
     * classe for menor que o passado como argumento.
     * @param v1 o valor a ser comparado
     * @return true se o valor encapsulado for menor que o passado como argumento,
     *         false caso contr·rio
     */
    public boolean ÈMenorQue(double v1) {
        if (valor < v1) {
            return true; // o valor encapsulado È menor que o argumento
        } else {
            return false;
        }
    } // fim do mÈtodo ÈMenorQue

    /**
     * O mÈtodo ÈMenorQue retorna o valor booleano true se o valor encapsulado nesta
     * classe for menor que os passados como argumentos.
     * @param v1 um valor a ser comparado
     * @param v2 outro valor a ser comparado
     * @return true se o valor encapsulado for menor que os passados como argumentos,
     *         false caso contr·rio
     */
    public boolean ÈMenorQue(double v1, double v2) {
        if ((valor < v1) && (valor < v2)) // o valor encapsulado È menor que os argumentos
        {
            return true;
        } else {
            return false;
        }
    } // fim do mÈtodo ÈMenorQue
} // fim da classe Comparavel
