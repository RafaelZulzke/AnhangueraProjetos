package implementacaoDosModelosCap1;

public class TestaLampada {

    public static void main(String[] args) {

        Lampada l1 = new Lampada();
        Lampada l2 = new Lampada();

        l1.mostraEstado();
        l1.acende();
        l1.mostraEstado();
        l1.apaga();
        l1.mostraEstado();

        l2.mostraEstado();
        l2.acende();
        l2.mostraEstado();

    }

}




