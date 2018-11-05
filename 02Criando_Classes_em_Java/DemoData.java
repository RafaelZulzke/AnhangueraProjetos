
/** 
 * A classe DemoData demonstra usos da classe Data, em especial os efeitos
 * causados pela modificação dos modificadores de acesso dos campos.
 * ESTA CLASSE NÃO PODE SER COMPILADA POR CAUSA DE ERROS INTENCIONAIS. 
 */
class DemoData // declaração da classe 
{

    /**
     * O método main permite a execução desta classe. Este método contém declarações
     * de algumas instâncias da classe Data, e demonstra como usar a classe e como
     * seus campos não podem ser acessados diretamente por ser privados.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Criamos duas instâncias da classe Data, usando a palavra-chave new. As
        // instâncias serão associadas a duas referências, que permitirão o acesso aos
        // métodos das instâncias mas não a seus campos.
        Data nascimento = new Data();
        Data descobrimentoDoBrasil = new Data();
        // E três variáveis para receber o dia, mês e ano para as datas
        byte umDia, umMês;
        short umAno;
        // Inicializamos "nascimento" com uma data não-válida
        umDia = 22;
        umMês = 13;
        umAno = 2000;
        nascimento.inicializaData(umDia, umMês, umAno); // inicializa os campos da instância
        nascimento.mostraData();  // imprime 0/0/0
        // Inicializamos "descobrimentoDoBrasil" com uma data válida
        umDia = 22;
        umMês = 4;
        umAno = 1500;
        descobrimentoDoBrasil.inicializaData(umDia, umMês, umAno); // inicializa os campos
        // da instância
        descobrimentoDoBrasil.mostraData(); // imprime 22/4/1500
        // As datas são iguais ?
        if (nascimento.éIgual(descobrimentoDoBrasil)) {
            System.out.println("As datas são iguais !");
        } else {
            System.out.println("As datas são diferentes !");
        }

        // Como os campos são privados, não podemos mais acessá-los nem modificá-los.
        // As duas linhas abaixo causarão erros de compilação !
        //nascimento.mês = 10;
        //descobrimentoDoBrasil.mês = -1;
        System.out.println(nascimento.retornaMês());
    }  // fim do método main
} // fim da classe DemoData
