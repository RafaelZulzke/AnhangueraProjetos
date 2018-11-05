package exercicio831;

public class Circulo extends ObjetoGeometrico {

    private int x;
    private int y;
    private double raio;

    public Circulo(int x, int y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double perimetro() {
        return Math.PI * raio * 2;
    }

    public void mostraDados() {
        super.mostraDados();
        System.out.println("Circulo:");
        System.out.println("Centro: (" + x + "," + y + ")");
        System.out.println("Raio: " + raio);
    }

}
