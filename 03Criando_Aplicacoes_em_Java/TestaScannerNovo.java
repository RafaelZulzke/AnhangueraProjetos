import java.util.Scanner;

public class TestaScannerNovo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o valor de a:");
        int a = sc.nextInt();
        System.out.println("Valor de a: " + a);

        System.out.print("Informe o valor de b:");
        double b = sc.nextDouble();
        System.out.println("Valor de b: " + b);

        System.out.print("Informe o valor de c:");
        boolean c = sc.nextBoolean();
        System.out.println("Valor de c: " + c);

        System.out.print("Informe o valor de d:");
        String d = sc.next();
        System.out.println("Valor de d: " + d);

        sc.nextLine();
        System.out.print("Informe o valor de e:");
        String e = sc.nextLine();
        System.out.println("Valor de e: " + e);




    }

}
