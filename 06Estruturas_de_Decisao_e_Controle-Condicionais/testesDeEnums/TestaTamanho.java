package testesDeEnums;

public class TestaTamanho {

    enum TamanhoInterno {

        S, M, L
    };

    public static void main(String[] args) {

        System.out.println(TamanhoInterno.M.ordinal());

        Tamanho t = Tamanho.M;
        System.out.println(t);

        TamanhoV2 t2 = TamanhoV2.G;
        System.out.println(t2 + " - " + t2.getMedida());

        TamanhoV3 t3;
        t3 = TamanhoV3.PP;
        System.out.println(t3 + " - " + t3.getMedida());

        t3 = TamanhoV3.G;
        System.out.println(t3 + " - " + t3.getMedida());

        t3 = TamanhoV3.GG;
        System.out.println(t3 + " - " + t3.getMedida());

        switch (t2) {
            case G:
                System.out.println("Tamanho G");
                break;
            case M:
                System.out.println("Tamanho M");
                break;
            case P:
                System.out.println("Tamanho PP");
                break;
            case GG:
            case PP:
            default:
                System.out.println("Tamanho P ou GG");
        }

    }
}
