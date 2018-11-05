package testeDeProtected.pacoteDiferente;

import testeDeProtected.ClasseBase;

public class ClasseNoPacoteDiferente extends ClasseBase {

    void qqCoisa() {
        ClasseBase cb = new ClasseBase();
        //cb.a = 123;
        a = 123;
    }


}
