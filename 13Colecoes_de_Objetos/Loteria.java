/* Precisamos de classes e interfaces no pacote java.util */

import java.util.*;

/**
 * A classe Loteria contém um método estático (sorteiaNúmeros) que demonstra o uso de
 * um Set para sortear números únicos (isto é, sem repetição). A classe também contém 
 * um método main que demonstra o método sorteiaNúmeros.
 */
class Loteria {

    /**
     * O método sorteiaNúmeros recebe um valor inteiro como argumento e retorna um array
     * de valores inteiros aleatórios cujo tamanho é o passado como argumento.
     * @param quantos o número de valores inteiros aleatórios que devem ser sorteados
     * @return um array contendo os valores aleatórios
     */
    public static int[] sorteiaNúmeros(int quantos) {
        TreeSet números = new TreeSet(); // Criamos um set que conterá os números aleatórios
        int conta = 0;
        while (números.size() < quantos) // Preenchemos este set até o tamanho desejado.
        {
            // Somente objetos podem entrar em um Set, então criamos uma instância da classe
            // Integer que representa um valor inteiro aleatório entre 0 e 99.
            Integer umNúmero = new Integer((int) (100 * Math.random()));
            // Adicionamos o valor ao set (se já existir nada será feito).
            números.add(umNúmero);
            conta++;
        }
        System.out.println("Quantidade de iteracoes: " + conta);
        // Agora transformamos o set em um array de valores inteiros
        int[] array = new int[números.size()];
        int índice = 0;
        System.out.println(números.iterator());
        Iterator i = números.iterator(); // usamos um iterator para este set
        while (i.hasNext()) // para cada um dos elementos
        {
            Integer temp = (Integer) i.next(); // recuperamos o elemento como um Integer
            array[índice++] = temp.intValue(); // armazenamos o valor do elemento no array
            // e incrementamos o índice do array
            i.remove(); // eliminamos o elemento do set
        }
        return array; // retornamos o array de inteiros
    }

    /**
     * O método main permite a execução desta classe. Este método executa algumas vezes
     * o método estático sorteiaNúmeros.
     * @param argumentos os argumentos que podem ser passados para o método via linha
     *        de comando, mas que neste caso serão ignorados.
     */
    public static void main(String[] argumentos) {
        // Sorteamos e imprimimos um array com 10 inteiros
        int[] arrayCom10 = sorteiaNúmeros(10);
        for (int i = 0; i < arrayCom10.length; i++) {
            System.out.print(" " + arrayCom10[i]);
        }
        System.out.println();
        // Sorteamos e imprimimos um array com 50 inteiros
        int[] arrayCom50 = sorteiaNúmeros(99);
        for (int i = 0; i < arrayCom50.length; i++) {
            System.out.print(" " + arrayCom50[i]);
        }
        System.out.println();
    }
} // fim da classe Loteria
