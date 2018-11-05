package implementacaoDosModelosCap1;

public class TestaContaBancariaSimplificada {

    public static void main(String[] args) {

        ContaBancariaSimplificada c1 =
                new ContaBancariaSimplificada();
        c1.abreConta("jose", 3000, true);
        c1.mostraDados();

        ContaBancariaSimplificada c2 =
                new ContaBancariaSimplificada();
        c2.abreContaSimples("maria");
        c2.mostraDados();

        c2.deposita(5);
        c2.deposita(5);
        c2.deposita(5);
        c2.mostraDados();

        c2.retira(10);
        c2.mostraDados();

        c1.retira(4000);
        c1.mostraDados();

    }
}
