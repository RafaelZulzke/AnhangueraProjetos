
/** 
 * A classe DemoDataSimples demonstra usos da classe DataSimples, em especial os 
 * problemas que podem ocorrer quando os campos de uma classe podem ser acessados 
 * diretamente.
 */
class DemoDataSimples // declaração da classe 
{

    /**
     * O método main permite a execução desta classe. Este método contém declarações
     * de algumas instâncias da classe DataSimples, e demonstra como seus campos podem
     * ser acessados diretamente pois estes são públicos.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos duas instâncias da classe DataSimples, usando a palavra-chave new. As
        // instâncias serão associadas a duas referências, que permitirão o acesso aos
        // campos e métodos das instâncias.

        DataSimples hoje = new DataSimples();
        DataSimples independênciaDoBrasil = new DataSimples();

        // E três variáveis para receber o dia, mês e ano para as datas
        byte umDia, umMês;
        short umAno;
        // Inicializamos "hoje" com uma data não-válida
        umDia = 40;
        umMês = 1;
        umAno = 2001;
        hoje.inicializaDataSimples(umDia, umMês, umAno); // inicializa os campos da instância
        hoje.mostraDataSimples();  // imprime 0/0/0
        // Inicializamos "independênciaDoBrasil" com uma data válida
        umDia = 7;
        umMês = 9;
        umAno = 1822;
        independênciaDoBrasil.inicializaDataSimples(umDia, umMês, umAno);
        independênciaDoBrasil.mostraDataSimples(); // imprime 7/9/1822
        // Vamos testar o método éIgual:
        if (hoje.éIgual(independênciaDoBrasil)) {
            System.out.println("As datas são iguais !");
        } else {
            System.out.println("As datas são diferentes !");
        }
        // O problema: podemos facilmente "invalidar" datas válidas acessando os seus
        // campos diretamente:
        hoje.dia = 0;
        hoje.mês = 1;
        hoje.ano = 2001;
        hoje.mostraDataSimples(); // imprime 0/1/2001 - é válida ou não ?
        independênciaDoBrasil.mês = 13;
        independênciaDoBrasil.mostraDataSimples(); // imprime 7/13/1822 - é válida ou não ?
    }  // fim do método main
} // fim da classe DemoDataSimples
