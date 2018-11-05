package exemploComEnum;

public class Pessoa {

    private String codigo;
    private String nome;
    private int idade;
    private EstadoCivil estadoCivil;

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

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String toString() {
        return "\nCodigo: " + getCodigo() +
                "\nNome: " + getNome() +
                "\nIdade: " + getIdade() +
                "\nEstado Civil: " + getEstadoCivil();
    }

}
