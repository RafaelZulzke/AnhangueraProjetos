#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int p ,a ,s;
	p = 0;
	printf("Digite o primeiro numero\n\n");
	scanf("%i", &p);
	a = p-1;
	s = p+1;
	printf("O Antecessor e: %i\n\n",a);
	printf("Seu sucessor e: %i\n\n",s);
	
	return 0;
}
