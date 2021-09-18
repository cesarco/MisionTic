/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterfaces;

/**
 *
 * @author rodri
 */
public class JavaInterfaces extends ClasePadre implements InterfaceEjemplo, InterfaceEjemploUno {
    
    public void metodoUno(){
        System.out.println("Metodo uno");
    }
    public int metodoDos(int a, int b){
        System.out.println("Metodo dos");
        return 0;
    }

    public String convertirStringMayuculas(String cad) {
        return cad.toUpperCase();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        JavaInterfaces ho = new JavaInterfaces();
        String nombre = ho.convertirStringMayuculas("Cesar");
        System.out.println("Nombre: " + nombre);
    }



    
    
}
