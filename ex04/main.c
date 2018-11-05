#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	float p,c,a;
	printf("Digite um valor");
	scanf("%f", &p);
	a = p*0.1;
	c = p+a;
	printf("Seu produto o resultado e: %.2f", c);
	return 0;
}
