package testes;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class TestaHashSet {

    public static void main(String[] args) {


        int[] a = {23, 45, 30, 67, 12, 60};

        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i: a) {
            hs.add(i);
        }

        HashSet<Integer> c = new HashSet<Integer>();
        c.add(8);
        c.add(5);

        System.out.println("hs: " + hs);
        System.out.println("c: " + c);

        System.out.println("Retorno de removeAll(): " +
                hs.removeAll(c));

        System.out.println("hs: " + hs);

        hs.clear();

        Random rd = new Random();

        TreeSet<Integer> ts = new TreeSet<Integer>();

        for (int i = 1; i <= 10; i++) {
            ts.add(rd.nextInt(30));
        }

        System.out.println(ts);
        ts.add(13);
        System.out.println(ts);





    }
}
