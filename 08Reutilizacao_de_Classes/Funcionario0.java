
/** 
 * A classe Funcionario0 encapsula os dados b�sicos de um funcion�rio de uma 
 * empresa. Esta classe em especial mostra o que acontece quando uma inst�ncia de 
 * outra classe (no caso, da classe Data), que tem modificadores de acesso, � usada
 * com outros modificadores de acesso.
 * O nome da classe tem um zero pois esta classe ainda ser� modificada.
 */
class Funcionario0 // declara��o da classe
{

    /**
     * Declara��o dos campos da classe
     */
    private Pessoa0 funcion�rio; // identifica��o do funcion�rio, dada por uma inst�ncia
    // da classe Pessoa0
    public Data admiss�o;  // data de admiss�o, declarada propositalmente como p�blica
    private float sal�rio; // sal�rio do funcion�rio

    /**
     * O construtor para a classe Funcionario0, que recebe argumentos para inicializar
     * todos os campos da classe.
     * @param f uma inst�ncia da classe Pessoa0 com a identifica��o do funcion�rio
     * @param a uma inst�ncia da classe Data com a data de admiss�o
     * @param s um valor de ponto flutuante com o sal�rio do funcion�rio
     */
    Funcionario0(Pessoa0 f, Data a, float s) {
        funcion�rio = f;
        admiss�o = a;
        sal�rio = s;
    }

    /**
     * O m�todo toString n�o recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados.
     * @return uma string com os valores dos campos formatados.
     */
    public String toString() {
        String resultado;
        resultado = funcion�rio + "\n";
        // chamada impl�cita ao m�todo toString
        // da classe Pessoa
        resultado += "Data de admiss�o:" + admiss�o + "\n";
        resultado += "Sal�rio:" + sal�rio + "\n";
        return resultado;
    }
} // fim da classe Funcionario0
