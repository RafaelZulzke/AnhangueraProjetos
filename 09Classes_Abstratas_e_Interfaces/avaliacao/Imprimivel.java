package avaliacao;

public interface Imprimivel {

    static final boolean IMPRIME_NOME_DA_EMPRESA = true;
    static final boolean NAO_IMPRIME_NOME_DA_EMPRESA = false;

    public abstract void imprime(boolean imprimeNomeEmpresa);

}
