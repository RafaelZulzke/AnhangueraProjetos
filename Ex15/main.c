#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
   int first = 0, second = 1, next, c;
  
   for ( c = 0 ; c < 10; c++ )
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
      printf("%d\n",next);
   }
 
 
	return 0;
}
