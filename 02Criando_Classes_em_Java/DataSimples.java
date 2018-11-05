
/** 
 * A classe DataSimples cont�m campos e m�todos que permitem a manipula��o de 
 * datas.
 */
class DataSimples // declara��o da classe 
{

    /**
     * Declara��o dos campos da classe
     */
    byte dia, m�s; // dia e m�s s�o representados por bytes
    short ano; // ano � representado por um short

    /**
     * O m�todo inicializaDataSimples recebe argumentos para inicializar os campos da
     * classe DataSimples. Este m�todo chama o m�todo data�V�lida para verificar se os
     * argumentos s�o correspondentes a uma data v�lida: se forem, inicializa os
     * campos, caso contr�rio inicializa todos os tr�s campos com o valor zero.
     * @param d o argumento correspondente ao m�todo dia
     * @param m o argumento correspondente ao m�todo m�s
     * @param a o argumento correspondente ao m�todo ano
     */
    void inicializaDataSimples(byte d, byte m, short a) {
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
    } // fim do m�todo inicializaDataSimples

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
    boolean data�V�lida(byte d, byte m, short a) {
        if ((d >= 1) && // se o dia for maior ou igual a 1  E
                (d <= 31) && // se o dia for menor ou igual a 31  E
                (m >= 1) && // se o m�s for maior ou igual a 1  E
                (m <= 12)) // se o m�s for menor ou igual a 12 ENT�O
        {
            return true;      // a data � v�lida, retorna true
        } else {
            return false;     // a data n�o � v�lida, retorna false
        }
    } // fim do m�todo data�V�lida

    /**
     * O m�todo �Igual recebe uma inst�ncia da pr�pria classe DataSimples como argumento
     * e verifica se a data representada pela classe e pela inst�ncia que foi passada �
     * a mesma. A compara��o � feita comparando os campos da data um a um.
     * @param outraDataSimples uma inst�ncia da pr�pria classe DataSimples
     * @return true se a data encapsulada for igual � passada, false caso contr�rio
     */
    boolean �Igual(DataSimples outraDataSimples) {
        if ((dia == outraDataSimples.dia) && // se os dois dias forem iguais E
                (m�s == outraDataSimples.m�s) && // se os dois meses forem iguais E
                (ano == outraDataSimples.ano)) // se os dois anos forem iguais ent�o
        {
            return true;      // a data � igual, retorna true
        } else {
            return false;     // a data � diferente, retorna false
        }
    } // fim do m�todo �Igual

    /**
     * O m�todo mostraDataSimples n�o recebe argumentos nem retorna valores. Este m�todo
     * somente imprime os valores dos campos, formatados de forma que uma barra ("/")
     * seja impressa entre eles. Quando o valor do ano for impresso, uma quebra de
     * linha tamb�m ser� impressa.
     */
    void mostraDataSimples() {

        System.out.print(dia);   // O m�todo print do campo out da classe System faz com
        System.out.print("/");   // que o argumento passado a ele seja transformado em uma
        System.out.print(m�s);   // string e impresso no terminal. O m�todo println faz a
        System.out.print("/");   // mesma coisa, mas adiciona uma quebra de linha ('\n')
        System.out.println(ano); // ao final da string impressa.
    }  // fim do m�todo mostraDataSimples
} // fim da classe DataSimples
