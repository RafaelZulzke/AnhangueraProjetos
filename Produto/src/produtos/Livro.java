package produtos;

public class Livro extends Produto
{
  public String autor;

    public Livro(String descricao, String Autor) 
    {
        super.descricao = descricao;
        this.autor = Autor;
        
    }

  @Override
    public String getDescricao() 
    {
        return "Nome: " + descricao + " Autor: " + autor;
    }
  
}
