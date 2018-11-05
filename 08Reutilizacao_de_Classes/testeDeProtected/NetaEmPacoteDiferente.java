package testeDeProtected;

public class NetaEmPacoteDiferente
        extends FilhaEmPacoteDiferente {

    void qqCoisa() {
        x = 12;
        System.out.println(x);
    // Erro de compilacao
    // new FilhaEmPacoteDiferente().x = 12;
    }
}
