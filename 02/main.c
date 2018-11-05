#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
  int a,b;
  
  printf("Digite o 1º Numero\n\n");
  scanf("%d", &a);
  printf("Digite o 2º Numero\n\n");
  scanf("%d", &b);
   
   if(a>b)
   {
   printf("\n\nO maior numero é %d",a);
   }
   else
   {
    if (b>a)
    {
     printf("\n\nO maior numero é %d",b); 
     }
    printf("\n\nOs valores de A e B são iguais");
    } 
           
  
  system("PAUSE");	
  return 0;
}
