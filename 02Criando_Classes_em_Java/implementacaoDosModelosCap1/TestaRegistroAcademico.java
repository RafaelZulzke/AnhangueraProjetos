package implementacaoDosModelosCap1;

public class TestaRegistroAcademico {

    public static void main(String[] args) {

        Data dt1 = new Data();
        dt1.inicializaData(12, 12, 2009);

        RegistroAcademico ra1 = new RegistroAcademico();
        ra1.inicializaRegistro(
                "Jose", "121212", dt1, false, 2000);

        ra1.mostraRegistro();

    }

}
