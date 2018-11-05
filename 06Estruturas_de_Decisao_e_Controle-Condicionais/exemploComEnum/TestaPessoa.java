package exemploComEnum;

public class TestaPessoa {

    public static void main(String[] args) {

        Pessoa p = new Pessoa();

        p.setCodigo("123");
        p.setNome("Andre");
        p.setIdade(12);
        p.setEstadoCivil(EstadoCivil.SOLTEIRO);

        System.out.println(p);

    }

}
