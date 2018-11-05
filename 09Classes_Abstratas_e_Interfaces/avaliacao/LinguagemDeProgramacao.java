package avaliacao;

public class LinguagemDeProgramacao 
        extends Modelo implements Imprimivel {

    private String nomeLinguagem;

    public LinguagemDeProgramacao(
            String nomeEmpresa, String nomeLinguagem) {
        super(nomeEmpresa);
        this.nomeLinguagem = nomeLinguagem;
    }

    public String getNomeLinguagem() {
        return nomeLinguagem;
    }

    public void setNomeLinguagem(String nomeLinguagem) {
        this.nomeLinguagem = nomeLinguagem;
    }

    public String toString() {
        return "Nome da Linguagem: " +
                getNomeLinguagem();
    }

    public void imprime(boolean imprimeNomeEmpresa) {
        if (imprimeNomeEmpresa) {
            System.out.println("Nome da Empresa: " +
                    getNomeEmpresa());
        }
        System.out.println(toString());
    }

}
