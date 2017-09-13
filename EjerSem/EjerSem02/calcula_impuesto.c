#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*
Programa que calcula el impuesto a pagar por un producto
en tres paises diferentes Mexico, EUA y Colombia.
*/

//Variables constantes
#define iva 16.00
#define tax 3.45
#define renta 15.00

////////////////////////////////////////
//Funciones a utilizar
////////////////////////////////////////

/*
Funcion para multiplicar dos entradas 
*/
double multiplica(double entrada_uno, double entrada_dos)
{
	return entrada_uno * entrada_dos;
}

/*
Funcion para imprimir el total a pagar
dependiendo del pais seleccionado y su iva,
renta o tax respectivamente.
*/
void imprime_pago(char const *pais, double dato)
{

	if(strcmp(pais, "MEXICO") == 0)
	{
		printf("Pagar al SAT: %.3f\n", dato);
		printf("IVA: %.3f\n", multiplica(dato, iva));
	}
	else if(strcmp(pais, "EUA") == 0)
	{
		printf("Pay to US Government: %.3f\n", dato);
		printf("Tax: %.3f\n",multiplica(dato, tax));
	}
	else if(strcmp(pais, "COLOMBIA") == 0)
	{
		printf("Pagar al Ministerio de Hacienda: %.3f\n", dato);
		printf("Reanta: %.3f\n", multiplica(dato, renta));
	}
}

/*
Funcion para validar el pais
*/
int verifica_pais(char const *pais)
{
	if(strcmp(pais, "MEXICO") == 0 || strcmp(pais, "EUA") == 0 || 
		strcmp(pais, "COLOMBIA") == 0)
		return 0;
	else 
		return 1;
}

/*
Funcion para validar si el segundo argumento es un numero
*/
int verifica_numero(char const *numero)
{
	return atof(numero);
}

/*
Funcion principal que calcula el impuesto.
*/
int main(int argc, char const *argv[])
{	
	//Variables 
	double entrada = 0;

	//Validamos entradas
	if(argc != 3){
		printf("Los datos han sido ingresados incorrectamente! Por favor verifica...\n");
		return 1;
	}

	if(verifica_pais(argv[1]) == 1){
		printf("País incorrecto! Por favor verifica...\n");
		return 1;
	}

	if(verifica_numero(argv[2]) == 0.0){
		printf("Numero incorrecto! Por favor verifica...\n");
		return 1;
	}

	//Realizamos calculos e imprimimos
	entrada = atof(argv[2]);
	imprime_pago(argv[1], entrada);

	return 0;
} 