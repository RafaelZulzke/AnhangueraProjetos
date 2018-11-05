/** 
 * A classe RoboSimples representa um rob� que tem uma posi��o qualquer no espa�o
 * de duas dimens�es, pode modificar a posi��o e dire��o (se movimentar, somente para
 * a frente) e informar a sua posi��o e dire��o. Este rob� � um modelo 
 * supersimplificado de um pequeno rob� m�vel. Esta classe apresenta melhorias e 
 * simplifica��es em rela��o � classe RoboSimples0.
 */
class RoboSimples // declara��o da classe 
  {
 /**
  * Declara��o dos campos da classe
  */
  private String nomeDoRob�;
  private int posi��oXAtual,posi��oYAtual;
  private char dire��oAtual;
     
 /**
  * O construtor "completo" para a classe RoboSimples, que recebe argumentos para 
  * inicializar todos os campos da classe.
  * @param n o nome do rob�
  * @param px a posi��o X atual
  * @param py a posi��o Y atual
  * @param d a dire��o atual
  */
  RoboSimples(String n,int px,int py,char d)
    {
    nomeDoRob� = n;
    posi��oXAtual = px;
    posi��oYAtual = py;
    dire��oAtual = d;
    } // fim do construtor com todos os argumentos

 /**
  * O construtor para a classe RoboSimples, que recebe somente o nome do rob� e assume
  * que este rob� est� na posi��o (0,0) e dire��o norte.
  * @param n o nome do rob�
  */
  RoboSimples(String n)
    {
    // Chama o construtor completo passando a posi��o e dire��o como constantes.
    this(n,0,0,'N');
    } // fim do construtor com somente o nome do rob� como argumento

 /**
  * O construtor para a classe RoboSimples, que n�o recebe argumentos e assume que o
  * rob� n�o tem nome (string vazia), e que este rob� est� na posi��o (0,0) e dire��o 
  * norte.
  */
  RoboSimples()
    {
    // Chama o construtor completo passando o nome como uma string vazia e a posi��o 
    // e dire��o como constantes.
    this("",0,0,'N'); // Poder�amos escrever tamb�m this("") !
    } // fim do construtor com somente o nome do rob� como argumento

 /**
  * Esta vers�o do m�todo move modifica a posi��o do rob� em uma unidade na dire��o
  * em que o rob� est�. Este m�todo n�o recebe argumentos.
  */
  public void move()
    {
    move(1);
    } // fim do m�todo move

 /**
  * Esta vers�o do m�todo move modifica a posi��o do rob� em um n�mero de unidades na
  * dire��o em que o rob� est�.
  * @param passos o n�mero de "passos" para o rob�
  */
  public void move(int passos)
    {
    if (dire��oAtual == 'N') posi��oYAtual = posi��oYAtual+passos;
    if (dire��oAtual == 'S') posi��oYAtual = posi��oYAtual-passos;
    if (dire��oAtual == 'E') posi��oXAtual = posi��oXAtual+passos;
    if (dire��oAtual == 'O') posi��oXAtual = posi��oXAtual-passos;
    } // fim do m�todo move

 /**
  * O m�todo mudaDire��o permite que a dire��o do rob� seja mudada depois de ele ter
  * sido criado.
  * @param novaDire��o a nova dire��o para o rob�.
  */
  public void mudaDire��o(char novaDire��o)
    {
    dire��oAtual = novaDire��o;
    } // fim do m�todo mudaDire��o

 /**
  * O m�todo toString n�o recebe argumentos, e retorna uma string contendo os valores 
  * dos campos da classe formatados.
  * @return uma string com os valores dos campos formatados.
  */
  public String toString()
    {
    String posi��o = "Nome do rob�:"+nomeDoRob�+"\n";
    posi��o = posi��o+"Posi��o do rob�: ("+posi��oXAtual+","+
                                           posi��oYAtual+")\n";
    posi��o = posi��o+"Dire��o do rob�:"+dire��oAtual;
    return posi��o;                                   
    } // fim do m�todo toString

  } // fim da classe RoboSimples
