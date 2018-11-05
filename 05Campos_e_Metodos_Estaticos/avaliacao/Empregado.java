package avaliacao;

public class Empregado {

    private String nome;
    private int idade;
    private static int quantidadeDeEmpregados;

    public Empregado(String nome, int idade) {
        quantidadeDeEmpregados++;
        setNome(nome);
        setIdade(idade);
    }

    public Empregado(String nome) {
        this(nome, 0);
    }

    public static Empregado getEmpregado(
            String nome, int idade) {
        return new Empregado(nome, idade);
    }

    public static Empregado getEmpregado(
            String nome) {
        return new Empregado(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return "Nome: " + getNome() +
                "\nIdade: " + getIdade() +
                "\nQuantidade de Empregados: " +
                quantidadeDeEmpregados;
    }

}