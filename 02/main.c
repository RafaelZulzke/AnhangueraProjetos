#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
  int a,b;
  
  printf("Digite o 1� Numero\n\n");
  scanf("%d", &a);
  printf("Digite o 2� Numero\n\n");
  scanf("%d", &b);
   
   if(a>b)
   {
   printf("\n\nO maior numero � %d",a);
   }
   else
   {
    if (b>a)
    {
     printf("\n\nO maior numero � %d",b); 
     }
    printf("\n\nOs valores de A e B s�o iguais");
    } 
           
  
  system("PAUSE");	
  return 0;
}
