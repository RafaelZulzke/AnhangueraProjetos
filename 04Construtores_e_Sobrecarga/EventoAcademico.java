
/** 
 * A classe EventoAcademico representa um evento acad�mico, como um congresso ou
 * encontro, que se realiza em determinado per�odo entre datas, local, e com um certo
 * n�mero de participantes.
 */
class EventoAcademico // declara��o da classe 
{

    /**
     * Declara��o dos campos da classe
     */
    private String nomeDoEvento,  localDoEvento;
    private Data in�cioDoEvento,  fimDoEvento;
    private int n�meroDeParticipantes;

    /**
     * O construtor para a classe EventoAcademico, que recebe argumentos para
     * inicializar os campos da classe.
     * @param i o in�cio do evento
     * @param f o in�cio do evento
     * @param n o nome do evento
     * @param l o local do evento
     * @param num o n�mero de participantes do evento
     */
    EventoAcademico(String n, String l, Data i, Data f, int num) {
        nomeDoEvento = n;
        localDoEvento = l;
        // � necess�rio inicializar as inst�ncias internas da classe Data, e n�o somente
        // igual�-las aos valores passados, caso contr�rio elas simplesmente ser�o outras
        // refer�ncias para inst�ncias da classe Data na classe que chamou o construtor.
        in�cioDoEvento = new Data();
        in�cioDoEvento.inicializaData(i.retornaDia(), i.retornaM�s(), i.retornaAno());
        fimDoEvento = new Data();
        fimDoEvento.inicializaData(f.retornaDia(), f.retornaM�s(), f.retornaAno());
        n�meroDeParticipantes = num;
    } // fim do construtor

    /**
     * O m�todo toString n�o recebe argumentos, e retorna uma string contendo os valores
     * dos campos da classe formatados.
     * @return uma string com os valores dos campos formatados como um relat�rio simples
     */
    public String toString() {
        String relat�rio = ""; // no in�cio do m�todo a string � vazia
        relat�rio = relat�rio + "Evento: " + nomeDoEvento + "\n";
        relat�rio = relat�rio + "Local:  " + localDoEvento + "\n";
        relat�rio = relat�rio + "De:     " + in�cioDoEvento.retornaDia() + "/" +
                in�cioDoEvento.retornaM�s() + "/" +
                in�cioDoEvento.retornaAno() + " a " +
                fimDoEvento.retornaDia() + "/" +
                fimDoEvento.retornaM�s() + "/" +
                fimDoEvento.retornaAno() + "\n";
        relat�rio = relat�rio + "Participantes: " + n�meroDeParticipantes + "\n";
        return relat�rio;
    } // fim do m�todo toString
} // fim da classe EventoAcademico 
