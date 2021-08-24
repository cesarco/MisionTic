
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rodri
 */
public class Kilometros2 {

    public void metros() {
        double kilometro = 0.0, metros = 0.0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese el numero de kilometros: ");
        kilometro = obj.nextDouble();
        metros = kilometro * 1000;
        System.out.println("El equivalente en metros es igual a: " + metros + "Metros");
    }

}
