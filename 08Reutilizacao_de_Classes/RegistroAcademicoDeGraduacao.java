
/** 
 * A classe RegistroAcademicoDeGraduacao encapsula os dados de um aluno
 * matriculado em um curso de graduação.
 */
class RegistroAcademicoDeGraduacao {

    /**
     * Declaração dos campos da classe
     */
    private String nomeDoAluno; // O nome do aluno
    private Data dataDeNascimento; // a data de nascimento
    private int númeroDeMatrícula; // O número de matrícula
    private byte códigoDoCurso; // O código do curso do aluno (1..4)
    private double percentualDeCobrança; // O percentual a ser cobrado do aluno, 0 a 100%
    /**
     * Declaração de alguns campos constantes desta classe. Estes campos são declarados
     * como public para serem acessíveis de fora da classe, como static pois serão
     * independentes de instâncias, e como final para que não sejam modificáveis.
     */
    public static final byte ARQUITETURA = 1;
    public static final byte CIÊNCIADACOMPUTAÇÃO = 2;
    public static final byte ENGENHARIADACOMPUTAÇÃO = 3;
    public static final byte ZOOTECNIA = 4;

    /**
     * O construtor completo, que recebe argumentos para inicializar os campos da classe.
     * @param n o nome do aluno
     * @param d a data de nascimento
     * @param m o número de matrícula
     * @param c o código do curso
     * @param p o percentual de bolsa
     */
    RegistroAcademicoDeGraduacao(String n, Data d, int m,
            byte c, double p) {
        nomeDoAluno = n;
        dataDeNascimento = d;
        númeroDeMatrícula = m;
        códigoDoCurso = c;
        percentualDeCobrança = p;
    } // fim do construtor

    /**
     * O construtor que recebe argumentos para inicializar os campos da classe, menos o
     * percentual de cobrança, que será considerado como 100%.
     * @param n o nome do aluno
     * @param m o número de matrícula
     * @param c o código do curso
     */
    RegistroAcademicoDeGraduacao(String n, Data d, int m,
            byte c) {
        this(n, d, m, c, 95); // chama o construtor
    } // fim do construtor

    /**
     * O método calculaMensalidade calcula e retorna a mensalidade do aluno usando
     * o código do seu curso e o percentual de cobrança.
     * @return o valor da mensalidade do aluno
     */
    public double calculaMensalidade() {
        double mensalidade = 0; // valor deve ser inicializado
        // Primeiro, dependendo do curso do aluno, determina a mensalidade básica. Note
        // que estamos usando as constantes da classe, definidas anteriormente.
        if (códigoDoCurso == ARQUITETURA) // Arquitetura
        {
            mensalidade = 450.00;
        }
        if (códigoDoCurso == CIÊNCIADACOMPUTAÇÃO) // Ciência da Computação
        {
            mensalidade = 500.00;
        }
        if (códigoDoCurso == ENGENHARIADACOMPUTAÇÃO) // Engenharia da Computação
        {
            mensalidade = 550.00;
        }
        if (códigoDoCurso == ZOOTECNIA) // Zootecnia
        {
            mensalidade = 380.00;
        }
        // Agora calcula o desconto com o percentual de cobrança. Se o percentual de
        // cobrança for zero, a mensalidade também o será.
        if (percentualDeCobrança == 0) {
            mensalidade = 0;
        } // Senão, calculamos com uma fórmula simples.
        else {
            mensalidade = mensalidade * 100.0 / percentualDeCobrança;
        }
        return mensalidade;
    } // fim do método calculaMensalidade

    /**
     * O método toString retorna uma string contendo os campos desta classe com uma
     * formatação simples.
     * @return os campos da classe, formatados
     */
    public String toString() {
        String resultado = "Cadastro de Aluno\n----------------------\n"; // adicionaremos os valores dos campos
        resultado += "Matrícula: " + númeroDeMatrícula +
                " Nome: " + nomeDoAluno + "\n";
        resultado += "Data de Nascimento: " +
                dataDeNascimento + "\n"; // chamada implícita ao
        // método toString da
        // classe Data.
        resultado += "Código do Curso: " + códigoDoCurso + "\n";
        resultado += "Percentual de Cobrança: " +
                percentualDeCobrança + "\n";
        return resultado; // retorna a string concatenada
    }
} // fim da classe RegistroAcademicoDeGraduacao
