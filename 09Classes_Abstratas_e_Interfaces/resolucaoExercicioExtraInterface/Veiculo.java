package resolucaoExercicioExtraInterface;

public class Veiculo implements Modelo {

    private int placa;
    private Empregado responsavel;

    public Veiculo(int placa, Empregado responsavel) {
        this.placa = placa;
        this.responsavel = responsavel;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public Empregado getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Empregado responsavel) {
        this.responsavel = responsavel;
    }

    public String toString() {
        return "Titulo do Projeto: " + TITULO_DO_PROJETO + "\n" +
                "Dados do Veiculo ----\n" +
                "Codigo: " + getPlaca() + "\n" +
                "Responsavel: \n" + getResponsavel() + "\n";
    }

    public void imprimir() {
        System.out.println(toString());
    }
    
}
