package testeDeProtected;

import testeDeProtected.outro.Mae;

public class FilhaEmPacoteDiferente extends Mae {

    void imprime() {
        System.out.println(x);
        // Nao eh valido, pois nao se pode
        // fazer acesso direto a um membro protected
        //System.out.println(new Mae().x); // Erro de compilacao
    }
}
