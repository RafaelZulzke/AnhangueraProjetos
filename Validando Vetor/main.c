#include <stdio.h>
#include <stdlib.h>
#define v 3
int vetor[v];
int x,i;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void validavetor(int a)
{
if (vetor[v] != -1)
{
printf("\n\nPosicao Existe, continue a insercao\n\n");
printf("\n\n Insira um numero nessa posicao\n\n");
scanf("%d", &x);
for(i = 0; i<= v-1; i++)
{
vetor[v] = vetor[x];	
}
		
}
else
{
printf("\n\n Posição não existe \n\n");	
}

}
int main(int argc, char *argv[]) 
{
printf("\n\nValide seu vetor\n\n");	
scanf("%d", &x);
validavetor(x);	
return 0;
}
