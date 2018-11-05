package exercicio831;

public class Triangulo extends ObjetoGeometrico {

    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double area() {
        double s = perimetro() / 2;
        return Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC));
    }

    public double perimetro() {
        return ladoA + ladoB + ladoC;
    }

    public void mostraDados() {
        super.mostraDados();
        System.out.println("Triagulo:");
        System.out.println("Lado A: " + ladoA);
        System.out.println("Lado B: " + ladoB);
        System.out.println("Lado C: " + ladoC);
    }

}
