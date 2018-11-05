package genericos;

public class TestaImpressorGenerico {

    public static void main(String[] args) {

        Empregado e = new Empregado("123", "Juca", 23);

        ImpressorGenerico<? super Empregado> ig = new ImpressorGenerico<Empregado>();

        ig.toString();

    }

}
