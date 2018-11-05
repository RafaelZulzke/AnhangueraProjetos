/* Importamos as classes e interfaces do pacote java.util */
import java.util.*;

/** 
 * A classe EstoqueDeLivraria representa uma coleção de instâncias da classe
 * LivroDeLivraria. As instâncias serão armazenadas em um mapa, onde a chave é o
 * ISBN do livro e o valor é a instância da classe LivroDeLivraria associada.
 * Esta classe contém métodos simples para simular a compra e venda de livros da
 * coleção.
 */
class EstoqueDeLivraria
  {
 /**
  * Declaração dos campos da classe
  */
  private Map estoque;
  private float saldoDoCaixa; // valor das vendas efetuadas

 /**
  * O construtor desta classe inicializa os campos da classe.
  */
  EstoqueDeLivraria()
    {
    estoque = new HashMap();
    }

 /**
  * O método adicionaLivro adiciona um livro à coleção representada por esta classe.
  * @param livro uma instância da classe LivroDeLivraria
  */
  public void adicionaLivro(LivroDeLivraria livro)
    {
    String isbn = livro.qualISBN(); // recuperamos o ISBN para usar como chave
    estoque.put(isbn,livro); // adicionamos o livro com esta chave ao mapa
    }

 /**
  * O método mostraCaixa mostra o balanço do caixa.
  */
  public void mostraCaixa()
    {
    System.out.println("Saldo do caixa: "+saldoDoCaixa);
    }

 /**
  * O método vendeLivro simula a venda de um livro do estoque. O ISBN de um dos 
  * livros no estoque será pedido e o livro correspondente terá seus dados
  * modificados.
  */
  public void vendeLivro()
    {
    // Recuperamos um ISBN de livro no estoque com um menu
    String ISBN = escolheLivro();
    // Recuperamos o livro correspondente do mapa
    LivroDeLivraria livro = (LivroDeLivraria)estoque.get(ISBN);
    // Se existir estoque, efetuamos a venda (simbólica) do livro, decrementando 
    // seu estoque e incrementando o nosso caixa.
    if (livro.quantosNoEstoque() > 0)
      {
      livro.decrementaEstoque();
      saldoDoCaixa += livro.qualPreçoDeVenda();
      System.out.println("Quantidades do livro "+livro.qualTítulo()+" no estoque: "+
                         livro.quantosNoEstoque());
      mostraCaixa();
      }
    else
      System.out.println("Não temos o livro "+livro.qualTítulo()+" no estoque !");
    }

 /**
  * O método compraLivro simula a compra de um livro do estoque. O ISBN de um dos 
  * livros no estoque será pedido e o livro correspondente terá seus dados
  * modificados.
  */
  public void compraLivro()
    {
    // Recuperamos um ISBN de livro no estoque com um menu
    String ISBN = escolheLivro();
    // Recuperamos o livro correspondente do mapa
    LivroDeLivraria livro = (LivroDeLivraria)estoque.get(ISBN);
    // Se existir dinheiro em caixa, efetuamos a compra (simbólica) do livro, 
    // incrementando seu estoque e decrementando o nosso caixa.
    if (saldoDoCaixa > livro.qualPreçoDeCompra())
      {
      livro.incrementaEstoque();
      saldoDoCaixa -= livro.qualPreçoDeCompra();
      System.out.println("Quantidades do livro "+livro.qualTítulo()+" no estoque: "+
                         livro.quantosNoEstoque());
      mostraCaixa();
      }
    else
      System.out.println("Não temos dinheiro em caixa para comprar o livro "+
                         livro.qualTítulo()+" !");
    }

 /**
  * O método escolheLivro (declarado como privado, para ser usado somente por outros 
  * métodos nesta classe) permite a escolha de um livro a partir de um número (entrada
  * em um menu). Seria mais simples para o programador fazer o usuário entrar 
  * diretamente o ISBN do livro, o que seria mais complicado para o usuário de uma  
  * aplicação que usasse este método (o usuário poderia digitar valores incorretos). 
  * @return o ISBN do livro escolhido (como uma string)
  */
  private String escolheLivro()
    {
    System.out.println("===================================================");
    // Precisaremos, neste método, tratar o mapa que representa os livros como um array.
    // Temos duas maneiras de fazer isto: transformar os valores do mapa em uma instância 
    // de qualquer classe que herde de Collection usando o método values ou recuperar 
    // somente as chaves do mapa como uma lista que pode ser procurada através de um
    // índice. Faremos da segunda forma, criando um ArrayList a partir das chaves do mapa.
    ArrayList listaDeISBNs = new ArrayList(estoque.keySet());
    for(int índice=0;índice<listaDeISBNs.size();índice++)
      {
      // Recuperamos do mapa o livro cuja chave seja o ISBN da lista obtida anteriormente
      LivroDeLivraria livro = (LivroDeLivraria)estoque.get(listaDeISBNs.get(índice));
      // Imprimimos uma entrada de menu com o índice ajustado e os dados básicos do livro
      // correspondente
      System.out.println((índice+1)+" "+livro.qualTítulo()+": R$ "+livro.qualPreçoDeVenda());
      System.out.println("===================================================");
      }
    int opção = Keyboard.readInt(); 
    // Pedimos ao usuário um valor, repetimos enquanto não for um valor válido
    while ((opção <= 0) || (opção > listaDeISBNs.size()))
      {
      System.out.println("Por favor entre um valor entre 1 e "+listaDeISBNs.size());
      opção = Keyboard.readInt(); 
      }
    // Retornamos o ISBN correspondente à posição digitada, convertida de Object para String
    // e usando o índice decrementado (pois o ArrayList conta de 0 a N-1)
    return (String)listaDeISBNs.get(opção-1); 
    }

 /**
  * O método toString retorna a lista dos livros do estoque como uma string.
  * @return uma string contendo a lista dos livros do estoque.
  */
  public String toString()
    {
    StringBuffer resultado = new StringBuffer();
    resultado.append("===================================================\n");
    // Precisamos obter a lista de chaves do mapa. Podemos fazer isso obtendo a
    // coleção de chaves com o keySet e um Iterator a partir desta coleção
    Iterator livros = estoque.keySet().iterator();
    while (livros.hasNext())
      {
      // Adicionamos ao StringBuffer o resultado do método toString de cada
      // instância de LivroDeLivraria presente no mapa
      LivroDeLivraria livro = (LivroDeLivraria)estoque.get(livros.next());
      resultado.append(livro.toString());
      resultado.append("===================================================\n");
      }
    return resultado.toString();
    }

  } // fim da classe EstoqueDeLivraria
