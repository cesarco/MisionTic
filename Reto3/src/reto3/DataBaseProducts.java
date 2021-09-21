/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rodri
 */
public class DataBaseProducts {
    
    private Map<Integer, Product > listaProductos = new HashMap<Integer, Product>();

        public DataBaseProducts() {

            listaProductos.put(1, new Product(1, "Manzanas", 6000.0, 97));

            listaProductos.put(2, new Product(2, "Limones", 2600.0, 45));

            listaProductos.put(3, new Product(3, "Peras", 2700.0, 55));
            listaProductos.put(4, new Product(4, "Arandanos", 7300.0, 44));

            listaProductos.put(5, new Product(5, "Tomates", 8100.0, 42));

            listaProductos.put(6, new Product(6, "Fresas", 9100.0, 99));

            listaProductos.put(7, new Product(7, "Helado", 4500.0, 41));

            listaProductos.put(8, new Product(8, "Galletas", 600.0, 18));

            listaProductos.put(9, new Product(9, "Chocolates", 4500.0, 990));

            listaProductos.put(10, new Product(10, "Jamon", 18000.0, 55));

        }
// AGREGAMOS PRODUCTOS
        public void agregar(Product producto) {
            listaProductos.put(producto.getCodigo(), producto);
        }
// Borramos el producto
        public void borrar(Product producto) {
            listaProductos.remove(producto.getCodigo());
        }
// Actualizamos el producto que esta en el hasmap
        
        public void actualizar(Product producto) {
            listaProductos.replace(producto.getCodigo(), producto);
        }
// Con el tipo de dato bolean  verificamos si el producto esta
        
        public boolean verificar(Product producto) {
            return listaProductos.containsKey(producto.getCodigo());
        }
// usamos para determinar cual producto tiene el precio mayor
        
        public Product productosPrecioMayor() {
            Product producto = listaProductos.values().iterator().next();
            for (Product pro : listaProductos.values()) {
                if (pro.getPrecio() > producto.getPrecio()) {
                    producto = pro;

                }

            }
            return producto;
        }
// es lo que estamos mostrando por con sola los resultados
        
        public void generarInforme() {
            String[] productos = new String[3];

            for (int i = 0; i < 3; i++) {
                Product pros = productosPrecioMayor();
                productos[i] = pros.getNombre();
                listaProductos.remove(pros.getCodigo());

            }
            System.out.println(productos[0] + " " + productos[1] + " " + productos[2]);
        }

}
