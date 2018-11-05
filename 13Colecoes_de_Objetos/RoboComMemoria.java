/* A linha abaixo permite o uso da interface List e da classe ArrayList. */

import java.util.*;

/** 
 * A classe RoboComMemoria herda da classe abstrata RoboAbstrato e representa
 * um rob� que armazena os movimentos feitos. Esta classe possui internamente uma lista
 * de passos que � atualizada a cada movimento do rob�, podendo ser usada para 
 * analisar seu caminho e possibilitar o retorno do rob� � "base" (a posi��o 
 * original do rob�).
 */
class RoboComMemoria extends RoboAbstrato {

    /**
     * Declara��o dos campos da classe
     */
    private List<MovimentoDeRobo> movimentos; // a lista de movimentos do rob�

    /**
     * O construtor para a classe RoboComMemoria recebe argumentos para inicializar todos
     * os campos da classe, e inicializa tamb�m uma inst�ncia de classe que implementa a
     * interface List para conter os movimentos do rob�.
     * @param n o nome do rob�
     * @param px a posi��o X atual
     * @param py a posi��o Y atual
     * @param d a dire��o atual
     */
    RoboComMemoria(String n, int px, int py, short d) {
        super(n, px, py, d);
        movimentos = new ArrayList<MovimentoDeRobo>(); // lista dos movimentos
    }

    /**
     * O m�todo move modifica a posi��o do rob� em um n�mero de unidades na dire��o em
     * que o rob� est�, e armazena o movimento dado pelo rob� na lista de movimentos.
     * @param passos o n�mero de "passos" para o rob�
     */
    public void move(int passos) {
        switch (qualDire��oAtual()) // recuperamos a dire��o atual atrav�s deste m�todo
        {
            case 0:
                moveY(+passos); // passos positivos na dire��o Y
                break;
            case 90:
                moveX(+passos); // passos positivos na dire��o X
                break;
            case 180:
                moveY(-passos); // passos negativos na dire��o Y
                break;
            case 270:
                moveX(-passos); // passos negativos na dire��o X
                break;
        } // fim do switch
        // adicionamos o movimento � lista
        movimentos.add(
                new MovimentoDeRobo(passos, qualDire��oAtual()));
    } // fim do m�todo move

    /**
     * O m�todo listaCaminho retorna o conte�do da lista de movimentos feitos pelo
     * rob� como uma string.
     * @return uma string contendo a lista de movimentos do rob�.
     */
    public String listaCaminho() {
        // Para melhor performance, usamos internamente um StringBuffer
        StringBuffer resultado = new StringBuffer(1024);
        // Percorremos a lista de passos
        for (int p = 0; p < movimentos.size(); p++) {
            resultado.append(movimentos.get(p));
            resultado.append("\n");
        }
        return resultado.toString();
    } // fim do m�todo listaCaminho

    /**
     * O m�todo retorna�Base faz com que o rob� retorne � "base" (sua posi��o original).
     * Este m�todo usar� a lista de passos dados para retornar � "base".
     * Os passos percorridos at� agora ser�o refeitos ao contr�rio.
     */
    public void retorna�Base() {
        for (int p = movimentos.size() - 1; p >= 0; p--) {
            MovimentoDeRobo umMovimento =
                    movimentos.get(p);
            // Fazemos o movimento ao contr�rio (invertendo o sinal do n�mero de passos)
            mudaDire��o(umMovimento.qualDire��o());
            move(-umMovimento.quantosPassos());
        }
    }
} // fim da classe RoboComMemoria
