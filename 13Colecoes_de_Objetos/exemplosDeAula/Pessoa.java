package exemplosDeAula;

public class Pessoa implements Comparable<Pessoa> {

    private String codigo;
    private String nome;
    private int idade;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
        return "\nCodigo: " + getCodigo() +
                "\nNome: " + getNome() +
                "\nIdade: " + getIdade();
    }

    public int compareTo(Pessoa o) {
        return -getNome().compareTo(o.getNome());
    }

}
