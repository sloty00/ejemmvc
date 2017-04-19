/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemmvc;
import ejemmvc.Animal; //Importamos la clase Animal para poder usarla
import ejemmvc.NewJFrame;
import java.awt.Frame;
/**
 *
 * @author Jose
 */
public class ejemplo
{
    
	public static void main(String[] args)
	{
                NewJFrame frame =new NewJFrame();
		//Creamos un animal cuyo nombré será Falco
		Animal miAnimal = new Animal("Falco");
		//Le establecemos 3 años de edad a Falco.
		miAnimal.setEdad(3);
		//Mostraremos el nombre del animal por pantalla
		System.out.println("El nombre es: " + miAnimal.getNombre());
		//Mostramos la edad del animal por pantalla
		System.out.println(" y tiene " + miAnimal.getEdad() + " años");
		//Este código deberia imprimir "El nombre es: Falco y tiene 3 años"
                frame.txt_1.setText(miAnimal.getNombre());
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
	}
}
