
/**
 * A classe EpocaDeFrutas permite a consulta a um banco de dados primitivo sobre
 * frutas e suas �pocas.
 */
class EpocaDeFrutas {

    /**
     * Esta classe cont�m alguns campos est�ticos que ser�o usados nas pesquisas.
     */

    // Array de strings contendo nomes de frutas
    private static String[] frutas = {"abacate",
        "abacaxi", "ameixa", "banana", "cereja",
        "damasco", "figo", "laranja",
        "lim�o", "ma��", "manga", "melancia",
        "morango", "papaia", "p�ra", "p�ssego",
        "tangerina", "uva"};

    // Este campo servir� como um atalho para o array seguinte, desta forma n�o ser�
    // necess�rio declarar v�rios elementos do array com a mesma string.
    private static String anoInteiro =
            "janeiro,fevereiro,mar�o,abril,maio,junho," +
            "julho,agosto,setembro,outubro,novembro,dezembro";

    // Array de meses, onde cada campo corresponde (inclusive na ordem) aos campos
    // declarados no array de nomes de frutas.
    private static String[] �pocas = {
        anoInteiro,
        anoInteiro,
        "outubro,novembro,dezembro,janeiro",
        anoInteiro,
        "setembro,outubro,novembro,dezembro",
        "setembro,outubro,novembro,dezembro,janeiro,fevereiro",
        "dezembro,janeiro,fevereiro,mar�o,abril",
        anoInteiro,
        "janeiro,fevereiro,mar�o,abril,maio,junho,julho,agosto",
        "dezembro,janeiro,fevereiro",
        "outubro,novembro,dezembro,janeiro,fevereiro,mar�o",
        "outubro,novembro,dezembro,janeiro,fevereiro,mar�o",
        "abril,maio,junho,julho,agosto,setembro,outubro,novembro,dezembro",
        anoInteiro,
        "dezembro,janeiro,fevereiro,mar�o,abril",
        "setembro,outubro,dezembro,janeiro,fevereiro",
        "abril,maio,junho,julho,agosto,setembro",
        "novembro,dezembro,janeiro,fevereiro,mar�o"
    };

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo processa a linha de
     * comando, considerando que somente um argumento ser� passado e que este argumento
     * ser� um nome de m�s. O m�todo ent�o pesquisa o argumento no array de meses. Onde
     * houver correspond�ncia, mostra a(s) fruta(s) que podem ser colhidas no m�s
     * correspondente ao argumento.
     * @param argumentos o nome do m�s a ser pesquisado (este m�todo considera que
     *                   somente um argumento ser� passado pela linha de comando)
     */
    public static void main(String[] argumentos) {
        if (argumentos.length != 1) // nenhum argumento foi passado, imprimimos mensagem
        {                         // e terminamos o programa
            System.out.println(
                    "Este programa precisa de um argumento " +
                    "(o nome do m�s para " +
                    "pesquisa.");
            System.exit(1);
        } else // um argumento foi passado, ser� procurado no array de �pocas
        {
            for (int qual�poca = 0; qual�poca < �pocas.length; qual�poca++) {
                // Procuramos a posi��o da string representada por argumentos[0] dentro da
                // string representada pelo elemento �pocas[qual�poca]. Se a posi��o for maior
                // que zero, o m�s aparece na lista representada pelo elemento do array �pocas.
                if (�pocas[qual�poca].indexOf(argumentos[0]) >= 0) {
                    // Imprimimos a fruta correspondente � �poca
                    System.out.println(frutas[qual�poca]);
                }
            } // fim do for para todos as �pocas
        }
    } // fim do m�todo main
} // fim da classe EpocaDeFrutas
