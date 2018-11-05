// Esta classe faz parte do pacote administracaoHospitalar
package administracaoHospitalar;

/**
 * A classe PedidoDeMedicamento representa um pedido de medicamento. Esta classe herda
 * todos os métodos da classe Pedido, somente sobrescrevendo o construtor.
 */
class PedidoDeMedicamento extends Pedido
  {

 /**
  * O construtor desta classe recebe os argumentos para inicializar os campos da classe.
  * Este construtor simplesmente chama o construtor da classe ancestral.
  * @param desc a descrição do pedido
  * @param quant a quantidade de itens pedidos
  */
  PedidoDeMedicamento(String desc,int quant)
    {
    super(desc,quant);
    } 

  } // fim da classe PedidoDeMedicamento
