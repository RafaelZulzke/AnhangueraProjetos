
/** 
 * A interface ItemDeBiblioteca declara os campos e m�todos que qualquer item 
 * em uma biblioteca deve ter. 
 */
interface ItemDeBiblioteca {

    /**
     * Declara��o dos campos da interface - note que todo campo em uma interface �
     * considerado como public final, n�o podendo variar.
     */
    int m�ximoDeDiasParaEmpr�stimo = 14;

    /**
     * O m�todo est�Emprestado retorna true se o item estiver emprestado e false caso
     * contr�rio.
     * @return true se o item estiver emprestado e false caso contr�rio
     */
    boolean est�Emprestado();

    /**
     * O m�todo empresta modifica o estado de um campo que indica se o item est�
     * emprestado ou n�o para true.
     */
    void empresta();

    /**
     * O m�todo devolve modifica o estado de um campo que indica se o item est�
     * emprestado ou n�o para false.
     */
    void devolve();

    /**
     * O m�todo localiza��o retorna a localiza��o do item na biblioteca
     * @return a localiza��o do item na biblioteca
     */
    String localiza��o();

    /**
     * O m�todo descri��oSum�ria retorna uma string contendo uma descri��o sum�ria do
     * item de biblioteca
     * @return a descri��o sum�ria do item da biblioteca
     */
    String descri��oSum�ria();
} // fim da interface ItemDeBiblioteca
