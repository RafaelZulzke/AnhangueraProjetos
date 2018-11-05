#include <stdio.h>
#include <stdlib.h>


int main(int argc, char *argv[])
{
   int x, y;
   int resto,a,b;

   printf("\n\nInforme o primeiro valor:\n\n ");
   scanf("%d", &x);
   printf("\n\nInforme o segundo valor: \n\n");
   scanf("%d", &y);
   
   while(b != 0)
	  	{
    	resto = x % y;
    	a = y;
    	b = resto;
		}
		
   printf("O maximo divisor comum de %d e %d : %d \n\n ",x,y,a);
   system("PAUSE");
} 

