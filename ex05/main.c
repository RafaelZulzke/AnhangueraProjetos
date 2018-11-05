#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	float p,a,c;
	printf("Digite o preço a ser descontado em 9 porcento");
	scanf("%f", &p);
	a = p*0.09;
	c = p-a;
	printf("O seu desconto e :%.2f", c);
	return 0;
}
