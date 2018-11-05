package testes;

public class TestaArgLinhaDeComando {

    public static void main(String[] args) {

        System.out.println("Quantidad de parametros: " + args.length);

        for(String a: args) {
            System.out.println(a);
        }

    }

}
