#include <stdio.h>
#include <stdlib.h>
float peso,altura, imc;
int idade;

void cadastro()
{
printf("\n Digite a idade\n");
scanf("\n%i",&idade);
printf("\n Digite o peso\n");
scanf("\n%f",&peso);
printf("\n Digite a altura\n");
scanf("\n%f",&altura);
}

void tabelapeso()
{
	
	if (imc <= 18.5)
	{
	printf("\nAbaixo do peso");	
	}
	
	if (imc >=18.6 && imc <=24.9)
	{
	printf("\nPeso Ideal");	
	}
	
	if(imc >= 25 && imc <= 29.9)
	{
	printf("\nLevemente Acima do Peso");	
	}
	
	if(imc >= 30 && imc <=34.9)
	{
	printf("\nObesidade de 1 Grau");	
	}
	
	if(imc >= 35 && imc <=39.9)
	{
	printf("\nObesidade de 2 Grau");	
	}
	
	if(imc > 40)
	{
	printf("\nObesidade de 3 Grau");	
	}

}
float calculo()
{
	imc=peso/(altura*altura);
	return imc;
}
int main(int argc, char *argv[]) 
{
	
	cadastro();
	calculo();
	printf("\n%.2f",imc);
	tabelapeso();

}
