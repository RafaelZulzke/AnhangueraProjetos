#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int a,b,c;
	printf("Digite o primeiro numero");
	scanf("%i", &a);
	if (a > 20)
	{
	 b = a /2;
	 printf("Seu numero e: %i\n\n", a);
	 printf("A metade do seu numero e: %i\n\n", b);	
	}
	else
	{
	printf("Seu numero e: %i", a);
	}
	return 0;
}
