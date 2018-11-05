#include <stdio.h>
#include <stdlib.h>
#define Tamanho 10

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
int v[Tamanho];
int t[Tamanho];
int a,i= Tamanho-1;
for(a = 0; a <= Tamanho-1; a++)
{
printf("Digite um numero");
scanf("%d",&v[a]);
t[i] = v[a];
i--;
 
}

for(a = 0; a <= Tamanho-1;a++)
{
printf("\n\nValor do Vetor 1\n\n%d\n\n", v[a]);	
printf("\n\nValor do Vetor 2 \n\n%d\n\n", t[a]);	
}
/*
for(a = 0; Tamanho-1; a++)
{
printf("\n\nValor %d\n\n", t[a]);	
}*/
return 0;
}
