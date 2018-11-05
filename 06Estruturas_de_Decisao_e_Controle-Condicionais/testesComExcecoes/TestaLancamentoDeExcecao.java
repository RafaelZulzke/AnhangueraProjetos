package testesComExcecoes;

public class TestaLancamentoDeExcecao {
    public static void main(String[] args) {
        try {
            recebeNumero(100);
            System.out.println("100 recebido");
            recebeNumero(120);
            System.out.println("120 recebido");
        } catch (NumeroForaDoIntervaloExcecao e) {
            System.out.println(
                    "Erro de recebimento");
        }
    }
    static void recebeNumero(int a) 
            throws NumeroForaDoIntervaloExcecao {
        if (a < 0 || a > 100) {
            throw new NumeroForaDoIntervaloExcecao();
        }
    }
}
