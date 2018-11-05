package testesDeEnums;

public enum TamanhoV2 {

    PP(32), P(36), M(41), G(42), GG(44);

    int medida;

    private TamanhoV2(int medida) {
        this.medida = medida;
    }

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

}
