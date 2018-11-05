package exemplosJE;

public class TestaVeiculoAVenda {

    public static void main(String[] args) {

        AutomovelAVenda av = new AutomovelAVenda(2000, 5500f);
        VeiculoAVenda vv1 = av;

        imprime(av);
        imprime(vv1);

        MotocicletaAVenda mv = new MotocicletaAVenda(2009, 15000f);
        VeiculoAVenda vv2 = mv;
        
        imprime(mv);
        imprime(vv2);

        System.out.println("av instanceof AutomovelAVenda: " + (av instanceof AutomovelAVenda));
        System.out.println("av instanceof VeiculoAVenda: " + (av instanceof VeiculoAVenda));
        System.out.println("");

        System.out.println("mv instanceof MotocicletaAVenda: " + (mv instanceof MotocicletaAVenda));
        System.out.println("mv instanceof VeiculoAVenda: " + (mv instanceof VeiculoAVenda));
        System.out.println("");

        System.out.println("vv1 instanceof VeiculoAVenda: " + (vv1 instanceof VeiculoAVenda));
        System.out.println("vv1 instanceof AutomovelAVenda: " + (vv1 instanceof AutomovelAVenda));
        System.out.println("vv1 instanceof MotocicletaAVenda: " + (vv1 instanceof MotocicletaAVenda));
        System.out.println("");

        System.out.println("vv2 instanceof VeiculoAVenda: " + (vv2 instanceof VeiculoAVenda));
        System.out.println("vv2 instanceof AutomovelAVenda: " + (vv2 instanceof AutomovelAVenda));
        System.out.println("vv2 instanceof MotocicletaAVenda: " + (vv2 instanceof MotocicletaAVenda));
        System.out.println("");

    }

    static void imprime(VeiculoAVenda veiculoAVenda) {
        System.out.println("Veiculo a venda: \n" + veiculoAVenda + "\n");
    }

}
