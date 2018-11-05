#include <stdio.h>
#include <stdlib.h>


int main(int argc, char *argv[]) 
{
	int prova1,prova2;
	float peso1 =0.4,peso2 =0.6,media;
	printf("\n\nDigite a nota da primeira prova\n\n");
	scanf("%d",&prova1);
	printf("\n\nDigite a nota da segunda prova\n\n");
	scanf("%d",&prova2);
	media = (prova1*peso1)+(prova2*peso2);
	printf("A sua media é %.2f",media);
	if (media >= 6) 
	{
	printf("\n\n\nVoce Passou");
    }
    if (media < 6)
    {
    printf("\n\n\nVoce Reprovou");
    }
    else
	{
	printf("\n\n\n");
    }
    system("pause");
	return 0;

}
