package testes;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String n, int i) {
        nome = n;
        idade = i;
    }

    public Pessoa() {
        nome = "sem nome";
        idade = 0;
    }

    public Pessoa(int i) {
        nome = "sem nome";
        idade = i;
    }

    public Pessoa(String n) {
        nome = n;
        idade = 0;
    }

    public void setNome(String n) {
        nome = n;
    }

    public void setIdade(int i) {
        idade = i;
    }

    public String toString() {
        return "Nome: " + nome + "\n" + "Idade: " + idade + "\n";
    }



}
