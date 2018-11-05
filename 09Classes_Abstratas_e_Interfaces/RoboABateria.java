
/** 
 * A classe RoboABateria herda da classe RoboAbstrato e que representa um robô 
 * que consome energia com seus movimentos.
 * Esta classe herda todos os métodos não-abstratos da classe RoboAbstrato exceto o
 * construtor. Esta classe também implementa o método move, que foi declarado como 
 * sendo abstrato na classe ancestral. A classe contém um campo adicional para indicar
 * quantos passos o robô ainda pode dar.
 */
class RoboABateria extends RoboAbstrato // declaração da classe 
{

    /**
     * Declaração dos campos da classe
     */
    private long energia; // a energia que o robô ainda possui

    /**
     * O construtor para a classe RoboABateria, que recebe argumentos para inicializar
     * todos os campos da classe. O construtor chama o construtor da classe ancestral
     * repassando alguns argumentos, e inicializa um campo desta classe.
     * @param n o nome do robô
     * @param px a posição X atual
     * @param py a posição Y atual
     * @param d a direção atual
     * @param e a energia inicial
     */
    RoboABateria(String n, int px, int py, short d, long e) {
        super(n, px, py, d);
        energia = e;
    }

    /**
     * Esta versão do método move modifica a posição do robô em um número de unidades na
     * direção em que o robô está e deduz o número de passos da energia que o robô tem,
     * considerando que a cada passo dez unidades de energia são gastas.
     * Consideramos que um robô a bateria pode se movimentar somente em oito direções,
     * em intervalos de 45 graus, ou seja, nas direções 0, 45, 90, 135, 180, 225, 270 e
     * 315 graus - outros valores são ignorados. Note que para os ângulos 45, 135, 225 e
     * 315 graus o robô modificará as suas duas coordenadas. O método não faz nada caso
     * a energia do robô não seja suficiente para movê-lo.
     * @param passos o número de "passos" para o robô
     */
    public void move(int passos) {
        long energiaASerGasta = passos * 10; // quanta energia será necessária para
        // movimentar o robô ?
        if (energiaASerGasta <= energia) // o robô tem energia para se movimentar
        {
            switch (qualDireçãoAtual()) // recuperamos a direção atual através deste método
            {
                case 0:
                    moveX(+passos);
                    break; // passos positivos na direção X
                case 45:
                    moveX(+passos);        // passos positivos na direção X e
                    moveY(+passos);
                    break; // passos positivos na direção Y
                case 90:
                    moveY(+passos);
                    break; // passos positivos na direção Y
                case 135:
                    moveY(+passos);        // passos positivos na direção Y
                    moveX(-passos);
                    break; // passos negativos na direção X
                case 180:
                    moveX(-passos);
                    break; // passos negativos na direção X
                case 225:
                    moveX(-passos);        // passos negativos na direção X e
                    moveY(-passos);
                    break; // passos negativos na direção Y
                case 270:
                    moveY(-passos);
                    break; // passos negativos na direção Y
                case 315:
                    moveY(-passos);        // passos negativos na direção Y e
                    moveX(+passos);
                    break; // passos positivos na direção X
            } // fim do switch
            energia -= energiaASerGasta; // deduz a energia gasta para o movimento
        } // fim do if
    }

    /**
     * O método toString não recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados. Este método chama o método toString da classe
     * ancestral e concatena ao resultado da chamada os campos exclusivos desta classe.
     * @return uma string com os valores dos campos formatados.
     */
    public String toString() {
        String resultado = super.toString() + "\n";
        resultado = resultado + "Energia do robô:" + energia;
        return resultado;
    } // fim do método toString
} // fim da classe RoboABateria
