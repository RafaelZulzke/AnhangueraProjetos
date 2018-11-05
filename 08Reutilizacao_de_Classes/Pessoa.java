
/** 
 * A classe Pessoa encapsula os dados de identificação de uma pessoa. A única
 * diferença entre esta classe e a classe Pessoa0 é que todos os campos são declarados
 * como private ao invés de public.
 */
class Pessoa // declaração da classe
{

    /**
     * Declaração dos campos da classe
     */
    private String nome;    // o nome da pessoa
    private int identidade; // o número da identidade da pessoa
    private Data nascimento; // a data de nascimento da pessoa

    /**
     * O construtor da classe Pessoa, que recebe argumentos para inicializar seus campos.
     * @param n o nome da pessoa
     * @param i o número da identidade da pessoa
     * @param d a data de nascimento da pessoa
     */
    Pessoa(String n, int i, Data d) {
        nome = n;
        identidade = i;
        nascimento = d;
    }

    /**
     * O método toString não recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados.
     * @return uma string com os valores dos campos formatados.
     */
    public String toString() {
        return "Nome: " + nome +
                "\nIdentidade: " + identidade + " " +
                "\nData de Nascimento: " + nascimento;
    }
} // fim da classe Pessoa
