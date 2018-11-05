package exemplosJE;

public class Aluno {

    private String nome;
    private Data dataNascimento;
    private Materia materia;

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

    /**
     * @return the dataNascimento
     */
    public Data getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the materia
     */
    public Materia getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String toString() {
        return "Nome: " + nome + "\n" +
                "Nascimento: " + dataNascimento + "\n" +
                materia;
    }

}
