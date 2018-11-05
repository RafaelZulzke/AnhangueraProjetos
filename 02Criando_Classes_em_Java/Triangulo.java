
/** 
 * A classe Triangulo representa os três lados de um triângulo qualquer.
 */
class Triangulo // declaração da classe 
{

    /**
     * Declaração de um dos campos da classe
     */
    float lado1;

    /**
     * O método éEquilátero verifica se o triângulo é equilátero ou não.
     * @return true se o triângulo é equilátero, false se não for
     */
    boolean éEquilátero() {
        boolean igualdade12, resultado;
        igualdade12 = (lado1 == lado2); // o lado 1 é igual ao lado 2 ?
        boolean igualdade23;
        igualdade23 = (lado2 == lado3); // o lado 2 é igual ao lado 3 ?
        if (igualdade12 && igualdade23) // os três lados são iguais ?
        {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    } // fim do método éEquilátero

    /**
     * O método calculaPerímetro calcula o perímetro do triângulo usando seus lados.
     * @return o perímetro do triângulo representado por esta classe
     */
    float calculaPerímetro() {
        float resultado = lado1 + lado2 + lado3;
        return resultado;
    } // fim do método perímetro
    /**
     * Declaração dos outros campos da classe
     */
    float lado2, lado3;
} // fim da classe Triangulo
