#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
    int a,b,c;
    float d;
  printf("Entre com o 1� Numero\n\n");
  scanf("%d", &a);              
  printf("Entre com o 2� Numero\n\n");
  scanf("%d", &b);
  printf("Entre com o 3� Numero\n\n");
  scanf("%d", &c);
  
  d = ((a+b+c)/3);
  
  printf("\n\n\n A media do aluno � %f",d);
   
  system("PAUSE");	
  return 0;
}
