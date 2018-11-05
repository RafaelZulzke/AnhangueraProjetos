/**
 * A classe LivroDeLivraria representa um livro à venda em uma livraria. 
 */

class LivroDeLivraria
  {
 /**
  * Declaração dos campos da classe
  */
  private String título,autor; // título do livro e nome do autor
  private String ISBN; // o ISBN (código) do livro
  private short estoque; // número de livros em estoque
  private float pCompra,pVenda; // preço de compra e venda

 /**
  * Este construtor para a classe LivroDeLivraria recebe valores para inicializar os
  * os campos da classe. 
  * @param tit o título do livro
  * @param aut o nome do autor do livro
  * @param isbn o ISBN do livro
  * @param est o número de exemplares em estoque
  * @param pc o preço de compra deste livro
  * @param pv o preço de venda deste livro
  */
  LivroDeLivraria(String tit,String aut,String isbn,short est,float pc,float pv)
    { 
    título = tit; autor = aut; ISBN = isbn;
    estoque = est; pCompra = pc; pVenda = pv;
    }

 /**
  * O método quantosNoEstoque retorna o estoque do livro encapsulado.
  * @return o estoque do livro encapsulado.
  */
  public short quantosNoEstoque()
    {
    return estoque;
    }

 /**
  * O método qualPreçoDeVenda retorna o preço de venda do livro encapsulado.
  * @return o preço de venda do livro encapsulado.
  */
  public float qualPreçoDeVenda()
    {
    return pVenda;
    }

 /**
  * O método qualPreçoDeCompra retorna o preço de compra do livro encapsulado.
  * @return o preço de compra do livro encapsulado.
  */
  public float qualPreçoDeCompra()
    {
    return pCompra;
    }

 /**
  * O método qualISBN retorna o ISBN do livro encapsulado.
  * @return o ISBN do livro encapsulado.
  */
  public String qualISBN()
    {
    return ISBN;
    }

 /**
  * O método qualTítulo retorna o título do livro encapsulado.
  * @return o título do livro encapsulado.
  */
  public String qualTítulo()
    {
    return título;
    }

 /**
  * O método incrementaEstoque incrementa o estoque do livro encapsulado.
  */
  public void incrementaEstoque()
    {
    estoque++;
    }

 /**
  * O método decrementaEstoque decrementa o estoque do livro encapsulado.
  */
  public void decrementaEstoque()
    {
    estoque--;
    }

 /**
  * O método toString retorna uma string contendo os campos desta classe.
  * @return uma string com os valores dos campos desta classe
  */
  public String toString()
    {
    String res = "Título: "+título+"\n"+
                 "Autor: "+autor+"\n"+
                 "ISBN: "+ISBN+"\n"+
                 "Estoque: "+estoque+"\n"+
                 "Preço de compra: "+pCompra+"\n"+
                 "Preço de venda: "+pVenda+"\n";
    return res;
    }

  } // Fim da classe LivroDeLivraria
