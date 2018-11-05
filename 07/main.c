#include <stdio.h>
#include <stdlib.h>


char ar;
float c,a,b;
  
void adicao(float a,float b)
{
	c = a+b;
    printf("\n\nO resultado da sua adicao é %.2f\n\n", c);
}

  
void sub(float a,float b)
{
	c = a-b;
    printf("\n\nO resultado da sua subtracao é %.2fn\n",c);
}
  
void mult(float a,float b)
{
	c = a*b;
    printf("\n\nO resultado da sua multiplicacao é %.2f\n\n",c);    
}

void divis(float a,float b)
{
	c = a/b;
    printf("\n\nO resultado da sua divisão é %.2f\n\n",c);      
}

int main(int argc, char *argv[]) {


  printf("Digite A\n\n");
  scanf("%f",&a);
  printf("Digite B\n\n");
  scanf("%f",&b);
  
  printf("Digite o valor da sua operação\n\n 1 - + Adicao \n\n 2 - - Subtracao \n\n 3 - * Multiplicacao\n\n 4 - / Divisao\n\n\n");
//  scanf("%c",&ar);
  ar=getche();   
       
          if( ar == '+')
          {
          adicao(a,b);
          }
               
         if(ar == '-')
         {
         sub(a,b);
         }
                    
         if (ar == '*')
         {
          mult(a,b);
         }
                        
         if(ar == '/')
         {
          divis(a,b);
		  
		 }
	return 0;
}
