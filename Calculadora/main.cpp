#include <iostream>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) 
{
	float a,b,c;
	char op;
	printf("Digite o 1 Numero\n\n");
	scanf("%f", &a);
	printf("Digite o 2 Numero\n\n");
	scanf("%f", &b);
	printf ("Escolha a operacao usada  \n\n'+' - Adicao \n\n '-' - Subtracao \n\n '*' - Multiplicacao \n\n '/' - Divisao\n\n");
	scanf("%s", &op);
	switch(op)
		{
		case '+':
		c = a+b;
		printf("A soma  é %.2f", c);
		break;
		case '-':
		c = a-b;
		printf("A subtracao é %.2f", c);
		break;
		case '*':
		c = a*b;
		printf("A multiplicacao é %.2f", c);
		break;
		case '/':
		c = a/b;
		printf("A divisao é %.2f", c);
		break;
		default:
		printf("Opcao Indisponivel");
		break;
 		}
	
	return 0;
}
