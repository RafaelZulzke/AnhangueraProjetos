package testes;

public class TestaPessoa {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Maria", 12);
        System.out.println(p1);

        Pessoa p2 = new Pessoa("Carlos");
        System.out.println(p2);

        Pessoa p3 = new Pessoa();
        System.out.println(p3);

        Pessoa p4 = new Pessoa(34);
        System.out.println(p4);

    }

}
