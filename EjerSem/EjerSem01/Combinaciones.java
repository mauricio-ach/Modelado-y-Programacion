import java.math. *;
import java.util.Scanner;

/**
 * Clase que regresa el número de combinaciones de n en r.
 */
public class Combinaciones{

    /**
     * Calcula el factorial de un numero entero.
     * @return un entero representando el factorial de un número.
     */
    public static int factorial(int i){
	if ( i <= 1 ){
	    return 1;
	}else{
	    return i * factorial(i - 1);
	}
    }

    /**
     * Calcula las combinaciones de un conjunto de n elementos
     * de tamaños de r.
     * @return número de todas las combinaciones posibles.
     */
    public static BigInteger combinations(int n , int r){
        BigInteger com = BigInteger.valueOf(factorial(n)).divide(BigInteger.valueOf(factorial(n - r))
								 .multiply(BigInteger.valueOf(factorial(r))));
	return com;
    }

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	int n;
	int r;
	BigInteger resultado;
	System.out.print("Introduzca un número entero: ");
	n = sc.nextInt();
	System.out.print("Introduzca un número entero: ");
	r = sc.nextInt();
	resultado = combinations(n , r);
	System.out.println(resultado);
    }
}
