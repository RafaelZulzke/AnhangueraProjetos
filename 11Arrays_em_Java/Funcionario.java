
/** 
 * A classe Funcionario encapsula os dados b�sicos de um funcion�rio de uma 
 * empresa. Esta classe herda da classe Pessoa, criando a rela��o "Funcionario � um 
 * tipo de Pessoa". 
 */
class Funcionario extends Pessoa // declara��o da classe (herdando de Pessoa)
{

    /**
     * Declara��o dos campos adicionais da classe. Note que n�o � necess�rio declarar
     * um campo como sendo uma inst�ncia da classe Pessoa, como foi feito com o
     * exemplo do mecanismo de delega��o: os campos e m�todos da classe Pessoa foram
     * herdados (mas os campos dever�o ser acessados indiretamente pois s�o privados da
     * classe Pessoa).
     */
    private Data admiss�o;
    private float sal�rio;

    /**
     * O construtor para a classe Funcionario, que recebe argumentos para inicializar
     * todos os campos da classe. Este construtor recebe os mesmos dados que seriam
     * necess�rios para criar uma inst�ncia da classe Pessoa mais os que diferenciam
     * a classe Funcionario da Pessoa. Passaremos os dados que representam uma Pessoa
     * para o construtor da classe ancestral, via a palavra-chave super.
     * @param nome o nome da pessoa
     * @param id o n�mero da identidade da pessoa
     * @param nasc uma inst�ncia da classe Data com a data de nascimento
     * @param adm uma inst�ncia da classe Data com a data de admiss�o
     * @param sal o sal�rio do funcion�rio
     */
    Funcionario(String nome, int id, Data nasc, Data adm, float sal) {
        super(nome, id, nasc);
        admiss�o = adm;
        sal�rio = sal;
    }

    /**
     * O m�todo toString n�o recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados. Como � necess�rio ter os campos da classe
     * ancestral formatados para retornar o resultado deste m�todo, chamamos o m�todo
     * toString da classe ancestral via a palavra-chave super.
     * @return uma string com os valores dos campos formatados.
     */
    public String toString() {
        String resultado;
        resultado = super.toString() + "\n"; // chama o m�todo toString da classe Pessoa
        resultado = resultado + "Data de admiss�o: " + admiss�o + "\n";
        resultado = resultado + "Sal�rio: " + sal�rio;
        return resultado;
    }

    /**
     * O m�todo qualSal�rio retorna o valor do sal�rio do funcion�rio. Este m�todo ser�
     * usado por qualquer outro m�todo que queira somente acessar (ler) o valor num�rico
     * do sal�rio.
     * Este m�todo foi declarado como final, e n�o poder� ser sobreposto por m�todos
     * com a mesma assinatura em classes herdeiras.
     * @return o valor do sal�rio do funcion�rio
     */
    final public float qualSal�rio() {
        return sal�rio;
    }
} // fim da classe Funcionario
