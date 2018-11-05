#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
{
	int a,b,c,d,e;
	printf("Digite o 1 numero \n\n");
	scanf("%i", &a);
	printf("Digite o 2 numero \n\n");
	scanf("%i", &b);
	printf("Digite o 3 numero \n\n");
	scanf("%i", &c);
	printf("Digite o 4 numero \n\n");
	scanf("%i", &d);
	printf("Digite o 5 numero \n\n");
	scanf("%i", &e);
	
	if((a > b) && (a>c) && (a>d) && (a>e))
	{
	printf("O maior numero é: %i", a);	
	}
	
	if((b > a) && (b>c) && (b>d) && (b>e))
	{
	printf("O maior numero é: %i", b);	
	}
	
	if((c > a) && (c>b) && (c>d) && (c>e))
	{
	printf("O maior numero é: %i", c);	
	}
	
	if((d > a) && (d>b) && (d>c) && (d>e))
	{
	printf("O maior numero é: %i", d);	
	}
	
	if((e > a) && (e>b) && (e>c) && (e>d))
	{
	printf("O maior numero é: %i", e);	
	}	
		
	if((a == b) && (b == c) && (c == d) && (d ==e))
	{
	printf("Os numeros são iguais: %i", e);	
	}
	
	
	return 0;
}

