package implementacaoDosModelosCap1;

public class Lampada {

    String estadoDaLampada = "apagada";

    void acende() {
        estadoDaLampada = "acesa";
    }

    void apaga() {
        estadoDaLampada = "apagada";
    }

    void mostraEstado() {
        if (estadoDaLampada.equals("acesa")) {
            System.out.println("Esta acesa!");
        } else {
            System.out.println("Esta apagada!");
        }
    }

}
