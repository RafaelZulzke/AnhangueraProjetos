package operadoresLogicosAbreviadosOuNao;

public class TestaOperadoresLogicosAbreviadosOuNao {

    public static void main(String[] args) {

        int z = 5;
        if (++z > 5 || ++z > 6) {
            z++;
        }

        int y = 5;
        if (++y > 5 | ++y > 6) {
            y++;
        }

        System.out.println("valor de z: " + z);
        System.out.println("valor de y: " + y);

    }
}
