package testes;

interface InterUm {
    int a = 123;
    void imprime();
}
interface InterDois {
    String nome = "Maria";
}
interface InterTres extends InterUm, InterDois {}

class TestaInterface implements InterTres {
    public void imprime() {
        System.out.println("Imprime alguma coisa: " + a);
        System.out.println("Imprime o nome: " + nome);
    }
}