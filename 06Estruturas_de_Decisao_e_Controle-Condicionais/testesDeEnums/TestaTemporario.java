package testesDeEnums;

public class TestaTemporario {

    public static void main(String[] args) {

        TamanhoV2 t = TamanhoV2.M;

        //t.setMedida(455);

        switch (t) {
            case PP:
            case P:
                System.out.println("Pequeno!!");
                break;
            case M:
                System.out.println("Médio!!");
                System.out.println("Medida: " +
                        TamanhoV2.M.getMedida());
                break;
            case G:
            case GG:
                System.out.println("Grande!!");
                break;
            default:
        }




    }
}
