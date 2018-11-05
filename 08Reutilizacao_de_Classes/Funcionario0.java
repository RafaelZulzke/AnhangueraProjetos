
/** 
 * A classe Funcionario0 encapsula os dados básicos de um funcionário de uma 
 * empresa. Esta classe em especial mostra o que acontece quando uma instância de 
 * outra classe (no caso, da classe Data), que tem modificadores de acesso, é usada
 * com outros modificadores de acesso.
 * O nome da classe tem um zero pois esta classe ainda será modificada.
 */
class Funcionario0 // declaração da classe
{

    /**
     * Declaração dos campos da classe
     */
    private Pessoa0 funcionário; // identificação do funcionário, dada por uma instância
    // da classe Pessoa0
    public Data admissão;  // data de admissão, declarada propositalmente como pública
    private float salário; // salário do funcionário

    /**
     * O construtor para a classe Funcionario0, que recebe argumentos para inicializar
     * todos os campos da classe.
     * @param f uma instância da classe Pessoa0 com a identificação do funcionário
     * @param a uma instância da classe Data com a data de admissão
     * @param s um valor de ponto flutuante com o salário do funcionário
     */
    Funcionario0(Pessoa0 f, Data a, float s) {
        funcionário = f;
        admissão = a;
        salário = s;
    }

    /**
     * O método toString não recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados.
     * @return uma string com os valores dos campos formatados.
     */
    public String toString() {
        String resultado;
        resultado = funcionário + "\n";
        // chamada implícita ao método toString
        // da classe Pessoa
        resultado += "Data de admissão:" + admissão + "\n";
        resultado += "Salário:" + salário + "\n";
        return resultado;
    }
} // fim da classe Funcionario0
