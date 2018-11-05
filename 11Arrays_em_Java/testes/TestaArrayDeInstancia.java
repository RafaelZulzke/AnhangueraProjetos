package testes;

public class TestaArrayDeInstancia {

    public static void main(String[] args) {

        Pessoa[] pessoas = new Pessoa[2];

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();
        }

        pessoas[0].setNome("Maria");
        pessoas[0].setIdade(23);

        pessoas[1].setNome("Jose");
        pessoas[1].setIdade(32);

        for(Pessoa pessoa: pessoas) {
            System.out.println(pessoa);
        }

    }

}
