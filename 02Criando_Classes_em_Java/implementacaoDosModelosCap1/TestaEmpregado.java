package implementacaoDosModelosCap1;

public class TestaEmpregado {

    public static void main(String[] args) {

        Empregado e1 = new Empregado();
        e1.setNome("Pedro");
        e1.setIdade(78);
        
        Empregado e2 = new Empregado();
        e2.setNome("Maria");
        e2.setIdade(12);

        Empregado e3 = new Empregado();
        e3.setNome("Patricia");
        e3.setIdade(13);

        Empregado e4 = e2;
        e4.setNome("xpto");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

    }

}
