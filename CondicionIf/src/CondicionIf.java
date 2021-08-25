
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
public class CondicionIf {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduce el precio del producto :");
//
//        double precio = sc.nextDouble();
//        System.out.println("Introduce el numero de unidades: ");
//
//        int unidades = sc.nextInt();
//        double precioCompra = precio * unidades;
//        double descuento;
//
//        if (precioCompra < 100) {
//            descuento = 0;
//        } else if (precioCompra > 200) {
//            descuento = (15 * precioCompra) / 100;
//
//        } else {
//            descuento = (10 * precioCompra) / 100;
//        }
//        double precioFinal = precioCompra - descuento;
//        System.out.println("Precio final " + precioFinal);
        System.out.println("Introduce la nota entre 0 y 10 : ");
        float nota = sc.nextFloat();

        if (nota >= 0 && nota < 3) {
            System.out.println("Deficiente..");
        } else if (nota >= 3 && nota < 5) {
            System.out.println("Insuficiente..");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Suficiente..");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("Bien..");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Excelente..");
        } else if (nota >= 10 && nota <= 10) {
            System.out.println("Sobresaliente..");
        }else {
            System.out.println("Nota no valida");
        }
    }
}
