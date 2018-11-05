package testesDeEnums;

public enum TamanhoV3 {

    PP(32) {
        public String getMedida() {
            return super.getMedida() + " - Deve ganhar peso!!!";
        }
    },
    P(36),
    M(40),
    G(42),
    GG(44) {
        public String getMedida() {
            return super.getMedida() + " - Deve perder peso!!!";
        }
    };

    int medida;

    private TamanhoV3(int medida) {
        this.medida = medida;
    }

    public String getMedida() {
        return medida + "";
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }




}
