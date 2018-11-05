#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	
int a,b,c,d = 0, e = 0, f = 0;

for ( b = 1; b <=5; b++)
{
printf("\nDigite o peso da Caixa\n");
scanf("%d", &a);
if ( a < 10)
{
printf("\nCaixa vazia\n");
d++;
printf("A quantidade de Caixas vazias sao %d", d);
}
else
{
if ( a == 10 || a <= 30)
{
printf("\nCaixa dentro do permitido\n");
e++;
printf("A quantidade de Caixas padrões sao %d", e);
}
else
{
if ( a > 30)
{
c = a - 30;
printf("\nO peso acima do permitido a diferença do peso é %d", c);
f++;
printf("A quantidade de Caixas acima do permitido sao %d", f);

}

}
}
}
return 0;
}
