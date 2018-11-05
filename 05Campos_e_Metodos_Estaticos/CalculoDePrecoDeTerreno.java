
/** 
 * A classe CalculoDePrecoDeTerreno calcula o preço de um terreno baseado
 * em sua área e localização. O cálculo é feito por um método estático da classe, 
 * permitindo a sua reutilização.
 */
class CalculoDePrecoDeTerreno // declaração da classe 
{

    /**
     * O método main permite a execução desta classe. Este método demonstra o uso de um
     * método estático para calcular o preço de um terreno baseado na sua área e
     * localização.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        CalculoDePrecoDeTerreno cpt = new CalculoDePrecoDeTerreno();

        double preço;
        // Cálculo do preço do terreno no lote N1
        System.out.print("O preço do terreno N1 é ");
        preço = cpt.preçoDoTerreno(450, 1); // calculamos o preço e o armazenamos na variável
        System.out.println(preço); // imprimimos a variável
        // Cálculo do preço do terreno no lote Q2
        System.out.print("O preço do terreno Q2 é ");
        preço = cpt.preçoDoTerreno(475, 4);
        System.out.println(preço);
        // Cálculo do preço do terreno no lote F3
        System.out.print("O preço do terreno F3 é ");
        // Chamamos o método e imprimimos o seu resultado
        System.out.println(cpt.preçoDoTerreno(525, 2));
    } // fim do método main

    /**
     * O método preçoDoTerreno calcula o preço de um terreno dependendo da sua área
     * em metros quadrados e sua localização, que é um código entre 1 e 5.
     * @param área a área do terreno em metros quadrados
     * @param localização o código da localização do terreno (1 a 5)
     * @return o preço do terreno
     */
    public double preçoDoTerreno(double área, int localização) {
        double preço = 0; // deve ser inicializada com algum valor !
        if (localização == 1) {
            preço = área * 22.00;
        }
        if (localização == 2) {
            preço = área * 27.00;
        }
        if (localização == 3) {
            preço = área * 29.50;
        }
        if (localização == 4) {
            preço = área * 31.50;
        }
        if (localização == 5) {
            preço = área * 34.50;
        }
        return preço;
    } // fim do método preçoDoTerreno
} // fim da classe CalculoDePrecoDeTerreno
