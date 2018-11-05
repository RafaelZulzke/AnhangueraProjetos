#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int n1,n2;

void calcula(float n1, float n2)
{
float m;

m = (n1+n2)/2;
printf("\nMedia %2.f\n", m);
}

int main(int argc, char *argv[]) 
{
	
printf("\nCalculo de media\n");
printf("\nDigite N 1\n");
scanf("%i", &n1);
printf("\nDigite N 2\n");
scanf("%i", &n2);
calcula(n1,n2);
printf("\nFim de Transmissão\n");
getch();

}
