/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemmvc;

/**
 *
 * @author Jose
 */
public class Animal
{
	private String raza;
	private String nombre;
	private int edad;

	public Animal(String nuevoNombre)
	{
		nombre = nuevoNombre; //Se le da un nombre al animal
	}

	//Método para obtener la edad del animal
	public int getEdad()
	{
		return edad;
	}

	//Método para establecer la edad del animal
	public void setEdad(int nuevaEdad)
	{
		edad = nuevaEdad;
	}

	//Método para obtener el nombre del animal
	public String getNombre()
	{
		return nombre;
	}
}
