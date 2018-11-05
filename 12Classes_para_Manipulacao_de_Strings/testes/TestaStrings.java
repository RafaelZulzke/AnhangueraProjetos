package testes;

public class TestaStrings {

    public static void main(String[] args) {

        char[] a = {'t', 'e', 's', 't', 'e'};
        String as = new String(a);

        System.out.println(as.charAt(4));

        char[] y = as.toCharArray();

        for(char c: y) {
            System.out.println(c);
        }

        System.out.println("teste".indexOf("e", 2));

    }

}
