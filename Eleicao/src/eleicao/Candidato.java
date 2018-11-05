package eleicao;

public class Candidato 
{
    private int num;
    private String partido;
    public int aceita;
    public int rejeita;

    
    Candidato(int num, String partido) 
    {
     this.num = num;
     this.partido = partido;
     aceita = 0;
     rejeita = 0;
    }
              
    public void aceitacao()
    {
     aceita++;
    }
    
    public void rejeitacao()
    {
     rejeita++;
    }
    
    public int getAceita() 
    {
        return aceita;
    }

    public int getRejeita() 
    {
        return rejeita;
    }

    public int getNum() 
    {
        return num;
    }

    public void setNum(int num) 
    {
        this.num = num;
    }

    public String getPartido() 
    {
        return partido;
    }

    public void setPartido(String partido) 
    {
        this.partido = partido;
    }

    @Override
    public String toString() 
    {
        return "Candidato{" + "num=" + num + ", partido=" + partido + '}';
    }
     
    


    
    

    
   
}
