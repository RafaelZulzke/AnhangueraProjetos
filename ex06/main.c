#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
{
	float ce,fa;
	printf("Digite a temperatura em celsius");
	scanf("%f", &ce);
	fa = (ce*1.8)+32.00;
	printf("A temperatura em Fahrenheit %.2f", fa);
	
	return 0;
}
