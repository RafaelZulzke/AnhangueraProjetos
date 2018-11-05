
public class TestaClassForName {

    public static void main(String[] args) throws ClassNotFoundException, 
            InstantiationException, IllegalAccessException {

        Class csi = Class.forName("testes.Pessoa");
        csi.newInstance();


    }

}
