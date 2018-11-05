
/** 
 * A classe MapaDeBiblioteca encapsula os dados de um mapa de uma biblioteca.
 * Esta classe herda todos os campos e m�todos da classe Mapa (consideramos que campos
 * privados s�o herdados, mesmo que n�o possam ser acessados diretamente), e implementa
 * os m�todos declarados na interface ItemDeBiblioteca.
 * ESTA CLASSE N�O PODE SER COMPILADA POR CAUSA DE ERROS INTENCIONAIS.
 */
class MapaDeBiblioteca extends Mapa implements ItemDeBiblioteca, ItemRaroDeBiblioteca {

    /**
     * Declara��o dos campos da classe
     */
    // Este campo que indica o status do empr�stimo do material, e � usado por v�rios
    // m�todos, inclusive os que s�o implementados por causa da interface
    // ItemDeBiblioteca
    private boolean est�Emprestado;
    // Este campo representa a localiza��o do mapa na biblioteca - o campo � constante.
    private final String localiza��o = "Mapoteca";

    /**
     * O construtor para a classe MapaDeBiblioteca, que recebe argumentos para
     * inicializar todos os campos da classe. Este � o construtor "completo". Este
     * construtor passar� para o construtor da classe ancestral a tarefa de inicializar
     * os campos que s�o herdados da classe ancestral.
     * @param tit o t�tulo do mapa
     * @param esc a escala do mapa
     * @param ds uma descri��o sum�ria do mapa
     */
    MapaDeBiblioteca(String tit, float esc, String ds) {
        super(tit, esc, ds); // delega a inicializa��o ao construtor da classe ancestral
        est�Emprestado = false; // se acabou de ser criado, n�o deve estar emprestado ainda
    }

    /**
     * O m�todo empresta deve ser implementado porque foi declarado na interface
     * ItemDeBiblioteca. Este m�todo modifica o valor do campo est�Emprestado para true.
     */
    public void empresta() {
        est�Emprestado = true;
        System.out.print("O mapa " + qualT�tulo() + " foi emprestado, e dever� ser ");
        System.out.println("devolvido em " + m�ximoDeDiasParaEmpr�stimo + " dias.");
    }

    /**
     * O m�todo devolve deve ser implementado porque foi declarado na interface
     * ItemDeBiblioteca. Este m�todo modifica o valor do campo est�Emprestado para false.
     */
    public void devolve() {
        est�Emprestado = false;
    }

    /**
     * O m�todo est�Emprestado deve ser implementado porque foi declarado na interface
     * ItemDeBiblioteca. Este m�todo retorna o valor do campo privado est�Emprestado.
     * @return o valor do campo est�Emprestado
     */
    public boolean est�Emprestado() {
        return est�Emprestado;
    }

    /**
     * O m�todo localiza��o deve ser implementado porque foi declarado na interface
     * ItemDeBiblioteca. Este m�todo retorna o valor do campo privado localiza��o.
     * @return o valor do campo localiza��o
     */
    public String localiza��o() {
        return localiza��o;
    }

    /**
     * O m�todo descri��oSum�ria deve ser implementado porque foi declarado na interface
     * ItemDeBiblioteca.
     * @return uma descri��o sum�ria do mapa
     */
    public String descri��oSum�ria() {
        return qualT�tulo() + " (" + super.descri��oSum�ria() + ")";
    }

    /**
     * O m�todo cuidadosEspeciais deve ser implementado porque foi declarado na interface
     * ItemRaroDeBiblioteca.
     * @return os cuidados especiais a serem tomados com este item
     */
    public String cuidadosEspeciais() {
        return "N�o amassar, dobrar ou tirar c�pias heliogr�ficas.";
    }

    /**
     * O m�todo toString retorna os valores dos campos desta classe formatados em uma
     * string. Este m�todo chama explicitamente o m�todo toString da classe ancestral.
     * @return uma string contendo uma representa��o dos campos desta classe.
     */
    public String toString() {
        // Cria uma string tempor�ria para receber o conte�do dos campos. Esta string
        // receber� primeiramente o resultado do m�todo toString da classe ancestral.
        String tempor�ria = super.toString();
        tempor�ria += "Localiza��o      : " + localiza��o + "\n";
        if (est�Emprestado) {
            tempor�ria += "Este mapa est� emprestado.\n";
        } else {
            tempor�ria += "Este mapa est� dispon�vel para empr�stimo.\n";
        }
        tempor�ria += "Cuidados especiais: " + cuidadosEspeciais();
        return tempor�ria;
    }
} // fim da classe MapaDeBiblioteca
