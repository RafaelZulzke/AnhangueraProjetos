package testeDeAnonimos;

public class TestaClasseInternaImplementandoInterface {

    public static void main(String[] args) {

        class ClasseInternaAoMetodo implements Interface {
            public void imprime() {
                System.out.println("a = " + a);
            }
        }

        Interface i = new ClasseInternaAoMetodo();
        i.imprime();
    }

}
