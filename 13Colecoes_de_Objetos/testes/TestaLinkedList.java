package testes;

import java.util.LinkedList;

public class TestaLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> linkList1 = new LinkedList<Integer>();
        linkList1.add(12);
        linkList1.add(32);
        linkList1.add(42);
        linkList1.add(15);

        System.out.println("linkList1: " + linkList1);

        linkList1.addFirst(33);
        linkList1.addLast(29);

        System.out.println("linkList1: " + linkList1);

        System.out.println("getFirst(): " + linkList1.getFirst());
        System.out.println("getLast(): " + linkList1.getLast());

        System.out.println("removeFirst(): " + linkList1.removeFirst());
        System.out.println("removeLast(): " + linkList1.removeLast());

        System.out.println("linkList1: " + linkList1);

    }

}
