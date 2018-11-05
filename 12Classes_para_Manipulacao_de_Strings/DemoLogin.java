
import java.util.Scanner;


/**
 * A classe DemoLogin demonstra o uso de uma instância da classe Login. Esta
 * classe pede que o usuário se identifique com o nome e senha, e caso estes sejam
 * iguais aos cadastrados, mostramos uma frase de um autor (também decidido pelo
 * usuário).
 */
class DemoLogin // declaração da classe
{

    static Scanner sc = new Scanner(System.in);

    /**
     * O método main permite a execução desta classe. Este método contém a declaração
     * de uma instância da classe Login, e a usa para executar parte do código somente
     * se o usuário entrar corretamente o nome e a senha.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma instância da classe Login, contendo o nome e senha do usuário
        // autorizado.
        Login autorizado = new Login("Auberon", "Titania");
        // Perguntamos ao usuário qual é o nome e senha.
        String nome, senha;
        System.out.println(
                "Para prosseguir é necessário um nome " +
                "e senha.");
        System.out.print("Nome :");
        nome = sc.next();
        System.out.print("Senha:");
        senha = sc.next();
        // Verificamos se o nome e senha são iguais aos passados para o construtor da
        // classe Login.
        if (!autorizado.verifica(nome, senha)) {
            System.out.println("O nome e/ou senha " +
                    "fornecidos são diferentes " +
                    "dos autorizados.");
            System.exit(1);
        }
        // Se chegamos a este ponto, o nome e senha foram reconhecidos. Podemos prosseguir
        // com a interação com o usuário. Mostramos uma mensagem pedindo que o usuário
        // entre com o nome do autor da mensagem.
        System.out.println("Entre o nome do autor da frase. " +
                "Opções válidas são:");
        System.out.println("Asimov, Joyce, Knuth, Olsen, " +
                "Minsky ou Desconhecido.");
        String autor = sc.next();
        if (autor.equalsIgnoreCase("Asimov")) {
            System.out.println("Eu não tenho medo de computadores. Eu tenho medo da ");
            System.out.println("falta de computadores.");
            System.out.println(" -- Isaac Asimov");
        } // foi igual a Asimov
        else if (autor.equalsIgnoreCase("Joyce")) {
            System.out.println("A má reputação que Unix tem é totalmente desmerecida, ");
            System.out.println("criada por pessoas que não entendem, que não foram lá e ");
            System.out.println("tentaram alguma coisa.");
            System.out.println(" -- Jim Joyce, ex-professor de ciência da computação na ");
            System.out.println("    Universidade da Califórnia");
        } // foi igual a Joyce
        else if (autor.equalsIgnoreCase("Knuth")) {
            System.out.println("Uma pessoa que está mais que superficialmente interessada ");
            System.out.println("em computadores deveria conhecer bem linguagem de ");
            System.out.println("máquina, já que isto é parte fundamental de um computador.");
            System.out.println(" --  Donald Knuth");
        } // foi igual a Knuth
        else if (autor.equalsIgnoreCase("Olsen")) {
            System.out.println("Não existe nenhuma razão para que um indivíduo tenha um ");
            System.out.println("computador em sua casa.");
            System.out.println(" -- Ken Olsen (presidente da Digital Equipment ");
            System.out.println("    Corporation), na convenção da Sociedade do Mundo ");
            System.out.println("    Futuro, em 1977.");
        } // foi igual a Olsen
        else if (autor.equalsIgnoreCase("Minsky")) {
            System.out.println("Em três a oito anos nós teremos uma máquina com a ");
            System.out.println("inteligência de um ser humano médio ... a máquina irá ");
            System.out.println("começar a se educar com uma velocidade fantástica ... em ");
            System.out.println("alguns meses ela estará no nível de gênios e alguns meses ");
            System.out.println("depois seus poderes serão incalculáveis. ");
            System.out.println(" -- Marvin Minsky, 1970");
        } // foi igual a Minsky
        else if (autor.equalsIgnoreCase("Desconhecido")) {
            System.out.println("A criação de software é sempre um processo exigente e ");
            System.out.println("esmerado - um exercício em lógica, expressão clara e ");
            System.out.println("atenção quase fanática para detalhes. Isso requer ");
            System.out.println("inteligência, dedicação e uma enorme quantidade de ");
            System.out.println("trabalho duro. Mas, uma certa quantidade de inspiração ");
            System.out.println("imprevisível e frequentemente não repetitível é o que ");
            System.out.println("usualmente faz a diferença entre adequação e excelência.");
            System.out.println(" -- Desconhecido");
        } // foi igual a Desconhecido
        else // nenhum dos nomes conhecidos foi selecionado
        {
            System.out.println("Você escolheu um nome não reconhecido.");
        }
    } // fim do método main
} // fim da classe DemoLogin         
