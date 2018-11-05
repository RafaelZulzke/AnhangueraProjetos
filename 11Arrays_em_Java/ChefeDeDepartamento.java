/** 
 * A classe ChefeDeDepartamento encapsula os dados b�sicos de um chefe de um
 * departamento de uma empresa. Esta classe herda da classe Funcionario, criando a 
 * rela��o "ChefeDeDepartamento � um tipo de Funcionario". 
 */
class ChefeDeDepartamento extends Funcionario // declara��o da classe (herdando de 
                                              // Funcionario)
  {
 /**
  * Declara��o dos campos adicionais da classe. Note que n�o � necess�rio declarar
  * um campo como sendo inst�ncia da classe Funcionario. Somente os campos que 
  * diferenciam um ChefeDeDepartamento de um Funcionario s�o necess�rios.
  */
  private String departamento;
  private Data promo��oAChefe;

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
  ChefeDeDepartamento(String nome,int id,Data nasc, 
                      Data adm,float sal, 
                      String dep,Data prom)
    {
    super(nome,id,nasc,adm,sal); // chama o construtor da classe Funcionario
    departamento = dep;
    promo��oAChefe = prom;
    }

 /**
  * O m�todo toString n�o recebe argumentos, e retorna uma string contendo os valores 
  * dos campos da classe formatados. Como � necess�rio ter os campos da classe 
  * ancestral formatados para retornar todos os campos desta classe formatados, 
  * chamamos o m�todo toString da classe ancestral via a palavra-chave super.
  * @return uma string com os valores dos campos formatados.
  */
  public String toString()
    {
    String resultado;
    resultado = super.toString()+"\n"; // chama o m�todo toString da classe Funcionario
    resultado = resultado + "Departamento:"+departamento+"\n";
    resultado = resultado + "Data de promo��o ao cargo:"+promo��oAChefe;
    return resultado;
    }

 /**
  * O m�todo qualDepartamento retorna o departamento do chefe de departamento. Este 
  * m�todo ser� usado por qualquer outro m�todo que queira acessar (ler) somente o 
  * valor do campo departamento.
  * @return o departamento do chefe de departamento
  */
  public String qualDepartamento()
    {
    return departamento;
    }

  } // fim da classe ChefeDeDepartamento
