/**
 * A classe LivroDeLivraria representa um livro � venda em uma livraria. 
 */

class LivroDeLivraria
  {
 /**
  * Declara��o dos campos da classe
  */
  private String t�tulo,autor; // t�tulo do livro e nome do autor
  private String ISBN; // o ISBN (c�digo) do livro
  private short estoque; // n�mero de livros em estoque
  private float pCompra,pVenda; // pre�o de compra e venda

 /**
  * Este construtor para a classe LivroDeLivraria recebe valores para inicializar os
  * os campos da classe. 
  * @param tit o t�tulo do livro
  * @param aut o nome do autor do livro
  * @param isbn o ISBN do livro
  * @param est o n�mero de exemplares em estoque
  * @param pc o pre�o de compra deste livro
  * @param pv o pre�o de venda deste livro
  */
  LivroDeLivraria(String tit,String aut,String isbn,short est,float pc,float pv)
    { 
    t�tulo = tit; autor = aut; ISBN = isbn;
    estoque = est; pCompra = pc; pVenda = pv;
    }

 /**
  * O m�todo quantosNoEstoque retorna o estoque do livro encapsulado.
  * @return o estoque do livro encapsulado.
  */
  public short quantosNoEstoque()
    {
    return estoque;
    }

 /**
  * O m�todo qualPre�oDeVenda retorna o pre�o de venda do livro encapsulado.
  * @return o pre�o de venda do livro encapsulado.
  */
  public float qualPre�oDeVenda()
    {
    return pVenda;
    }

 /**
  * O m�todo qualPre�oDeCompra retorna o pre�o de compra do livro encapsulado.
  * @return o pre�o de compra do livro encapsulado.
  */
  public float qualPre�oDeCompra()
    {
    return pCompra;
    }

 /**
  * O m�todo qualISBN retorna o ISBN do livro encapsulado.
  * @return o ISBN do livro encapsulado.
  */
  public String qualISBN()
    {
    return ISBN;
    }

 /**
  * O m�todo qualT�tulo retorna o t�tulo do livro encapsulado.
  * @return o t�tulo do livro encapsulado.
  */
  public String qualT�tulo()
    {
    return t�tulo;
    }

 /**
  * O m�todo incrementaEstoque incrementa o estoque do livro encapsulado.
  */
  public void incrementaEstoque()
    {
    estoque++;
    }

 /**
  * O m�todo decrementaEstoque decrementa o estoque do livro encapsulado.
  */
  public void decrementaEstoque()
    {
    estoque--;
    }

 /**
  * O m�todo toString retorna uma string contendo os campos desta classe.
  * @return uma string com os valores dos campos desta classe
  */
  public String toString()
    {
    String res = "T�tulo: "+t�tulo+"\n"+
                 "Autor: "+autor+"\n"+
                 "ISBN: "+ISBN+"\n"+
                 "Estoque: "+estoque+"\n"+
                 "Pre�o de compra: "+pCompra+"\n"+
                 "Pre�o de venda: "+pVenda+"\n";
    return res;
    }

  } // Fim da classe LivroDeLivraria
