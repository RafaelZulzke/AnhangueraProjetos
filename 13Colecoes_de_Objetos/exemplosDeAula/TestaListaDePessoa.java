package exemplosDeAula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaListaDePessoa {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.setCodigo("123");
        p1.setNome("Pedro");
        p1.setIdade(53);

        Pessoa p2 = new Pessoa();
        p2.setCodigo("124");
        p2.setNome("Juca");
        p2.setIdade(24);

        Pessoa p3 = new Pessoa();
        p3.setCodigo("125");
        p3.setNome("Maria");
        p3.setIdade(23);

        Pessoa p4 = new Pessoa();
        p4.setCodigo("126");
        p4.setNome("Sibele");
        p4.setIdade(12);

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);

        System.out.println(p1.compareTo(p2));
        System.out.println(p1.compareTo(p3));
        System.out.println(p1.compareTo(p4));


        System.out.println(pessoas);

        Collections.sort(pessoas);

        System.out.println(pessoas);

    }

}
