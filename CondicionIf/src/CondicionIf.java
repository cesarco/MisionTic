
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
        System.out.println("Introduce el precio del producto :");

        double precio = sc.nextDouble();
        System.out.println("Introduce el numero de unidades: ");

        int unidades = sc.nextInt();
        double precioCompra = precio * unidades;
        double descuento;

        if (precioCompra < 100) {
            descuento = 0;
        } else if (precioCompra > 200) {
            descuento = (15 * precioCompra) / 100;

        } else {
            descuento = (10 * precioCompra) / 100;
        }
        double precioFinal = precioCompra - descuento;
        System.out.println("Precio final " + precioFinal);

    }
}
