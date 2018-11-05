
/** 
 * A classe RoboSimples0 representa um robô que tem uma posição qualquer no espaço
 * de duas dimensões, pode modificar a posição e direção (se movimentar, somente para
 * a frente) e informar a sua posição e direção. Este robô é um modelo 
 * supersimplificado de um pequeno robô móvel. O nome da classe tem um zero pois esta 
 * classe ainda será modificada.
 */
class RoboSimples0 // declaração da classe 
{

    /**
     * Declaração dos campos da classe
     */
    private String nomeDoRobô;
    private int posiçãoXAtual,  posiçãoYAtual;
    private char direçãoAtual;

    /**
     * O construtor para a classe RoboSimples0, que recebe argumentos para inicializar
     * todos os campos da classe.
     * @param n o nome do robô
     * @param px a posição X atual
     * @param py a posição Y atual
     * @param d a direção atual
     */
    RoboSimples0(String n, int px, int py, char d) {
        nomeDoRobô = n;
        posiçãoXAtual = px;
        posiçãoYAtual = py;
        direçãoAtual = d;
    } // fim do construtor com todos os argumentos

    /**
     * O construtor para a classe RoboSimples0, que recebe somente o nome do robô e assume
     * que este robô está na posição (0,0) e direção norte.
     * @param n o nome do robô
     */
    RoboSimples0(String n) {
        nomeDoRobô = n;
        posiçãoXAtual = 0;
        posiçãoYAtual = 0;
        direçãoAtual = 'N';
    } // fim do construtor com somente o nome do robô como argumento

    /**
     * O construtor para a classe RoboSimples0, que não recebe argumentos e assume que o
     * robô não tem nome (string vazia), e que este robô está na posição (0,0) e direção
     * norte.
     */
    RoboSimples0() {
        nomeDoRobô = "";
        posiçãoXAtual = 0;
        posiçãoYAtual = 0;
        direçãoAtual = 'N';
    } // fim do construtor com somente o nome do robô como argumento

    /**
     * Esta versão do método move modifica a posição do robô em uma unidade na direção
     * em que o robô está. Este método não recebe argumentos.
     */
    public void move() {
        if (direçãoAtual == 'N') {
            posiçãoYAtual = posiçãoYAtual + 1;
        }
        if (direçãoAtual == 'S') {
            posiçãoYAtual = posiçãoYAtual - 1;
        }
        if (direçãoAtual == 'E') {
            posiçãoXAtual = posiçãoXAtual + 1;
        }
        if (direçãoAtual == 'O') {
            posiçãoXAtual = posiçãoXAtual - 1;
        }
    } // fim do método move

    /**
     * Esta versão do método move modifica a posição do robô em um número de unidades na
     * direção em que o robô está.
     * @param passos o número de "passos" para o robô
     */
    public void move(int passos) {
        if (direçãoAtual == 'N') {
            posiçãoYAtual = posiçãoYAtual + passos;
        }
        if (direçãoAtual == 'S') {
            posiçãoYAtual = posiçãoYAtual - passos;
        }
        if (direçãoAtual == 'E') {
            posiçãoXAtual = posiçãoXAtual + passos;
        }
        if (direçãoAtual == 'O') {
            posiçãoXAtual = posiçãoXAtual - passos;
        }
    } // fim do método move

    /**
     * O método mudaDireção permite que a direção do robô seja mudada depois de ele ter
     * sido criado.
     * @param novaDireção a nova direção para o robô.
     */
    public void mudaDireção(char novaDireção) {
        direçãoAtual = novaDireção;
    } // fim do método mudaDireção

    /**
     * O método toString não recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados.
     * @return uma string com os valores dos campos formatados.
     */
    public String toString() {
        String posição = "Nome do robô:" + nomeDoRobô + "\n";
        posição = posição + "Posição do robô: (" + posiçãoXAtual + "," +
                posiçãoYAtual + ")\n";
        posição = posição + "Direção do robô:" + direçãoAtual;
        return posição;
    } // fim do método toString
} // fim da classe RoboSimples0
