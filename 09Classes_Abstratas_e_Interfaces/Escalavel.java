
/**
 * A interface Escalavel define que m�todos um objeto que seja escal�vel (isto �,
 * que pode ter seu tamanho modificado como uma fun��o do tamanho anterior) deve
 * conter. Esta interface n�o declara nenhum campo.
 */
interface Escalavel {

    /**
     * O m�todo amplia modifica os campos do objeto para alterar o seu tamanho.
     * @param escala a escala para modifica��o do objeto
     */
    void amplia(double escala);

    /**
     * O m�todo espelha modifica os campos do objeto para alterar a sua posi��o (fazendo
     * com que o objeto fique refletido nas suas coordenadas horizontais)
     */
    void espelha();
} // fim da interface Escalavel
