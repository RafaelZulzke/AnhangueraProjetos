package testes;

public abstract class Aluno extends Pessoa {

    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

//    public void imprime() {
//        System.out.println("Nome: " + getNome() +
//                "\nMatricula: " + getMatricula());
//    }

}
