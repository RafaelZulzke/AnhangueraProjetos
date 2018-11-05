package testes;

public class TestaStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Curso de ");
        System.out.println(sb);
        sb.append("Java ");
        System.out.println(sb);
        sb.append(6);
        System.out.println(sb);
        sb.insert(6, "Intermediario ");
        System.out.println(sb);
        sb.delete(6, 13);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
