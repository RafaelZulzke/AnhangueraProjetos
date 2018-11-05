
/** 
 * A classe Funcionario encapsula os dados básicos de um funcionário de uma 
 * empresa. Esta classe herda da classe Pessoa, criando a relação "Funcionario é um 
 * tipo de Pessoa". 
 */
class Funcionario extends Pessoa // declaração da classe (herdando de Pessoa)
{

    /**
     * Declaração dos campos adicionais da classe. Note que não é necessário declarar
     * um campo como sendo uma instância da classe Pessoa, como foi feito com o
     * exemplo do mecanismo de delegação: os campos e métodos da classe Pessoa foram
     * herdados (mas os campos deverão ser acessados indiretamente pois são privados da
     * classe Pessoa).
     */
    private Data admissão;
    private float salário;

    /**
     * O construtor para a classe Funcionario, que recebe argumentos para inicializar
     * todos os campos da classe. Este construtor recebe os mesmos dados que seriam
     * necessários para criar uma instância da classe Pessoa mais os que diferenciam
     * a classe Funcionario da Pessoa. Passaremos os dados que representam uma Pessoa
     * para o construtor da classe ancestral, via a palavra-chave super.
     * @param nome o nome da pessoa
     * @param id o número da identidade da pessoa
     * @param nasc uma instância da classe Data com a data de nascimento
     * @param adm uma instância da classe Data com a data de admissão
     * @param sal o salário do funcionário
     */
    Funcionario(String nome, int id, Data nasc, Data adm, float sal) {
        super(nome, id, nasc);
        admissão = adm;
        salário = sal;
    }

    /**
     * O método toString não recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados. Como é necessário ter os campos da classe
     * ancestral formatados para retornar o resultado deste método, chamamos o método
     * toString da classe ancestral via a palavra-chave super.
     * @return uma string com os valores dos campos formatados.
     */
    public String toString() {
        String resultado;
        resultado = super.toString() + "\n"; // chama o método toString da classe Pessoa
        resultado = resultado + "Data de admissão: " + admissão + "\n";
        resultado = resultado + "Salário: " + salário;
        return resultado;
    }

    /**
     * O método qualSalário retorna o valor do salário do funcionário. Este método será
     * usado por qualquer outro método que queira somente acessar (ler) o valor numérico
     * do salário.
     * Este método foi declarado como final, e não poderá ser sobreposto por métodos
     * com a mesma assinatura em classes herdeiras.
     * @return o valor do salário do funcionário
     */
    final public float qualSalário() {
        return salário;
    }
} // fim da classe Funcionario
