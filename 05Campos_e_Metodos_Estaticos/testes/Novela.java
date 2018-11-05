package testes;

public class Novela {

    private int capitulo;
    private String titulo;
    private static int qtd;

    private Novela(int capitulo, String titulo) {
        qtd++;
        this.capitulo = capitulo;
        this.titulo = titulo;
    }

    private Novela() {
        this(0, "Sem titulo");
    }

    private Novela(String titulo) {
        this(0, titulo);
    }

    public static Novela getNovela() {
        return new Novela();
    }

    public static Novela getNovela(int capitulo, String titulo) {
        return new Novela(capitulo, titulo);
    }

    public static Novela getNovela(String titulo) {
        return new Novela(titulo);
    }

    public static int getQtd() {
        return qtd;
    }

    public static void setQtd(int qtd) {
        Novela.qtd = qtd;
    }

    public int getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(int capitulo) {
        this.capitulo = capitulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String toString() {
        return "Titulo: " + getTitulo() +
                "\nCapitulo: " + getCapitulo() +
                "\nQuantidade: " + getQtd();
    }

}
