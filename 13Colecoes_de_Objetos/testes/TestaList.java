package testes;

import java.util.ArrayList;
import java.util.Collection;

public class TestaList {

    public static void main(String[] args) {

        ArrayList<Integer> lista1 =
                new ArrayList<Integer>();
        lista1.add(34);
        lista1.add(45);
        lista1.add(30);
        lista1.add(77);

        System.out.println(lista1.size());
        System.out.println("lista1: " + lista1);
        lista1.add(2, 123);
        System.out.println("lista1: " + lista1);

        Collection<Integer> lista2 =
                new ArrayList<Integer>();
        lista2.add(66);
        lista2.add(77);
        lista2.add(88);

        lista1.addAll(lista2);
        
        System.out.println("lista1: " + lista1);

        System.out.println("elemento 3: " + lista1.get(3));
        //System.out.println("elemento 13: " + lista1.get(13));

        System.out.println(
                "localizacao de 77: " + lista1.indexOf(77));
        System.out.println(
                "localizacao de 99: " + lista1.indexOf(99));

        System.out.println(
                "localizacao de 77: " +
                lista1.lastIndexOf(77));
        System.out.println(
                "localizacao de 99: " +
                lista1.lastIndexOf(99));

        lista1.remove(6);
        System.out.println("lista1: " + lista1);

        lista1.set(0, 99);
        System.out.println("lista1: " + lista1);

        System.out.println(
                "sublista de lista1: " +
                lista1.subList(0, 4));

    }

}
