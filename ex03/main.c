#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int a,b,c,d;
	printf("Digite o primeiro numero");
	scanf("%i", &a);
	printf("Digite o segundo numero");
	scanf("%i", &b);
	printf("Digite o terceiro numero");
	scanf("%i", &c);
	d = (a+b+c)/3;
	
	printf("O media e: %i", d);
	
	return 0;
}
