package testes;

import java.util.Scanner;

public class TestaPessoa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Ano: ");
        short ano = sc.nextShort();

        Pessoa pessoa = new Pessoa(nome, idade, ano);

        System.out.println(pessoa);

    }

}
