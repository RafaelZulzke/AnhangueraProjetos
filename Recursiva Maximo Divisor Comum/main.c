#include <stdio.h>
#include <stdlib.h>


int MDC(int a, int b)
{
  int resto;

 	 while(b != 0)
	  	{
    		resto = a % b;
    		a = b;
    		b = resto;
  		}	

  return a;
}

int main(int argc, char *argv[])
{
   int x, y;

   printf("\n\nInforme o primeiro valor:\n\n ");
   scanf("%d", &x);
   printf("\n\nInforme o segundo valor: \n\n");
   scanf("%d", &y);
   printf("O maximo divisor comum de %d e %d : %d \n\n ",x,y, MDC(x, y));
   system("PAUSE");
   return EXIT_SUCCESS;
} 

