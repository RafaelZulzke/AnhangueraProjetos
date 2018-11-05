// Esta classe faz parte do pacote administracaoHospitalar
package administracaoHospitalar;

/**
 * A classe DemoListaDePedidos demonstra o uso de uma instância da classe 
 * ListaDePedidos.
 */
class DemoListaDePedidos
  {
 /**
  * O método main permite a execução desta classe. Este método cria uma instância da
  * classe ListaDePedidos e executa alguns métodos desta instância.
  * @param argumentos os argumentos que podem ser passados para o método via linha
  *        de comando, mas que neste caso serão ignorados.
  */
  public static void main(String[] argumentos)
    {
    // Criamos uma instância da lista de pedidos.
    ListaDePedidos lista = new ListaDePedidos();
    // Adicionamos vários pedidos usando várias prioridades.
    lista.entraPedido(new PedidoDeMedicamento("Anestésico X-45",20),3);          // 3-1
    lista.entraPedido(new PedidoDeMedicamento("Pomada Antisséptica M-9",100),3); // 3-2
    lista.entraPedido(new PedidoDeSuprimento("Fita para Impressora E-80",10),3); // 3-5
    lista.entraPedido(new PedidoDeMedicamento("Analgésico O-8",200),3);          // 3-3
    lista.entraPedido(new PedidoDeSuprimento("Formulário Contínuo R-79",200),3); // 3-6
    lista.entraPedido(new PedidoDeMedicamento("Expectorante J-0",50),3);         // 3-4
    lista.entraPedido(new PedidoDeSuprimento("Álcool Absoluto P-51",60),6);      // 6-2
    lista.entraPedido(new PedidoDeMedicamento("Anestésico X-45",100),6);         // 6-1
    lista.entraPedido(new PedidoDeSuprimento("Algodão Hidrofílico K-2",500),3);  // 3-7
    System.out.println(lista); // Imprimimos o resultado do método toString. Os números após 
                               // as linhas acima indicam a posição final na fila de
                               // prioridades.
    }

  } // fim da classe DemoListaDePedidos
