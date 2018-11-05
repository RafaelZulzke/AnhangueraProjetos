package testeDeSopreposicao;

public class Programa {

    public static void main(String[] args) {
        CartaoDeCredito cc = new CartaoDeCredito();
        busca(cc);
        System.out.println(cc.numero);
    }

    static void busca(CartaoDeCredito cc) {
        cc = new CartaoDeCredito();
        cc.numero = 15;
    }
}

class CartaoDeCredito {

    int numero;
}
