// Esta classe faz parte do pacote administracaoHospitalar
package administracaoHospitalar;

/**
 * A classe Pedido representa um pedido que pode ser feito em um hospital. Esta classe
 * é declarada abstrata para que não possa ser instanciada, apesar de não ter nenhum
 * método explicitamente abstrato.
 */
abstract class Pedido
  {
 /**
  * Declaração dos campos da classe
  */
  private String descrição; // a descrição do pedido
  private int quantidade; // a quantidade de itens pedidos

 /**
  * O construtor desta classe recebe os argumentos para inicializar os campos da classe.
  * @param desc a descrição do pedido
  * @param quant a quantidade de itens pedidos
  * @param pri a prioridade deste pedido
  */
  Pedido(String desc,int quant)
    {
    descrição = desc;
    quantidade = quant;
    } 

 /**
  * O método toString retorna uma string contendo os campos da classe.
  * @return uma string contendo os campos da classe.
  */  
  public String toString()
    {
    return descrição+" ("+quantidade+")";
    }

  } // fim da classe Pedido
