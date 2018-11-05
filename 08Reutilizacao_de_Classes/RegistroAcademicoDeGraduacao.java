
/** 
 * A classe RegistroAcademicoDeGraduacao encapsula os dados de um aluno
 * matriculado em um curso de gradua��o.
 */
class RegistroAcademicoDeGraduacao {

    /**
     * Declara��o dos campos da classe
     */
    private String nomeDoAluno; // O nome do aluno
    private Data dataDeNascimento; // a data de nascimento
    private int n�meroDeMatr�cula; // O n�mero de matr�cula
    private byte c�digoDoCurso; // O c�digo do curso do aluno (1..4)
    private double percentualDeCobran�a; // O percentual a ser cobrado do aluno, 0 a 100%
    /**
     * Declara��o de alguns campos constantes desta classe. Estes campos s�o declarados
     * como public para serem acess�veis de fora da classe, como static pois ser�o
     * independentes de inst�ncias, e como final para que n�o sejam modific�veis.
     */
    public static final byte ARQUITETURA = 1;
    public static final byte CI�NCIADACOMPUTA��O = 2;
    public static final byte ENGENHARIADACOMPUTA��O = 3;
    public static final byte ZOOTECNIA = 4;

    /**
     * O construtor completo, que recebe argumentos para inicializar os campos da classe.
     * @param n o nome do aluno
     * @param d a data de nascimento
     * @param m o n�mero de matr�cula
     * @param c o c�digo do curso
     * @param p o percentual de bolsa
     */
    RegistroAcademicoDeGraduacao(String n, Data d, int m,
            byte c, double p) {
        nomeDoAluno = n;
        dataDeNascimento = d;
        n�meroDeMatr�cula = m;
        c�digoDoCurso = c;
        percentualDeCobran�a = p;
    } // fim do construtor

    /**
     * O construtor que recebe argumentos para inicializar os campos da classe, menos o
     * percentual de cobran�a, que ser� considerado como 100%.
     * @param n o nome do aluno
     * @param m o n�mero de matr�cula
     * @param c o c�digo do curso
     */
    RegistroAcademicoDeGraduacao(String n, Data d, int m,
            byte c) {
        this(n, d, m, c, 95); // chama o construtor
    } // fim do construtor

    /**
     * O m�todo calculaMensalidade calcula e retorna a mensalidade do aluno usando
     * o c�digo do seu curso e o percentual de cobran�a.
     * @return o valor da mensalidade do aluno
     */
    public double calculaMensalidade() {
        double mensalidade = 0; // valor deve ser inicializado
        // Primeiro, dependendo do curso do aluno, determina a mensalidade b�sica. Note
        // que estamos usando as constantes da classe, definidas anteriormente.
        if (c�digoDoCurso == ARQUITETURA) // Arquitetura
        {
            mensalidade = 450.00;
        }
        if (c�digoDoCurso == CI�NCIADACOMPUTA��O) // Ci�ncia da Computa��o
        {
            mensalidade = 500.00;
        }
        if (c�digoDoCurso == ENGENHARIADACOMPUTA��O) // Engenharia da Computa��o
        {
            mensalidade = 550.00;
        }
        if (c�digoDoCurso == ZOOTECNIA) // Zootecnia
        {
            mensalidade = 380.00;
        }
        // Agora calcula o desconto com o percentual de cobran�a. Se o percentual de
        // cobran�a for zero, a mensalidade tamb�m o ser�.
        if (percentualDeCobran�a == 0) {
            mensalidade = 0;
        } // Sen�o, calculamos com uma f�rmula simples.
        else {
            mensalidade = mensalidade * 100.0 / percentualDeCobran�a;
        }
        return mensalidade;
    } // fim do m�todo calculaMensalidade

    /**
     * O m�todo toString retorna uma string contendo os campos desta classe com uma
     * formata��o simples.
     * @return os campos da classe, formatados
     */
    public String toString() {
        String resultado = "Cadastro de Aluno\n----------------------\n"; // adicionaremos os valores dos campos
        resultado += "Matr�cula: " + n�meroDeMatr�cula +
                " Nome: " + nomeDoAluno + "\n";
        resultado += "Data de Nascimento: " +
                dataDeNascimento + "\n"; // chamada impl�cita ao
        // m�todo toString da
        // classe Data.
        resultado += "C�digo do Curso: " + c�digoDoCurso + "\n";
        resultado += "Percentual de Cobran�a: " +
                percentualDeCobran�a + "\n";
        return resultado; // retorna a string concatenada
    }
} // fim da classe RegistroAcademicoDeGraduacao
