package testesComExcecoes;

public class TestaTryCatchFinally {

    public static void main(String[] args) {

        Object o = "teste";
        try {
            System.out.println(o.toString());
            System.out.println("Metodo executado com sucesso!!!");
        } catch (NullPointerException e) {
            System.out.println("Erro de objeto nulo!!!");
        } finally {
            System.out.println("Mensagem enviada pelo bloco finally!!!");
        }
    }
}
