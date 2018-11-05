package testes;

import java.util.StringTokenizer;

public class TestaStringTokenizer {

    public static void main(String[] args) {

        String nomes = "maria,joao,patricia,afranio";
        StringTokenizer st = new StringTokenizer(nomes, ",");

        System.out.println("Quantidade de tokens: " + st.countTokens());
        
        String[] palavras = new String[st.countTokens()];

        int i = 0;
        while (st.hasMoreTokens()) {
            palavras[i++] = st.nextToken();
        }

        for (String s : palavras) {
            System.out.println("->" + s + "<-");
        }

    }
}
