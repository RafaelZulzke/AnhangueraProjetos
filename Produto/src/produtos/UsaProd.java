package produtos;

import java.util.ArrayList;


public class UsaProd 
{
 public static void main(String[] args) 
 {
 ArrayList<Produto> carrinho = new ArrayList<Produto>();

    Mouse mouse = new Mouse("Mouse", "Gamer");
    Livro livro = new Livro("Misterioso Mundo de Java", "Marcos"); 
 
 carrinho.add(mouse); 
 carrinho.add(livro); 
 
 for (Produto p : carrinho)
 {
  System.out.println( p.getDescricao());   
 } 
 }
}
