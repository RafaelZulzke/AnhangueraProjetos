
/** 
 * A classe MaisDemoData demonstra mais usos da classe Data. Esta classe
 * demonstra, em especial, o método main que permite a execução da classe, e o
 * operador new que permite a criação de instâncias de classes.
 */
class MaisDemoData // declaração da classe 
{

    /**
     * O método main permite a execução desta classe. Este método contém declarações
     * de algumas instâncias da classe Data, e demonstra seu uso.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Declaramos duas referências a instâncias da classe Data, mas não as
        // inicializamos.
        Data nascimentoDeGeorgesBizet;
        Data nascimentoDePabloPicasso;
        // Criamos três instâncias da classe Data. A instanciação é feita pelo operador
        // new.
        Data nascimentoDeJohannStrauss = new Data();
        Data JohnSteinbeckGanhaPrêmioNobel = new Data();
        Data nascimentoDeNancyCartwright = new Data();
        // Declaramos três variáveis auxiliares para uso nas inicializações
        byte d, m;
        short a;
        // Inicializamos algumas das instâncias com um método da classe Data, usando
        // as três variáveis auxiliares
        d = 25;
        m = 10;
        a = 1838; // na verdade foi em 1825, o erro é proposital
        nascimentoDeJohannStrauss.inicializaData(d, m, a);
        d = 25;
        m = 10;
        a = 1962;
        JohnSteinbeckGanhaPrêmioNobel.inicializaData(d, m, a);
        // Podemos passar os argumentos diretamente para o método de inicialização se
        // pudermos garantir que eles são dos tipos esperados
        nascimentoDeNancyCartwright.inicializaData(
                (byte) 25, (byte) 10, (short) 1959);
        // Até agora as referências nascimentoDeGeorgesBizet e nascimentoDePabloPicasso
        // não foram inicializadas, mas podem ser usadas mesmo assim:
        nascimentoDeGeorgesBizet = nascimentoDeJohannStrauss;
        // Vamos ver se realmente funciona ?
        nascimentoDeGeorgesBizet.mostraData(); // imprime 25/10/1838
        // O ano do nascimento de Johann Strauss está errado ! Vamos corrigi-lo.
        nascimentoDeJohannStrauss.inicializaData(
                (byte) 25, (byte) 10, (short) 1825);
        // Imprimimos agora as duas datas, a que foi modificada...
        nascimentoDeJohannStrauss.mostraData(); // imprime 25/10/1825
        // e a que era uma cópia (duas referências para a mesma instância)
        nascimentoDeGeorgesBizet.mostraData();  // imprime 25/10/1825 !!!
        // Estas duas datas são iguais ?
        System.out.println(JohnSteinbeckGanhaPrêmioNobel.éIgual(nascimentoDeNancyCartwright)); // false
        // Podemos comparar os anos das datas.
        short ano1, ano2;
        ano1 = JohnSteinbeckGanhaPrêmioNobel.retornaAno();
        ano2 = nascimentoDeNancyCartwright.retornaAno();
        if (ano1 > ano2) {
            System.out.println("John Steinbeck ganhou o prêmio Nobel de literatura depois");
            System.out.println(" do nascimento de Nancy Cartwright.");
        }
    } // fim do método main
} // fim da classe MaisDemoData

// Datas obtidas em http://www.scopesys.com/today/
