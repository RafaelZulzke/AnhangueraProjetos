
/** 
 * A classe EmprestimoBancario calcula o valor de empr�stimos que podem ser dados
 * a pessoas (inst�ncias das classes Pessoa, Funcionario e ChefeDeDepartamento) por um
 * banco popular. Empr�stimos a pessoas que n�o s�o funcion�rias s�o de valor fixo, 
 * enquanto empr�stimos dados a funcion�rios e chefes de departamento s�o baseados
 * nos sal�rios que estes recebem.
 * Esta classe demonstra polimorfismo de classes usando inst�ncias das classes 
 * herdeiras da classe Pessoa, e sobrecarga, implementando o mesmo m�todo mas mais
 * especializado para inst�ncias de classes herdeiras da classe Funcionario.
 */
class EmprestimoBancario {

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es de
     * algumas inst�ncias das classes Pessoa, Funcionario e ChefeDeDepartamento, e as
     * usa para calcular o valor de um empr�stimo banc�rio a ser feito para cada uma
     * das pessoas representadas pela inst�ncia.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos uma inst�ncia da classe Pessoa
        Pessoa p1 = new Pessoa("Kurt G�del", 10973213,
                new Data((byte) 23, (byte) 12, (short) 1904));
        // Criamos tr�s inst�ncias da classe Funcionario
        Funcionario f1 = new Funcionario("Henri Poincar�", 19283712,
                new Data((byte) 12, (byte) 7, (short) 1897),
                new Data((byte) 28, (byte) 1, (short) 1918),
                2500.0f);
        Funcionario f2 = new Funcionario("Paul Dirac", 98736812,
                new Data((byte) 20, (byte) 1, (short) 1885),
                new Data((byte) 31, (byte) 3, (short) 1909),
                3200.0f);
        Funcionario f3 = new Funcionario("Wolfgang Pauli", 33886620,
                new Data((byte) 14, (byte) 9, (short) 1902),
                new Data((byte) 16, (byte) 11, (short) 1930),
                3600.0f);
        // Criamos uma inst�ncia da classe ChefeDeDepartamento
        ChefeDeDepartamento c1 = new ChefeDeDepartamento("Edwin Hubble", 4259782,
                new Data((byte) 20, (byte) 1, (short) 1875),
                new Data((byte) 20, (byte) 7, (short) 1899),
                4100.0f,
                "Laborat�rio de Astrof�sica",
                new Data((byte) 20, (byte) 7, (short) 1899));
        // Calculamos os empr�stimos que podem ser feitos a cada pessoa
        System.out.println(calculaEmpr�stimo(p1));
        System.out.println(calculaEmpr�stimo(f1));
        System.out.println(calculaEmpr�stimo(f2));
        System.out.println(calculaEmpr�stimo(f3));
        System.out.println(calculaEmpr�stimo(c1));
    } // fim do m�todo main

    /**
     * O m�todo calculaEmpr�stimo calcula o empr�stimo que pode ser dado para uma pessoa
     * (inst�ncia da classe Pessoa ou de suas descendentes, mas que n�o sejam inst�ncias
     * da classe Funcionario ou suas descendentes). Veja tamb�m o m�todo sobrecarregado
     * abaixo.
     * @param p uma inst�ncia de qualquer classe que herde da classe Pessoa
     */
    public static float calculaEmpr�stimo(Pessoa p) {
        return 1000.0f; // qualquer pessoa pode ter um empr�stimo de 1000 reais.
    } // fim do m�todo calculaEmpr�stimo 

    /**
     * O m�todo calculaEmpr�stimo calcula o empr�stimo que pode ser dado para uma
     * pessoa (inst�ncia da classe Funcionario e suas descendentes). O empr�stimo ser�
     * calculado de forma diferenciada para as inst�ncias das classes Funcionario e
     * ChefeDeDepartamento.
     * @param f uma inst�ncia de qualquer classe que herde da classe Funcionario
     */
    public static float calculaEmpr�stimo(Funcionario f) {
        float empr�stimo = 0f; // inicialmente consideramos o empr�stimo zero
        // Primeiro verificamos se a inst�ncia f � uma inst�ncia da classe
        // ChefeDeDepartamento. Se for, calculamos o empr�stimo como sendo quatro vezes o
        // sal�rio recebido.
        if (f instanceof ChefeDeDepartamento) {
            empr�stimo = 4.0f * f.qualSal�rio();
        } // Se a inst�ncia f n�o for da classe ChefeDeDepartamento, verificaremos se ela �
        // inst�ncia da classe Funcionario e, se for, calculamos o empr�stimo como sendo
        // duas vezes o sal�rio recebido.
        else if (f instanceof Funcionario) {
            empr�stimo = 2.0f * f.qualSal�rio();
        }
        return empr�stimo;
    } // fim do m�todo calculaEmpr�stimo
} // fim da classe EmprestimoBancario
