/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodri
 */
public class DoWhile {
    public static void main(String args[]){
        int x = 5;
        int y = 4;
        
        do {
            System.out.println("X es menor que Y");
            x = x +2;
        }while (x <y);
        System.out.println("x yo NO es menor que Y, vale ahora..");
    }
}
