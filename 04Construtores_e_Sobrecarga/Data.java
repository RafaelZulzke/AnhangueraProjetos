
/** 
 * A classe Data cont�m campos e m�todos que permitem a manipula��o de datas.
 * Esta vers�o da classe tem os campos protegidos para evitar a sua manipula��o 
 * incorreta - valores dos campos s� podem ser acessados atrav�s de m�todos.
 */
class Data // declara��o da classe 
{

    /**
     * Declara��o dos campos da classe
     */
    private byte dia,  m�s; // dia e m�s s�o representados por bytes
    private short ano; // ano � representado por um short

    /**
     * O m�todo inicializaData recebe argumentos para inicializar os campos da classe
     * Data. Este m�todo chama o m�todo data�V�lida para verificar se os argumentos
     * correspondem a uma data v�lida: se forem, inicializa os campos, caso contr�rio
     * inicializa todos os tr�s campos com o valor zero.
     * @param d o argumento correspondente ao m�todo dia
     * @param m o argumento correspondente ao m�todo m�s
     * @param a o argumento correspondente ao m�todo ano
     */
    public void inicializaData(byte d, byte m, short a) {
        if (data�V�lida(d, m, a)) // se a data for v�lida, inicializa os campos com os
        // valores passados como argumentos
        {
            dia = d;
            m�s = m;
            ano = a;
        } else // caso contr�rio, inicializa os campos com zero
        {
            dia = 0;
            m�s = 0;
            ano = 0;
        }
    } // fim do m�todo inicializaData

    /**
     * O m�todo retornaDia retorna o dia da data encapsulada, j� que o campo dia, sendo
     * declarado como private, n�o poder� ser acessado diretamente de fora da classe.
     * @return o dia encapsulado pela classe
     */
    public byte retornaDia() {
        return dia;
    } // fim do m�todo retornaDia

    /**
     * O m�todo retornaM�s retorna o m�s da data encapsulada, j� que o campo m�s, sendo
     * declarado como private, n�o poder� ser acessado diretamente de fora da classe.
     * @return o m�s encapsulado pela classe
     */
    public byte retornaM�s() {
        return m�s;
    } // fim do m�todo retornaM�s

    /**
     * O m�todo retornaAno retorna o ano da data encapsulada, j� que o campo ano, sendo
     * declarado como private, n�o poder� ser acessado diretamente de fora da classe.
     * @return o ano encapsulado pela classe
     */
    public short retornaAno() {
        return ano;
    } // fim do m�todo retornaAno

    /**
     * O m�todo data�V�lida recebe tr�s valores como argumentos e verifica de maneira
     * simples se os dados correspondem a uma data v�lida. Se a data for v�lida, retorna
     * a constante booleana true, caso contr�rio, retorna a constante booleana false.
     * Vale a pena notar que este algoritmo � simples e incorreto, um dos exerc�cios
     * sugere a implementa��o do algoritmo correto.
     * @param d o argumento correspondente ao m�todo dia
     * @param m o argumento correspondente ao m�todo m�s
     * @param a o argumento correspondente ao m�todo ano
     * @return true se a data for v�lida, false se n�o for v�lida
     */
    public boolean data�V�lida(byte d, byte m, short a) {
        if ((d >= 1) && // se o dia for maior ou igual a 1  E
                (d <= 31) && // se o dia for menor ou igual a 31  E
                (m >= 1) && // se o m�s for maior ou igual a 1  E
                (m <= 12)) // se o m�s for menor ou igual a 12  ENT�O
        {
            return true;      // a data � v�lida, retorna true
        } else {
            return false;     // a data n�o � v�lida, retorna false
        }
    } // fim do m�todo data�V�lida

    /**
     * O m�todo �Igual recebe uma inst�ncia da pr�pria classe Data como argumento e
     * verifica se a data representada pela classe e pela inst�ncia que foi passada �
     * a mesma. A compara��o � feita comparando os campos da data um a um.
     * @param outraData uma inst�ncia da pr�pria classe Data
     * @return true se a data encapsulada for igual � passada, false caso contr�rio
     */
    public boolean �Igual(Data outraData) {
        if ((dia == outraData.dia) && // se os dois dias forem iguais E
                (m�s == outraData.m�s) && // se os dois meses forem iguais E
                (ano == outraData.ano)) // se os dois anos forem iguais ent�o
        {
            return true;      // a data � igual, retorna true
        } else {
            return false;     // a data � diferente, retorna false
        }
    } // fim do m�todo �Igual

    /**
     * O m�todo mostraData n�o recebe argumentos nem retorna valores. Este m�todo somente
     * imprime os valores dos campos, formatados de forma que uma barra ("/") seja
     * impressa entre eles. Quando o valor do ano for impresso, uma quebra de linha
     * tamb�m ser� impressa.
     */
    public void mostraData() {
        System.out.print(dia);
        System.out.print("/");
        System.out.print(m�s);
        System.out.print("/");
        System.out.println(ano);
    }  // fim do m�todo mostraData
} // fim da classe Data
