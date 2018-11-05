package eleicao;
import java.util.ArrayList;


public class UsaEleicao 
{
    public static void main(String[] args) 
    {
        ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
        Candidato c = new Candidato(1,"PV");
        candidatos.add(c);
        c = new Candidato(2, "PT");
        candidatos.add(c);
        c = new Candidato (3,"PSDB");
        candidatos.add(c);    
    
        Eleicao e = new Eleicao(3, candidatos);
        e.votar();
        e.apuracao();
        
        
    }

}
