package exemplosJE;

public class VeiculoAVenda {

    private String tipo;
    private int ano;
    private float preco;

    public VeiculoAVenda(String t, int a, float p) {
        tipo = t;
        ano = a;
        preco = p;
    }

    public String toString() {
        return
        "Tipo: " + tipo + "\n" +
        "Ano: " + ano + "\n" +
        "Preco: " + preco;
    }

}
