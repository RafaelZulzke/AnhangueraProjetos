/* Precisamos de classes e interfaces no pacote java.util */

import java.util.*;

/**
 * A classe Loteria cont�m um m�todo est�tico (sorteiaN�meros) que demonstra o uso de
 * um Set para sortear n�meros �nicos (isto �, sem repeti��o). A classe tamb�m cont�m 
 * um m�todo main que demonstra o m�todo sorteiaN�meros.
 */
class Loteria {

    /**
     * O m�todo sorteiaN�meros recebe um valor inteiro como argumento e retorna um array
     * de valores inteiros aleat�rios cujo tamanho � o passado como argumento.
     * @param quantos o n�mero de valores inteiros aleat�rios que devem ser sorteados
     * @return um array contendo os valores aleat�rios
     */
    public static int[] sorteiaN�meros(int quantos) {
        TreeSet n�meros = new TreeSet(); // Criamos um set que conter� os n�meros aleat�rios
        int conta = 0;
        while (n�meros.size() < quantos) // Preenchemos este set at� o tamanho desejado.
        {
            // Somente objetos podem entrar em um Set, ent�o criamos uma inst�ncia da classe
            // Integer que representa um valor inteiro aleat�rio entre 0 e 99.
            Integer umN�mero = new Integer((int) (100 * Math.random()));
            // Adicionamos o valor ao set (se j� existir nada ser� feito).
            n�meros.add(umN�mero);
            conta++;
        }
        System.out.println("Quantidade de iteracoes: " + conta);
        // Agora transformamos o set em um array de valores inteiros
        int[] array = new int[n�meros.size()];
        int �ndice = 0;
        System.out.println(n�meros.iterator());
        Iterator i = n�meros.iterator(); // usamos um iterator para este set
        while (i.hasNext()) // para cada um dos elementos
        {
            Integer temp = (Integer) i.next(); // recuperamos o elemento como um Integer
            array[�ndice++] = temp.intValue(); // armazenamos o valor do elemento no array
            // e incrementamos o �ndice do array
            i.remove(); // eliminamos o elemento do set
        }
        return array; // retornamos o array de inteiros
    }

    /**
     * O m�todo main permite a execu��o desta classe. Este m�todo executa algumas vezes
     * o m�todo est�tico sorteiaN�meros.
     * @param argumentos os argumentos que podem ser passados para o m�todo via linha
     *        de comando, mas que neste caso ser�o ignorados.
     */
    public static void main(String[] argumentos) {
        // Sorteamos e imprimimos um array com 10 inteiros
        int[] arrayCom10 = sorteiaN�meros(10);
        for (int i = 0; i < arrayCom10.length; i++) {
            System.out.print(" " + arrayCom10[i]);
        }
        System.out.println();
        // Sorteamos e imprimimos um array com 50 inteiros
        int[] arrayCom50 = sorteiaN�meros(99);
        for (int i = 0; i < arrayCom50.length; i++) {
            System.out.print(" " + arrayCom50[i]);
        }
        System.out.println();
    }
} // fim da classe Loteria
