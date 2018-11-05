
/** 
 * A classe Pessoa encapsula os dados de identifica��o de uma pessoa. A �nica
 * diferen�a entre esta classe e a classe Pessoa0 � que todos os campos s�o declarados
 * como private ao inv�s de public.
 */
class Pessoa // declara��o da classe
{

    /**
     * Declara��o dos campos da classe
     */
    private String nome;    // o nome da pessoa
    private int identidade; // o n�mero da identidade da pessoa
    private Data nascimento; // a data de nascimento da pessoa

    /**
     * O construtor da classe Pessoa, que recebe argumentos para inicializar seus campos.
     * @param n o nome da pessoa
     * @param i o n�mero da identidade da pessoa
     * @param d a data de nascimento da pessoa
     */
    Pessoa(String n, int i, Data d) {
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
                "\nIdentidade: " + identidade + " " +
                "\nData de Nascimento: " + nascimento;
    }
} // fim da classe Pessoa
