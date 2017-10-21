/**
 * ControladorEsteganografia.java 
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

package imagen.esteganografia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.awt.Color;

/**
 * @author Mauricio Araujo
 * @version 1.0 
 * @since Oct 18 2017
 *
 * Esta clase funciona como un operador para esconder texto dentro de una imagen
 * ocupando la tecnica de esteganografia LSB.
 *
 */
public class ControladorEsteganografia{
	
	/**
	* Constructor vacio de la clase
	*/
	public ControladorEsteganografia(){}

	/**
	* Metodo que codifica un texto dentro de una imagen utilizando la tecnica
	* de esteganografia LSB.
	* @param path contiene el directorio del archivo a modificar
	* @param archivo_texto contiene el texto que va a ser codificado
	* @param imagen_nombre el nombre de la imagen a modificar
	* @param imagen_salida el nombre de salida de la imagen
	* @return True si la operación fue correcta, False en otro caso.
	*/
	public boolean codificar(String path, String imagen_nombre, String imagen_salida, String texto){
		return true;
	} 

	/**
	* Metodo que decodifica un texto dentro de una imagen utilizando la tecnica
	* de esteganografia LSB.
	* @param path el directorio del archivo a modificar
	* @param imagen_nombre el nombre de la imagen a modificar
	* @return El texto escondido en la imagen
	*/
	public String decodificar(String path, String imagen_nombre){
		return "";
	}

	/**
	* Metodo para obtener el directorio correcto del estilo:
	* path/name.png
	* @param path el directorio 
	* @param name el nombre de salida
	* @return el directorio con la imagen de salida
	*/
	private String getImagenPath(String path, String name){
		return path + "/" + name + ".png";
	}

	/**
	* Metodo para obtener un archivo imagen
	* @param archivo el nombre del archivo a procesar
	* @return BufferedImage generada con el archivo
	*/
	private BufferedImage getImagen(String archivo)
	{
		return null;
	}

	/**
	* Método para guardar una imagen
	* @param imagen la imagen a ser guardada
	* @param archivo donde sera guardada la imagen
	* @return True si resulto existoso, False en otro caso
	*/
	private boolean setImagen(BufferedImage imagen, File archivo)
	{
		return true;
	}

	/**
	* Metodo para agregar texto dentro de una imagen
	* @param imagen donde sera guardado el texto
	* @param texto el texto a ser codificado
	* @return la imagen con el texto dentro de ella
	*/
	private BufferedImage agregaTexto(BufferedImage imagen, String texto)
	{
		return null;
	}

	/**
	* Obtiene los datos que contiene la imagen
	* @param imagen de donde se requieren los datos
	* @return un arreglo con los datos de la imagen
	*/
	private byte[] obtenDatos(BufferedImage imagen) {
		return null;
	}

	/**
	* Metodo para convertir un int a formato bit
	* @param el entero a convertir
	* @return su equivalente en formato bit
	*/
	private byte[] convierteBit(int i){

		byte byte0 = (byte) ((i & 0x000000FF) );
		byte byte1 = (byte) ((i & 0x0000FF00) >>> 8);
		byte byte2 = (byte) ((i & 0x00FF0000) >>> 16);
		byte byte3 = (byte) ((i & 0xFF000000) >>> 24);

		return(new byte[] {byte3, byte2, byte1, byte0});
	}

	/**
	* Metodo para codificar un arreglo de byte en otro aplicando una compensacion
	* @param los datos de la imagen original
	* @param los datos que seran agregados en el original
	* @param la compensacion de la operacion
	* @return un arreglo con la informacion mezclada apropiadamente
	*/
	private byte[] codificaTexto(byte[] imagen, byte[] agregado, int compensacion){
		return null;
	}

	/**
	* Metodo para decodificar texto de una imagen 
	* @param un arreglo con los datos de la imagen de entrada
	* @return un arreglo con el texto dentro de la imagen
	*/
	private byte[] decodificaTexto(byte[] imagen){
		return null;
	}
}