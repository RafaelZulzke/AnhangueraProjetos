#include <stdio.h>
#include <stdlib.h>
#define Tamanho 3
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int p;
int pilha[Tamanho];

void empilhar (int num)
{ 
p++;
pilha[p]= num;
}

void avancapilha()
{
	int i;
	for(i= Tamanho-1; i<=0; i++)
	{
	pilha[i] = pilha[i-i]	;
	}
}

int desempilhar ()
{
	int valor;
	int i;
	if (p==-1)
	{
	printf ("\n Pilha vazia!!!\n");
	}
	else
	{
	i = pilha[0];
	avancapilha();
	p--;
	return i;
	}
}

void imprimir()
{
	int y;
	if (p==-1)
	{
	printf("\n Pilha vazia!!!\n");	
	}
	else
	{
		for (y=0; y<= p; y++)
		{
		printf("%d \n" , pilha[y]);
		}
	}
}

void main ()
{
int op, x ;
p=-1 ;
do{ 
printf (" 01 Empilhar\n\n");
printf (" 02 Desempilhar\n\n");
printf (" 03 Imprimir Pilha\n\n");
printf (" 04 Imprimir o valor inicial da Pilha\n\n");
printf (" 05 Sair\n\n\n");
printf("Digite uma das opcoes acima\n\n") ;
scanf("%d", &op);
printf("\n\n");
		switch (op)
		{
			case 1: 
				if (p==Tamanho-1)
				{
				printf ("\n Pilha cheia\n\n");
				}
				else
				{
				printf("Digite um numero para empilhar\n\n");
				scanf("%d" ,&x);
				empilhar(x);
				}
			break;
    		case 2: 
			desempilhar();
			break;
			case 3: 
			imprimir() ;
			break;
			case 4: 
				if (p==-1)
				{
				printf("\n Pilha vazia!!!\n\n");
				}
				else
				{	
				printf("\n O primeiro elemento da pilha ‚: %d \n\n\n ", pilha[0]);
				}	
		}
	}while(op!=5);
}
