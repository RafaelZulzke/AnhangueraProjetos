package testes;

public class TestaLivro {

    static int contaLivro;
    static int contaRevista;

    public static void main(String[] args) {

        Object p1 = new Livro(
                2000, "Ilha Perdida", 100);

        Object p2 = new Livro(
                2000, "Monica e Sua Turma", 30);

        Object p3 = new Revista(
                4, 2000, "Veja");

        Object p4 = new Revista(
                8, 2005, "Exame");

        Object p5 = new Revista(
                8, 2005, "Epoca");

        imprime(p1);
        imprime(p2);
        imprime(p3);
        imprime(p4);
        imprime(p5);
        imprime("\nQuantidade de Livros: " + contaLivro +
                "\nQuantidade de Revistas: " + contaRevista);

    }

    static void imprime(Object p) {
        System.out.println(p);
        if (p instanceof Livro) {
            contaLivro++;
        }
        if (p instanceof Revista) {
            contaRevista++;
        }
    }

}
