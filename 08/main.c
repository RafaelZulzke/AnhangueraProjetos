#include <stdio.h>
#include <stdlib.h>
#define Tamanho 2

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
{
	float p1[Tamanho],p2[Tamanho],media[Tamanho];
	char Nome[6][50];
	int x;
	
		for(x = 0; x<= Tamanho-1;x++)
		{
		printf("Digite o Nome do Aluno\n\n");
		scanf("%s", &Nome[x]);
		printf("Informe a Nota 01\n\n");
		scanf("%f", &p1[x]);
		printf("Informe a Nota 02\n\n");
		scanf("%f", &p2[x]);
		}
		
		for ( x = 0; x<= Tamanho-1; x++)
		{
		media[x] = (p1[x] + p2[x]) / 2.0;
		if(media[x] > 5)
		{
		printf("\n\n%s Aprovado com media: %2.f\n\n", Nome[x], media[x]);
		}
		else
		{
		  printf("\n\n %s Reprovado com Media:%2.f\n\n", Nome[x], media[x]);
		}
		}
	
		
		system("pause");

	return 0;
}
