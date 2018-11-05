
/**
 * A classe DemoLivroDeBiblioteca demonstra o uso de inst�ncias da classe 
 * LivroDeBiblioteca.
 */
class DemoLivroDeBiblioteca // declara��o da classe
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es de
     * inst�ncias da classe LivroDeBiblioteca e uso de alguns de seus m�todos.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Declaramos e criamos algumas inst�ncias da classe LivroDeBiblioteca
        LivroDeBiblioteca genesvii =
                new LivroDeBiblioteca(
                "Genes VII", "Benjamin Lewin", (short) 990, (short) 2000,
                "Estante L, prateleira 3");
        LivroDeBiblioteca essentialCellBiology =
                new LivroDeBiblioteca(
                "Essential Cell Biology", "Bruce Alberts, Dennis Bray, " +
                "Alexander Johnson, " +
                "Julian Lewis, Martin Raff, " +
                "Keith Roberts, Peter Walter",
                (short) 740, (short) 1997,
                "Estante A, prateleira 1");
        // Emprestamos um dos livros
        genesvii.empresta();
        essentialCellBiology.empresta();
        genesvii.devolve();
        // Imprimimos os dados dos livros
        System.out.println(genesvii);
        System.out.println(essentialCellBiology);
    } // fim do m�todo main
} // fim da classe DemoLivroDeBiblioteca 
