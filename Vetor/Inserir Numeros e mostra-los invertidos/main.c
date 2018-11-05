#include <stdio.h>
#include <stdlib.h>
#define t 10
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int a[10],b[10],c,y=t-1;
	
	for(c=0;c<=t-1;c++)
	{
	printf("Digite o Numero");
	scanf("%d", &a[c]); 
	b[y] =  a[c];
	y--;
	}
	
	for(c=0;c<=9;c++)
	{
	printf("\n\nNumeros em Ordem %d \n\n", a[c]);
  	printf("\n\nNumeros Invertidos %d \n\n", b[c]);	
	}
	

	
	return 0;
}
