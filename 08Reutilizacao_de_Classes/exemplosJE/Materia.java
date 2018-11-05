package exemplosJE;

public class Materia {

    private String nome;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Materia: " + nome + "\n";
    }

}
