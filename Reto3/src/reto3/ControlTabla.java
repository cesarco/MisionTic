/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author rodri
 */
public class ControlTabla implements TableModel {

    List<Product> ListaProduct;
    String[] Columnas;
    TableModelListener tableModelListener;

    public ControlTabla(List<Product> ListaProducto) {
        this.ListaProduct = ListaProducto;
        this.Columnas = new String[]{"Nombre", "Precio", "Inventario"};
    }

    @Override
    public int getRowCount() {
        return this.ListaProduct.size();
    }

    @Override
    public int getColumnCount() {
        return this.Columnas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return this.Columnas[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return Double.class;
            case 2:
                return Integer.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setValueAt(Object ProductoN, int rowIndex, int columnIndex) {
        Product Produc = this.ListaProduct.get(rowIndex);
        switch (columnIndex) {
            case 0:
                Produc.setNombre(String.valueOf(ProductoN));
            case 1:
                Produc.setPrecio((Double) ProductoN);
            case 2:
                Produc.setInventario((int) ProductoN);

        }
        this.ListaProduct.set(rowIndex, Produc);
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
