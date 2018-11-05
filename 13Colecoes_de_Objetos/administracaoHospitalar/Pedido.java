// Esta classe faz parte do pacote administracaoHospitalar
package administracaoHospitalar;

/**
 * A classe Pedido representa um pedido que pode ser feito em um hospital. Esta classe
 * � declarada abstrata para que n�o possa ser instanciada, apesar de n�o ter nenhum
 * m�todo explicitamente abstrato.
 */
abstract class Pedido
  {
 /**
  * Declara��o dos campos da classe
  */
  private String descri��o; // a descri��o do pedido
  private int quantidade; // a quantidade de itens pedidos

 /**
  * O construtor desta classe recebe os argumentos para inicializar os campos da classe.
  * @param desc a descri��o do pedido
  * @param quant a quantidade de itens pedidos
  * @param pri a prioridade deste pedido
  */
  Pedido(String desc,int quant)
    {
    descri��o = desc;
    quantidade = quant;
    } 

 /**
  * O m�todo toString retorna uma string contendo os campos da classe.
  * @return uma string contendo os campos da classe.
  */  
  public String toString()
    {
    return descri��o+" ("+quantidade+")";
    }

  } // fim da classe Pedido
