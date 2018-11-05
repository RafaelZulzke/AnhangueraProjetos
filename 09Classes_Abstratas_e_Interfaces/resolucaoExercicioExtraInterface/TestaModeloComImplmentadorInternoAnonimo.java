package resolucaoExercicioExtraInterface;

public class TestaModeloComImplmentadorInternoAnonimo {

    public static void main(String[] args) {

        Modelo modelo = new Modelo() {

            public void imprimir() {
                System.out.println("Gerado por implementador anonimo: \n" + this);
            }

            public String toString() {
                return "Nome do Projeto: " + TITULO_DO_PROJETO;
            }

        };

        geraSaida(modelo);

    }

    public static void geraSaida(Modelo modelo) {
        modelo.imprimir();
    }

}
