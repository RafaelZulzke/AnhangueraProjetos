#include <stdio.h>// bibliotecade e/s padrão 
#include <stdlib.h> // bibliotecade funções padrão 
#include <stdbool.h> // bibliotecapara valores lógicos
#define Tamanho 10 // tamanho da lista

int lista[ Tamanho ]; // vetor que armazena a lista 
int ultimo;
// Função para Inicializar a lista
void Inicializar( void ) 
{
 ultimo = -1 ; // atribui -1 para o indicador de ocupação 
}

//Função que testa se a lista está vazia
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
	printf("\n\nImpossívelInserir : Lista cheia !"); 
	return; // finaliza a função 
	}
	ultimo++; // incrementao indicador de posição 
	lista[ ultimo ] = valor; // armazena o valor na lista
}

void Inserir_no_Final(int valor) 
{ 
	if( Teste_Cheia( ) == true ) // se teste verdadeiro 
	{ 
	printf("\n\nImpossívelInserir : Lista cheia !"); 
	return; // finaliza a função 
	}
	ultimo++; // incrementao indicador de posição 
	lista[ ultimo ] = valor; // armazena o valor na lista
}

void Imprimir(void ) 
{ 
	if( Teste_Vazia( ) == true ) // se teste verdadeiro 
	{ 
	printf("\n\n Impossívelimprimir : Lista vazia !"); 
	return; // finaliza a função 
	}
		int i; // variávelauxiliar para percorrera lista 
		for( i=0; i<=ultimo; i++ ) 
		{ 
		printf("\n %i na posicao %i \n", lista[i], i ); // imprime elemento 
		}
}
// Função que insere um elemento numa posição determinada
void Inserir_na_Posicao(int posicao, int valor) 
{ 
	if( Teste_Cheia( ) == true ) // se teste verdadeiro 
	{ 
	printf("\n\n ImpossívelInserir : Lista cheia !"); 
	return; // finaliza a função
    }
    	int i; //variávelauxiliar 
		for( i = ultimo+1 ; i >=posicao ; i-- ) 
		{ 
		lista[ i ] = lista[ i-1 ]; // rearranja os elementos da lista 
		}
		ultimo++; // incrementaindicador de posição 
		lista[ posicao ] = valor; 
}

int Procurar( int valor ) 
{ 
	if( Teste_Vazia( ) == true ) // se teste verdadeiro 
	{ 
	printf("\n\nLista vazia!\n"); 
	return -1; // retorna posição inválida 
	}
		int i; // variávelauxiliar 
		for( i=0; i<=ultimo; i++ ) 
		{ 
			if( lista[ i ] == valor ) //procuraelemento na lista 
			{ 
			printf("\n\nElemento %i encontrado na posição %i\n",valor,i); 
			return i; // se encontrou retorna a sua posição 
			} 
		}
	printf("\n\n Elemento não encontrado ! \n"); 
	return -1; // se não encontrouretorna posição inválida 
	}
	
void Retirar( int valor ) 
{ 
	if( Teste_Vazia( ) == true ) // se teste verdadeiro 
	{ 
	printf("\n\n Impossivel retirar : Lista vazia!"); 
	return; // finaliza a função 
	}
		int posicao = Procurar(valor ); //variávelauxiliar que recebe // a posição do elemento
		if( posicao == -1 ) // se posição inválida 
		{ 
		printf("\n\n Impossível retirar : Elemento não encontrado!"); 
		return; // finaliza a função 
		}
			int i; // variávelauxiliar
			for( i=posicao; i<= ultimo; i++ ) 
			{ 
			lista[ i ] = lista[ i+1 ]; // rearranja a lista 
			}
	printf("\n\n Elemento %i retirado da posição %i da lista!", valor, posicao);
	ultimo--;
}

int main( ) // programaprincipal 
{
	
Inicializar( ) ; // inicializa lista
printf("\n \n");

Imprimir() ; //imprime a lista
printf("\n \n");

//Teste das funções criadas 
printf("\n Inserindo os elementos 35, 57, 25,12 e 69 na lista \n");

Inserir_no_Final(35 ) ; // insere o elemento na lista 
Inserir_no_Final(57 ) ; // insere o elemento na lista 
Inserir_no_Final(25 ); // insere o elemento na lista 
Inserir_no_Final(12 ) ; // insere o elemento na lista 
Inserir_no_Final(69 ) ; // insere o elemento na lista
printf("\n\n Imprimindo a lista \n");

Imprimir() ;
printf("\n\n Inserindo o elemento 77 no inicio da lista \n");

Inserir_no_Inicio(77 ); //insere elemento no início da lista
printf("\n\n Imprimindo a lista \n");
Imprimir() ; 

printf("\n\n Inserindo o elemento 55 na posição 3 \n") ;

Inserir_na_Posicao(3 , 55 ) ; //insereelemento na posição indicada
printf("\n\n Imprimindo a lista \n");
Imprimir() ; 

printf("\n\n Inserindo os elementos 59, 22 e 19 na lista \n");

Inserir_no_Final(59 ) ; //insere elemento na lista 
Inserir_no_Final(22 ) ; // insere o elemento na lista 
Inserir_no_Final(19 ) ; // insere o elemento na lista
printf("\n\n Imprimindo a lista \n");
Imprimir() ; 

}

