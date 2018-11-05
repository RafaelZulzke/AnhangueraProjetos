package testes;

import java.util.ArrayList;
import java.util.List;

public class OutrosTestesDeGenericos {

    public static void main(String[] args) {

        List<? super Integer> lista = new ArrayList<Number>();

        lista.set(1, new Integer(12));

        System.out.println(lista.size());

    }

}
