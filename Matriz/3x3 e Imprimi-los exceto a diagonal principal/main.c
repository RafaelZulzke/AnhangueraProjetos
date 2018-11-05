#include <stdio.h>
#include <stdlib.h>
#include <conio.h>  
#include <math.h>  
#include <string.h> 
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int lin, col, tab;
	int mat[3][3];
	
	for(lin=0;lin<3;lin++)
	{
	for(col=0;col<3;col++)
	{
		
	printf("\n\nDigite o elemento da linha %d, coluna %d da matriz\n\n", lin+1,col+1);
	scanf("%d", &mat[lin][col]);
	}	
	}
	
	printf("\n\nMatriz\n\n");
	
	for(lin=0; lin<3; lin++)
	{
	for(col=0;col<3; col++)
	printf("%d\n", mat[lin][col]);
	printf("\n\n");	
	}
	
	printf("\n\n Matriz exceto diagonal principal\n\n");
	for(lin=0; lin<3;lin++)
	{
	for(col=0;col<3;col++)
	{
	if(lin !=col)
	printf("%d", mat[lin][col]);
    printf("\n\n");		
	}	
	}
	return 0;
}
