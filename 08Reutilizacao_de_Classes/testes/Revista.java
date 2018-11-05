package testes;

public class Revista extends Publicacao {

    private int mes;

    public Revista() {
    }

    public Revista(int mes, int ano, String titulo) {
        super(ano, titulo);
        setMes(mes);
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String toString() {
        return super.toString() +
                "\nMes: " + getMes();
    }



}
