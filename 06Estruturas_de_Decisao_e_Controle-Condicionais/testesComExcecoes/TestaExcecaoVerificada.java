package testesComExcecoes;

public class TestaExcecaoVerificada {

    public static void main(String[] args) {

        try {
            Class.forName(
                    "testesComExcecoes.ClasseASerCarregada");
            System.out.println("Sucesso!!!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Classe nao encontrada!!!");
        }

    }
}
