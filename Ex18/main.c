#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int cod;
	printf("Digite o Codigo\n\n");
	scanf("%i", &cod);
	
	if(cod ==  1)
	{
	 printf("\n\nAlimento nao perecivel");	
	}
	if((cod ==  2) ||(cod == 3 ) || (cod == 4))  
	{
	 printf("\n\nAlimento perecivel");
	}
	if((cod ==  5) ||(cod == 6 ))
	{
	 printf("\n\nVestuario");
	}
	if(cod ==  7)
	{
	 printf("\n\nHigiene Pessoal");	
	}
	if((cod ==  8) ||(cod == 9 ))
	{
	 printf("\n\nLimpeza e utensilios domesticos");
	}
	if( cod > 9)
	{
	printf("\n\nCodigo Invalido");	
	}
	
	return 0;
}
