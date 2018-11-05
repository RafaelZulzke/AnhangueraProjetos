package eleicao;
import java.util.ArrayList;
import java.util.Scanner;


public class Eleicao 
{
    private int qtdEleitores;
    private ArrayList<Candidato> candidatos;
    
      public Eleicao(int qtdEleitores, ArrayList<Candidato> candidatos) 
      {
        this.qtdEleitores = qtdEleitores;
        this.candidatos = candidatos;
    }
      
    public void votar()
    {
        Scanner input = new Scanner(System.in);
        
        for(int a = 0; a < qtdEleitores; a++)
        {
            System.out.println("Qual candidato voce irá votar");
            int numCan = input.nextInt();
            candidatos.get(getIndiceCan(numCan)).aceitacao();
        
            System.out.println("Qual candidato voce quer reijeitar");
            numCan = input.nextInt();
            candidatos.get(getIndiceCan(numCan)).rejeitacao();
        }
    }
    
    private  int getIndiceCan(int num)
    {
        for(Candidato c : candidatos)
        {
         if(c.getNum() == num)
         return candidatos.indexOf(c);
        }
        return -1;
    }
            
    public void apuracao()
    {
        for(Candidato c : candidatos)
        {
            System.out.println(c);
            System.out.println("Indice de Aceitação: " +(double) ((c.getAceita()*100)/qtdEleitores)+ "%");
            System.out.println("Indice de Rejeição: " + (double)((c.getRejeita()*100)/qtdEleitores)+ "%");

        }
    }  
}