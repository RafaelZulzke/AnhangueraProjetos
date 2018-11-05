package testes;

public class Jogador {

    private int numero;
    private String nome;
    private static int qtd;

    private Jogador(int numero, String nome) {
        qtd++;
        setNumero(numero);
        setNome(nome);
    }

//    private Jogador(String nome) {
//        this(100, nome);
//    }
//
//    private Jogador(int numero) {
//        this(numero, "Sem Nome");
//    }
//
    public static Jogador getJogador(int numero, String nome) {
        return new Jogador(numero, nome);
    }

    public static Jogador getJogador(String nome) {
        return getJogador(100, nome);
    }

    public static Jogador getJogador(int numero) {
        return getJogador(numero, "Sem nome");
    }

    public static int getQtd() {
        return qtd;
    }

    public static void setQtd(int qtd) {
        Jogador.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public String toString() {
        return "Nome: " + getNome() +
                "\nNumero: " + getNumero() +
                "\nQuantidade: " + getQtd();
    }
}
