
public class IfsAninhados2JE {

    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1) {
            if (condicao2) {
                System.out.println("Condi��es 1 e 2 s�o verdadeiras");
            }
        } else {
            System.out.println("Condi��o 1 � falsa");
        }

    }
}
