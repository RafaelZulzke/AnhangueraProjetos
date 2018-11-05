package testes;

public class TestaArrays {

    public static void main(String[] args) {

        int tamanho = 10;

        int[] a = new int[tamanho];

        a[0] = 34;
        a[1] = 23;
        a[6] = 45;
        a[9] = 78;

        String[] b = { "34", "teste", "45", "67", "78", "89", "56", "90" };

        System.out.println("Tamanho de b: " + b.length);

        for(String z: b) {
            System.out.println(z);
        }

        

        for(int i = 0; i < a.length; i++) {
            System.out.println("Valor de a[" + i + "] = " + a[i]);
        }

        System.out.println("Gerado pelo for aprimorado!!!");

        for(int x: a) {
            System.out.println("Valor de a[j] = " + x);
        }

    }

}
