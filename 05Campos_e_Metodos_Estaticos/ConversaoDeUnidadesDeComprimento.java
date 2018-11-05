
/** 
 * A classe ConversaoDeUnidadesDeComprimento cont�m v�rios m�todos est�ticos que 
 * convertem unidades de comprimento. Esta classe n�o tem campos, e todos os seus 
 * m�todos s�o declarados como static, assim n�o � necess�rio criar inst�ncias desta 
 * classe para usar os m�todos. Para que os m�todos possam ser acessados de qualquer 
 * outra classe eles s�o declarados como public.
 */
class ConversaoDeUnidadesDeComprimento // declara��o da classe 
{

    /**
     * O m�todo polegadasParaCent�metros converte o valor passado em polegadas para
     * cent�metros.
     * @param polegadas o n�mero de polegadas
     * @return o n�mero de cent�metros correspondente ao n�mero de polegadas
     */
    public static double polegadasParaCent�metros(double polegadas) {
        double cent�metros = polegadas * 2.54;
        return cent�metros;
    }

    /**
     * O m�todo p�sParaCent�metros converte o valor passado em p�s para cent�metros.
     * @param p�s o n�mero de p�s
     * @return o n�mero de cent�metros correspondente ao n�mero de p�s
     */
    public static double p�sParaCent�metros(double p�s) {
        double cent�metros = p�s * 30.48;
        return cent�metros;
    }

    /**
     * O m�todo milhasParaQuil�metros converte o valor passado em milhas para quil�metros.
     * @param milhas o n�mero de milhas
     * @return o n�mero de quil�metros correspondente ao n�mero de milhas
     */
    public static double milhasParaQuil�metros(double milhas) {
        double quil�metros = milhas * 1.609;
        return quil�metros;
    }
} // fim da classe ConversaoDeUnidadesDeComprimento 

// F�rmulas obtidas no livro Manual de F�rmulas e Tabelas Matem�ticas, Murray R. 
// Spiegel, Cole��o Schaum, Editora McGraw-Hill
