#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	/*Declaração de Variaveis*/
	float a,b,c;
	int op;
	/*Inicio do Programa*/
	printf("\nDigite o primeiro numero\n");
	scanf("%f", &a);
	printf("\nDigite o segundo numero\n");
	scanf("%f", &b);	
	
	
	printf("\n 1 - Soma \n 2 - Subtração \n 3- Multiplicação \n 4 - Divisão \n 5 - Sair \n");
	scanf("%d", &op);
	switch(op)
	{
	case 1 :
	c=a+b;
	printf("\nA soma dos numeros é %d\n", c);
	break;
	case 2:
	c=a-b;
	printf("\nA subtração dos numeros é %d\n", c);
	break;
	case 3:
	c=a*b;
	printf("\nA multiplicação dos numeros é %d\n", c);
	break;
	case 4:
	c=a/b;
	printf("\nA divisão dos numeros é %d\n", c);
	break;
	case 5:
	exit(1);
	break;
	default:
	printf("\nOpção Invalida\n");
	break;	
	}
	
	return 0;
}
