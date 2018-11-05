package exemplosDeAula;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestaComparaMaps {

    public static void main(String[] args) {

        Map<String, String> tm = new TreeMap<String, String>();
        Map<String, String> hm = new HashMap<String, String>();
        Map<String, String> lhm = new LinkedHashMap<String, String>();

        tm.put("JE", "Jose Eduardo");
        tm.put("AM", "Amanda");
        tm.put("EL", "Elias");
        tm.put("MA", "Mariana");
        tm.put("SA", "Samuel");
        tm.put("KA", "Karina");

        hm.put("JE", "Jose Eduardo");
        hm.put("AM", "Amanda");
        hm.put("EL", "Elias");
        hm.put("MA", "Mariana");
        hm.put("SA", "Samuel");
        hm.put("KA", "Karina");

        lhm.put("JE", "Jose Eduardo");
        lhm.put("AM", "Amanda");
        lhm.put("EL", "Elias");
        lhm.put("MA", "Mariana");
        lhm.put("SA", "Samuel");
        lhm.put("KA", "Karina");

        System.out.println("tm: " + tm + "\nhm: " + hm + "\nlhm: " + lhm);

    }

}
