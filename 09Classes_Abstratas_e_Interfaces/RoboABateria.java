
/** 
 * A classe RoboABateria herda da classe RoboAbstrato e que representa um rob� 
 * que consome energia com seus movimentos.
 * Esta classe herda todos os m�todos n�o-abstratos da classe RoboAbstrato exceto o
 * construtor. Esta classe tamb�m implementa o m�todo move, que foi declarado como 
 * sendo abstrato na classe ancestral. A classe cont�m um campo adicional para indicar
 * quantos passos o rob� ainda pode dar.
 */
class RoboABateria extends RoboAbstrato // declara��o da classe 
{

    /**
     * Declara��o dos campos da classe
     */
    private long energia; // a energia que o rob� ainda possui

    /**
     * O construtor para a classe RoboABateria, que recebe argumentos para inicializar
     * todos os campos da classe. O construtor chama o construtor da classe ancestral
     * repassando alguns argumentos, e inicializa um campo desta classe.
     * @param n o nome do rob�
     * @param px a posi��o X atual
     * @param py a posi��o Y atual
     * @param d a dire��o atual
     * @param e a energia inicial
     */
    RoboABateria(String n, int px, int py, short d, long e) {
        super(n, px, py, d);
        energia = e;
    }

    /**
     * Esta vers�o do m�todo move modifica a posi��o do rob� em um n�mero de unidades na
     * dire��o em que o rob� est� e deduz o n�mero de passos da energia que o rob� tem,
     * considerando que a cada passo dez unidades de energia s�o gastas.
     * Consideramos que um rob� a bateria pode se movimentar somente em oito dire��es,
     * em intervalos de 45 graus, ou seja, nas dire��es 0, 45, 90, 135, 180, 225, 270 e
     * 315 graus - outros valores s�o ignorados. Note que para os �ngulos 45, 135, 225 e
     * 315 graus o rob� modificar� as suas duas coordenadas. O m�todo n�o faz nada caso
     * a energia do rob� n�o seja suficiente para mov�-lo.
     * @param passos o n�mero de "passos" para o rob�
     */
    public void move(int passos) {
        long energiaASerGasta = passos * 10; // quanta energia ser� necess�ria para
        // movimentar o rob� ?
        if (energiaASerGasta <= energia) // o rob� tem energia para se movimentar
        {
            switch (qualDire��oAtual()) // recuperamos a dire��o atual atrav�s deste m�todo
            {
                case 0:
                    moveX(+passos);
                    break; // passos positivos na dire��o X
                case 45:
                    moveX(+passos);        // passos positivos na dire��o X e
                    moveY(+passos);
                    break; // passos positivos na dire��o Y
                case 90:
                    moveY(+passos);
                    break; // passos positivos na dire��o Y
                case 135:
                    moveY(+passos);        // passos positivos na dire��o Y
                    moveX(-passos);
                    break; // passos negativos na dire��o X
                case 180:
                    moveX(-passos);
                    break; // passos negativos na dire��o X
                case 225:
                    moveX(-passos);        // passos negativos na dire��o X e
                    moveY(-passos);
                    break; // passos negativos na dire��o Y
                case 270:
                    moveY(-passos);
                    break; // passos negativos na dire��o Y
                case 315:
                    moveY(-passos);        // passos negativos na dire��o Y e
                    moveX(+passos);
                    break; // passos positivos na dire��o X
            } // fim do switch
            energia -= energiaASerGasta; // deduz a energia gasta para o movimento
        } // fim do if
    }

    /**
     * O m�todo toString n�o recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados. Este m�todo chama o m�todo toString da classe
     * ancestral e concatena ao resultado da chamada os campos exclusivos desta classe.
     * @return uma string com os valores dos campos formatados.
     */
    public String toString() {
        String resultado = super.toString() + "\n";
        resultado = resultado + "Energia do rob�:" + energia;
        return resultado;
    } // fim do m�todo toString
} // fim da classe RoboABateria
