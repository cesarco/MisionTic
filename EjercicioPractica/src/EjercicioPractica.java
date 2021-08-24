
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
public class EjercicioPractica {

    public static void main(String args[]) {
        // Suma de dos numeros

        Scanner sc = new Scanner(System.in);
//        System.out.println("ingerese el primer numero: ");
//        int A = number.nextInt();
//
//        System.out.println("Ingrese el segundo numero");
//        int B = number.nextInt();
//
//        int result = A + B;
//        System.out.println("result = " + result);

        System.out.println("Digite la primera coordenada: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Digite la segunda coordenada: ");

        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        
        double distance = Math.sqrt(Math.pov(x2 - x1),2) + Math.pov((y2-y1),2);
        
        System.out.println("La distancia de la coordenadas es: " + distance);

    }

}
