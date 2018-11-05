
/** 
 * A classe Pessoa0 encapsula os dados de identifica��o de uma pessoa.
 * O nome da classe tem um zero pois esta classe ainda dever� ser modificada - no 
 * caso, alguns dos campos da classe s�o p�blicos, para demonstra��o do que acontece
 * com os modificadores de acesso quando a classe � reutilizada em outra.
 */
class Pessoa0 // declara��o da classe
{

    /**
     * Declara��o dos campos da classe
     */
    public String nome;     // o nome da pessoa - declarado p�blico propositadamente
    private int identidade; // o n�mero da identidade da pessoa
    private Data nascimento; // a data de nascimento da pessoa

    /**
     * O construtor da classe Pessoa0, que recebe argumentos para inicializar seus campos.
     * @param n o nome da pessoa
     * @param i o n�mero da identidade da pessoa
     * @param d a data de nascimento da pessoa
     */
    Pessoa0(String n, int i, Data d) {
        nome = n;
        identidade = i;
        nascimento = d;
    }

    /**
     * O m�todo toString n�o recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados.
     * @return uma string com os valores dos campos formatados.
     */
    public String toString() {
        return "Nome: " + nome + 
                "\nIdentidade:" +    identidade +
                "Data de Nascimento:" + nascimento;
    }
} // fim da classe Pessoa0
