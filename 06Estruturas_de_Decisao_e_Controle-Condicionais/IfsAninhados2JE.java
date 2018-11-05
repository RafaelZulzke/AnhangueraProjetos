
public class IfsAninhados2JE {

    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1) {
            if (condicao2) {
                System.out.println("Condições 1 e 2 são verdadeiras");
            }
        } else {
            System.out.println("Condição 1 é falsa");
        }

    }
}
