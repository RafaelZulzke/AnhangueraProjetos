
/** 
 * A classe MapaDeBiblioteca encapsula os dados de um mapa de uma biblioteca.
 * Esta classe herda todos os campos e métodos da classe Mapa (consideramos que campos
 * privados são herdados, mesmo que não possam ser acessados diretamente), e implementa
 * os métodos declarados na interface ItemDeBiblioteca.
 * ESTA CLASSE NÃO PODE SER COMPILADA POR CAUSA DE ERROS INTENCIONAIS.
 */
class MapaDeBiblioteca extends Mapa implements ItemDeBiblioteca, ItemRaroDeBiblioteca {

    /**
     * Declaração dos campos da classe
     */
    // Este campo que indica o status do empréstimo do material, e é usado por vários
    // métodos, inclusive os que são implementados por causa da interface
    // ItemDeBiblioteca
    private boolean estáEmprestado;
    // Este campo representa a localização do mapa na biblioteca - o campo é constante.
    private final String localização = "Mapoteca";

    /**
     * O construtor para a classe MapaDeBiblioteca, que recebe argumentos para
     * inicializar todos os campos da classe. Este é o construtor "completo". Este
     * construtor passará para o construtor da classe ancestral a tarefa de inicializar
     * os campos que são herdados da classe ancestral.
     * @param tit o título do mapa
     * @param esc a escala do mapa
     * @param ds uma descrição sumária do mapa
     */
    MapaDeBiblioteca(String tit, float esc, String ds) {
        super(tit, esc, ds); // delega a inicialização ao construtor da classe ancestral
        estáEmprestado = false; // se acabou de ser criado, não deve estar emprestado ainda
    }

    /**
     * O método empresta deve ser implementado porque foi declarado na interface
     * ItemDeBiblioteca. Este método modifica o valor do campo estáEmprestado para true.
     */
    public void empresta() {
        estáEmprestado = true;
        System.out.print("O mapa " + qualTítulo() + " foi emprestado, e deverá ser ");
        System.out.println("devolvido em " + máximoDeDiasParaEmpréstimo + " dias.");
    }

    /**
     * O método devolve deve ser implementado porque foi declarado na interface
     * ItemDeBiblioteca. Este método modifica o valor do campo estáEmprestado para false.
     */
    public void devolve() {
        estáEmprestado = false;
    }

    /**
     * O método estáEmprestado deve ser implementado porque foi declarado na interface
     * ItemDeBiblioteca. Este método retorna o valor do campo privado estáEmprestado.
     * @return o valor do campo estáEmprestado
     */
    public boolean estáEmprestado() {
        return estáEmprestado;
    }

    /**
     * O método localização deve ser implementado porque foi declarado na interface
     * ItemDeBiblioteca. Este método retorna o valor do campo privado localização.
     * @return o valor do campo localização
     */
    public String localização() {
        return localização;
    }

    /**
     * O método descriçãoSumária deve ser implementado porque foi declarado na interface
     * ItemDeBiblioteca.
     * @return uma descrição sumária do mapa
     */
    public String descriçãoSumária() {
        return qualTítulo() + " (" + super.descriçãoSumária() + ")";
    }

    /**
     * O método cuidadosEspeciais deve ser implementado porque foi declarado na interface
     * ItemRaroDeBiblioteca.
     * @return os cuidados especiais a serem tomados com este item
     */
    public String cuidadosEspeciais() {
        return "Não amassar, dobrar ou tirar cópias heliográficas.";
    }

    /**
     * O método toString retorna os valores dos campos desta classe formatados em uma
     * string. Este método chama explicitamente o método toString da classe ancestral.
     * @return uma string contendo uma representação dos campos desta classe.
     */
    public String toString() {
        // Cria uma string temporária para receber o conteúdo dos campos. Esta string
        // receberá primeiramente o resultado do método toString da classe ancestral.
        String temporária = super.toString();
        temporária += "Localização      : " + localização + "\n";
        if (estáEmprestado) {
            temporária += "Este mapa está emprestado.\n";
        } else {
            temporária += "Este mapa está disponível para empréstimo.\n";
        }
        temporária += "Cuidados especiais: " + cuidadosEspeciais();
        return temporária;
    }
} // fim da classe MapaDeBiblioteca
