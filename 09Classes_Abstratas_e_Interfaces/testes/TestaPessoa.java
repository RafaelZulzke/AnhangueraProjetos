package testes;

public class TestaPessoa {

    public static void main(String[] args) {

        Pessoa.imprime2();

        Aluno p = new AlunoEspecial();

        p.setNome("Marias das Dores Avanšadas");
        p.setMatricula(123123);

        p.imprime();


    }

}
