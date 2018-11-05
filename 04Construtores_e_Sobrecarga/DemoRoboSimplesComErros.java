
/** 
 * A classe DemoRoboSimplesComErros demonstra o uso de inst�ncias da classe 
 * RoboSimples, com alguns erros causados pelos argumentos aos construtores e m�todos
 * sobrecarregados.
 * ESTA CLASSE N�O PODE SER COMPILADA POR CAUSA DE ERROS INTENCIONAIS.
 */
class DemoRoboSimplesComErros // declara��o da classe 
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es de
     * algumas inst�ncias da classe RoboSimples, mas argumentos de tipos diferentes s�o
     * passados para os construtores e m�todos.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Declaramos algumas refer�ncias a inst�ncias da classe RoboSimples e as
        // inicializamos com construtores com argumentos diversos, mas diferentes dos
        // esperados pelos construtores.
        RoboSimples n�mero5 = new RoboSimples("N�mero 5", 'N', '5', (char) 69); // OK
        byte coordX1 = -3;
        byte coordY1 = 8;
        RoboSimples gort = new RoboSimples("Gort", coordX1, coordY1, 'E'); // OK
        float coordX2 = 10.0f;
        float coordY2 = 22.0f;
        RoboSimples rosie = new RoboSimples("Rosie", coordX2, coordY2, 'S'); // Erro
        RoboSimples data = new RoboSimples(true); // Erro
        RoboSimples clonado = new RoboSimples(n�mero5); // Erro
        // Chamamos m�todos para estes rob�s
        byte dist�ncia = 12;
        rosie.move(dist�ncia);
        n�mero5.move(3.2); // Erro
        data.move(false); // Erro
    } // fim do m�todo main
} // fim da classe DemoRoboSimplesComErros
