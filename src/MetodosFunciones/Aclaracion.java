/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosFunciones;

/**
 *
 * @author Jose
 */
public class Aclaracion
{
	private int atributo1;
	private int atributo2;
	private String atributo3;

	//Declaramos un constructor
	public Aclaracion(int attr1, int attr2, String attr3)
	{
		atributo1 = attr1;
		atributo2 = attr2;
		atributo3 = attr3;
	}

	public static void main(String[] args)
	{
		Aclaracion ac = new Aclaracion(5, 10, "x");//Creamos un objeto enviando parámetros al constructor

		System.out.println(ac.atributo1 + ", " + ac.atributo2 + ", " +ac.atributo3);//Mostramos el valor de los atributos
        //Imprime '5, 10, x'
	}
}
