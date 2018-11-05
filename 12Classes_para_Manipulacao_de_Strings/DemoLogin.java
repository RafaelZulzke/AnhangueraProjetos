
import java.util.Scanner;


/**
 * A classe DemoLogin demonstra o uso de uma inst�ncia da classe Login. Esta
 * classe pede que o usu�rio se identifique com o nome e senha, e caso estes sejam
 * iguais aos cadastrados, mostramos uma frase de um autor (tamb�m decidido pelo
 * usu�rio).
 */
class DemoLogin // declara��o da classe
{

    static Scanner sc = new Scanner(System.in);

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m a declara��o
     * de uma inst�ncia da classe Login, e a usa para executar parte do c�digo somente
     * se o usu�rio entrar corretamente o nome e a senha.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma inst�ncia da classe Login, contendo o nome e senha do usu�rio
        // autorizado.
        Login autorizado = new Login("Auberon", "Titania");
        // Perguntamos ao usu�rio qual � o nome e senha.
        String nome, senha;
        System.out.println(
                "Para prosseguir � necess�rio um nome " +
                "e senha.");
        System.out.print("Nome :");
        nome = sc.next();
        System.out.print("Senha:");
        senha = sc.next();
        // Verificamos se o nome e senha s�o iguais aos passados para o construtor da
        // classe Login.
        if (!autorizado.verifica(nome, senha)) {
            System.out.println("O nome e/ou senha " +
                    "fornecidos s�o diferentes " +
                    "dos autorizados.");
            System.exit(1);
        }
        // Se chegamos a este ponto, o nome e senha foram reconhecidos. Podemos prosseguir
        // com a intera��o com o usu�rio. Mostramos uma mensagem pedindo que o usu�rio
        // entre com o nome do autor da mensagem.
        System.out.println("Entre o nome do autor da frase. " +
                "Op��es v�lidas s�o:");
        System.out.println("Asimov, Joyce, Knuth, Olsen, " +
                "Minsky ou Desconhecido.");
        String autor = sc.next();
        if (autor.equalsIgnoreCase("Asimov")) {
            System.out.println("Eu n�o tenho medo de computadores. Eu tenho medo da ");
            System.out.println("falta de computadores.");
            System.out.println(" -- Isaac Asimov");
        } // foi igual a Asimov
        else if (autor.equalsIgnoreCase("Joyce")) {
            System.out.println("A m� reputa��o que Unix tem � totalmente desmerecida, ");
            System.out.println("criada por pessoas que n�o entendem, que n�o foram l� e ");
            System.out.println("tentaram alguma coisa.");
            System.out.println(" -- Jim Joyce, ex-professor de ci�ncia da computa��o na ");
            System.out.println("    Universidade da Calif�rnia");
        } // foi igual a Joyce
        else if (autor.equalsIgnoreCase("Knuth")) {
            System.out.println("Uma pessoa que est� mais que superficialmente interessada ");
            System.out.println("em computadores deveria conhecer bem linguagem de ");
            System.out.println("m�quina, j� que isto � parte fundamental de um computador.");
            System.out.println(" --  Donald Knuth");
        } // foi igual a Knuth
        else if (autor.equalsIgnoreCase("Olsen")) {
            System.out.println("N�o existe nenhuma raz�o para que um indiv�duo tenha um ");
            System.out.println("computador em sua casa.");
            System.out.println(" -- Ken Olsen (presidente da Digital Equipment ");
            System.out.println("    Corporation), na conven��o da Sociedade do Mundo ");
            System.out.println("    Futuro, em 1977.");
        } // foi igual a Olsen
        else if (autor.equalsIgnoreCase("Minsky")) {
            System.out.println("Em tr�s a oito anos n�s teremos uma m�quina com a ");
            System.out.println("intelig�ncia de um ser humano m�dio ... a m�quina ir� ");
            System.out.println("come�ar a se educar com uma velocidade fant�stica ... em ");
            System.out.println("alguns meses ela estar� no n�vel de g�nios e alguns meses ");
            System.out.println("depois seus poderes ser�o incalcul�veis. ");
            System.out.println(" -- Marvin Minsky, 1970");
        } // foi igual a Minsky
        else if (autor.equalsIgnoreCase("Desconhecido")) {
            System.out.println("A cria��o de software � sempre um processo exigente e ");
            System.out.println("esmerado - um exerc�cio em l�gica, express�o clara e ");
            System.out.println("aten��o quase fan�tica para detalhes. Isso requer ");
            System.out.println("intelig�ncia, dedica��o e uma enorme quantidade de ");
            System.out.println("trabalho duro. Mas, uma certa quantidade de inspira��o ");
            System.out.println("imprevis�vel e frequentemente n�o repetit�vel � o que ");
            System.out.println("usualmente faz a diferen�a entre adequa��o e excel�ncia.");
            System.out.println(" -- Desconhecido");
        } // foi igual a Desconhecido
        else // nenhum dos nomes conhecidos foi selecionado
        {
            System.out.println("Voc� escolheu um nome n�o reconhecido.");
        }
    } // fim do m�todo main
} // fim da classe DemoLogin         
