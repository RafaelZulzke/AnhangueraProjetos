package testes;

public class TestaInterfaceQueEstendeVarias {

    public static void main(String[] args) {

        InterfaceQueEstendeVarias iev = new InterfaceQueEstendeVarias() {

            public void imprime() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void InterfaceComCampos() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

        };

        iev.InterfaceComCampos();

    }

}
