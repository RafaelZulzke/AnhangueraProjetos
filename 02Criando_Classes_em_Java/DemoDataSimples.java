
/** 
 * A classe DemoDataSimples demonstra usos da classe DataSimples, em especial os 
 * problemas que podem ocorrer quando os campos de uma classe podem ser acessados 
 * diretamente.
 */
class DemoDataSimples // declara��o da classe 
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es
     * de algumas inst�ncias da classe DataSimples, e demonstra como seus campos podem
     * ser acessados diretamente pois estes s�o p�blicos.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos duas inst�ncias da classe DataSimples, usando a palavra-chave new. As
        // inst�ncias ser�o associadas a duas refer�ncias, que permitir�o o acesso aos
        // campos e m�todos das inst�ncias.

        DataSimples hoje = new DataSimples();
        DataSimples independ�nciaDoBrasil = new DataSimples();

        // E tr�s vari�veis para receber o dia, m�s e ano para as datas
        byte umDia, umM�s;
        short umAno;
        // Inicializamos "hoje" com uma data n�o-v�lida
        umDia = 40;
        umM�s = 1;
        umAno = 2001;
        hoje.inicializaDataSimples(umDia, umM�s, umAno); // inicializa os campos da inst�ncia
        hoje.mostraDataSimples();  // imprime 0/0/0
        // Inicializamos "independ�nciaDoBrasil" com uma data v�lida
        umDia = 7;
        umM�s = 9;
        umAno = 1822;
        independ�nciaDoBrasil.inicializaDataSimples(umDia, umM�s, umAno);
        independ�nciaDoBrasil.mostraDataSimples(); // imprime 7/9/1822
        // Vamos testar o m�todo �Igual:
        if (hoje.�Igual(independ�nciaDoBrasil)) {
            System.out.println("As datas s�o iguais !");
        } else {
            System.out.println("As datas s�o diferentes !");
        }
        // O problema: podemos facilmente "invalidar" datas v�lidas acessando os seus
        // campos diretamente:
        hoje.dia = 0;
        hoje.m�s = 1;
        hoje.ano = 2001;
        hoje.mostraDataSimples(); // imprime 0/1/2001 - � v�lida ou n�o ?
        independ�nciaDoBrasil.m�s = 13;
        independ�nciaDoBrasil.mostraDataSimples(); // imprime 7/13/1822 - � v�lida ou n�o ?
    }  // fim do m�todo main
} // fim da classe DemoDataSimples
