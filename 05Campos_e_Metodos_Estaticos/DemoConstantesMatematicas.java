
/** 
 * A classe DemoConstantesMatematicas demonstra usos da classe 
 * ConstantesMatematicas, em especial o acesso aos campos est�ticos da classe.
 */
class DemoConstantesMatematicas // declara��o da classe 
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo demonstra o acesso a
     * campos est�ticos da classe ConstantesMatematicas, atrav�s de inst�ncias e atrav�s
     * do acesso direto.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos duas inst�ncias da classe ConstantesMatematicas. Como os campos desta
        // classe s�o est�ticos, os valores s�o id�nticos independentemente das inst�ncias.
        ConstantesMatematicas const1 = new ConstantesMatematicas();
        ConstantesMatematicas const2 = new ConstantesMatematicas();
        // Verificamos a igualdade...
        System.out.println(const1.raizDe2 == const2.raizDe2); // imprime true
        System.out.println(const1.raizDe3 == const2.raizDe3); // imprime true
        System.out.println(const1.raizDe5 == const2.raizDe5); // imprime true
        System.out.println(const1.raizDe6 == const2.raizDe6); // imprime true
        // � muito mais pr�tico acessar os campos diretamente a partir da classe:
        double raizDe10 = ConstantesMatematicas.raizDe2 *
                ConstantesMatematicas.raizDe5;
        System.out.println("A raiz quadrada de 10 � " + raizDe10);
    } // fim do m�todo main
} // fim da classe DemoConstantesMatematicas
