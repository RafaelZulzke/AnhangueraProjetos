#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	
int a,b,c;

for ( b = 1; b <=5; b++)
{
printf("\nDigite o peso da Caixa\n");
scanf("%d", &a);
if ( a < 10)
{
printf("\nCaixa vazia\n");
}
else
{
if ( a == 10 || a <= 30)
{
printf("\nCaixa dentro do permitido\n");
}
else
{
if ( a > 30)
{
c = a - 30;
printf("\nO peso acima do permitido a diferença do peso é %d", c);

}

}
}
}
return 0;
}
