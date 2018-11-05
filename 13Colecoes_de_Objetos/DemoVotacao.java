
/**
 * A classe DemoVotacao demonstra o uso de uma instância da classe Votacao.
 */
class DemoVotacao {

    /**
     * O método main permite a execução desta classe. Este método cria uma instância da
     * classe Votacao e executa alguns de seus métodos.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        Votacao prefeito = new Votacao(); // criamos uma instância
        prefeito.recebeVoto("Pernalonga"); // lançamos vários votos
        prefeito.recebeVoto("Patolino");
        prefeito.recebeVoto("Patolino");
        prefeito.recebeVoto("Pernalonga");
        prefeito.recebeVoto("Marvin o Marciano");
        prefeito.recebeVoto("Pernalonga");
        prefeito.tabula(); // tabulamos os votos até agora
        System.out.println(prefeito); // verificamos como está a votação
        prefeito.recebeVoto("Patolino"); // lançamos mais votos
        prefeito.recebeVoto("Pernalonga");
        prefeito.recebeVoto("Patolino");
        prefeito.recebeVoto("Patolino");
        prefeito.tabula(); // tabulamos os votos novamente
        System.out.println(prefeito); // verificamos o resultado novamente
    }
} // fim da classe Votacao
