package implementacaoDosModelosCap1;

public class TestaInstanceof {

    public static void main(String[] args) {

        Pessoa e = null;

        System.out.println(e instanceof Object);
        System.out.println(e instanceof Pessoa);
        System.out.println(e instanceof Empregado);

    }

}
