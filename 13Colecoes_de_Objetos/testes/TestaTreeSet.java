package testes;

import java.util.Iterator;
import java.util.TreeSet;

public class TestaTreeSet {

    public static void main(String[] args) {

        int[] a = { 23, 45, 30, 67, 12, 60 };

        TreeSet<Integer> ts1 = new TreeSet<Integer>();
        for(int i: a) {
            ts1.add(i);
        }

        System.out.println("ts1: " + ts1);

        System.out.println("Resultado de first(): " + ts1.first());
        System.out.println("Resultado de last(): " + ts1.last());

        // Primeiro maior ou igual (null)
        int b = 45;
        System.out.println("Resultado de ceiling(" + b + "): " + ts1.ceiling(b));

        // Primeiro menor ou igual (null)
        int c = 30;
        System.out.println("Resultado de floor(" + c + "): " + ts1.floor(c));

        // Primeiro maior (null)
        int d = 45;
        System.out.println("Resultado de higher(" + d + "): " + ts1.higher(d));

        // Primeiro menor (null)
        int e = 30;
        System.out.println("Resultado de lower(" + e + "): " + ts1.lower(e));

        System.out.println("Impressao com descendingIterator()");
        Iterator i = ts1.descendingIterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("ts1.headSet(45): " + ts1.headSet(45));
        System.out.println("ts1.tailSet(45): " + ts1.tailSet(45));
        System.out.println("ts1.subSet(23, 60): " + ts1.subSet(23, 60));

        System.out.println("Resultado de pollfirst(): " + ts1.pollFirst());
        System.out.println("ts1: " + ts1);
        System.out.println("Resultado de pollfirst(): " + ts1.pollFirst());
        System.out.println("ts1: " + ts1);

        System.out.println("Resultado de polllast(): " + ts1.pollLast());
        System.out.println("ts1: " + ts1);
        System.out.println("Resultado de polllast(): " + ts1.pollLast());
        System.out.println("ts1: " + ts1);

    }

}
