package exemplosDeAula;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class TestaCollection {

    public static void main(String[] args) {

        Collection<Integer> ts1 = new HashSet<Integer>();
        Collection<Integer> ts2 = new HashSet<Integer>();

        Random rd = new Random();

        for (int i = 1; i <= 10; i++) {
            int nro = rd.nextInt(40);
            System.out.println("Numero " + i + ": " + nro);
            System.out.println("Retorno de add: " + 
                    ts1.add(nro));
        }
        System.out.println("ts1: " + ts1);

        for (int i = 1; i <= 10; i++) {
            ts2.add(rd.nextInt(40));
        }
        System.out.println("ts2: " + ts2);

        ts1.addAll(ts2);
        System.out.println("ts1 + ts2: " + ts1);

        ts2.clear();
        System.out.println("ts2 depois de clear():" + ts2);

        int x = 12;
        System.out.println("Um numero qualquer: " + x);
        System.out.println("Contem o numero qualquer: " +
                ts1.contains(x));

        System.out.println("ts1 esta vazia: " + ts1.isEmpty());
        System.out.println("ts2 esta vazia: " + ts2.isEmpty());

        ts2.add(50);
        System.out.println("ts2 esta vazia: " + ts2.isEmpty());

        System.out.println("ts1 contem ts2: " +
                ts1.containsAll(ts2));

        ts1.clear();
        ts2.clear();

        for (int i = 0; i <= 5; i++) {
            ts1.add(i);
        }
        System.out.println("ts1: " + ts1);

        for (int i = 0; i <= 10; i += 2) {
            ts2.add(i);
        }
        System.out.println("ts2: " + ts2);

        System.out.println("Retorno de retainAll: " +
                ts1.retainAll(ts2));
        System.out.println("Retorno de retainAll: " +
                ts1.retainAll(ts2));
//        System.out.println("Retorno de removeAll: " + ts1.removeAll(ts2));
//        System.out.println("Retorno de removeAll: " + ts1.removeAll(ts2));
        System.out.println("ts1: " + ts1);

        System.out.println("Impressao do array gerado");
        Integer[] nros = ts2.toArray(new Integer[0]);
        for (int i = 0; i < nros.length; i++) {
            System.out.println(nros[i]);
        }

        System.out.println("Impressao com Iterator");
        Iterator<Integer> i = ts1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("Impressao com for aprimorado");
        for (Integer j : ts1) {
            System.out.println(j);
        }

    }
}
