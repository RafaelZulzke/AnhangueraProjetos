
import java.util.Scanner;

public class TestaScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre algo: ");

        double entrada1 = sc.nextDouble();

        System.out.print("Entre algo: ");

        sc.nextLine();
        String entrada2 = sc.nextLine();

        System.out.print("Entre algo: ");

        String entradaN = sc.nextLine();

        System.out.print("Entre algo: ");

        int entrada3 = sc.nextInt();

        System.out.println("Foi digitado: " + entrada1 + ", " + entrada2 + " e " + entrada3); // + " e sobrou " + sc.next() + " no buffer do teclado!!!");

    }

}
