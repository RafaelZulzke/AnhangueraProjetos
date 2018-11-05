#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	/*bruno-bac@hotmail.com*/
	int a,b,c;
	printf("Digite o 1 numero");
	scanf("%i", &a);
	printf("Digite o 2 numero");
	scanf("%i", &b);
	c =a + b;
	if  (c > 10)
    {
    printf("A Soma e: %i", c);
    }	
	return 0;
}
