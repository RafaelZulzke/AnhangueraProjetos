
import java.util.Scanner;


/** 
 * A classe EntradaDeCinema calcula o pre�o de uma entrada de cinema usando um
 * m�todo est�tico. 
 */
class EntradaDeCinema // declara��o da classe 
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo pergunta alguns
     * dados ao usu�rio e os passa como argumentos para um m�todo que calcula e retorna
     * o pre�o a ser pago por uma entrada de cinema.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {

        Scanner sc = new Scanner(System.in);
        // Algumas vari�veis que servir�o para c�lculo do pre�o da entrada
        short idade;
        byte diaDaSemana;
        // Perguntamos os dados ao operador do programa (usu�rio)
        System.out.print("Entre a idade do comprador:");
        idade = sc.nextShort();
        System.out.print("Entre o dia da semana (1=domingo, 2=segunda,..., 7=s�bado):");
        diaDaSemana = sc.nextByte();
        // Chama o m�todo para calcular o pre�o
        float pre�o = calculaPre�o(idade, diaDaSemana);
        // Imprime o resultado
        System.out.println("O pre�o da entrada � " + pre�o + " reais");
    } // fim do m�todo main  

    /**
     * O m�todo calculaPre�o calcula o pre�o da entrada de cinema usando o seguinte
     * algoritmo:
     * - Se a pessoa tem menos de 14 anos ou mais de 65 anos, paga meia entrada
     *   (4 reais), caso contr�rio paga oito reais
     * - Se o dia da semana for ter�a, quarta ou quinta (3, 4 ou 5), todos podem pagar
     *   meia entrada, independente da idade.
     * @param idade a idade do comprador
     * @param diaDaSemana o dia da semana, entre 1 (domingo) e 7 (s�bado).
     * @return o pre�o da entrada do cinema.
     */
    static float calculaPre�o(short idade, byte diaDaSemana) {
        float pre�o; // armazenar� o pre�o calculado
        // Se o dia da semana � entre 3 e 5, todo mundo paga meia
        if ((diaDaSemana >= 3) && (diaDaSemana <= 5)) {
            pre�o = 4;
        } else // ent�o � outro dia da semana, vamos ver de acordo com a idade
        {
            if ((idade <= 14) || (idade >= 65)) {
                pre�o = 4;
            } else {
                pre�o = 8;
            }
        } // fim do else do dia da semana
        return pre�o;
    } // fim do m�todo calculaPre�o
} // fim da classe EntradaDeCinema 
