
/** 
 * A classe MaisDemoData demonstra mais usos da classe Data. Esta classe
 * demonstra, em especial, o m�todo main que permite a execu��o da classe, e o
 * operador new que permite a cria��o de inst�ncias de classes.
 */
class MaisDemoData // declara��o da classe 
{

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es
     * de algumas inst�ncias da classe Data, e demonstra seu uso.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Declaramos duas refer�ncias a inst�ncias da classe Data, mas n�o as
        // inicializamos.
        Data nascimentoDeGeorgesBizet;
        Data nascimentoDePabloPicasso;
        // Criamos tr�s inst�ncias da classe Data. A instancia��o � feita pelo operador
        // new.
        Data nascimentoDeJohannStrauss = new Data();
        Data JohnSteinbeckGanhaPr�mioNobel = new Data();
        Data nascimentoDeNancyCartwright = new Data();
        // Declaramos tr�s vari�veis auxiliares para uso nas inicializa��es
        byte d, m;
        short a;
        // Inicializamos algumas das inst�ncias com um m�todo da classe Data, usando
        // as tr�s vari�veis auxiliares
        d = 25;
        m = 10;
        a = 1838; // na verdade foi em 1825, o erro � proposital
        nascimentoDeJohannStrauss.inicializaData(d, m, a);
        d = 25;
        m = 10;
        a = 1962;
        JohnSteinbeckGanhaPr�mioNobel.inicializaData(d, m, a);
        // Podemos passar os argumentos diretamente para o m�todo de inicializa��o se
        // pudermos garantir que eles s�o dos tipos esperados
        nascimentoDeNancyCartwright.inicializaData(
                (byte) 25, (byte) 10, (short) 1959);
        // At� agora as refer�ncias nascimentoDeGeorgesBizet e nascimentoDePabloPicasso
        // n�o foram inicializadas, mas podem ser usadas mesmo assim:
        nascimentoDeGeorgesBizet = nascimentoDeJohannStrauss;
        // Vamos ver se realmente funciona ?
        nascimentoDeGeorgesBizet.mostraData(); // imprime 25/10/1838
        // O ano do nascimento de Johann Strauss est� errado ! Vamos corrigi-lo.
        nascimentoDeJohannStrauss.inicializaData(
                (byte) 25, (byte) 10, (short) 1825);
        // Imprimimos agora as duas datas, a que foi modificada...
        nascimentoDeJohannStrauss.mostraData(); // imprime 25/10/1825
        // e a que era uma c�pia (duas refer�ncias para a mesma inst�ncia)
        nascimentoDeGeorgesBizet.mostraData();  // imprime 25/10/1825 !!!
        // Estas duas datas s�o iguais ?
        System.out.println(JohnSteinbeckGanhaPr�mioNobel.�Igual(nascimentoDeNancyCartwright)); // false
        // Podemos comparar os anos das datas.
        short ano1, ano2;
        ano1 = JohnSteinbeckGanhaPr�mioNobel.retornaAno();
        ano2 = nascimentoDeNancyCartwright.retornaAno();
        if (ano1 > ano2) {
            System.out.println("John Steinbeck ganhou o pr�mio Nobel de literatura depois");
            System.out.println(" do nascimento de Nancy Cartwright.");
        }
    } // fim do m�todo main
} // fim da classe MaisDemoData

// Datas obtidas em http://www.scopesys.com/today/
