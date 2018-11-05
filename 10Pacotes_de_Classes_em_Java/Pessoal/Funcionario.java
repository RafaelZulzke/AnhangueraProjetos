/* Esta classe faz parte do pacote Pessoal */
package Pessoal;

/* Esta classe usa a classe Data, definida no pacote DataHora */
import DataHora.Data;

/** 
 * A classe Funcionario encapsula os dados básicos de um funcionário de uma 
 * empresa.  Os campos desta classe são declarados como protected, podendo ser
 * utilizados diretamente em classes herdeiras. A classe é declarada pública, para
 * poder ser usada em outras classes fora do pacote Pessoal.
 * Esta classe herda da classe Pessoa, criando a relação "Funcionario é um tipo de
 * Pessoa". 
 */
public class Funcionario extends Pessoa // declaração da classe (herdando de Pessoa)
  {
 // Declaração dos campos adicionais da classe. Os campos da classe Pessoa serão
 // herdados e poderão ser acessados diretamente pois foram declarados com o
 // modificador protected na classe Pessoa.
 /**
  * A data de admissão deste Funcionario
  */
  protected Data admissão; 
 /**
  * O salário deste Funcionario
  */
  protected float salário;

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
  public Funcionario(String nome,int id,Data nasc,Data adm,float sal)
    {
    super(nome,id,nasc); // chama o construtor da classe Pessoa
    admissão = adm;
    salário = sal;
    }

 /**
  * O método toString não recebe argumentos, e retorna uma string contendo os valores 
  * dos campos da classe formatados. Para demonstrar a acessibilidade aos campos da
  * classe ancestral, este método usa diretamente o campo nome da classe Pessoa.
  * @return uma string com os valores dos campos formatados.
  */
  public String toString()
    {
    String resultado;
    resultado = "Nome: "+nome+"\n"; // uso direto de campo herdado
    resultado = resultado + "Data de admissão: "+admissão+"\n";
    resultado = resultado + "Salário: "+salário;
    return resultado;
    }

  } // fim da classe Funcionario
