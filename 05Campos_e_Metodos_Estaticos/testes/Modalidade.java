package testes;

public class Modalidade {

    private String descricao;
    private int anoCriacao;
    private static int qtd;

    private Modalidade(String descricao, int anoCriacao) {
        setQtd(getQtd()+1);
        setDescricao(descricao);
        setAnoCriacao(anoCriacao);
    }

//    private Modalidade(String descricao) {
//        this(descricao, 1969);
//    }
//
//    private Modalidade(int anoCriacao) {
//        this("Sem descricao", anoCriacao);
//    }

    public static Modalidade getModalidade(String descricao, int anoCriacao) {
        return new Modalidade(descricao, anoCriacao);
    }

    public static Modalidade getModalidade(String descricao) {
        return getModalidade(descricao, 1969);
    }

    public static Modalidade getModalidade(int anoCriacao) {
        return getModalidade("Sem Descricao", anoCriacao);
    }

    public static int getQtd() {
        return qtd;
    }

    public static void setQtd(int qtd) {
        Modalidade.qtd = qtd;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        if (anoCriacao > 0) {
            this.anoCriacao = anoCriacao;
        }
    }

    public String toString() {
        return "Descricao: " + getDescricao() +
                "\nAno de Criacao: " + getAnoCriacao();
    //"\nQuantidade: " + getQtd();
    }
}
