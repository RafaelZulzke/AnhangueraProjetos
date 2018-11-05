#include <stdio.h>
#include <stdlib.h>
#define Tamanho 3
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int f;
int fila[Tamanho];

void enfileirar (int num)
{ 
f++;
fila[f]= num;
}

void avancafila()
{
	int i;
	for(i=0; i<=f; i++)
	{
	fila[i] = fila[i+1]	;
	}
}
int desenfileirar ()
{
	int valor;
	int i;
	if (f==-1)
	{
	printf ("\n Fila vazia!!!\n");
	}
	else
	{
	i = fila[0];
	avancafila();
	f--;
	return i;
	}

}

void imprimir()
{
	int y;
	if (f==-1)
	{
	printf("\n Fila vazia!!!\n");	
	}
	else
	{
		for (y=0; y<= f; y++)
		{
		printf("%d \n" , fila[y]);
		}
	}
}

void main ()
{
int op, x ;
f=-1 ;
do{ 
printf (" 01 Enfileirar\n\n");
printf (" 02 Desenfileirar\n\n");
printf (" 03 Imprimir Fila\n\n");
printf (" 04 Imprimir o valor inicial da Fila\n\n");
printf (" 05 Sair\n\n\n");
printf("Digite uma das opcoes acima\n\n") ;
scanf("%d", &op);
printf("\n\n");
	switch (op)
	{
	case 1: 
		if (f==Tamanho-1)
		{
	
		printf ("\n Fila cheia\n\n") ;
	
		}
		else
		{
		printf("Digite um numero para enfileirar\n\n");
		scanf("%d" ,&x);
		enfileirar(x);
		}
		break;
    case 2: 
		desenfileirar();
		break;
	case 3: 
		imprimir() ;
		break;
	case 4: 
		if (f==-1)
		{

		printf("\n Fila vazia!!!\n\n");
		}
		else
		{	

		printf("\n O primeiro elemento da fila ‚: %d \n\n\n ", fila[0]);
		}	
	}
} while(op!=5);
}

