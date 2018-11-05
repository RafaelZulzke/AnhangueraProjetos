
/** 
 * A classe ConstantesMatematicas cont�m v�rios valores que s�o constantes.
 * Esta classe n�o tem m�todos, e todos os campos s�o declarados como static, assim
 * n�o � necess�rio criar inst�ncias desta classe para acessar os valores. Para que 
 * os valores possam ser acessados de fora da classe sem a necessidade de m�todos os
 * campos s�o declarados como public. Para garantir que os valores n�o poder�o ser
 * modificados, os campos tamb�m s�o declarados como final.
 */
class ConstantesMatematicas // declara��o da classe 
{

    /**
     * Declara��o dos campos da classe
     */
    // A raiz quadrada de 2
    final static public double raizDe2 = 1.4142135623730950488;
    // A raiz quadrada de 3
    final static public double raizDe3 = 1.7320508075688772935;
    // A raiz quadrada de 5
    final static public double raizDe5 = 2.2360679774997896964;
    // A raiz quadrada de 6: podemos usar as constantes j� definidas
    final static public double raizDe6 = raizDe2 * raizDe3;
    
} // fim da classe ConstantesMatematicas 

// Valores obtidos no livro Manual de F�rmulas e Tabelas Matem�ticas, Murray R. 
// Spiegel, Cole��o Schaum, Editora McGraw-Hill
