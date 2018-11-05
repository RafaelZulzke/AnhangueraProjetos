#include <stdio.h>// bibliotecade e/s padr�o 
#include <stdlib.h> // bibliotecade fun��es padr�o 
#include <stdbool.h> // bibliotecapara valores l�gicos
#define Tamanho 10 // tamanho da lista

int lista[ Tamanho ]; // vetor que armazena a lista 
int ultimo;
// Fun��o para Inicializar a lista
void Inicializar( void ) 
{
 ultimo = -1 ; // atribui -1 para o indicador de ocupa��o 
}

//Fun��o que testa se a lista est� vazia
bool Teste_Vazia( void ) 
{ 
	if( ultimo == -1 ) 
	{ 
	return true; // se verdade retorna true
	} 
		else 
		{ 
		return false; // se falso, retorna false 
		} 
}

bool Teste_Cheia( void ) 
{ 
	if( ultimo == Tamanho -1 ) 
	{ 
	return true; // se verdade retorna true 
	} 
		else 
		{ 
		return false; // se verdade retorna false 
		} 
}

void Inserir_no_Inicio(int valor) 
{ 
	if( Teste_Cheia( ) == true ) // se teste verdadeiro 
	{ 
	printf("\n\nImposs�velInserir : Lista cheia !"); 
	return; // finaliza a fun��o 
	}
	ultimo++; // incrementao indicador de posi��o 
	lista[ ultimo ] = valor; // armazena o valor na lista
}

void Inserir_no_Final(int valor) 
{ 
	if( Teste_Cheia( ) == true ) // se teste verdadeiro 
	{ 
	printf("\n\nImposs�velInserir : Lista cheia !"); 
	return; // finaliza a fun��o 
	}
	ultimo++; // incrementao indicador de posi��o 
	lista[ ultimo ] = valor; // armazena o valor na lista
}

void Imprimir(void ) 
{ 
	if( Teste_Vazia( ) == true ) // se teste verdadeiro 
	{ 
	printf("\n\n Imposs�velimprimir : Lista vazia !"); 
	return; // finaliza a fun��o 
	}
		int i; // vari�velauxiliar para percorrera lista 
		for( i=0; i<=ultimo; i++ ) 
		{ 
		printf("\n %i na posicao %i \n", lista[i], i ); // imprime elemento 
		}
}
// Fun��o que insere um elemento numa posi��o determinada
void Inserir_na_Posicao(int posicao, int valor) 
{ 
	if( Teste_Cheia( ) == true ) // se teste verdadeiro 
	{ 
	printf("\n\n Imposs�velInserir : Lista cheia !"); 
	return; // finaliza a fun��o
    }
    	int i; //vari�velauxiliar 
		for( i = ultimo+1 ; i >=posicao ; i-- ) 
		{ 
		lista[ i ] = lista[ i-1 ]; // rearranja os elementos da lista 
		}
		ultimo++; // incrementaindicador de posi��o 
		lista[ posicao ] = valor; 
}

int Procurar( int valor ) 
{ 
	if( Teste_Vazia( ) == true ) // se teste verdadeiro 
	{ 
	printf("\n\nLista vazia!\n"); 
	return -1; // retorna posi��o inv�lida 
	}
		int i; // vari�velauxiliar 
		for( i=0; i<=ultimo; i++ ) 
		{ 
			if( lista[ i ] == valor ) //procuraelemento na lista 
			{ 
			printf("\n\nElemento %i encontrado na posi��o %i\n",valor,i); 
			return i; // se encontrou retorna a sua posi��o 
			} 
		}
	printf("\n\n Elemento n�o encontrado ! \n"); 
	return -1; // se n�o encontrouretorna posi��o inv�lida 
	}
	
void Retirar( int valor ) 
{ 
	if( Teste_Vazia( ) == true ) // se teste verdadeiro 
	{ 
	printf("\n\n Impossivel retirar : Lista vazia!"); 
	return; // finaliza a fun��o 
	}
		int posicao = Procurar(valor ); //vari�velauxiliar que recebe // a posi��o do elemento
		if( posicao == -1 ) // se posi��o inv�lida 
		{ 
		printf("\n\n Imposs�vel retirar : Elemento n�o encontrado!"); 
		return; // finaliza a fun��o 
		}
			int i; // vari�velauxiliar
			for( i=posicao; i<= ultimo; i++ ) 
			{ 
			lista[ i ] = lista[ i+1 ]; // rearranja a lista 
			}
	printf("\n\n Elemento %i retirado da posi��o %i da lista!", valor, posicao);
	ultimo--;
}

int main( ) // programaprincipal 
{
	
Inicializar( ) ; // inicializa lista
printf("\n \n");

Imprimir() ; //imprime a lista
printf("\n \n");

//Teste das fun��es criadas 
printf("\n Inserindo os elementos 35, 57, 25,12 e 69 na lista \n");

Inserir_no_Final(35 ) ; // insere o elemento na lista 
Inserir_no_Final(57 ) ; // insere o elemento na lista 
Inserir_no_Final(25 ); // insere o elemento na lista 
Inserir_no_Final(12 ) ; // insere o elemento na lista 
Inserir_no_Final(69 ) ; // insere o elemento na lista
printf("\n\n Imprimindo a lista \n");

Imprimir() ;
printf("\n\n Inserindo o elemento 77 no inicio da lista \n");

Inserir_no_Inicio(77 ); //insere elemento no in�cio da lista
printf("\n\n Imprimindo a lista \n");
Imprimir() ; 

printf("\n\n Inserindo o elemento 55 na posi��o 3 \n") ;

Inserir_na_Posicao(3 , 55 ) ; //insereelemento na posi��o indicada
printf("\n\n Imprimindo a lista \n");
Imprimir() ; 

printf("\n\n Inserindo os elementos 59, 22 e 19 na lista \n");

Inserir_no_Final(59 ) ; //insere elemento na lista 
Inserir_no_Final(22 ) ; // insere o elemento na lista 
Inserir_no_Final(19 ) ; // insere o elemento na lista
printf("\n\n Imprimindo a lista \n");
Imprimir() ; 

}

