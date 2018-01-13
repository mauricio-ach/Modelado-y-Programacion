package shamir;

/**
 * Interfaz.java 
 * Version 1.0
 * Copyright (C)  2017 by Mauricio Araujo Chavez
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
import java.math.BigInteger;
/**
 * @author Mauricio Araujo, Martin Carmona
 * @version 1.0 
 * @since Jan 2 2018
 *
 * Clase controlador para manejar la interacción entre el usuario 
 *
 */

public class Interfaz {
	public static void main(String[] args) {
		byte[] contraseña;
		Controlador controlador = new Controlador();
		Polinomio aux = new Polinomio();
		String opcion = args[0];
		String archivoEval = "evaluaciones.frg";
		int evaluaciones = Integer.parseInt(args[2]);
		int min = Integer.parseInt(args[3]);
		String archivo = args[4];
		
		if(opcion != "c" || opcion != "d")
			System.out.println("Opción incorrecta!");

		if(evaluaciones <= 2)
			System.out.println("El número de evaluaciones debe ser mayor o igual a 3");

		if((min) < 1 || (min) > evaluaciones)
			System.out.println("El número mínimo de puntos debe ser mayor a 1 y menor que el númeor de evaluaciones");



		if(args.length == 5) {
			if(opcion == "c") {
				System.out.println("Por cifrar: " + nombreOriginal);
				contraseña = new BigInteger(controlador.obtenerClave()).abs().toByteArray();
				System.out.println("Realizado contraseña SHA-256");
				controlador.cifrar(contraseña, nombreArchivo, nombreOriginal);
				System.out.println("Archivo cifrado...");
				System.out.println("Creando archivo .frg");
				Polinomio polinomio = new Polinomio((new BigInteger(contraseña).mod(aux.p)), )
				controlador.evaluaciones()
			} else {
				System.out.println("Argumentos inválidos!");
			}
		} else if(args.length == 3) {
			if(args[0] == "d") {

			} else {
				System.out.println("Argumentos inválidos!");
			}
		} else {
			System.out.println("Argumentos inválidos!");
		}
	}
}