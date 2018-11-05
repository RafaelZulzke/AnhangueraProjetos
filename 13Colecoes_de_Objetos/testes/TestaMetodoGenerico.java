package testes;

public class TestaMetodoGenerico {

    public static void main(String[] args) {

        Empregado e = new Empregado();
        Veiculo v = new Veiculo();

        MetodoGenerico mg = new MetodoGenerico();

        mg.imprime(e);
        mg.imprime(v);


    }

}
