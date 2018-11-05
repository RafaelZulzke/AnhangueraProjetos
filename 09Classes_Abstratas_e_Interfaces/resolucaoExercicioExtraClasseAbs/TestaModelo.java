package resolucaoExercicioExtraClasseAbs;

public class TestaModelo {

    public static void main(String[] args) {

        Empregado p1 = new Empregado(
                "Projeto de Ensino", "1", "Maria", 23);

        Empregado p2 = new Empregado(
                "Projeto de Entretenimento", "2",
                "Heloisa", 27);

        Veiculo v1 = new Veiculo("Projeto de Ensino",
                1232, p1);

        Veiculo v2 = new Veiculo("Projeto de Fusao",
                4545, p2);

        geraSaida(p1);
        geraSaida(p2);
        geraSaida(v1);
        geraSaida(v2);

    }

    public static void geraSaida(Modelo modelo) {
        modelo.imprimir();
    }

}
