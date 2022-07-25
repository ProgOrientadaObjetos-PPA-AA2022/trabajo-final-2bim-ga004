/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author jpvpv
 */
public abstract class PlanCelular {
    
    protected String nombresPropietario;
    protected String cedulaPropietario;
    protected String ciudadPropietario;
    protected String marcaCelular;
    protected String modeloCelular;
    protected double pagoMensual;

    public PlanCelular(String nombresPropietario, String cedulaPropietario, 
            String ciudadPropietario, String marcaCelular, String modeloCelular) {
        this.nombresPropietario = nombresPropietario;
        this.cedulaPropietario = cedulaPropietario;
        this.ciudadPropietario = ciudadPropietario;
        this.marcaCelular = marcaCelular;
        this.modeloCelular = modeloCelular;
    }
    
    

    public void establecerNombresPropietario(String nombresPropietario) {
        this.nombresPropietario = nombresPropietario;
    }

    public void establecerCedulaPropietario(String cedulaPropietario) {
        this.cedulaPropietario = cedulaPropietario;
    }

    public void establecerCiudadPropietario(String ciudadPropietario) {
        this.ciudadPropietario = ciudadPropietario;
    }

    public void establecerMarcaCelular(String marcaCelular) {
        this.marcaCelular = marcaCelular;
    }

    public void establecerModeloCelular(String modeloCelular) {
        this.modeloCelular = modeloCelular;
    }
    
    public abstract void calcularPagoMensual();

    public String obtenerNombresPropietario() {
        return nombresPropietario;
    }

    public String obtenerCedulaPropietario() {
        return cedulaPropietario;
    }

    public String obtenerCiudadPropietario() {
        return ciudadPropietario;
    }

    public String obtenerMarcaCelular() {
        return marcaCelular;
    }

    public String obtenerModeloCelular() {
        return modeloCelular;
    }
    
    public double obtenerPagoMensual() {
        return pagoMensual;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Propietario\n"
                + "\tNombres: %s\n"
                + "\tCedula: %s\n"
                + "\tCiudad: %s\n"
                + "Celular\n"
                + "\tMarca: %s\n"
                + "\tModelo: %s\n",
                nombresPropietario,
                cedulaPropietario,
                ciudadPropietario,
                marcaCelular,
                modeloCelular);
        return cadena;
    }
    
    
    
}
