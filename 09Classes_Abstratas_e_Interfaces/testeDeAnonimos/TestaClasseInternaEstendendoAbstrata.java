package testeDeAnonimos;

public class TestaClasseInternaEstendendoAbstrata {

    int x = 45;
    class ClasseInternaAClasse extends ClasseAbstrata {

        public ClasseInternaAClasse(int a) {
            super(a);
        }

        void imprime() {
            System.out.println("a = " + a);
            System.out.println("x = " + x);
            System.out.println(getClass().getName());
        }

    }
    ClasseAbstrata c = new ClasseInternaAClasse(123);

    public static void main(String[] args) {

        class ClasseInternaAoMetodo extends ClasseAbstrata {

            public ClasseInternaAoMetodo(int a) {
                super(a);
            }

            void imprime() {
                System.out.println("a = " + a);
                System.out.println(getClass().getName());
            }

        }

        ClasseAbstrata ca = new ClasseInternaAoMetodo(123);
        ca.imprime();
        new TestaClasseInternaEstendendoAbstrata().c.imprime();
    }
}
