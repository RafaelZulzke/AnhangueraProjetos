#include <stdio.h>
#include <stdlib.h>
#include <stdin.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	FILE*arq_entrada;
	arq_entrada = fopen("D:\Anhanguera\3 Semestre\Algoritmos\Teste Gravação\text.txt", "w");
	
	if(arq_entrada == NULL)
	printf("Arquivo não Encontrado");

	return 0;
}
