package exemplosDeAula;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestaSets {

    public static void main(String[] args) {

        Integer a[] = { 12, 45, 65, 29, 10, 33, 78, 37, 65 };

        Set<Integer> ts = new TreeSet<Integer>(Arrays.asList(a));
        Set<Integer> hs = new HashSet<Integer>(Arrays.asList(a));
        Set<Integer> lhs = new LinkedHashSet<Integer>(Arrays.asList(a));

        Iterator<Integer> its = ts.iterator();
        Iterator<Integer> ihs = hs.iterator();
        Iterator<Integer> ilhs = lhs.iterator();

        System.out.println("S-AR-TS-HS-LHS");
        int i = 0;
        while(its.hasNext()) {
            System.out.println(++i + "-" + a[i-1] + "-" +
                    its.next() + "-" + ihs.next() + "-" + ilhs.next());
        }

        for(Integer e: lhs) {
            System.out.println(e);
        }
//        ihs = hs.iterator();
//        ilhs = lhs.iterator();
//        for(Integer e: ts) {
//            System.out.println(e + "-" + ihs.next() + "-" + ilhs.next());
//        }
//
//        Integer b[] = ts.toArray(new Integer[0]);
//        for(int j = 0; j < b.length; j++) {
//            System.out.println(b[j]);
//        }

    }

}









