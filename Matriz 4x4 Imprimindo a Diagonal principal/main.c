#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
int matriz[4][4], i, j; 
for (i=0; i<4; i++) 
for (j=0; j<4; j++)
{ 
printf("Informe matriz[%d][%d]: ", i, j); 
scanf("%d", &matriz[i][j]); 
} 
printf("\nDiagonal principal:\n");
for (i=0; i<4; i++) 
printf("\t%d", matriz[i][i]); 

return 0;
}
