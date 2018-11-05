package testeDeProtected.outro;

public class FilhaNoMesmoPacote extends Mae {

    void imprime() {
        System.out.println(x);
        // Eh valido, mas nao esta usando o acesso
        // protected e sim o acesso de pacote que
        // todos os membros protected possuem
        System.out.println(new Mae().x);
    }
}
