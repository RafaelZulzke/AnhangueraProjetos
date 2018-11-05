package testes;

public class Inteiro implements Comparable {

    private int valor;

    public Inteiro(int valor) {
        setValor(valor);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int compareTo(Object o) {
        //return getValor() - ((Inteiro)o).getValor();
        return ((Inteiro)o).getValor() - getValor();
    }

    public String toString() {
        return getValor() + "";
    }

}
