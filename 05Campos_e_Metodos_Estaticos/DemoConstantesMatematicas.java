
/** 
 * A classe DemoConstantesMatematicas demonstra usos da classe 
 * ConstantesMatematicas, em especial o acesso aos campos estáticos da classe.
 */
class DemoConstantesMatematicas // declaração da classe 
{

    /**
     * O método main permite a execução desta classe. Este método demonstra o acesso a
     * campos estáticos da classe ConstantesMatematicas, através de instâncias e através
     * do acesso direto.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos duas instâncias da classe ConstantesMatematicas. Como os campos desta
        // classe são estáticos, os valores são idênticos independentemente das instâncias.
        ConstantesMatematicas const1 = new ConstantesMatematicas();
        ConstantesMatematicas const2 = new ConstantesMatematicas();
        // Verificamos a igualdade...
        System.out.println(const1.raizDe2 == const2.raizDe2); // imprime true
        System.out.println(const1.raizDe3 == const2.raizDe3); // imprime true
        System.out.println(const1.raizDe5 == const2.raizDe5); // imprime true
        System.out.println(const1.raizDe6 == const2.raizDe6); // imprime true
        // É muito mais prático acessar os campos diretamente a partir da classe:
        double raizDe10 = ConstantesMatematicas.raizDe2 *
                ConstantesMatematicas.raizDe5;
        System.out.println("A raiz quadrada de 10 é " + raizDe10);
    } // fim do método main
} // fim da classe DemoConstantesMatematicas
