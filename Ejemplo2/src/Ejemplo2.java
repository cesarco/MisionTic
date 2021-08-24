
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
public class Ejemplo2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.equals("Hola Mundo")) {
            System.out.println("Hola Usuario");
        } else {
            System.out.println("Opción no valida");
        }
    }
}
