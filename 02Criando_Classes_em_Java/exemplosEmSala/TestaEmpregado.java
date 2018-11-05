package exemplosEmSala;

import temp.Empregado;

public class TestaEmpregado {

    public static void main(String[] a) {

        Empregado e = new Empregado();

        System.out.println("Salario: " + e.salario);
        System.out.println("Simulacao de reajuste de 30%: " + e.simulaReajuste(0.3));
        e.reajustaSalario(0.4);
        System.out.println("Salario depois de reajuste: " + e.salario);



    }


}
