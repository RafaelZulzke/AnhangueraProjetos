package temp;

public class TestaLimiteLong {

    public static void main(String[] args) {

        System.out.println("Limite long: " +
                Long.MAX_VALUE + ", " + Long.MIN_VALUE);

        double a = Long.MIN_VALUE;
        System.out.println(a);

        float b = Long.MIN_VALUE;
        System.out.println(b);

        long x = (long) a;
        long y = (long) b;

        System.out.println(x);
        System.out.println(y);

    }

}
