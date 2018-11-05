package testesComExcecoes;

public class TestaExcecaoVerificadaDeclarada {
    public static void main(String[] args) {
        try {
            carrega("testesComExcecoes.ClasseASerCarragada");
        } catch (ClassNotFoundException e) {
            System.out.println("Erro de carga!!!");
        }
    }

    static void carrega(String classe)
            throws ClassNotFoundException {
        Class.forName(classe);
        System.out.println("Sucesso!!!");
    }
}
