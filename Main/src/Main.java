
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodri
 */
public class Main {
    
    public static void main(String args[]) throws IOException {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("ingrese nombre:");
        
        String nombre = entrada.nextLine();
        
        System.out.println("el nombre ingresasdo fue: "+nombre);
        
        
        System.out.println("Ingrese un numero entero");
        int num = entrada.nextInt();
        System.out.println("numero ingresado " +num);
        
        
        System.out.println("ingrese un numero decimal");
        
       float num2 = entrada.nextFloat();
        System.out.println("numero ingresado" + num2);
        
        
       BufferedReader leer = new BufferedReader (new
            InputStreamReader(System.in));
        System.out.println("Diga el nombre");
       String nombre1 = leer.readLine();
        System.out.println("Ingreso nombre: " + nombre1);
        
       
                
        
        
    }
    
}
