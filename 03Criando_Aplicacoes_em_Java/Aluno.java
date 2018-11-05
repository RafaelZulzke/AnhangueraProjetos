
public class Aluno extends Pessoa {

    Aluno() {
        this("sem nome");

    }

    Aluno(String nome) {
        this(nome, 0);

    }

    Aluno(String nome, int idade) {
        setNome(nome);
        setIdade(idade);

    }

    


}
