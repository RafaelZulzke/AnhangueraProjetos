
/** 
 * A classe ComparaSimples cont�m m�todos est�ticos para a compara��o de dois
 * valores do tipo inteiro. Esta classe demonstra o uso do operador condicional ?.
 */
class ComparaSimples // declara��o da classe
{

    /**
     * O m�todo qual�Maior retorna o maior dos dois valores passados como argumentos.
     * @param p1 o primeiro dos dois valores
     * @param p2 o segundo dos dois valores
     * @return o maior dos dois valores passados como argumentos
     */
    public static int qual�Maior(int p1, int p2) {
        int valor = (p1 > p2 ? p1 : p2); // se p1 > p2, valor recebe p1, sen�o recebe p2
        return valor;
    } // fim do m�todo qual�Maior

    /**
     * O m�todo qual�Menor retorna o menor dos dois valores passados como argumentos.
     * @param p1 o primeiro dos dois valores
     * @param p2 o segundo dos dois valores
     * @return o menor dos dois valores passados como argumentos
     */
    public static int qual�Menor(int p1, int p2) {
        // N�o � necess�rio declarar uma vari�vel tempor�ria
        return (p1 < p2 ? p1 : p2); // se p1 > p2, retorna p1, sen�o retorna p2
    } // fim do m�todo qual�Menor
} // fim da classe ComparaSimples
