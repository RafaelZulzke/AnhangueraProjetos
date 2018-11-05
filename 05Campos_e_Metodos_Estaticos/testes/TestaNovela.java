package testes;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TestaNovela {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.print("Informe o capitulo e o titulo: ");
        Novela n1 = Novela.getNovela(
                Integer.parseInt(
                JOptionPane.showInputDialog(null, "Informe o capitulo:")),
                JOptionPane.showInputDialog(null, "Informe o titulo: "));

//        sc.nextLine();
//        System.out.print("Informe o titulo: ");
//        Novela n2 = Novela.getNovela(sc.nextLine());
//        System.out.print("Informe o capitulo: ");
//        n2.setCapitulo(sc.nextInt());
//
//        Novela n3 = Novela.getNovela();
//        System.out.print("Informe o capitulo: ");
//        n3.setCapitulo(sc.nextInt());
//        sc.nextLine();
//        System.out.print("informe o titulo: ");
//        n3.setTitulo(sc.nextLine());

        JOptionPane.showMessageDialog(null, n1);
//        System.out.println(n2);
//        System.out.println(n3);

    }

}
