/*
 * @Autor: RafaelZulzke; Ultima Data de Modificação: 22/08/16   
 */

public class Pessoa 
{
    /*Atributos*/
    String nome;
    int idade;
   
    /*Construtores*/
    public Pessoa(String nome, int idade) 
    {
        this.nome = nome;
        this.idade = idade;
    }
    
    /*Get e Set Nome*/
    public String getNome() 
    {
    return nome;
    }
    public void setNome(String nome)
    {
      this.nome = nome;
    }
    
    /*Get e Set Idade*/
    public int getIdade() 
    {
    return idade;
    }
    public void setIdade(int idade) 
    {
        this.idade = idade;
    }
    
    /*Main*/ 
    public static void main(String args[])
    {
        Pessoa p = new Pessoa("Calamares", 16);
 
            // p.nome = "Claro";
            // p.idade = 15;

        System.out.println("Nome:" + p.nome);
        System.out.println("Idade:" + p.idade);

    }

}
