package exercicio831;

public class Retangulo extends ObjetoGeometrico {

    private int ladoA;
    private int ladoB;

    public Retangulo(int ladoA, int ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public double area() {
        return ladoA * ladoB;
    }

    public double perimetro() {
        return (ladoA + ladoB) * 2;
    }

    public void mostraDados() {
        super.mostraDados();
        System.out.println("Retangulo:");
        System.out.println("Lado A: " + ladoA);
        System.out.println("Lado B: " + ladoB);
    }

}
