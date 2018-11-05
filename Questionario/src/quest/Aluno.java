package quest;


public class Aluno {
    
    String nome;
    int nota;
    
    public Aluno(String nome, int nota) 
    {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public int getNota() 
    {
        return nota;
    }

    public void setNota(int nota) 
    {
        this.nota = nota;
    }

    @Override
    public String toString() 
    {
        return "AlunoS: " + " Nome " + nome + " Nota " + nota + '}';
    }
    
}
