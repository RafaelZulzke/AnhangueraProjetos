#include <stdio.h>
#include <stdlib.h>


int main(int argc, char *argv[]) 
{
	int x,y,z;
	float m;
	printf("Digite o Primeiro Numero\n");
	scanf("%d",&x);
	printf("Digite o Segundo Numero\n");
	scanf("%d",&y);
	printf("Digite o Terceiro Numero\n");
	scanf("%d",&z);
	m = (x+y+z)/3;
	printf("\nA media igual a %.2f",m);
    return 0;
	system("pause");
	
}
