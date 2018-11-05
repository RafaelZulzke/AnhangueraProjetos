#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int m1 [3][3]; /* matriz 3x3 */
	int dom,dom2; /* Variaveis multiplicadoras */
	int det;
	int konx,kony; /*variaveis contadores*/
	for(konx=0;konx<3;konx++){
		for(kony=0;kony<3;kony++){
		printf("Digite o valor da coordenada [%i][%i] (Digite 1 caso nao haja valor):",konx+1,kony+1);
		scanf("%i",&m1[konx][kony]);

		}
	}
	dom=((m1[2][0]*m1[1][1]*m1[0][2])+(m1[2][1]*m1[1][2]*m1[0][0])+(m1[2][2]*m1[1][0]*m1[0][1]));
	dom2=((m1[2][1]*m1[1][0]*m1[0][2])+(m1[2][0]*m1[1][2]*m1[0][1])+(m1[2][2]*m1[1][1]*m1[0][0]));
	det=(dom*-1)+dom2; /* Recebe o valor dos Determinantes */
	printf("A determinante da matriz equivale a: %i",det); 
	
	getch();
	system("pause");
}

