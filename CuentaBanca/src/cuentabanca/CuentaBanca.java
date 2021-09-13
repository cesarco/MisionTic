/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabanca;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class CuentaBanca {
// se Crean variables privadas

    private String titular;
    private int cedulaTitular;
    private double cantidadDiner0;
    private String tipoCuenta;

    // get and set
    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String nombreTitular) {
        this.titular = nombreTitular;
    }

    public int getCedula() {
        return this.cedulaTitular;
    }

    public void setCedula(int cedulatTitular) {
        this.cedulaTitular = cedulaTitular;
    }

    public double getCantidad() {
        return this.cantidadDiner0;
    }

    public void setCantidad(double cantidadDinero) {
        this.cantidadDiner0 = cantidadDinero;
    }

    public String getTcuenta() {
        return this.tipoCuenta;
    }

    public void setTcuenta(String tipoCuenta1) {
        this.tipoCuenta = tipoCuenta1;
    }

    public double agregar(double ingreso) {
        double r = ingreso + cantidadDiner0;
        return r;
    }

    public double Retirar(double retiro) {
        double r2 = cantidadDiner0 - retiro;
        return r2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario Cesar = new Usuario();
        Cesar.setNombre("Cesar Luis Rodriguez Solera");
        Cesar.setCedula(1006860748);
        Cesar.setCantidad(1000000);
        Cesar.setCiudad("Villavicencio");
        Cesar.setDireccion("Caller 5ta sur 48-45");
        Cesar.setGenero('M');
        Cesar.setIdentificacion("1006860748");
        Cesar.setPais("Colombia");
        Cesar.setSalario(2000000);
        Cesar.setTcuenta("Ahorros");
        Cesar.setTitular("Cesar Rodriguez");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite ingresar o retirar, dinero de la cuenta");
        String operaciones = sc.nextLine();

        if (operaciones.equals("ingresar")) {
            System.out.println("Cuanto dinero desea ingresar");
            double digitado = sc.nextDouble();
            double f1 = Cesar.agregar(digitado);
            System.out.println("Su saldo actual es: " + f1 + "Pesos");

        } else if (operaciones.equals("Retirar")) {
            System.out.println("Cuanto dinero desea Retirar");
            double digitado1 = sc.nextDouble();
            if (digitado1 > Cesar.getCantidad()) {
                System.out.println("Dicha cantidad no esta disponible");
            } else if (digitado1 > 600000) {
                System.out.println("El tope maximo a retirar es de 600.000 pesos");
            } else {
                double f2 = Cesar.Retirar(digitado1);
                System.out.println("Su saldo actual es: " + f2 + "Pesos");
            }

        }

    }

}
