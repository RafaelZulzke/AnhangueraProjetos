package testes;

import java.util.Arrays;

public class TestaInteiro {

    public static void main(String[] args) {

        Inteiro[] inteiros = {
            new Inteiro(12),
            new Inteiro(34),
            new Inteiro(45),
            new Inteiro(1),
            new Inteiro(7),
            new Inteiro(13),
            new Inteiro(3),
            new Inteiro(14),
            new Inteiro(31),
            new Inteiro(2),
        };

        for(Inteiro i: inteiros) {
            System.out.println(i);
        }

        System.out.println("Localizado em: " +
                Arrays.binarySearch(inteiros, new Inteiro(31)));

        Arrays.sort(inteiros);

        for(Inteiro i: inteiros) {
            System.out.println(i);
        }

        System.out.println("Localizado em: " +
                Arrays.binarySearch(inteiros, new Inteiro(31)));
    }

}
