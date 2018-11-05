#include <stdio.h>
#include <stdlib.h>
int n1,n2;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

float calcular(float n1, float n2)
{
float m;
m = (n1+n2)/2;
return(m);	
}

int main(int argc, char *argv[]) 
{
float n1,n2,m;
printf("\nDigite o valor de N1\n");
scanf("%f", &n1);	
printf("\nDigite o valor de N2\n");
scanf("%f", &n2);

m = calcular(n1,n2);
printf("\nA media é %.2f\n", m);
}
