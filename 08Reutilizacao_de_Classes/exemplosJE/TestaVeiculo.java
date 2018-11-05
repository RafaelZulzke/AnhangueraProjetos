package exemplosJE;

public class TestaVeiculo {

    public static void main(String[] a){

        Veiculo v = new Veiculo();

        v.setAno(2009);
        v.setMarca("Ford");

        System.out.print(v.getAno());
        System.out.print(v.getMarca());
        
    }


}
