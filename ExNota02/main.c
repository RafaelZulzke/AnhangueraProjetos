#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
{
	 int numero,i;
     printf("Numero: ");
     scanf("%d",&numero);
     
     for(i = numero;i!= 0 ;i--)
	 {
      if(numero%i == 0)
      {
       printf("%d\n",i);
      }
     }
	return 0;
	system("pause");
}
