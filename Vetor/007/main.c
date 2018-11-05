#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 

{
	
	int a[5], b[5] = {1,5,3,4,2}, c[5],d[5],x,y,n=0,u;
	


	printf("Digite o ID do Gabarito\n\n");
	scanf("%d", &a[x]);
	
	printf("Digite o numero do aluno\n\n");
	scanf("%d", &c[x]);
	
	for(u=0;u<5;u++)
	{
	printf("Opções de resposta\n ");
	printf("\n\n1-A\n\n2-B\n\n3-C\n\n4-D\n\n5-E\n\n");	
	printf("\n\nDigite as Respostas da Questões\n\n");
	scanf("%d", &d[u]);
	if(d[u] == b[u])
	{
	n++;	
	}
	}
	
	printf("\nGabarito %d\n\n",a[y]);
	printf("\n\Numero do Aluno %d\n\n",c[y]);



	return 0;
}
