
/** 
 * A classe DemoData demonstra usos da classe Data, em especial os efeitos
 * causados pela modifica��o dos modificadores de acesso dos campos.
 * ESTA CLASSE N�O PODE SER COMPILADA POR CAUSA DE ERROS INTENCIONAIS. 
 */
class DemoData // declara��o da classe 
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es
     * de algumas inst�ncias da classe Data, e demonstra como usar a classe e como
     * seus campos n�o podem ser acessados diretamente por ser privados.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos duas inst�ncias da classe Data, usando a palavra-chave new. As
        // inst�ncias ser�o associadas a duas refer�ncias, que permitir�o o acesso aos
        // m�todos das inst�ncias mas n�o a seus campos.
        Data nascimento = new Data();
        Data descobrimentoDoBrasil = new Data();
        // E tr�s vari�veis para receber o dia, m�s e ano para as datas
        byte umDia, umM�s;
        short umAno;
        // Inicializamos "nascimento" com uma data n�o-v�lida
        umDia = 22;
        umM�s = 13;
        umAno = 2000;
        nascimento.inicializaData(umDia, umM�s, umAno); // inicializa os campos da inst�ncia
        nascimento.mostraData();  // imprime 0/0/0
        // Inicializamos "descobrimentoDoBrasil" com uma data v�lida
        umDia = 22;
        umM�s = 4;
        umAno = 1500;
        descobrimentoDoBrasil.inicializaData(umDia, umM�s, umAno); // inicializa os campos
        // da inst�ncia
        descobrimentoDoBrasil.mostraData(); // imprime 22/4/1500
        // As datas s�o iguais ?
        if (nascimento.�Igual(descobrimentoDoBrasil)) {
            System.out.println("As datas s�o iguais !");
        } else {
            System.out.println("As datas s�o diferentes !");
        }

        // Como os campos s�o privados, n�o podemos mais acess�-los nem modific�-los.
        // As duas linhas abaixo causar�o erros de compila��o !
        //nascimento.m�s = 10;
        //descobrimentoDoBrasil.m�s = -1;
        System.out.println(nascimento.retornaM�s());
    }  // fim do m�todo main
} // fim da classe DemoData
