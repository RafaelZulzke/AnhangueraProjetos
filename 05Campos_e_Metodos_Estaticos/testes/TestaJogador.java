package testes;

public class TestaJogador {

    public static void main(String[] args) {

        Jogador j1 = Jogador.getJogador(9, "Ronaldo");
        Jogador j2 = Jogador.getJogador("Obina");
        Jogador j3 = Jogador.getJogador(69);

        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j3);

    }
}
