
/** 
 * A classe EmprestimoBancarioComCast calcula o valor de empr�stimos que podem 
 * ser dados a pessoas (inst�ncias das classes Pessoa, Funcionario e 
 * ChefeDeDepartamento) por um banco popular. Esta classe � similar � classe 
 * EmprestimoBancario, mas o m�todo calculaEmpr�stimo unifica o c�lculo do empr�stimo
 * que pode ser feito verificando a classe da inst�ncia passada como argumento e 
 * fazendo o cast (convers�o expl�cita) se necess�rio.
 */
class EmprestimoBancarioComCastJE {

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
        Pessoa f1 = new Funcionario("Henri Poincar�", 19283712,
                new Data((byte) 12, (byte) 7, (short) 1897),
                new Data((byte) 28, (byte) 1, (short) 1918),
                2500.0f);
        Pessoa f2 = new Funcionario("Paul Dirac", 98736812,
                new Data((byte) 20, (byte) 1, (short) 1885),
                new Data((byte) 31, (byte) 3, (short) 1909),
                3200.0f);
        Pessoa f3 = new Funcionario("Wolfgang Pauli", 33886620,
                new Data((byte) 14, (byte) 9, (short) 1902),
                new Data((byte) 16, (byte) 11, (short) 1930),
                3600.0f);
        // Criamos uma inst�ncia da classe ChefeDeDepartamento
        Pessoa c1 = new ChefeDeDepartamento("Edwin Hubble", 4259782,
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
     * O m�todo calculaEmpr�stimo calcula o empr�stimo que pode ser dado para uma
     * pessoa (inst�ncia da classe Funcionario e suas descendentes). O empr�stimo ser�
     * calculado de forma diferenciada para as inst�ncias das classes Funcionario e
     * ChefeDeDepartamento.
     * @param f uma inst�ncia de qualquer classe que herde da classe Funcionario
     */
    public static float calculaEmpr�stimo(Pessoa p) {
        float empr�stimo = 1000.f; // inicialmente consideramos o empr�stimo zero
        // Primeiro verificamos se a inst�ncia p � uma inst�ncia da classe
        // ChefeDeDepartamento. Se for, calculamos o empr�stimo como sendo quatro vezes o
        // sal�rio recebido.
        if (p instanceof ChefeDeDepartamento) {
            // N�o podemos acessar o m�todo qualSal�rio da inst�ncia p pois esta � uma
            // inst�ncia da classe Pessoa. Devemos criar uma inst�ncia tempor�ria da classe
            // ChefeDeDepartamento a partir de p e us�-la para chamar o m�todo qualSal�rio.
            // Notem que n�o � necess�rio inicializar a inst�ncia com a palavra-chave new,
            // ela ser� somente outra refer�ncia a p.
            ChefeDeDepartamento tempor�rio = (ChefeDeDepartamento) p;
            empr�stimo = 4.0f * tempor�rio.qualSal�rio();
        } // Se a inst�ncia p n�o for da classe ChefeDeDepartamento, verificaremos se ela �
        // inst�ncia da classe Funcionario e, se for, calculamos o empr�stimo como sendo
        // duas vezes o sal�rio recebido.
        else if (p instanceof Funcionario) {
            // N�o podemos acessar o m�todo qualSal�rio da inst�ncia p pois esta � uma
            // inst�ncia da classe Pessoa. Devemos criar uma inst�ncia tempor�ria da classe
            // Funcionario a partir de p e us�-la para chamar o m�todo qualSal�rio.
            Funcionario tempor�rio = (Funcionario) p;
            empr�stimo = 2.0f * tempor�rio.qualSal�rio();
        }
        return empr�stimo;
    } // fim do m�todo calculaEmpr�stimo
} // fim da classe EmprestimoBancarioComCast
