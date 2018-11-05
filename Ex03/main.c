#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
{
    int numero,impar=0;
    
	
       for(numero = 0; numero < 100; numero++)
	   {
        impar = numero % 2;
        
        if(impar)
         {
		  printf("%d \n\n\n", numero);
         }	
       }
	return 0;

    
}
