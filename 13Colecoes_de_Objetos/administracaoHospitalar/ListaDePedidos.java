// Esta classe faz parte do pacote administracaoHospitalar
package administracaoHospitalar;

// Importamos as classes do pacote java.util
import java.util.*;

/**
 * A classe ListaDePedidos simula uma lista de pedidos de medicamentos e suprimentos de
 * um hospital. A simula��o � bastante simplificada - consideramos que os pedidos devem
 * entrar em uma fila com prioridades, implementada internamente como um array de
 * listas. Somente inst�ncias de classes herdeiras da classe Pedido ser�o inclu�das
 * nas listas, sendo que inst�ncias da classe Medicamento ter�o sempre prioridade 
 * sobre inst�ncias da classe Suprimento.
 */
class ListaDePedidos
  {
 /**
  * Declara��o dos campos da classe
  */
  private List[] pedidos; // a lista dos pedidos de compra 
  private static int prioridadeM�nima = 10; // consideramos que existir�o 10 
                                            // categorias de prioridades

 /**
  * O construtor desta classe inicializa a lista que conter� os pedidos.
  */
  ListaDePedidos()
    {
    pedidos = new List[prioridadeM�nima]; // criamos o array de listas
    // Inicializamos cada lista do array de listas.
    for(int prioridade=0;prioridade<prioridadeM�nima;prioridade++)
      pedidos[prioridade] = new LinkedList();
    }

 /**
  * O m�todo entraPedido recebe uma inst�ncia de qualquer classe que herde da classe
  * Pedido e coloca a inst�ncia na lista, verificando a prioridade do pedido.
  * @param umPedido uma inst�ncia de qualquer classe que herde da classe Pedido.
  * @param prioridade a prioridade deste pedido.
  */
  public void entraPedido(Pedido umPedido,int prioridade)
    {
    // Se a lista estiver vazia, simplesmente inserimos o pedido nela.
    if (pedidos[prioridade].size() == 0)
      pedidos[prioridade].add(umPedido);
    else // a lista n�o est� vazia, devemos localizar a posi��o para inserir o pedido
    if (umPedido instanceof PedidoDeMedicamento) // se for um pedido de medicamentos
      {
      // Localizamos a �ltima inst�ncia de PedidoDeMedicamento nesta lista
      int posi��oParaInser��o = 0;
      for(int pedido=pedidos[prioridade].size()-1;pedido>=0;pedido--)
        {
        Pedido tempor�rio = (Pedido)pedidos[prioridade].get(pedido);
        if (tempor�rio instanceof PedidoDeMedicamento)
          {
          posi��oParaInser��o = pedido+1; // inseriremos na pr�xima posi��o
          break;
          }
        }
      // Inserimos o pedido na primeira posi��o depois do �ltimo medicamento.
      pedidos[prioridade].add(posi��oParaInser��o,umPedido); 
      }
    else if (umPedido instanceof PedidoDeSuprimento) // se for um pedido de suprimentos
      pedidos[prioridade].add(umPedido); // inserimos no final da lista
    }

 /**
  * O m�todo toString retorna uma representa��o da lista de pedidos como uma string.
  * @return uma string contendo a representa��o da lista de pedidos.
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
        // Obtemos o pedido e anexamos o resultado de seu m�todo toString no
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
