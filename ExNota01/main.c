#include <stdio.h>
#include <stdlib.h>


int main(int argc, char *argv[])
{
	int a,c,b;
	b =0;
	printf("Digite o primeiro numero\n\n\n");
	scanf("%d", &a);
	
     for (c=2; c < a; c++)
     {
     if(a % c == 0)
     {
      b++;
     }
     
	 }
	 
     if( b == 0)
     {
     printf("\n\n\nNumero e primo");	
     }
     else
	 {
	 printf("\n\n\nNumero nao e primo");	
     }

}
