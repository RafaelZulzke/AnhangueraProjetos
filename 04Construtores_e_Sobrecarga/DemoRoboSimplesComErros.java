
/** 
 * A classe DemoRoboSimplesComErros demonstra o uso de instâncias da classe 
 * RoboSimples, com alguns erros causados pelos argumentos aos construtores e métodos
 * sobrecarregados.
 * ESTA CLASSE NÃO PODE SER COMPILADA POR CAUSA DE ERROS INTENCIONAIS.
 */
class DemoRoboSimplesComErros // declaração da classe 
{

    /**
     * O método main permite a execução desta classe. Este método contém declarações de
     * algumas instâncias da classe RoboSimples, mas argumentos de tipos diferentes são
     * passados para os construtores e métodos.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Declaramos algumas referências a instâncias da classe RoboSimples e as
        // inicializamos com construtores com argumentos diversos, mas diferentes dos
        // esperados pelos construtores.
        RoboSimples número5 = new RoboSimples("Número 5", 'N', '5', (char) 69); // OK
        byte coordX1 = -3;
        byte coordY1 = 8;
        RoboSimples gort = new RoboSimples("Gort", coordX1, coordY1, 'E'); // OK
        float coordX2 = 10.0f;
        float coordY2 = 22.0f;
        RoboSimples rosie = new RoboSimples("Rosie", coordX2, coordY2, 'S'); // Erro
        RoboSimples data = new RoboSimples(true); // Erro
        RoboSimples clonado = new RoboSimples(número5); // Erro
        // Chamamos métodos para estes robôs
        byte distância = 12;
        rosie.move(distância);
        número5.move(3.2); // Erro
        data.move(false); // Erro
    } // fim do método main
} // fim da classe DemoRoboSimplesComErros
