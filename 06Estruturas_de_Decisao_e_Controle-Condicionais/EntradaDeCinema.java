
import java.util.Scanner;


/** 
 * A classe EntradaDeCinema calcula o preço de uma entrada de cinema usando um
 * método estático. 
 */
class EntradaDeCinema // declaração da classe 
{

    /**
     * O método main permite a execução desta classe. Este método pergunta alguns
     * dados ao usuário e os passa como argumentos para um método que calcula e retorna
     * o preço a ser pago por uma entrada de cinema.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {

        Scanner sc = new Scanner(System.in);
        // Algumas variáveis que servirão para cálculo do preço da entrada
        short idade;
        byte diaDaSemana;
        // Perguntamos os dados ao operador do programa (usuário)
        System.out.print("Entre a idade do comprador:");
        idade = sc.nextShort();
        System.out.print("Entre o dia da semana (1=domingo, 2=segunda,..., 7=sábado):");
        diaDaSemana = sc.nextByte();
        // Chama o método para calcular o preço
        float preço = calculaPreço(idade, diaDaSemana);
        // Imprime o resultado
        System.out.println("O preço da entrada é " + preço + " reais");
    } // fim do método main  

    /**
     * O método calculaPreço calcula o preço da entrada de cinema usando o seguinte
     * algoritmo:
     * - Se a pessoa tem menos de 14 anos ou mais de 65 anos, paga meia entrada
     *   (4 reais), caso contrário paga oito reais
     * - Se o dia da semana for terça, quarta ou quinta (3, 4 ou 5), todos podem pagar
     *   meia entrada, independente da idade.
     * @param idade a idade do comprador
     * @param diaDaSemana o dia da semana, entre 1 (domingo) e 7 (sábado).
     * @return o preço da entrada do cinema.
     */
    static float calculaPreço(short idade, byte diaDaSemana) {
        float preço; // armazenará o preço calculado
        // Se o dia da semana é entre 3 e 5, todo mundo paga meia
        if ((diaDaSemana >= 3) && (diaDaSemana <= 5)) {
            preço = 4;
        } else // então é outro dia da semana, vamos ver de acordo com a idade
        {
            if ((idade <= 14) || (idade >= 65)) {
                preço = 4;
            } else {
                preço = 8;
            }
        } // fim do else do dia da semana
        return preço;
    } // fim do método calculaPreço
} // fim da classe EntradaDeCinema 
