package avaliacao;

public abstract class Modelo {

    private String nomeEmpresa;

    public Modelo(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public abstract String toString();

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

}
