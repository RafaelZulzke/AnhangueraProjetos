package testes;

public class TestaClassForName {

    public static void main(String[] args) throws ClassNotFoundException, 
            InstantiationException, IllegalAccessException {

        Class csi = Class.forName("testes.Pessoa");
        Pessoa p = (Pessoa)csi.newInstance();

        p.setNome("Maria");
        p.setIdade(12);
        p.setAno((short)2009);

        System.out.println(p);

    }

}
