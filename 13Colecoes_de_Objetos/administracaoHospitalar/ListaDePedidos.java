// Esta classe faz parte do pacote administracaoHospitalar
package administracaoHospitalar;

// Importamos as classes do pacote java.util
import java.util.*;

/**
 * A classe ListaDePedidos simula uma lista de pedidos de medicamentos e suprimentos de
 * um hospital. A simulação é bastante simplificada - consideramos que os pedidos devem
 * entrar em uma fila com prioridades, implementada internamente como um array de
 * listas. Somente instâncias de classes herdeiras da classe Pedido serão incluídas
 * nas listas, sendo que instâncias da classe Medicamento terão sempre prioridade 
 * sobre instâncias da classe Suprimento.
 */
class ListaDePedidos
  {
 /**
  * Declaração dos campos da classe
  */
  private List[] pedidos; // a lista dos pedidos de compra 
  private static int prioridadeMínima = 10; // consideramos que existirão 10 
                                            // categorias de prioridades

 /**
  * O construtor desta classe inicializa a lista que conterá os pedidos.
  */
  ListaDePedidos()
    {
    pedidos = new List[prioridadeMínima]; // criamos o array de listas
    // Inicializamos cada lista do array de listas.
    for(int prioridade=0;prioridade<prioridadeMínima;prioridade++)
      pedidos[prioridade] = new LinkedList();
    }

 /**
  * O método entraPedido recebe uma instância de qualquer classe que herde da classe
  * Pedido e coloca a instância na lista, verificando a prioridade do pedido.
  * @param umPedido uma instância de qualquer classe que herde da classe Pedido.
  * @param prioridade a prioridade deste pedido.
  */
  public void entraPedido(Pedido umPedido,int prioridade)
    {
    // Se a lista estiver vazia, simplesmente inserimos o pedido nela.
    if (pedidos[prioridade].size() == 0)
      pedidos[prioridade].add(umPedido);
    else // a lista não está vazia, devemos localizar a posição para inserir o pedido
    if (umPedido instanceof PedidoDeMedicamento) // se for um pedido de medicamentos
      {
      // Localizamos a última instância de PedidoDeMedicamento nesta lista
      int posiçãoParaInserção = 0;
      for(int pedido=pedidos[prioridade].size()-1;pedido>=0;pedido--)
        {
        Pedido temporário = (Pedido)pedidos[prioridade].get(pedido);
        if (temporário instanceof PedidoDeMedicamento)
          {
          posiçãoParaInserção = pedido+1; // inseriremos na próxima posição
          break;
          }
        }
      // Inserimos o pedido na primeira posição depois do último medicamento.
      pedidos[prioridade].add(posiçãoParaInserção,umPedido); 
      }
    else if (umPedido instanceof PedidoDeSuprimento) // se for um pedido de suprimentos
      pedidos[prioridade].add(umPedido); // inserimos no final da lista
    }

 /**
  * O método toString retorna uma representação da lista de pedidos como uma string.
  * @return uma string contendo a representação da lista de pedidos.
  */
  public String toString()
    {
    // Usamos um StringBuffer para melhor performance.
    StringBuffer sb = new StringBuffer(1024);
    // Para cada uma das prioridades
    for(int prioridade=0;prioridade<pedidos.length;prioridade++)
      {
      // Criamos uma "linha" no StringBuffer.
      sb.append("Prioridade "+prioridade+": ");
      // Para cada pedido naquela prioridade
      for(int pedido=0;pedido<pedidos[prioridade].size();pedido++)
        {
        // Obtemos o pedido e anexamos o resultado de seu método toString no
        // StringBuffer
        Pedido umPedido = (Pedido)pedidos[prioridade].get(pedido);
        sb.append(umPedido);
        sb.append("; ");
        }
      sb.append("\n"); // finalizamos uma "linha" no StringBuffer
      }
    return sb.toString(); // retornamos o StringBuffer convertido para string
    }     

  } // fim da classe ListaDePedidos
