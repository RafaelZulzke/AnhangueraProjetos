#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	/*Declara��o de Variaveis*/
	float a,b,c;
	int op;
	/*Inicio do Programa*/
	printf("\nDigite o primeiro numero\n");
	scanf("%f", &a);
	printf("\nDigite o segundo numero\n");
	scanf("%f", &b);	
	
	
	printf("\n 1 - Soma \n 2 - Subtra��o \n 3- Multiplica��o \n 4 - Divis�o \n 5 - Sair \n");
	scanf("%d", &op);
	switch(op)
	{
	case 1 :
	c=a+b;
	printf("\nA soma dos numeros � %d\n", c);
	break;
	case 2:
	c=a-b;
	printf("\nA subtra��o dos numeros � %d\n", c);
	break;
	case 3:
	c=a*b;
	printf("\nA multiplica��o dos numeros � %d\n", c);
	break;
	case 4:
	c=a/b;
	printf("\nA divis�o dos numeros � %d\n", c);
	break;
	case 5:
	exit(1);
	break;
	default:
	printf("\nOp��o Invalida\n");
	break;	
	}
	
	return 0;
}
