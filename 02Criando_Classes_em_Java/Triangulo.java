
/** 
 * A classe Triangulo representa os tr�s lados de um tri�ngulo qualquer.
 */
class Triangulo // declara��o da classe 
{

    /**
     * Declara��o de um dos campos da classe
     */
    float lado1;

    /**
     * O m�todo �Equil�tero verifica se o tri�ngulo � equil�tero ou n�o.
     * @return true se o tri�ngulo � equil�tero, false se n�o for
     */
    boolean �Equil�tero() {
        boolean igualdade12, resultado;
        igualdade12 = (lado1 == lado2); // o lado 1 � igual ao lado 2 ?
        boolean igualdade23;
        igualdade23 = (lado2 == lado3); // o lado 2 � igual ao lado 3 ?
        if (igualdade12 && igualdade23) // os tr�s lados s�o iguais ?
        {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    } // fim do m�todo �Equil�tero

    /**
     * O m�todo calculaPer�metro calcula o per�metro do tri�ngulo usando seus lados.
     * @return o per�metro do tri�ngulo representado por esta classe
     */
    float calculaPer�metro() {
        float resultado = lado1 + lado2 + lado3;
        return resultado;
    } // fim do m�todo per�metro
    /**
     * Declara��o dos outros campos da classe
     */
    float lado2, lado3;
} // fim da classe Triangulo
