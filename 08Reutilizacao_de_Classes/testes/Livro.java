package testes;

public class Livro extends Publicacao {

    private int qtdPaginas;

    public Livro() {
    }

    public Livro(int ano, String titulo, int qtdPaginas) {
        super(ano, titulo);
        setQtdPaginas(qtdPaginas);
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        if (qtdPaginas >= 10) {
            this.qtdPaginas = qtdPaginas;
        }
    }

    public String toString() {
        return super.toString() +
                "\nPaginas: " + getQtdPaginas();
    }

    public void teste() {
        ano = 2003;
    }


}
