#include <stdio.h>
#include <stdlib.h>


int main(int argc, char *argv[]) 
{
	float prova1,prova2,sub;
	float peso1 =0.4,peso2 =0.6,media;
	printf("\n\nDigite a nota da primeira prova\n\n");
	scanf("%f",&prova1);
	printf("\n\nDigite a nota da segunda prova\n\n");
	scanf("%f",&prova2);
	media = (prova1*peso1)+(prova2*peso2);
	
	if (media >= 6) 
	{
	printf("A sua media é %.2f",media);
	printf("\n\n\nVoce Passou");
    }
    if (media < 6)
    {
    printf("A sua media é %.2f",media);
    printf("\n\n\nVoce Reprovou");
    printf("\n\n\nDigite a Nota da Sub");
    scanf("%f", &sub);
       if(sub> media)
      { 
        media = (prova1*peso1)+(sub*peso2);
		if (media >= 6)
		{
	    printf("A sua media é %.2f",media);
	    printf("\n\n\nVoce Passou");
    	}
		else
		{
		printf("\n\n\nVoce Reprovou");
		}	
	  }
    }
    else
	{
	printf("\n\n\nVoce Reprovou");
    }
    system("pause");
	return 0;

}
