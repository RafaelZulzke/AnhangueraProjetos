/* Importamos as classes e interfaces do pacote java.util */
import java.util.*;

/** 
 * A classe EstoqueDeLivraria representa uma cole��o de inst�ncias da classe
 * LivroDeLivraria. As inst�ncias ser�o armazenadas em um mapa, onde a chave � o
 * ISBN do livro e o valor � a inst�ncia da classe LivroDeLivraria associada.
 * Esta classe cont�m m�todos simples para simular a compra e venda de livros da
 * cole��o.
 */
class EstoqueDeLivraria
  {
 /**
  * Declara��o dos campos da classe
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
  * O m�todo adicionaLivro adiciona um livro � cole��o representada por esta classe.
  * @param livro uma inst�ncia da classe LivroDeLivraria
  */
  public void adicionaLivro(LivroDeLivraria livro)
    {
    String isbn = livro.qualISBN(); // recuperamos o ISBN para usar como chave
    estoque.put(isbn,livro); // adicionamos o livro com esta chave ao mapa
    }

 /**
  * O m�todo mostraCaixa mostra o balan�o do caixa.
  */
  public void mostraCaixa()
    {
    System.out.println("Saldo do caixa: "+saldoDoCaixa);
    }

 /**
  * O m�todo vendeLivro simula a venda de um livro do estoque. O ISBN de um dos 
  * livros no estoque ser� pedido e o livro correspondente ter� seus dados
  * modificados.
  */
  public void vendeLivro()
    {
    // Recuperamos um ISBN de livro no estoque com um menu
    String ISBN = escolheLivro();
    // Recuperamos o livro correspondente do mapa
    LivroDeLivraria livro = (LivroDeLivraria)estoque.get(ISBN);
    // Se existir estoque, efetuamos a venda (simb�lica) do livro, decrementando 
    // seu estoque e incrementando o nosso caixa.
    if (livro.quantosNoEstoque() > 0)
      {
      livro.decrementaEstoque();
      saldoDoCaixa += livro.qualPre�oDeVenda();
      System.out.println("Quantidades do livro "+livro.qualT�tulo()+" no estoque: "+
                         livro.quantosNoEstoque());
      mostraCaixa();
      }
    else
      System.out.println("N�o temos o livro "+livro.qualT�tulo()+" no estoque !");
    }

 /**
  * O m�todo compraLivro simula a compra de um livro do estoque. O ISBN de um dos 
  * livros no estoque ser� pedido e o livro correspondente ter� seus dados
  * modificados.
  */
  public void compraLivro()
    {
    // Recuperamos um ISBN de livro no estoque com um menu
    String ISBN = escolheLivro();
    // Recuperamos o livro correspondente do mapa
    LivroDeLivraria livro = (LivroDeLivraria)estoque.get(ISBN);
    // Se existir dinheiro em caixa, efetuamos a compra (simb�lica) do livro, 
    // incrementando seu estoque e decrementando o nosso caixa.
    if (saldoDoCaixa > livro.qualPre�oDeCompra())
      {
      livro.incrementaEstoque();
      saldoDoCaixa -= livro.qualPre�oDeCompra();
      System.out.println("Quantidades do livro "+livro.qualT�tulo()+" no estoque: "+
                         livro.quantosNoEstoque());
      mostraCaixa();
      }
    else
      System.out.println("N�o temos dinheiro em caixa para comprar o livro "+
                         livro.qualT�tulo()+" !");
    }

 /**
  * O m�todo escolheLivro (declarado como privado, para ser usado somente por outros 
  * m�todos nesta classe) permite a escolha de um livro a partir de um n�mero (entrada
  * em um menu). Seria mais simples para o programador fazer o usu�rio entrar 
  * diretamente o ISBN do livro, o que seria mais complicado para o usu�rio de uma  
  * aplica��o que usasse este m�todo (o usu�rio poderia digitar valores incorretos). 
  * @return o ISBN do livro escolhido (como uma string)
  */
  private String escolheLivro()
    {
    System.out.println("===================================================");
    // Precisaremos, neste m�todo, tratar o mapa que representa os livros como um array.
    // Temos duas maneiras de fazer isto: transformar os valores do mapa em uma inst�ncia 
    // de qualquer classe que herde de Collection usando o m�todo values ou recuperar 
    // somente as chaves do mapa como uma lista que pode ser procurada atrav�s de um
    // �ndice. Faremos da segunda forma, criando um ArrayList a partir das chaves do mapa.
    ArrayList listaDeISBNs = new ArrayList(estoque.keySet());
    for(int �ndice=0;�ndice<listaDeISBNs.size();�ndice++)
      {
      // Recuperamos do mapa o livro cuja chave seja o ISBN da lista obtida anteriormente
      LivroDeLivraria livro = (LivroDeLivraria)estoque.get(listaDeISBNs.get(�ndice));
      // Imprimimos uma entrada de menu com o �ndice ajustado e os dados b�sicos do livro
      // correspondente
      System.out.println((�ndice+1)+" "+livro.qualT�tulo()+": R$ "+livro.qualPre�oDeVenda());
      System.out.println("===================================================");
      }
    int op��o = Keyboard.readInt(); 
    // Pedimos ao usu�rio um valor, repetimos enquanto n�o for um valor v�lido
    while ((op��o <= 0) || (op��o > listaDeISBNs.size()))
      {
      System.out.println("Por favor entre um valor entre 1 e "+listaDeISBNs.size());
      op��o = Keyboard.readInt(); 
      }
    // Retornamos o ISBN correspondente � posi��o digitada, convertida de Object para String
    // e usando o �ndice decrementado (pois o ArrayList conta de 0 a N-1)
    return (String)listaDeISBNs.get(op��o-1); 
    }

 /**
  * O m�todo toString retorna a lista dos livros do estoque como uma string.
  * @return uma string contendo a lista dos livros do estoque.
  */
  public String toString()
    {
    StringBuffer resultado = new StringBuffer();
    resultado.append("===================================================\n");
    // Precisamos obter a lista de chaves do mapa. Podemos fazer isso obtendo a
    // cole��o de chaves com o keySet e um Iterator a partir desta cole��o
    Iterator livros = estoque.keySet().iterator();
    while (livros.hasNext())
      {
      // Adicionamos ao StringBuffer o resultado do m�todo toString de cada
      // inst�ncia de LivroDeLivraria presente no mapa
      LivroDeLivraria livro = (LivroDeLivraria)estoque.get(livros.next());
      resultado.append(livro.toString());
      resultado.append("===================================================\n");
      }
    return resultado.toString();
    }

  } // fim da classe EstoqueDeLivraria
