#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
{
	
	int a,b,c;
	
	printf("Digite o primeiro Valor \n\n");
	scanf("%i", &a);
	printf("Digite o segundo Valor\n\n");
	scanf("%i", &b);
	printf("Digite o terceiro Valor\n\n");
	scanf("%i", &c);
	
	if((a > b+c) || (b> a+c)|| (c> a+b))
	{
	printf("\n\nNao e possivel formar um triangulo");
	}
	else
	{
	  if((a == b) && ( a == c))
	  {
	  	printf("\n\nO triangulo e equilatero");
	  }	
	  else
	  {
	    if((a == b) || (a == c) || (b == c))
	    {
	     printf("\n\nO triangulo e isoceles");
		}
		
	     printf("\n\nO triangulo e escaleno");	
	  }
	}
	return 0;
}
