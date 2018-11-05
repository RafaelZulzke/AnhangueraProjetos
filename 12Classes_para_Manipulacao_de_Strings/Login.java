
/**
 * A classe Login encapsula um nome de usuário e senha e um mecanismo para
 * verificar este nome e senha.
 */
class Login // declaração da classe
{

    /**
     * Os campos da classe, que armazenarão o nome de usuário e a sua senha.
     * Um campo adicional indicará se a verificação deve ser rigorosa ou não.
     */
    private String nome,  senha;
    private boolean verificaçãoRigorosa;

    /**
     * Um construtor da classe, que recebe como argumentos um nome e uma senha.
     * Este construtor chama o construtor mais completo, passando para este os
     * argumentos. Se este construtor for utilizado, consideraremos que a verificação
     * da senha e nome deve ser rigorosa.
     * @param nome o nome a ser encapsulado
     * @param senha a senha a ser encapsulada
     */
    Login(String nome, String senha) {
        this(nome, senha, true); // chama o construtor com mais argumentos
    }

    /**
     * Um construtor da classe, que recebe como argumentos um nome, uma senha e
     * um valor que indica se a verificação será rigorosa ou não. Este construtor
     * inicializa os campos da classe com estes argumentos.
     * @param nome o nome a ser encapsulado
     * @param senha a senha a ser encapsulada
     * @param verificaçãoRigorosa indica se a verificação de nome e senha será rigorosa
     *        ou não.
     */
    Login(String nome, String senha,
            boolean verificaçãoRigorosa) {
        this.nome = nome;    // inicializa os campos usando os valores passados como
        this.senha = senha;  // argumentos
        this.verificaçãoRigorosa = verificaçãoRigorosa;
    }

    /**
     * O método verifica, que compara o nome e a senha com valores passados como
     * argumento, retornando true se o nome e senha encapsulados forem iguais ao nome
     * e senha passados como argumento.
     * @param nome o nome a ser comparado com o encapsulado
     * @param senha a senha a ser comparada com a encapsulada
     * @return true se o nome e senha forem iguais, false caso contrário
     */
    public boolean verifica(String nome, String senha) {
        // Se a verificação deve ser rigorosa, consideraremos maiúsculas e minúsculas
        // como sendo diferentes.
        if (verificaçãoRigorosa) {
            if (this.nome.equals(nome) && // se o nome for igual ao encapsulado
                    this.senha.equals(senha)) // e a senha também for
            {
                return true; // retornamos true (verificação OK)
            } else {
                return false; // senão retornamos false (verificação falhou)
            }
        } else // senão, consideraremos maiúsculas e minúsculas como sendo iguais.
        {
            if (this.nome.equalsIgnoreCase(nome) && // se o nome for igual ao encapsulado
                    this.senha.equalsIgnoreCase(senha)) // e a senha também for
            {
                return true; // retornamos true (verificação OK)
            } else {
                return false; // senão retornamos false (verificação falhou)
            }
        }
    }
} // fim da classe Login
