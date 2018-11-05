#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{

 float valor,a;

 printf("\n Digite o Valor do produto: ");
 scanf("%f", &valor);

 if ( valor < 20.0 )
  { 
  a = valor * 1.45;
  printf("\n Valor de venda: %.2f ", a); 
  
  }
 else
   { 
   a = valor * 1.3;
   printf("\n Valor de Venda:  %.2f", a );
   }
 
 	return 0;

}
