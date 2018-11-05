
/** 
 * A classe RoboSimples0 representa um rob� que tem uma posi��o qualquer no espa�o
 * de duas dimens�es, pode modificar a posi��o e dire��o (se movimentar, somente para
 * a frente) e informar a sua posi��o e dire��o. Este rob� � um modelo 
 * supersimplificado de um pequeno rob� m�vel. O nome da classe tem um zero pois esta 
 * classe ainda ser� modificada.
 */
class RoboSimples0 // declara��o da classe 
{

    /**
     * Declara��o dos campos da classe
     */
    private String nomeDoRob�;
    private int posi��oXAtual,  posi��oYAtual;
    private char dire��oAtual;

    /**
     * O construtor para a classe RoboSimples0, que recebe argumentos para inicializar
     * todos os campos da classe.
     * @param n o nome do rob�
     * @param px a posi��o X atual
     * @param py a posi��o Y atual
     * @param d a dire��o atual
     */
    RoboSimples0(String n, int px, int py, char d) {
        nomeDoRob� = n;
        posi��oXAtual = px;
        posi��oYAtual = py;
        dire��oAtual = d;
    } // fim do construtor com todos os argumentos

    /**
     * O construtor para a classe RoboSimples0, que recebe somente o nome do rob� e assume
     * que este rob� est� na posi��o (0,0) e dire��o norte.
     * @param n o nome do rob�
     */
    RoboSimples0(String n) {
        nomeDoRob� = n;
        posi��oXAtual = 0;
        posi��oYAtual = 0;
        dire��oAtual = 'N';
    } // fim do construtor com somente o nome do rob� como argumento

    /**
     * O construtor para a classe RoboSimples0, que n�o recebe argumentos e assume que o
     * rob� n�o tem nome (string vazia), e que este rob� est� na posi��o (0,0) e dire��o
     * norte.
     */
    RoboSimples0() {
        nomeDoRob� = "";
        posi��oXAtual = 0;
        posi��oYAtual = 0;
        dire��oAtual = 'N';
    } // fim do construtor com somente o nome do rob� como argumento

    /**
     * Esta vers�o do m�todo move modifica a posi��o do rob� em uma unidade na dire��o
     * em que o rob� est�. Este m�todo n�o recebe argumentos.
     */
    public void move() {
        if (dire��oAtual == 'N') {
            posi��oYAtual = posi��oYAtual + 1;
        }
        if (dire��oAtual == 'S') {
            posi��oYAtual = posi��oYAtual - 1;
        }
        if (dire��oAtual == 'E') {
            posi��oXAtual = posi��oXAtual + 1;
        }
        if (dire��oAtual == 'O') {
            posi��oXAtual = posi��oXAtual - 1;
        }
    } // fim do m�todo move

    /**
     * Esta vers�o do m�todo move modifica a posi��o do rob� em um n�mero de unidades na
     * dire��o em que o rob� est�.
     * @param passos o n�mero de "passos" para o rob�
     */
    public void move(int passos) {
        if (dire��oAtual == 'N') {
            posi��oYAtual = posi��oYAtual + passos;
        }
        if (dire��oAtual == 'S') {
            posi��oYAtual = posi��oYAtual - passos;
        }
        if (dire��oAtual == 'E') {
            posi��oXAtual = posi��oXAtual + passos;
        }
        if (dire��oAtual == 'O') {
            posi��oXAtual = posi��oXAtual - passos;
        }
    } // fim do m�todo move

    /**
     * O m�todo mudaDire��o permite que a dire��o do rob� seja mudada depois de ele ter
     * sido criado.
     * @param novaDire��o a nova dire��o para o rob�.
     */
    public void mudaDire��o(char novaDire��o) {
        dire��oAtual = novaDire��o;
    } // fim do m�todo mudaDire��o

    /**
     * O m�todo toString n�o recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados.
     * @return uma string com os valores dos campos formatados.
     */
    public String toString() {
        String posi��o = "Nome do rob�:" + nomeDoRob� + "\n";
        posi��o = posi��o + "Posi��o do rob�: (" + posi��oXAtual + "," +
                posi��oYAtual + ")\n";
        posi��o = posi��o + "Dire��o do rob�:" + dire��oAtual;
        return posi��o;
    } // fim do m�todo toString
} // fim da classe RoboSimples0
