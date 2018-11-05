package exemploComEnum;

public enum EstadoCivil {

    SOLTEIRO,
    CASADO,
    SEPARADO,
    DIVORCIADO,
    VIUVO;

    public String toString() {
        return super.ordinal() + "";
    }



}
