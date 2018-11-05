
/** 
 * A interface ItemRaroDeBiblioteca declara os campos e m�todos que itens raros
 * em uma biblioteca devem ter. 
 */
interface ItemRaroDeBiblioteca {

    /**
     * Declara��o dos campos da interface - note que todo campo em uma interface �
     * considerado como public final, n�o podendo variar.
     */
    int m�ximoDeDiasParaEmpr�stimo = 1;
    boolean empr�stimoPodeSerRenovado = false;

    /**
     * O m�todo cuidadosEspeciais retorna uma string contendo uma descri��o dos cuidados
     * especiais que devem ser tomados ao manusear este item
     * @return os cuidados especiais a tomar com este item
     */
    String cuidadosEspeciais();
} // fim da interface ItemRaroDeBiblioteca
