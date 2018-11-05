package quest;
import java.util.ArrayList;
import java.util.Scanner;


public class Questoes 
{
    
    String descricao;
    String opcao;
    int qtdalunos;
    public int qtdQuest;

    public  ArrayList<Aluno> alunos;

    public Questoes(String descricao, String opcao,int qtdalunos, int qtdQuest, ArrayList<Aluno> alunos) 
    {
        this.descricao = descricao;
        this.opcao = opcao;
        this.qtdalunos = qtdalunos;
        this.qtdQuest = qtdQuest;
        this.alunos = alunos;
    }
    
    public String getDescricao() 
    {
        return descricao;
    }

    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    public String getOpcao() 
    {
        return opcao;
    }

    public void setOpcao(String opcao) 
    {
        this.opcao = opcao;
    }

/*    public void criarquest()
    {
        Scanner input = new Scanner(System.in);
        
     for(int a = 0; a < qtdQuest; a++)
    {
      System.out.println("Qual questão deseja inserir");
      String descricao = input.nextString();  
    }*/
     
    @Override
    public String toString() 
    {
        return "Questoes " + " Descricao " + descricao + " Opcao " + opcao + '}';
    }

    

    
}
