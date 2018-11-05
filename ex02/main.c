#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int p;
	printf("Digite o primeiro numero");
	scanf("%i", &p);
	p = p*p;
	printf("%i", p);
	return 0;
}
