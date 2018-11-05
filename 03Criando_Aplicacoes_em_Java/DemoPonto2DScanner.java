import java.util.Scanner;

class DemoPonto2DScanner // declaração da classe
{

    public static void main(String[] argumentos) {

        Ponto2D p1 = new Ponto2D();
        Ponto2D p2 = new Ponto2D();

		Scanner sc = new Scanner( System.in );

        // Vamos ler dois valores do tipo double do teclado para inicialização
        System.out.print("Entre um valor de ponto flutuante (coordenada x):");
        double x = sc.nextDouble();
        System.out.print("Entre outro valor de ponto flutuante (coordenada y):");
        double y = sc.nextDouble();
        p1.inicializaPonto2D(x, y);

        // Vamos ler diretamente dois valores do tipo double (sem usar variáveis)
        System.out.print("Entre dois valores de ponto flutuante, pressionando ENTER ");
        System.out.print("após entrar cada um:");
        // Inicializamos a instância p2 com os valores lidos diretamente.
        p2.inicializaPonto2D(sc.nextDouble(), sc.nextDouble());

        // Como o método toString existe na classe Ponto2D, podemos imprimir diretamente
        // as instâncias
        System.out.println("As coordenadas de P1 são " + p1); // imprime P1
        System.out.println("As coordenadas de P2 são " + p2); // imprime P2

    }  // fim do método main

} // fim da classe DemoPonto2DK
