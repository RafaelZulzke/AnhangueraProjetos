#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
    int a,b,c;
    float d;
  printf("Entre com o 1º Numero\n\n");
  scanf("%d", &a);              
  printf("Entre com o 2º Numero\n\n");
  scanf("%d", &b);
  printf("Entre com o 3º Numero\n\n");
  scanf("%d", &c);
  
  d = ((a+b+c)/3);
  
  printf("\n\n\n A media do aluno é %f",d);
   
  system("PAUSE");	
  return 0;
}
