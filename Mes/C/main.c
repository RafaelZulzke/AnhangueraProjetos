#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	
char op;


printf("\n\n A - Janeiro \n B - Fevereiro \n C - Março \n D - Abril \n E - Maio \n F - Junho \n G - Julho \n H - Agosto \n I - Setembro \n J - Outubro \n K - Novembro \n L - Dezembro ");
scanf(" %c",&op);
switch(op)
{

case 'a':

printf("Janeiro");

break;

case 'b':
	
printf("Fevereiro");

break;

case 'c':

printf("Março");

break;

case 'd':

printf("Abril");

break;

case 'e':

printf("Maio");

break;

case 'f':

printf("Junho");

break;

case 'g':

printf("Julho");

break;

case 'h':

printf("Agosto");

break;

case 'i':

printf("Setembro");

break;

case 'j':

printf("Outubro");

break;

case 'k':

printf("Novembro");

break;

case 'l':

printf("Dezembro");

break;

default:
	
printf("Mes Invalido");

break;
}
	return 0;
}
