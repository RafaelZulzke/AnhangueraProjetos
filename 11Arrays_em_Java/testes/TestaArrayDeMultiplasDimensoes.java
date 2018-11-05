package testes;

public class TestaArrayDeMultiplasDimensoes {

    public static void main(String[] args) {

        int[][][] a = new int[3][3][3];

        int[] b = {12, 45, 67};

        a[0] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        a[1] = new int[][]{{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};
        a[2] = new int[][]{{19, 20, 21}, {22, 23, 24}, {25, 26, 27}};

        for (int[][] x : a) {
            for (int[] y : x) {
                for (int z : y) {
                    System.out.println(z);
                }
            }
        }

    }
}
