package testesDeEnums;

public enum Tipo {

    A(10), B(100), O(200);

    Tipo(int valor) {
        setValor(valor);
        inc();
    }

    static int qtd;
    int valor;

    void inc() {
        qtd++;
    }

    public static int getQtd() {
        return qtd;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
