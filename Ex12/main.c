#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
{
	int e,b,c,d;
	printf("Digite a base");
	scanf("%d", &b);
	printf("Digite o expoente");
	scanf("%d", &e);
	d = 1;
	for( c =1; c <= e; c++ )
	{
	 d = d*b;	
	}
	printf("%d", d);
	return 0;
}
