/* Esta classe faz parte do pacote Pessoal */
package Pessoal;

/* Esta classe usa a classe Data, definida no pacote DataHora */
import DataHora.Data;

/** 
 * A classe ChefeDeDepartamento encapsula os dados b�sicos de um chefe de um
 * departamento de uma empresa. A classe � declarada p�blica, para poder ser usada em 
 * outras classes fora do pacote Pessoal. Esta classe herda da classe
 * Funcionario, criando a rela��o "ChefeDeDepartamento � um tipo de Funcionario". 
 */
public class ChefeDeDepartamento extends Funcionario // declara��o da classe (herdando
// de Funcionario)
{
    // Declara��o dos campos adicionais da classe. Somente os campos que diferenciam
    // um ChefeDeDepartamento de um Funcionario s�o necess�rios. Os campos das classes
    // Pessoa e Funcionario podem ser acessados diretamente dentro da classe.

    /**
     * Este campo representa o departamento deste ChefeDeDepartamento
     */
    protected String departamento;
    /**
     * Este campo representa a data de promo��o deste ChefeDeDepartamento
     */
    protected Data promo��oAChefe;

    /**
     * O construtor para a classe ChefeDeDepartamento, que recebe argumentos para
     * inicializar todos os campos da classe. Este construtor recebe os mesmos dados
     * que seriam necess�rios para criar uma inst�ncia da classe Pessoa mais os que
     * diferenciam a classe Funcionario da classe Pessoa e os que diferenciam a classe
     * ChefeDeDepartamento da classe Funcionario. Passaremos os dados que representam
     * um Funcionario para o construtor da classe ancestral, via a palavra-chave super.
     * @param nome o nome da pessoa
     * @param id o n�mero da identidade da pessoa
     * @param nasc uma inst�ncia da classe Data com a data de nascimento
     * @param adm uma inst�ncia da classe Data com a data de admiss�o
     * @param sal o sal�rio do funcion�rio/chefe de departamento
     * @param dep o departamento que este chefe chefia
     * @param prom uma inst�ncia da classe Data com a data de promo��o ao cargo
     */
    public ChefeDeDepartamento(String nome, int id, Data nasc,
            Data adm, float sal,
            String dep, Data prom) {
        super(nome, id, nasc, adm, sal); // chama o construtor da classe Funcionario
        departamento = dep;
        promo��oAChefe = prom;
    }

    /**
     * O m�todo toString n�o recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados.  Para demonstrar a acessibilidade aos campos das
     * classes ancestrais, este m�todo usa diretamente o campo nome da classe Pessoa e o
     * campo sal�rio da classe Funcionario.
     * @return uma string com os valores dos campos formatados.
     */
    public String toString() {
        String resultado;
        resultado = "Nome: " + nome + "\n"; // uso direto de campo herdado da classe Pessoa
        resultado = resultado + "Departamento: " + departamento + "\n";
        resultado = resultado + "Data de promo��o ao cargo: " + promo��oAChefe + "\n";
        resultado = resultado + "Sal�rio: " + sal�rio; // uso direto de campo herdado da
        // classe Funcionario
        return resultado;
    }
} // fim da classe ChefeDeDepartamento
