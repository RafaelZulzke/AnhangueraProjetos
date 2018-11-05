
/**
 * A classe Login encapsula um nome de usu�rio e senha e um mecanismo para
 * verificar este nome e senha.
 */
class Login // declara��o da classe
{

    /**
     * Os campos da classe, que armazenar�o o nome de usu�rio e a sua senha.
     * Um campo adicional indicar� se a verifica��o deve ser rigorosa ou n�o.
     */
    private String nome,  senha;
    private boolean verifica��oRigorosa;

    /**
     * Um construtor da classe, que recebe como argumentos um nome e uma senha.
     * Este construtor chama o construtor mais completo, passando para este os
     * argumentos. Se este construtor for utilizado, consideraremos que a verifica��o
     * da senha e nome deve ser rigorosa.
     * @param nome o nome a ser encapsulado
     * @param senha a senha a ser encapsulada
     */
    Login(String nome, String senha) {
        this(nome, senha, true); // chama o construtor com mais argumentos
    }

    /**
     * Um construtor da classe, que recebe como argumentos um nome, uma senha e
     * um valor que indica se a verifica��o ser� rigorosa ou n�o. Este construtor
     * inicializa os campos da classe com estes argumentos.
     * @param nome o nome a ser encapsulado
     * @param senha a senha a ser encapsulada
     * @param verifica��oRigorosa indica se a verifica��o de nome e senha ser� rigorosa
     *        ou n�o.
     */
    Login(String nome, String senha,
            boolean verifica��oRigorosa) {
        this.nome = nome;    // inicializa os campos usando os valores passados como
        this.senha = senha;  // argumentos
        this.verifica��oRigorosa = verifica��oRigorosa;
    }

    /**
     * O m�todo verifica, que compara o nome e a senha com valores passados como
     * argumento, retornando true se o nome e senha encapsulados forem iguais ao nome
     * e senha passados como argumento.
     * @param nome o nome a ser comparado com o encapsulado
     * @param senha a senha a ser comparada com a encapsulada
     * @return true se o nome e senha forem iguais, false caso contr�rio
     */
    public boolean verifica(String nome, String senha) {
        // Se a verifica��o deve ser rigorosa, consideraremos mai�sculas e min�sculas
        // como sendo diferentes.
        if (verifica��oRigorosa) {
            if (this.nome.equals(nome) && // se o nome for igual ao encapsulado
                    this.senha.equals(senha)) // e a senha tamb�m for
            {
                return true; // retornamos true (verifica��o OK)
            } else {
                return false; // sen�o retornamos false (verifica��o falhou)
            }
        } else // sen�o, consideraremos mai�sculas e min�sculas como sendo iguais.
        {
            if (this.nome.equalsIgnoreCase(nome) && // se o nome for igual ao encapsulado
                    this.senha.equalsIgnoreCase(senha)) // e a senha tamb�m for
            {
                return true; // retornamos true (verifica��o OK)
            } else {
                return false; // sen�o retornamos false (verifica��o falhou)
            }
        }
    }
} // fim da classe Login
