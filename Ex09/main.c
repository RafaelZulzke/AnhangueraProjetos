#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int a, b;
	printf("Digite um limite maximo \n\n");
	scanf("%d", &a);
	b = 0;
	while (b <= a)
	{
	printf("%d \n\n", b);
	b = b +1 ;
	}
	return 0;
}
