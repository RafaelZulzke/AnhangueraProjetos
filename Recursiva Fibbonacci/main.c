#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int Fibbonaci(int r)
{  
int first = 0, second = 1, next, c;
  
   for ( c = 0 ; c < r; c++)
   {
      if ( c <= 1 )
      {
      	next = c;
	  }
        
      else
      {
         next = first + second;
         first = second;
         second = next;
      }
      printf("\n\n%d\n\n", next);
   }
 	
}
int main(int argc, char *argv[]) 
{
 int a,f;
 printf("\n\nDigite quantos termos da sequencia voce quer ver\n\n");
 scanf("%d",&a);
 printf("\n\nTermos abaixo\n\n");
 Fibbonaci(a);
 system("PAUSE"); 
 return EXIT_SUCCESS;

	return 0;
}
