#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int soma,a;
	soma = 1;
    for (a=1;a<=100;a++)
	{
		soma=soma*a;
		printf ("Valor %i \n %i \n", a,soma);
	}
   	 printf ("Valor %i",soma);
     return 0;
}
