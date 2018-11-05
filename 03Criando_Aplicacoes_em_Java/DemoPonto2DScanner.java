import java.util.Scanner;

class DemoPonto2DScanner // declara��o da classe
{

    public static void main(String[] argumentos) {

        Ponto2D p1 = new Ponto2D();
        Ponto2D p2 = new Ponto2D();

		Scanner sc = new Scanner( System.in );

        // Vamos ler dois valores do tipo double do teclado para inicializa��o
        System.out.print("Entre um valor de ponto flutuante (coordenada x):");
        double x = sc.nextDouble();
        System.out.print("Entre outro valor de ponto flutuante (coordenada y):");
        double y = sc.nextDouble();
        p1.inicializaPonto2D(x, y);

        // Vamos ler diretamente dois valores do tipo double (sem usar vari�veis)
        System.out.print("Entre dois valores de ponto flutuante, pressionando ENTER ");
        System.out.print("ap�s entrar cada um:");
        // Inicializamos a inst�ncia p2 com os valores lidos diretamente.
        p2.inicializaPonto2D(sc.nextDouble(), sc.nextDouble());

        // Como o m�todo toString existe na classe Ponto2D, podemos imprimir diretamente
        // as inst�ncias
        System.out.println("As coordenadas de P1 s�o " + p1); // imprime P1
        System.out.println("As coordenadas de P2 s�o " + p2); // imprime P2

    }  // fim do m�todo main

} // fim da classe DemoPonto2DK
