/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Reto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DataBaseProducts listaProductos = new DataBaseProducts();

        Scanner sc = new Scanner(System.in);
        String operacion = sc.nextLine();
        String[] input = sc.nextLine().split(" ");

        Producto producto = new Producto(Integer.parseInt(input[0]),
                input[1],
                Double.parseDouble(input[2]),
                Integer.parseInt(input[3])
        );

        if ("AGREGAR".equals(operacion) && !listaProductos.verificarExistencia(producto)) {
            listaProductos.agregar(producto);
            listaProductos.generarInforme();

        } else if ("BORRAR".equals(operacion) && listaProductos.verificarExistencia(producto)) {
            listaProductos.borrar(producto);
            listaProductos.generarInforme();
        } else if ("ACTUALIZAR".equals(operacion) && listaProductos.verificarExistencia(producto)) {
            listaProductos.actualizar(producto);
            listaProductos.generarInforme();
        } else {
            System.out.println("ERROR");

        }

    }

}

class DataBaseProducts {

    private Map<Integer, Producto> listaProductos = new HashMap<Integer, Producto>();

    public DataBaseProducts() {
        listaProductos.put(1, new Producto(1, "Manzana", 6000.0, 97));

        listaProductos.put(2, new Producto(2, "Limones", 2600.0, 45));

        listaProductos.put(3, new Producto(3, "Peras", 2700.0, 55));

        listaProductos.put(4, new Producto(4, "Arandanos", 7300.0, 44));

        listaProductos.put(5, new Producto(5, "Tomates", 8100.0, 42));

        listaProductos.put(6, new Producto(6, "Fresas", 9100.0, 99));

        listaProductos.put(7, new Producto(7, "Helado", 4500.0, 41));

        listaProductos.put(8, new Producto(8, "Galletas", 600.0, 18));

        listaProductos.put(9, new Producto(9, "Chocolates", 4500.0, 990));

        listaProductos.put(10, new Producto(10, "Jamon", 18000.0, 55));

    }

    public void agregar(Producto producto) {
        listaProductos.put(producto.getCodigo(), producto);
    }

    public void borrar(Producto producto) {
        listaProductos.remove(producto.getCodigo());
    }

    public void actualizar(Producto producto) {
        listaProductos.replace(producto.getCodigo(), producto);
    }

    public boolean verificarExistencia(Producto producto) {
        return listaProductos.containsKey(producto.getCodigo());

    }

    public double totalInventario() {

        double totalInventario1 = 0;
        for (Producto producto : listaProductos.values()) {
            totalInventario1 += producto.getPrecio() * producto.getInventario();

        }
        return totalInventario1;
    }

    public String productosPrecioMayor() {
        String nombre = listaProductos.values().iterator().next().getNombre();
        double precio = listaProductos.values().iterator().next().getPrecio();
        for (Producto producto: listaProductos.values()) {
            if(producto.getPrecio() > precio){
            nombre = producto.getNombre();
            precio = producto.getPrecio();
            }
        }
        return nombre;
    }

    public String productoPrecioMenor() {
        
        String nombre = listaProductos.values().iterator().next().getNombre();
        double precio = listaProductos.values().iterator().next().getPrecio();
        
        for (Producto producto : listaProductos.values()) {
            if (producto.getPrecio() < precio) {
                nombre = producto.getNombre();
                precio = producto.getPrecio();
            }
        }
        return nombre;
    }

    public double promedioPrecios() {
        
        double suma = 0;
        for (Producto producto : listaProductos.values()) {
            suma += producto.getPrecio();
        }
        return suma / (listaProductos.size());
    }

    public void generarInforme() {
        System.out.println(productosPrecioMayor() + " " + productoPrecioMenor() + " " + String.format("%.1f", promedioPrecios()) + " " + " " + String.format("%.1f", totalInventario()));
    }

}

class Producto {

    private int codigo;
    private String nombre;
    private double precio;
    private int inventario;

    public Producto(int codigo, String nombre, double precio, int inventario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

}
