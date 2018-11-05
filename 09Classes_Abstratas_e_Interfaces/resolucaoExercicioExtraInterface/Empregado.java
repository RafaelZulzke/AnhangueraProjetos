package resolucaoExercicioExtraInterface;

public class Empregado implements Modelo {

    private String codigo;
    private String nome;
    private int idade;

    public Empregado(String codigo, String nome, int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Titulo do Projeto: " + TITULO_DO_PROJETO + "\n" +
                "Dados do Empregado ----\n" +
                "Codigo: " + getCodigo() + "\n" +
                "Nome: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n";
    }

    public void imprimir() {
        System.out.println(this);
    }

}
