// Esta classe faz parte do pacote administracaoHospitalar
package administracaoHospitalar;

/**
 * A classe DemoListaDePedidos demonstra o uso de uma inst�ncia da classe 
 * ListaDePedidos.
 */
class DemoListaDePedidos
  {
 /**
  * O m�todo main permite a execu��o desta classe. Este m�todo cria uma inst�ncia da
  * classe ListaDePedidos e executa alguns m�todos desta inst�ncia.
  * @param argumentos os argumentos que podem ser passados para o m�todo via linha
  *        de comando, mas que neste caso ser�o ignorados.
  */
  public static void main(String[] argumentos)
    {
    // Criamos uma inst�ncia da lista de pedidos.
    ListaDePedidos lista = new ListaDePedidos();
    // Adicionamos v�rios pedidos usando v�rias prioridades.
    lista.entraPedido(new PedidoDeMedicamento("Anest�sico X-45",20),3);          // 3-1
    lista.entraPedido(new PedidoDeMedicamento("Pomada Antiss�ptica M-9",100),3); // 3-2
    lista.entraPedido(new PedidoDeSuprimento("Fita para Impressora E-80",10),3); // 3-5
    lista.entraPedido(new PedidoDeMedicamento("Analg�sico O-8",200),3);          // 3-3
    lista.entraPedido(new PedidoDeSuprimento("Formul�rio Cont�nuo R-79",200),3); // 3-6
    lista.entraPedido(new PedidoDeMedicamento("Expectorante J-0",50),3);         // 3-4
    lista.entraPedido(new PedidoDeSuprimento("�lcool Absoluto P-51",60),6);      // 6-2
    lista.entraPedido(new PedidoDeMedicamento("Anest�sico X-45",100),6);         // 6-1
    lista.entraPedido(new PedidoDeSuprimento("Algod�o Hidrof�lico K-2",500),3);  // 3-7
    System.out.println(lista); // Imprimimos o resultado do m�todo toString. Os n�meros ap�s 
                               // as linhas acima indicam a posi��o final na fila de
                               // prioridades.
    }

  } // fim da classe DemoListaDePedidos
