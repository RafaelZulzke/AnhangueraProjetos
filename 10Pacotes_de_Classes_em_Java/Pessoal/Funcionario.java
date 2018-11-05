/* Esta classe faz parte do pacote Pessoal */
package Pessoal;

/* Esta classe usa a classe Data, definida no pacote DataHora */
import DataHora.Data;

/** 
 * A classe Funcionario encapsula os dados b�sicos de um funcion�rio de uma 
 * empresa.  Os campos desta classe s�o declarados como protected, podendo ser
 * utilizados diretamente em classes herdeiras. A classe � declarada p�blica, para
 * poder ser usada em outras classes fora do pacote Pessoal.
 * Esta classe herda da classe Pessoa, criando a rela��o "Funcionario � um tipo de
 * Pessoa". 
 */
public class Funcionario extends Pessoa // declara��o da classe (herdando de Pessoa)
  {
 // Declara��o dos campos adicionais da classe. Os campos da classe Pessoa ser�o
 // herdados e poder�o ser acessados diretamente pois foram declarados com o
 // modificador protected na classe Pessoa.
 /**
  * A data de admiss�o deste Funcionario
  */
  protected Data admiss�o; 
 /**
  * O sal�rio deste Funcionario
  */
  protected float sal�rio;

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
  public Funcionario(String nome,int id,Data nasc,Data adm,float sal)
    {
    super(nome,id,nasc); // chama o construtor da classe Pessoa
    admiss�o = adm;
    sal�rio = sal;
    }

 /**
  * O m�todo toString n�o recebe argumentos, e retorna uma string contendo os valores 
  * dos campos da classe formatados. Para demonstrar a acessibilidade aos campos da
  * classe ancestral, este m�todo usa diretamente o campo nome da classe Pessoa.
  * @return uma string com os valores dos campos formatados.
  */
  public String toString()
    {
    String resultado;
    resultado = "Nome: "+nome+"\n"; // uso direto de campo herdado
    resultado = resultado + "Data de admiss�o: "+admiss�o+"\n";
    resultado = resultado + "Sal�rio: "+sal�rio;
    return resultado;
    }

  } // fim da classe Funcionario
