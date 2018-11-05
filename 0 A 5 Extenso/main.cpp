#include <iostream>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv)
 {
	int a;
	printf("Digite Numeros de 0 a 5\n");
	scanf("%d", &a);
	switch(a)
	{
	 case 1 :
	 printf("Um");
	 break;
	 case 2:
	 printf("Dois");
	 break;
	 case 3:
	 printf("Três");
	 break;
	 case 4:
	 printf("Quatro");
	 break;
	 case 5:
	 printf("Cinco");
	 break;
	 case 0:
	 printf("Zero");
	 break;
	 default:
	 printf("Numero não disponivel");
	 break;
	}
	return 0;
}
