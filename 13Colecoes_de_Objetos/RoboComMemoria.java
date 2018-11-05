/* A linha abaixo permite o uso da interface List e da classe ArrayList. */

import java.util.*;

/** 
 * A classe RoboComMemoria herda da classe abstrata RoboAbstrato e representa
 * um robô que armazena os movimentos feitos. Esta classe possui internamente uma lista
 * de passos que é atualizada a cada movimento do robô, podendo ser usada para 
 * analisar seu caminho e possibilitar o retorno do robô à "base" (a posição 
 * original do robô).
 */
class RoboComMemoria extends RoboAbstrato {

    /**
     * Declaração dos campos da classe
     */
    private List<MovimentoDeRobo> movimentos; // a lista de movimentos do robô

    /**
     * O construtor para a classe RoboComMemoria recebe argumentos para inicializar todos
     * os campos da classe, e inicializa também uma instância de classe que implementa a
     * interface List para conter os movimentos do robô.
     * @param n o nome do robô
     * @param px a posição X atual
     * @param py a posição Y atual
     * @param d a direção atual
     */
    RoboComMemoria(String n, int px, int py, short d) {
        super(n, px, py, d);
        movimentos = new ArrayList<MovimentoDeRobo>(); // lista dos movimentos
    }

    /**
     * O método move modifica a posição do robô em um número de unidades na direção em
     * que o robô está, e armazena o movimento dado pelo robô na lista de movimentos.
     * @param passos o número de "passos" para o robô
     */
    public void move(int passos) {
        switch (qualDireçãoAtual()) // recuperamos a direção atual através deste método
        {
            case 0:
                moveY(+passos); // passos positivos na direção Y
                break;
            case 90:
                moveX(+passos); // passos positivos na direção X
                break;
            case 180:
                moveY(-passos); // passos negativos na direção Y
                break;
            case 270:
                moveX(-passos); // passos negativos na direção X
                break;
        } // fim do switch
        // adicionamos o movimento à lista
        movimentos.add(
                new MovimentoDeRobo(passos, qualDireçãoAtual()));
    } // fim do método move

    /**
     * O método listaCaminho retorna o conteúdo da lista de movimentos feitos pelo
     * robô como uma string.
     * @return uma string contendo a lista de movimentos do robô.
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
    } // fim do método listaCaminho

    /**
     * O método retornaÀBase faz com que o robô retorne à "base" (sua posição original).
     * Este método usará a lista de passos dados para retornar à "base".
     * Os passos percorridos até agora serão refeitos ao contrário.
     */
    public void retornaÀBase() {
        for (int p = movimentos.size() - 1; p >= 0; p--) {
            MovimentoDeRobo umMovimento =
                    movimentos.get(p);
            // Fazemos o movimento ao contrário (invertendo o sinal do número de passos)
            mudaDireção(umMovimento.qualDireção());
            move(-umMovimento.quantosPassos());
        }
    }
} // fim da classe RoboComMemoria
