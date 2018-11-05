
/**
 * A classe EpocaDeFrutas permite a consulta a um banco de dados primitivo sobre
 * frutas e suas épocas.
 */
class EpocaDeFrutas {

    /**
     * Esta classe contém alguns campos estáticos que serão usados nas pesquisas.
     */

    // Array de strings contendo nomes de frutas
    private static String[] frutas = {"abacate",
        "abacaxi", "ameixa", "banana", "cereja",
        "damasco", "figo", "laranja",
        "limão", "maçã", "manga", "melancia",
        "morango", "papaia", "pêra", "pêssego",
        "tangerina", "uva"};

    // Este campo servirá como um atalho para o array seguinte, desta forma não será
    // necessário declarar vários elementos do array com a mesma string.
    private static String anoInteiro =
            "janeiro,fevereiro,março,abril,maio,junho," +
            "julho,agosto,setembro,outubro,novembro,dezembro";

    // Array de meses, onde cada campo corresponde (inclusive na ordem) aos campos
    // declarados no array de nomes de frutas.
    private static String[] épocas = {
        anoInteiro,
        anoInteiro,
        "outubro,novembro,dezembro,janeiro",
        anoInteiro,
        "setembro,outubro,novembro,dezembro",
        "setembro,outubro,novembro,dezembro,janeiro,fevereiro",
        "dezembro,janeiro,fevereiro,março,abril",
        anoInteiro,
        "janeiro,fevereiro,março,abril,maio,junho,julho,agosto",
        "dezembro,janeiro,fevereiro",
        "outubro,novembro,dezembro,janeiro,fevereiro,março",
        "outubro,novembro,dezembro,janeiro,fevereiro,março",
        "abril,maio,junho,julho,agosto,setembro,outubro,novembro,dezembro",
        anoInteiro,
        "dezembro,janeiro,fevereiro,março,abril",
        "setembro,outubro,dezembro,janeiro,fevereiro",
        "abril,maio,junho,julho,agosto,setembro",
        "novembro,dezembro,janeiro,fevereiro,março"
    };

    /**
     * O método main permite a execução desta classe. Este método processa a linha de
     * comando, considerando que somente um argumento será passado e que este argumento
     * será um nome de mês. O método então pesquisa o argumento no array de meses. Onde
     * houver correspondência, mostra a(s) fruta(s) que podem ser colhidas no mês
     * correspondente ao argumento.
     * @param argumentos o nome do mês a ser pesquisado (este método considera que
     *                   somente um argumento será passado pela linha de comando)
     */
    public static void main(String[] argumentos) {
        if (argumentos.length != 1) // nenhum argumento foi passado, imprimimos mensagem
        {                         // e terminamos o programa
            System.out.println(
                    "Este programa precisa de um argumento " +
                    "(o nome do mês para " +
                    "pesquisa.");
            System.exit(1);
        } else // um argumento foi passado, será procurado no array de épocas
        {
            for (int qualÉpoca = 0; qualÉpoca < épocas.length; qualÉpoca++) {
                // Procuramos a posição da string representada por argumentos[0] dentro da
                // string representada pelo elemento épocas[qualÉpoca]. Se a posição for maior
                // que zero, o mês aparece na lista representada pelo elemento do array épocas.
                if (épocas[qualÉpoca].indexOf(argumentos[0]) >= 0) {
                    // Imprimimos a fruta correspondente à época
                    System.out.println(frutas[qualÉpoca]);
                }
            } // fim do for para todos as épocas
        }
    } // fim do método main
} // fim da classe EpocaDeFrutas
