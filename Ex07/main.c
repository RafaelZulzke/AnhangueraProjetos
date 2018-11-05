#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
{
	int a, soma;
	soma = 0;
	for(  a = 0 ; a <=100; a = a+2)
	{
	 soma = soma+a;
	}
	printf("%d", soma);
	return 0;
	
}
