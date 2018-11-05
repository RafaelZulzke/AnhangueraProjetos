package testaInterface;

import testaInterface.outro.InterfaceComConstantes;

public class Implementadora implements InterfaceComConstantes {

    void imprime() {
        System.out.println(InterfaceComConstantes.a);
        System.out.println(a);
    }

}
