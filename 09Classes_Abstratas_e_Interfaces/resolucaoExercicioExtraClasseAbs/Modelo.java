package resolucaoExercicioExtraClasseAbs;

public abstract class Modelo {

    private String tituloDoProjeto;

    public Modelo(String tituloDoProjeto) {
        this.tituloDoProjeto = tituloDoProjeto;
    }

    public String getTitulo() {
        return tituloDoProjeto;
    }

    public void setTitulo(String tituloDoProjeto) {
        this.tituloDoProjeto = tituloDoProjeto;
    }

    public abstract void imprimir();

    public String toString() {
        return "Titulo do projeto: " + getTitulo() + "\n";
    }

}
