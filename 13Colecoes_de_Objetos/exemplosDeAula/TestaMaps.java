package exemplosDeAula;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestaMaps {

    public static void main(String[] args) {

        Map<String, Integer> m1 = new TreeMap<String, Integer>();

        m1.put("um", 1);
        m1.put("dois", 2);
        m1.put("tres", 3);
        m1.put("quatro", 4);

        System.out.println("m1: " + m1);

        Map<String, Integer> m2 = new TreeMap<String, Integer>();

        m2.put("dez", 10);
        m2.put("onze", 11);
        m2.put("doze", 12);

        System.out.println("m2: " + m2);

        m1.putAll(m2);

        System.out.println("m1: " + m1);

        System.out.println("m1 Contem a chave \"um\"? " + m1.containsKey("um"));
        System.out.println("m2 Contem a chave \"um\"? " + m2.containsKey("um"));

        System.out.println("m1 Contem a o valor 1? " + m1.containsValue(1));
        System.out.println("m2 Contem a o valor 1? " + m2.containsValue(1));

        System.out.println("Valor de chave \"dois\" em m1: " + m1.get("dois"));
        System.out.println("Valor de chave \"dois\" em m2: " + m2.get("dois"));

        System.out.println("Remove par com chave \"dois\" de m1: " + m1.remove("dois"));
        System.out.println("Remove par com chave \"dois\" de m2: " + m2.remove("dois"));

        System.out.println("m1: " + m1);
        System.out.println("m2: " + m2);

        Set chavesDeM1 = m1.keySet();
        System.out.println("Chaves de m1: " + chavesDeM1);

        Collection valoresDeM1 = m1.values();
        System.out.println("Valores de m1: " + valoresDeM1);

    }

}
