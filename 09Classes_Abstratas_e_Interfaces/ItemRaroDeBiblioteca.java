
/** 
 * A interface ItemRaroDeBiblioteca declara os campos e métodos que itens raros
 * em uma biblioteca devem ter. 
 */
interface ItemRaroDeBiblioteca {

    /**
     * Declaração dos campos da interface - note que todo campo em uma interface é
     * considerado como public final, não podendo variar.
     */
    int máximoDeDiasParaEmpréstimo = 1;
    boolean empréstimoPodeSerRenovado = false;

    /**
     * O método cuidadosEspeciais retorna uma string contendo uma descrição dos cuidados
     * especiais que devem ser tomados ao manusear este item
     * @return os cuidados especiais a tomar com este item
     */
    String cuidadosEspeciais();
} // fim da interface ItemRaroDeBiblioteca
