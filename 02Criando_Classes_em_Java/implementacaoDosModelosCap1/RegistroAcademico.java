package implementacaoDosModelosCap1;

public class RegistroAcademico {

    String nomeDoAluno;
    String numeroDeMatricula;
    Data dataDeNascimento;
    boolean eBolsista;
    int anoDeMatricula;

    void inicializaRegistro(String oNome,
            String aMatricula, Data aData,
            boolean temBolsa, int qualAno) {
        nomeDoAluno = oNome;
        numeroDeMatricula = aMatricula;
        dataDeNascimento = aData;
        eBolsista = temBolsa;
        anoDeMatricula = qualAno;
    }

    void mostraRegistro() {
        System.out.println("\nNome do Aluno: " +
                nomeDoAluno);
        System.out.println("Matricula: " +
                numeroDeMatricula);
        System.out.print("Data de Nascimento: ");
        dataDeNascimento.mostraData();
        System.out.print("Bolsista: ");
        if (eBolsista) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }
        System.out.println("Ano de Ingresso: " +
                anoDeMatricula);
        System.out.println("Mesalidade: " +
                calculaMensalidade());
    }

    double calculaMensalidade() {
        double mensalidade = 400;
        if (eBolsista) {
            mensalidade /= 2;
        }
        return mensalidade;
    }


}
