package temp;

public class Empregado {

    public double salario = 300000;

    public double retornaSalario() {
        return salario;
    }

    public double simulaReajuste(double per) {
        double novoSalario = salario * per + salario;
        return novoSalario;
    }

    public void reajustaSalario(double per) {
        salario += salario * per;
    }

    public String toString() {
        return "Salario: " + salario;
    }


}
