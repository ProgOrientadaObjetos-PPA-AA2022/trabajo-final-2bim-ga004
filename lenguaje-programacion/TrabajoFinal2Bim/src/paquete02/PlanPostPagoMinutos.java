/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author jpvpv
 */
public class PlanPostPagoMinutos extends PlanCelular {
    
    private double minutosNacionales;
    private double costoMinutoNacional;
    private double minutosInternacionales;
    private double costoMinutoInternacional;

    public PlanPostPagoMinutos(double minutosNacionales, double costoMinutoNacional,
            double minutosInternacional, double costoMinutoInternacional, 
            String nombresPropietario, String cedulaPropietario, String ciudadPropietario, 
            String marcaCelular, String modeloCelular) {
        super(nombresPropietario, cedulaPropietario, ciudadPropietario, 
                marcaCelular, modeloCelular);
        this.minutosNacionales = minutosNacionales;
        this.costoMinutoNacional = costoMinutoNacional;
        this.minutosInternacionales = minutosInternacional;
        this.costoMinutoInternacional = costoMinutoInternacional;
    }

    public void establecerMinutosNacionales(double minutosNacionales) {
        this.minutosNacionales = minutosNacionales;
    }

    public void establecerCostoMinutoNacional(double costoMinutoNacional) {
        this.costoMinutoNacional = costoMinutoNacional;
    }

    public void establecerMinutosInternacional(double minutosInternacional) {
        this.minutosInternacionales = minutosInternacional;
    }

    public void establecerCostoMinutoInternacionales(double costoMinutoInternacional) {
        this.costoMinutoInternacional = costoMinutoInternacional;
    }
    
    @Override
    public void calcularPagoMensual() {
         pagoMensual = (minutosNacionales * costoMinutoNacional) + 
                 (minutosInternacionales * costoMinutoInternacional);
         
    }

    public double obtenerMinutosNacionales() {
        return minutosNacionales;
    }

    public double obtenerCostoMinutoNacional() {
        return costoMinutoNacional;
    }

    public double obtenerMinutosInternacionales() {
        return minutosInternacionales;
    }

    public double obtenerCostoMinutoInternacional() {
        return costoMinutoInternacional;
    }
    
    public String toString() {
        String cadena = String.format("%s\n(1) Plan Post Pago Megas\n"
                + "%s"
                + "Plan\n"
                + "\tMinutos Nacionales: %.2f\n"
                + "\tCosto Minuto Nacional: %.2f\n"
                + "\tMinutos Internacionales: %.2f\n"
                + "\tCosto Minuto Internacional: %.2f\n"
                + "\tPago mensual: %.2f\n",
                "----------------------------------------",
                super.toString(),
                minutosNacionales,
                costoMinutoNacional,
                minutosInternacionales,
                costoMinutoInternacional,
                pagoMensual);
        return cadena;
    }
    
}
