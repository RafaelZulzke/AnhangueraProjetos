package testes;

public class Publicacao {

    protected int ano;
    private String titulo;

    public Publicacao(int ano, String titulo) {
        setAno(ano);
        setTitulo(titulo);
    }

    public Publicacao() {
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String toString() {
        return "Titulo: " + getTitulo() +
                "\nAno: " + getAno();
    }

}
