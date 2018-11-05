public class DemoMatrizDeDouble {

    public static void main(String[] args) {

        MatrizDeDoubles md = new MatrizDeDoubles(3, 3);

        md.preencheMatriz(10);

        md.matriz[1][1] = 9;
        md.matriz[2][1] = 6;
        md.matriz[1][2] = 15;

        System.out.println(md);



        System.out.println("Maior valor: " + md.maiorValor());



    }

}
