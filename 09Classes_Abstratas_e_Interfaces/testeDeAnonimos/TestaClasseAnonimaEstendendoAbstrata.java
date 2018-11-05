package testeDeAnonimos;

public class TestaClasseAnonimaEstendendoAbstrata {

    int x = 45;
    ClasseAbstrata c = new ClasseAbstrata(123) {

        void imprime() {
            System.out.println("a = " + a);
            System.out.println("x = " + x);
            System.out.println(getClass().getName());
        }
    };

    public static void main(String[] args) {
        ClasseAbstrata ca = new ClasseAbstrata(123) {

            void imprime() {
                System.out.println("a = " + a);
                System.out.println(getClass().getName());
            }
        };
        ca.imprime();
        new TestaClasseAnonimaEstendendoAbstrata().c.imprime();
    }
}
