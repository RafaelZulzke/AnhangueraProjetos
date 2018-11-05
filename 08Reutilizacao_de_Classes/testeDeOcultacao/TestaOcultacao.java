package testeDeOcultacao;

public class TestaOcultacao {
    public static void main(String[] args) {
        Primeira p0 = new Primeira();
        System.out.println(p0.a);
        p0.imprime();
        p0.imprimeSemOverride();

        Primeira p1 = new Segunda();
        System.out.println(p1.a);
        p1.imprime();
        p1.imprimeSemOverride();

        Segunda p2 = new Segunda();
        System.out.println(p2.a);
        p2.imprime();
        p2.imprimeSemOverride();
    }
}
