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
		Polinomio polinomio;
		String nombreArchivo = args[2];
		if(args.length == 5) {
			if(args[0] == "c") {
				System.out.println("Por cifrar: " + args[5]);
				contraseña = new BigInteger(controlador.obtenerClave()).abs().toByteArray();
				System.out.println("Realizado contraseña SHA-256");
				controlador.cifrar(contraseña, )
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