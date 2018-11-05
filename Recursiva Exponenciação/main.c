#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int expe(int a, int b)
{
    int d = 1,c;
	for( c =1; c <= b; c++ )
	{
	 d = d*a;	
	}
	printf("\n\nResultado: %d", d);	
}

int main(int argc, char *argv[])
{
	int e,b;
	printf("\n\nDigite a base\n\n");
	scanf("%d", &b);
	printf("\n\nDigite o expoente\n\n");
	scanf("%d", &e);
    expe(b,e);
    system("\n\n\nPAUSE\n\n\n"); 
	return EXIT_SUCCESS;
}

    

