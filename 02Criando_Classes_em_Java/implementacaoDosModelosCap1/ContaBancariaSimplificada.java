package implementacaoDosModelosCap1;


public class ContaBancariaSimplificada {

    String nomeDoCorrentista;
    double saldo;
    boolean contaEEspecial;

    void abreConta(
            String nome, double deposito,
            boolean especial) {
        nomeDoCorrentista = nome;
        saldo = deposito;
        contaEEspecial = especial;
    }

    void abreContaSimples(String nome) {
        nomeDoCorrentista = nome;
        saldo = 0;
        contaEEspecial = false;
    }

    void deposita(double valor) {
        saldo += valor;
    }

    void retira(double valor) {
        if (!contaEEspecial) {
            if (valor <= saldo) {
                saldo -= valor;
            }
        } else {
            saldo -= valor;
        }
    }

    void mostraDados() {
        System.out.println("\nConta Corrente");
        System.out.println("Nome: " +
                nomeDoCorrentista);
        System.out.println("Saldo: " +
                saldo);
        if (contaEEspecial) {
            System.out.println("Conta Especial");
        } else {
            System.out.println("Conta Comum");
        }
    }

}
