#include <iostream>
#include <stdio.h>
#include <stdlib.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) 
{
	
int a,b,c;

printf("Digite a tabuada");
scanf("%d", &a);

for(b = 0; b <=10; b++)
{
c = a*b;
printf("\n%d * %d = %d\n", a,b,c);
} 
	return 0;
}
