#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int p;
	printf("Digite um numero");
	scanf("%i", &p);
	
	if ( p > 20)
	{
	 printf("Seu numero e maior que 20");	
	}
	if ( p == 20)
	{
	 printf("Seu numero e igual a 20");
	}
	if (p < 20)
	{
	printf("Seu numero e menor que 20");
	}
	return 0;
}
