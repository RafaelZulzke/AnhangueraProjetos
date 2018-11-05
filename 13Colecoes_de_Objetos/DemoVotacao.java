
/**
 * A classe DemoVotacao demonstra o uso de uma inst�ncia da classe Votacao.
 */
class DemoVotacao {

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cria uma inst�ncia da
     * classe Votacao e executa alguns de seus m�todos.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        Votacao prefeito = new Votacao(); // criamos uma inst�ncia
        prefeito.recebeVoto("Pernalonga"); // lan�amos v�rios votos
        prefeito.recebeVoto("Patolino");
        prefeito.recebeVoto("Patolino");
        prefeito.recebeVoto("Pernalonga");
        prefeito.recebeVoto("Marvin o Marciano");
        prefeito.recebeVoto("Pernalonga");
        prefeito.tabula(); // tabulamos os votos at� agora
        System.out.println(prefeito); // verificamos como est� a vota��o
        prefeito.recebeVoto("Patolino"); // lan�amos mais votos
        prefeito.recebeVoto("Pernalonga");
        prefeito.recebeVoto("Patolino");
        prefeito.recebeVoto("Patolino");
        prefeito.tabula(); // tabulamos os votos novamente
        System.out.println(prefeito); // verificamos o resultado novamente
    }
} // fim da classe Votacao
