#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) 
{
/*Começamos iniciando as variaveis sendo M1 a matriz de 3x3,DOM a soma dos produtos das diagonais negativas,DOM2 é a soma das diagonais positivas,DET o valor dos determinantes e KONXeY são as devidas linhas e colunas*/ 
	int m1 [3][3];
	int dom,dom2;
	int det;
	int konx,kony;
/*Logo usamos a estrutura de repetição FOR para que o usuario possa entrar com as linhas e colunas que serão usadas para os calculos*/		
		for(konx=0;konx<3;konx++)
		{
			for(kony=0;kony<3;kony++)
			{
			printf("\n\nDigite o valor da coordenada [%i][%i] (Digite 1 caso nao haja valor):\n\n",konx+1,kony+1);
			scanf("%i",&m1[konx][kony]);
			}
		}
/*Usaremos os numeros armazenados para os calculos do DOM*/ 		
	dom=((m1[2][0]*m1[1][1]*m1[0][2])+(m1[2][1]*m1[1][2]*m1[0][0])+(m1[2][2]*m1[1][0]*m1[0][1]));
	dom2=((m1[2][1]*m1[1][0]*m1[0][2])+(m1[2][0]*m1[1][2]*m1[0][1])+(m1[2][2]*m1[1][1]*m1[0][0]));
/*Fazemos o calculo do deteminante usando os DOM´s já obtidos*/	
	det=(dom*-1)+dom2;
/*Mostramos ao usuario os resultado total do determinante da sua matriz*/	
	printf("\n\nO determinante da matriz equivale a: %i\n\n",det);	
	return 0;
}
