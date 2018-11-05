package testes;

interface InterUm {
    int a = 123;
    void imprime();
}

interface InterDois {
    String nome = "Maria";
}

class TestaInterface implements InterUm, InterDois {
    public void imprime() {
        System.out.println("Imprime alguma coisa: " + a);
        System.out.println("Imprime o nome: " + nome);
    }
}