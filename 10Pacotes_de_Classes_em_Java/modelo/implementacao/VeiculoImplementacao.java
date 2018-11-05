package modelo.implementacao;

import modelo.Veiculo;

class VeiculoImplementacao implements Veiculo {

    String placa;
    int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String toString() {
        return "Placa: " + getPlaca() +
                "\nAno: " + getPlaca();
    }

}
