package testes;

class Pessoa {
    private String nome;
    private int idade;
    private short ano;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, short ano) {
        this.nome = nome;
        this.idade = idade;
        this.ano = ano;
    }

    public String toString() {
        return "Nome: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "Ano: " + getAno() + "\n";
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

    public short getAno() {
        return ano;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }




}
