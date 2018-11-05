
public class Pessoa {

    private String nome;
    private int idade;

//    Pessoa(String nome, int idade) {
//        setNome(nome);
//        setIdade(idade);
//    }
//
//    Pessoa() {
//        this("Sem nome");
//    }
//
//    Pessoa(String nome) {
//        this(nome, 0);
//    }

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
        if (idade >= 0) {
            this.idade = idade;
        }
    }

    public String toString() {
        return "Nome: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n";
    }
}
