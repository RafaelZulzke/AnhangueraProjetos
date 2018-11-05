package exemplosEmSala;

public class TestaPessoa {

    public static void main(String[] a) {

        Pessoa p = new Pessoa();

        p.setNome("Aline");
        p.setIdade(18);
        p.setIdade(-36);
        p.setIdade(34);

        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());

    }
    

}
