#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	float area,perimetro,lado;
	printf("\nDigite o valor do lado do quadrado\n");
	scanf("%f", &lado);
	area = lado*lado;
	perimetro = lado*4;
	printf("\nO Valor da area é: %2.f\n", area);
	printf("\nO Valor do perimetro é: %2.f\n", perimetro);
	return 0;
}
