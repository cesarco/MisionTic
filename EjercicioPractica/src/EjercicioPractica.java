
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
    public static void main(String args[]){
        
        Scanner number = new Scanner(System.in);
        System.out.println("ingerese el primer numero: ");
        int A = number.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int B = number.nextInt();
        
        int result = A + B;
        System.out.println("result = " + result);
        
    }
    
}
