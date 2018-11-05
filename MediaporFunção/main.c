#include <stdio.h>
#include <stdlib.h>

int op;
float a,b,c,e;
float d;

char nome[20], ra[15];

char CadastroAlunos(char nome, char ra)
{
	FILE*arquivo;
	arquivo=fopen("E:\Anhanguera\3 Semestre\Algoritmos\MediaporFunção\BD.txt","w");
	if(arquivo == NULL)
	{
	printf("Erro de Abertura");
	exit(1);	
	}
	printf("Digite o Nome do Aluno");
	gets(nome);
	printf("Digite o Ra do Aluno");
	gets(ra);
    return(nome,ra);
}



void InsercaoNum()
{
	char r;
	CadastroAlunos(nome,ra);
	do{
	printf("\n\nDigite a Primeira Nota\n\n");
	scanf("%f", &a);
	printf("\n\nDigite a Segunda Nota\n\n");
	scanf("%f", &b);
	printf("\n\nDigite a Terceira Nota\n\n");
	scanf("%f", &c);
	system("cls");	
	printf("\n\n\nDeseja inserir outra nota? \n\n");
	r = getche();
	}while(r != 'n');
}

float Calculo(float a, float b, float c)
{
	printf("Nome do Aluno %s \n\n RA do Aluno %s", nome,ra);
	d = (a+b+c)/3;	
	return (d);
	
}

void Sair()
{
	system("exit");
}

void Menu()
{

do
	{	
		printf("\n\n1 - Inserir Notas dos Alunos \n\n");
		printf("\n\n2 - Calcular Notas\n\n");
		printf("\n\n3 - Fechar\n\n");
		scanf("%d",&op);
		
		system("cls");

			switch(op)
			{
			case 1:
			InsercaoNum();
			break;
			
			case 2:
			d = Calculo(a,b,c);
			printf("\n\nA Media do Aluno e %.2f\n\n", d);
			break;
			
			case 3:
			Sair();
			break;
	
				
			}	
	}while(op!=3);
}
int main(int argc, char *argv[]) 
{
	Menu();

	return 0;
}
