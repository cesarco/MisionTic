/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabanca;

/**
 *
 * @author rodri
 */
public class Usuario extends CuentaBanca {

    private String nombre;
    private String identificacion;
    private char genero;
    private float Celular;
    private String direccion;
    private String ciudad;
    private String pais;
    private double Salario;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre1) {
        this.nombre = nombre1;
    }

    public String getIdentificacion() {
        return this.identificacion;
    }

    public void setIdentificacion(String identificacion1) {
        this.identificacion = identificacion1;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero1) {
        this.genero = genero1;
    }

    public float getCelular() {
        return this.Celular;
    }

    public void setCelular(float celular1) {
        this.Celular = celular1;
    }

    public String getDirreccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion1) {
        this.direccion = direccion1;
    }

    public String getCiuedad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad1) {
        this.ciudad = ciudad1;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais1) {
        this.pais = pais1;
    }

    public double getSalario() {
        return this.Salario;
    }

    public void setSalario(double salario1) {
        this.Salario = salario1;
    }
}
