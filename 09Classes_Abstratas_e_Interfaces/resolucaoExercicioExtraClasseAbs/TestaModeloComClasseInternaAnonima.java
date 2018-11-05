package resolucaoExercicioExtraClasseAbs;

public class TestaModeloComClasseInternaAnonima {

    public static void main(String[] args) {

        Modelo modelo = new Modelo("Projeto de Teste") {

            public void imprimir() {
                System.out.println(
                        "Gerado por classe anonima: \n" +
                        this);
            }
            
        };

        geraSaida(modelo);

    }

    public static void geraSaida(Modelo modelo) {
        modelo.imprimir();
    }

}
