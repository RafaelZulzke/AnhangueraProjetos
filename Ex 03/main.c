#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
 {
	float a,b,c;
	printf("\nDigite o Primeiro valor\n\n");
	scanf("%f", &a);
	printf("\nDigite o Segundo valor\n\n");
	scanf("%f", &b);
	
	c = a+b;
	 
  if(c > 5)
 {
	 printf("\nA media e %.2f\n\n", c);
	 printf("\nAprovado com louvor\n\n"); 
 }
 else{
 if ( c == 5)
   {
    printf("\nA media e %.2f \n\n", c);
    printf("\nAprovado\n\n");
   }
     }
 if(c < 5)
 {	
  printf("\nA media e %.2f \n\n", c);
  printf("\nReprovado\n\n");
 }
    return 0;
	system("pause");
}
