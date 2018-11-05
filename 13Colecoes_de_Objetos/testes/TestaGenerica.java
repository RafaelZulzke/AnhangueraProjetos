package testes;

public class TestaGenerica {

    public static void main(String[] args) {

        Empregado e = new Empregado();
        Veiculo v = new Veiculo();

        Generica<Empregado> ge = new Generica<Empregado>();
        Generica<Veiculo> gv = new Generica<Veiculo>();

        ge.imprime(e);
        gv.imprime(v);


    }

}
