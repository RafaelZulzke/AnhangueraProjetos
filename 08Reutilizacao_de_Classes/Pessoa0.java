
/** 
 * A classe Pessoa0 encapsula os dados de identificação de uma pessoa.
 * O nome da classe tem um zero pois esta classe ainda deverá ser modificada - no 
 * caso, alguns dos campos da classe são públicos, para demonstração do que acontece
 * com os modificadores de acesso quando a classe é reutilizada em outra.
 */
class Pessoa0 // declaração da classe
{

    /**
     * Declaração dos campos da classe
     */
    public String nome;     // o nome da pessoa - declarado público propositadamente
    private int identidade; // o número da identidade da pessoa
    private Data nascimento; // a data de nascimento da pessoa

    /**
     * O construtor da classe Pessoa0, que recebe argumentos para inicializar seus campos.
     * @param n o nome da pessoa
     * @param i o número da identidade da pessoa
     * @param d a data de nascimento da pessoa
     */
    Pessoa0(String n, int i, Data d) {
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
                "\nIdentidade:" +    identidade +
                "Data de Nascimento:" + nascimento;
    }
} // fim da classe Pessoa0
