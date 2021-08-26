/*
 * un programa que compare dos nombres para verificar que son iguales
mostrando un mensaje al final que diga: los nombres son iguales / los nombres son 
diferentes (los nombres ser introducidos por el usuario
 */
package cadenas;

import java.util.Scanner;

public class Cadenas {

    public static void main(String[] args){
        String nombre_uno = "", nombre_dos="";
        Scanner lea=new Scanner(System.in);
        System.out.println("Por favor ingresa el primer nombre: ");
        nombre_uno=lea.nextLine();
        
        System.out.println("Por favor ingresa el segundo nombre: ");
        nombre_dos=lea.nextLine();
        
        if(nombre_uno.equals(nombre_dos)){
            System.out.println("Los nombres son iguales..");
        }else{
            System.out.println("los nombres son diferentes..");
        }
    
}
}
