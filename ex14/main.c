#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	
	int a, soma,b;
	float media;
	soma = 0;
	printf("Digite o valor minimo \n\n\n");
	scanf("%i", &b);
	
	for(  a = b; a <=99; a++)
	{
	 soma = soma+a;
	 media = soma/a;
	}
	printf("%d\n\n", soma);
	printf("\n\n%f", media);

	return 0;
}
