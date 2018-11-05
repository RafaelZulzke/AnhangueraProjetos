package exemplosDeAula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestaLists {

    public static void main(String[] args) {

        Integer a[] = { 12, 45, 65, 29, 10, 33, 78, 37, 65 };

        List<Integer> al = new ArrayList<Integer>(Arrays.asList(a));
        List<Integer> ll = new LinkedList<Integer>(Arrays.asList(a));

        Collections.sort(al);
        Collections.sort(ll);

        Iterator<Integer> ial = al.iterator();
        Iterator<Integer> ill = ll.iterator();

        System.out.println("S-AR-AL-LL");
        int i = 0;
        while(ial.hasNext()) {
            System.out.println(++i + "-" + a[i-1] + "-" + ial.next() + "-" + ill.next());
        }

//        ill = ll.iterator();
//        for(Integer e: al) {
//            System.out.println(e + "-" + ill.next());
//        }
//
//        Integer b[] = al.toArray(new Integer[0]);
//        for(int j = 0; j < b.length; j++) {
//            System.out.println(b[j]);
//        }

    }

}









