#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	
	float altura, AltT,  MedAlt, MedIdade;
	int x,y, idade, idadeT,a;
	
	for(a=0; a>=5;a++)
	{
	printf("Digite a Idade");
	scanf("%d", &idade);
	printf("Digite a Altura");
	scanf("%f", &altura);
	
	idadeT = idadeT+idade;
	AltT = AltT + altura;
	
		if(altura == 1.70)
		{
		x++;
		MedIdade = idadeT/x; 
		printf("A idade media dos alunos com 1.70 de altura é %.2f", MedIdade);
		}
		if(idade == 20)
		{
		y++;
		MedAlt = AltT/y;	
		printf("A altura media dos alunos com mais de 20 anos é %.2f", MedAlt);
		}
		return 0;
	}
	

}
