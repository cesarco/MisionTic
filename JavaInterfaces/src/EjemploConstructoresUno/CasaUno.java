/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploConstructoresUno;

/**
 *
 * @author rodri
 */
public class CasaUno {
    private double metrosCuadrados;
    private int estrato;
    
    public CasaUno(){
        System.out.println("Constructor sin parametros");
    }
    public CasaUno(int n){
        System.out.println("Constructor con un parametro");
    }
    public CasaUno(double metrosCuadrados, int estrato){
        this.estrato = estrato;
        this.metrosCuadrados = metrosCuadrados;
    }

    /**
     * @return the metrosCuadrados
     */
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    /**
     * @param metrosCuadrados the metrosCuadrados to set
     */
    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    /**
     * @return the estrato
     */
    public int getEstrato() {
        return estrato;
    }

    /**
     * @param estrato the estrato to set
     */
    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }
    
    
}
