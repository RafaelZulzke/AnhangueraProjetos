/* Esta classe faz parte do pacote Pessoal */
package Pessoal;

/* Esta classe usa a classe Data, definida no pacote DataHora */
import DataHora.Data;

/** 
 * A classe ChefeDeDepartamento encapsula os dados básicos de um chefe de um
 * departamento de uma empresa. A classe é declarada pública, para poder ser usada em 
 * outras classes fora do pacote Pessoal. Esta classe herda da classe
 * Funcionario, criando a relação "ChefeDeDepartamento é um tipo de Funcionario". 
 */
public class ChefeDeDepartamento extends Funcionario // declaração da classe (herdando
// de Funcionario)
{
    // Declaração dos campos adicionais da classe. Somente os campos que diferenciam
    // um ChefeDeDepartamento de um Funcionario são necessários. Os campos das classes
    // Pessoa e Funcionario podem ser acessados diretamente dentro da classe.

    /**
     * Este campo representa o departamento deste ChefeDeDepartamento
     */
    protected String departamento;
    /**
     * Este campo representa a data de promoção deste ChefeDeDepartamento
     */
    protected Data promoçãoAChefe;

    /**
     * O construtor para a classe ChefeDeDepartamento, que recebe argumentos para
     * inicializar todos os campos da classe. Este construtor recebe os mesmos dados
     * que seriam necessários para criar uma instância da classe Pessoa mais os que
     * diferenciam a classe Funcionario da classe Pessoa e os que diferenciam a classe
     * ChefeDeDepartamento da classe Funcionario. Passaremos os dados que representam
     * um Funcionario para o construtor da classe ancestral, via a palavra-chave super.
     * @param nome o nome da pessoa
     * @param id o número da identidade da pessoa
     * @param nasc uma instância da classe Data com a data de nascimento
     * @param adm uma instância da classe Data com a data de admissão
     * @param sal o salário do funcionário/chefe de departamento
     * @param dep o departamento que este chefe chefia
     * @param prom uma instância da classe Data com a data de promoção ao cargo
     */
    public ChefeDeDepartamento(String nome, int id, Data nasc,
            Data adm, float sal,
            String dep, Data prom) {
        super(nome, id, nasc, adm, sal); // chama o construtor da classe Funcionario
        departamento = dep;
        promoçãoAChefe = prom;
    }

    /**
     * O método toString não recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados.  Para demonstrar a acessibilidade aos campos das
     * classes ancestrais, este método usa diretamente o campo nome da classe Pessoa e o
     * campo salário da classe Funcionario.
     * @return uma string com os valores dos campos formatados.
     */
    public String toString() {
        String resultado;
        resultado = "Nome: " + nome + "\n"; // uso direto de campo herdado da classe Pessoa
        resultado = resultado + "Departamento: " + departamento + "\n";
        resultado = resultado + "Data de promoção ao cargo: " + promoçãoAChefe + "\n";
        resultado = resultado + "Salário: " + salário; // uso direto de campo herdado da
        // classe Funcionario
        return resultado;
    }
} // fim da classe ChefeDeDepartamento
