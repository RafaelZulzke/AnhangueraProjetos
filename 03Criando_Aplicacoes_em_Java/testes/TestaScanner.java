package testes;

import java.util.Scanner;

public class TestaScanner {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int a = entrada.nextInt();

        System.out.print("Informe um numero real: ");
        double b = entrada.nextDouble();

        System.out.print("Informe um numero string: ");
        String c = entrada.next();

        System.out.print("Informe um logico: ");
        boolean d = entrada.nextBoolean();

        entrada.nextLine();
        System.out.print("Informe um nome completo: ");
        String e = entrada.nextLine();

        System.out.println("Valor de a = " + a);
        System.out.println("Valor de b = " + b);
        System.out.println("Valor de c = " + c);
        System.out.println("Valor de d = " + d);
        System.out.println("Valor de e = " + e);

    }

}
