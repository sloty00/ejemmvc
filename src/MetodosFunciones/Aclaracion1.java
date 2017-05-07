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
public class Aclaracion1
{
    private int atributo1;
    private int atributo2;
    private String atributo3;


    public void setAtributo1(int attr1)
    {
        atributo1 = attr1;
    }

    public void setAtributo2(int attr2)
    {
        atributo2 = attr2;
    }

    public void setAtributo3(String attr3)
    {
        atributo3 = attr3;
    }


    public static void main(String[] args)
    {
            NewJFrame frame = new NewJFrame();
            Aclaracion1 ac1 = new Aclaracion1();//Creamos un objeto con constructor vacío
            Aclaracion1 ac2 = new Aclaracion1();//Creamos otro objeto con constructor vacío

            //Establecemos los valores de los atributos usando métodos set de cada uno
            ac1.setAtributo1(5);
            ac1.setAtributo2(10);
            ac1.setAtributo3("x");

            //Establecemos los valores de los atributos accediendo directamente a cada uno
            ac2.atributo1 = 5;
            ac2.atributo2 = 10;
            ac2.atributo3 = "x";

            System.out.println(ac1.atributo1 + ", " + ac1.atributo2 + ", " +ac1.atributo3);//Mostramos el valor de los atributos de ac1
			//Imprime '5, 10, x'

            System.out.println(ac2.atributo1 + ", " + ac2.atributo2 + ", " +ac2.atributo3);//Mostramos el valor de los atributos de ac2
            //Imprime '5, 10, x'
            
            frame.txt_1.setText(ac2.atributo1+" "+ac2.atributo2+" "+ac2.atributo3);
            frame.setVisible(true);
    }
}

