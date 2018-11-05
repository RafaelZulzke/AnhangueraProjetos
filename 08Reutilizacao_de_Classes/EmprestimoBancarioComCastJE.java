
/** 
 * A classe EmprestimoBancarioComCast calcula o valor de empréstimos que podem 
 * ser dados a pessoas (instâncias das classes Pessoa, Funcionario e 
 * ChefeDeDepartamento) por um banco popular. Esta classe é similar à classe 
 * EmprestimoBancario, mas o método calculaEmpréstimo unifica o cálculo do empréstimo
 * que pode ser feito verificando a classe da instância passada como argumento e 
 * fazendo o cast (conversão explícita) se necessário.
 */
class EmprestimoBancarioComCastJE {

    /**
     * O método main permite a execução desta classe. Este método contém declarações de
     * algumas instâncias das classes Pessoa, Funcionario e ChefeDeDepartamento, e as
     * usa para calcular o valor de um empréstimo bancário a ser feito para cada uma
     * das pessoas representadas pela instância.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma instância da classe Pessoa
        Pessoa p1 = new Pessoa("Kurt Gödel", 10973213,
                new Data((byte) 23, (byte) 12, (short) 1904));
        // Criamos três instâncias da classe Funcionario
        Pessoa f1 = new Funcionario("Henri Poincaré", 19283712,
                new Data((byte) 12, (byte) 7, (short) 1897),
                new Data((byte) 28, (byte) 1, (short) 1918),
                2500.0f);
        Pessoa f2 = new Funcionario("Paul Dirac", 98736812,
                new Data((byte) 20, (byte) 1, (short) 1885),
                new Data((byte) 31, (byte) 3, (short) 1909),
                3200.0f);
        Pessoa f3 = new Funcionario("Wolfgang Pauli", 33886620,
                new Data((byte) 14, (byte) 9, (short) 1902),
                new Data((byte) 16, (byte) 11, (short) 1930),
                3600.0f);
        // Criamos uma instância da classe ChefeDeDepartamento
        Pessoa c1 = new ChefeDeDepartamento("Edwin Hubble", 4259782,
                new Data((byte) 20, (byte) 1, (short) 1875),
                new Data((byte) 20, (byte) 7, (short) 1899),
                4100.0f,
                "Laboratório de Astrofísica",
                new Data((byte) 20, (byte) 7, (short) 1899));
        // Calculamos os empréstimos que podem ser feitos a cada pessoa
        System.out.println(calculaEmpréstimo(p1));
        System.out.println(calculaEmpréstimo(f1));
        System.out.println(calculaEmpréstimo(f2));
        System.out.println(calculaEmpréstimo(f3));
        System.out.println(calculaEmpréstimo(c1));
    } // fim do método main

    /**
     * O método calculaEmpréstimo calcula o empréstimo que pode ser dado para uma
     * pessoa (instância da classe Funcionario e suas descendentes). O empréstimo será
     * calculado de forma diferenciada para as instâncias das classes Funcionario e
     * ChefeDeDepartamento.
     * @param f uma instância de qualquer classe que herde da classe Funcionario
     */
    public static float calculaEmpréstimo(Pessoa p) {
        float empréstimo = 1000.f; // inicialmente consideramos o empréstimo zero
        // Primeiro verificamos se a instância p é uma instância da classe
        // ChefeDeDepartamento. Se for, calculamos o empréstimo como sendo quatro vezes o
        // salário recebido.
        if (p instanceof ChefeDeDepartamento) {
            // Não podemos acessar o método qualSalário da instância p pois esta é uma
            // instância da classe Pessoa. Devemos criar uma instância temporária da classe
            // ChefeDeDepartamento a partir de p e usá-la para chamar o método qualSalário.
            // Notem que não é necessário inicializar a instância com a palavra-chave new,
            // ela será somente outra referência a p.
            ChefeDeDepartamento temporário = (ChefeDeDepartamento) p;
            empréstimo = 4.0f * temporário.qualSalário();
        } // Se a instância p não for da classe ChefeDeDepartamento, verificaremos se ela é
        // instância da classe Funcionario e, se for, calculamos o empréstimo como sendo
        // duas vezes o salário recebido.
        else if (p instanceof Funcionario) {
            // Não podemos acessar o método qualSalário da instância p pois esta é uma
            // instância da classe Pessoa. Devemos criar uma instância temporária da classe
            // Funcionario a partir de p e usá-la para chamar o método qualSalário.
            Funcionario temporário = (Funcionario) p;
            empréstimo = 2.0f * temporário.qualSalário();
        }
        return empréstimo;
    } // fim do método calculaEmpréstimo
} // fim da classe EmprestimoBancarioComCast
