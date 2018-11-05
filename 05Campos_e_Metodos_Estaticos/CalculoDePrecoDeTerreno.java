
/** 
 * A classe CalculoDePrecoDeTerreno calcula o pre�o de um terreno baseado
 * em sua �rea e localiza��o. O c�lculo � feito por um m�todo est�tico da classe, 
 * permitindo a sua reutiliza��o.
 */
class CalculoDePrecoDeTerreno // declara��o da classe 
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo demonstra o uso de um
     * m�todo est�tico para calcular o pre�o de um terreno baseado na sua �rea e
     * localiza��o.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        CalculoDePrecoDeTerreno cpt = new CalculoDePrecoDeTerreno();

        double pre�o;
        // C�lculo do pre�o do terreno no lote N1
        System.out.print("O pre�o do terreno N1 � ");
        pre�o = cpt.pre�oDoTerreno(450, 1); // calculamos o pre�o e o armazenamos na vari�vel
        System.out.println(pre�o); // imprimimos a vari�vel
        // C�lculo do pre�o do terreno no lote Q2
        System.out.print("O pre�o do terreno Q2 � ");
        pre�o = cpt.pre�oDoTerreno(475, 4);
        System.out.println(pre�o);
        // C�lculo do pre�o do terreno no lote F3
        System.out.print("O pre�o do terreno F3 � ");
        // Chamamos o m�todo e imprimimos o seu resultado
        System.out.println(cpt.pre�oDoTerreno(525, 2));
    } // fim do m�todo main

    /**
     * O m�todo pre�oDoTerreno calcula o pre�o de um terreno dependendo da sua �rea
     * em metros quadrados e sua localiza��o, que � um c�digo entre 1 e 5.
     * @param �rea a �rea do terreno em metros quadrados
     * @param localiza��o o c�digo da localiza��o do terreno (1 a 5)
     * @return o pre�o do terreno
     */
    public double pre�oDoTerreno(double �rea, int localiza��o) {
        double pre�o = 0; // deve ser inicializada com algum valor !
        if (localiza��o == 1) {
            pre�o = �rea * 22.00;
        }
        if (localiza��o == 2) {
            pre�o = �rea * 27.00;
        }
        if (localiza��o == 3) {
            pre�o = �rea * 29.50;
        }
        if (localiza��o == 4) {
            pre�o = �rea * 31.50;
        }
        if (localiza��o == 5) {
            pre�o = �rea * 34.50;
        }
        return pre�o;
    } // fim do m�todo pre�oDoTerreno
} // fim da classe CalculoDePrecoDeTerreno
