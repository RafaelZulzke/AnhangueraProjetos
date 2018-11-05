#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	/*Declaração de Variaveis*/
	float a,b,c;
	int x;
	
	/*Inicio do Programa*/
	for ( x=0; x<10; x++)
	{
	printf("Digite a primeira nota\n");
	scanf("%f", &a);
	printf("Digite a segunda nota\n");
	scanf("%f", &b);
	
	/*Conta para Obter a Media*/
	
	c = ((a+b)/2);
	
	printf("Sua media é %.2f\n", c);
    
	/*Estrutura Se / Senão*/
	
    if( c >= 6)
	{
	printf("Aprovado\n");
	}	
	else
	{
	printf("Reprovado\n");
	}
	
	}
	return 0;
}
