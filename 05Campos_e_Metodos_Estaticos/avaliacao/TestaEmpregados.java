package avaliacao;

public class TestaEmpregados {

    public static void main(String[] args) {

        Empregado e1 = new Empregado("Maria", 23);
        Empregado e2 = new Empregado("Pedro");
        Empregado e3 = Empregado.getEmpregado("Tatiana", 22);
        Empregado e4 = Empregado.getEmpregado("Daniel");
        e2.setIdade(21);
        e4.setIdade(28);

        imprime(e1);
        imprime(e2);
        imprime(e3);
        imprime(e4);

    }
    
    public static void imprime(Empregado e) {
        System.out.println(e);
    }

}
