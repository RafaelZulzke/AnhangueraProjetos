
/** 
 * A classe DemoFuncionario0 demonstra o uso de uma inst�ncia da classe 
 * Funcionario0. Esta classe demonstra o que ocorre quando uma inst�ncia de uma 
 * classe cujos campos t�m modificadores de acesso � reaproveitada (via delega��o ou 
 * composi��o) dentro de outra classe que redeclara os modificadores de acesso.
 * ESTA CLASSE N�O PODE SER COMPILADA POR CAUSA DE ERROS INTENCIONAIS. 
 */
class DemoFuncionario0 // declara��o da classe
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo declara uma inst�ncia
     * da classe Funcionario0 e tenta acessar alguns de seus campos e dos campos das
     * classes que s�o usadas pela classe Funcionario0.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma inst�ncia da classe Pessoa0,
        // cujo construtor espera como terceiro
        // argumento uma inst�ncia da classe Data
        Pessoa0 pessoaChan = new Pessoa0(
                "Patrick Chan",
                90235422,
                new Data((byte) 22, (byte) 2, (short) 1964));
        // Criamos uma inst�ncia da classe Funcionario0, cujo construtor espera como
        // primeiro argumento uma inst�ncia da classe Pessoa0, como segundo argumento uma
        // inst�ncia da classe Data e como terceiro argumento um valor do tipo float.
        Funcionario0 funcion�rioChan = new Funcionario0(
                pessoaChan,
                new Data((byte) 14, (byte) 2, (byte) 1990),
                (float) 2400.00);
        // Tentamos modificar diretamente o campo funcion�rio da inst�ncia. Teremos um
        // erro de compila��o pois o campo funcion�rio � privado da classe Funcionario0.
        funcion�rioChan.funcion�rio =
                new Pessoa0("Jos� Ribamar", 87124324,
                new Data((byte) 9, (byte) 1, (short) 1931));
        // Tentamos modificar diretamente o nome do campo funcion�rio da inst�ncia. Teremos
        // outro erro de compila��o pois mesmo que o campo nome da classe Pessoa0 seja
        // p�blico, o campo funcion�rio da classe Funcionario0 � privado, impedindo o
        // acesso.
        funcion�rioChan.funcion�rio.nome = "Jos� Ribamar";
        // Tentamos modificar o campo sal�rio da inst�ncia. Teremos novamente um erro de
        // compila��o pois o campo sal�rio � privado da classe Funcionario0.
        funcion�rioChan.sal�rio = (float) 1200.00;
        // Tentamos modificar o campo admiss�o da inst�ncia. Desta vez n�o teremos erros
        // pois o campo admiss�o � p�blico da classe Funcionario0, podendo ser acessado
        // diretamente usando o operador ponto.
        funcion�rioChan.admiss�o = new Data((byte) 14, (byte) 2, (byte) 1989);
        // Tentamos modificar diretamente o campo dia do campo admiss�o da inst�ncia.
        // Teremos novamente um erro de compila��o pois, mesmo que a inst�ncia admiss�o
        // da classe Data tenha sido declarada como p�blica na classe Funcionario0, o campo
        // dia � declarado como private na classe Data.
        funcion�rioChan.admiss�o.dia = (byte) 22;
        System.out.println(funcion�rioChan);
    } // fim do m�todo main
} // fim da classe DemoFuncionario0
