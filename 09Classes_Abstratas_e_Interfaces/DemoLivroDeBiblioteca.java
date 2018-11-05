
/**
 * A classe DemoLivroDeBiblioteca demonstra o uso de instâncias da classe 
 * LivroDeBiblioteca.
 */
class DemoLivroDeBiblioteca // declaração da classe
{

    /**
     * O método main permite a execução desta classe. Este método contém declarações de
     * instâncias da classe LivroDeBiblioteca e uso de alguns de seus métodos.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Declaramos e criamos algumas instâncias da classe LivroDeBiblioteca
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
    } // fim do método main
} // fim da classe DemoLivroDeBiblioteca 
