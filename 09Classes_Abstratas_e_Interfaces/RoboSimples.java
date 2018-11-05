
/** 
 * A classe RoboSimples herda da classe RoboAbstrato e que representa um rob� de
 * comportamento simples.
 * Esta classe herda todos os m�todos n�o-abstratos da classe RoboAbstrato exceto o
 * construtor, que � redeclarado (mas aproveita o construtor da classe ancestral).
 * Esta classe tamb�m implementa o m�todo move, que foi declarado como sendo abstrato
 * na classe ancestral. A classe n�o tem nenhum campo adicional.
 */
class RoboSimples extends RoboAbstrato // declara��o da classe 
{

    /**
     * O construtor para a classe RoboSimples, que recebe argumentos para inicializar
     * todos os campos da classe, que foram herdados da classe RoboAbstrato. O construtor
     * simplesmente repassa os argumentos para o construtor da classe ancestral.
     * @param n o nome do rob�
     * @param px a posi��o X atual
     * @param py a posi��o Y atual
     * @param d a dire��o atual
     */
    RoboSimples(String n, int px, int py, short d) {
        super(n, px, py, d);
    }

    /**
     * Esta vers�o do m�todo move modifica a posi��o do rob� em um n�mero de unidades na
     * dire��o em que o rob� est�. O m�todo foi declarado como sendo abstrato na classe
     * ancestral, e deve ser implementado nesta classe.
     * Consideramos que um rob� simples pode se movimentar somente nas quatro dire��es
     * cardeais, ou seja, 0, 90, 180, 270 graus, correspondentes aos pontos cardeais
     * E, N, O, S. Outros valores s�o ignorados.
     * Como n�o podemos modificar diretamente os campos que determinam a posi��o atual do
     * rob�, usamos os m�todos moveX e moveY, herdados da classe ancestral.
     * @param passos o n�mero de "passos" para o rob�
     */
    public void move(int passos) {
        switch (qualDire��oAtual()) // recuperamos a dire��o atual atrav�s deste m�todo
        {
            case 0:
                moveX(+passos);
                break; // passos positivos na dire��o X
            case 90:
                moveY(+passos);
                break; // passos positivos na dire��o Y
            case 180:
                moveX(-passos);
                break; // passos negativos na dire��o X
            case 270:
                moveY(-passos);
                break; // passos negativos na dire��o Y
        }
    }
} // fim da classe RoboSimples
