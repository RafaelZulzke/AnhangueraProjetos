package avaliacao;

public class TestaAPI {

    public static void main(String[] args) {

       Imprimivel i1 = new LinguagemDeProgramacao(
               "Anhanguera Educacional", "Java");

       LinguagemDeProgramacao i2 = new LinguagemDeProgramacao(
               "Banco Santander", "PHP");

       i1.imprime(Imprimivel.NAO_IMPRIME_NOME_DA_EMPRESA);

       i2.imprime(Imprimivel.IMPRIME_NOME_DA_EMPRESA);

    }

}
