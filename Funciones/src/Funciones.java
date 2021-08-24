/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodri
 */
public class Funciones {
   public static double area_rect(double base, double altura){
       double area = base * altura;
       return area;
   }
   public static void main(String args[]){
       double A = 20.1;
       double B = 2.0;
       double resultado = area_rect(A,B);
       System.out.println("resultado = " + resultado);
   }
}
