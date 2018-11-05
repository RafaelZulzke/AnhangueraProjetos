package testeDeAnonimos;
public class TestaClasseAnonimaImplementandoInterface {
    public static void main(String[] args) {
        Interface i = new Interface() {
            public void imprime() {
                System.out.println("a = " + a);
            }
        };
        i.imprime();
    }
}
