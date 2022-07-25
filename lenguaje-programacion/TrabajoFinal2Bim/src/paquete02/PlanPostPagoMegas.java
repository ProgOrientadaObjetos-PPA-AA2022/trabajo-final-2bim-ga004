/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author jpvpv
 */
public class PlanPostPagoMegas extends PlanCelular {
    
    private double megasEnGigas;
    private double costoGiga;
    private double tarifaBase;

    public PlanPostPagoMegas(double megasEnGigas, double costoGiga, 
            double tarifaBase, String nombresPropietario, String cedulaPropietario, 
            String ciudadPropietario, String marcaCelular, String modeloCelular) {
        super(nombresPropietario, cedulaPropietario, ciudadPropietario, 
                marcaCelular, modeloCelular);
        this.megasEnGigas = megasEnGigas;
        this.costoGiga = costoGiga;
        this.tarifaBase = tarifaBase;
    }
    
    public void establecerMegasEnGigas(double megasEnGigas) {
        this.megasEnGigas = megasEnGigas;
    }

    public void establecerCostoGiga(double costoGiga) {
        this.costoGiga = costoGiga;
    }

    public void establecerTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = tarifaBase + (megasEnGigas * costoGiga);
    }

    public double obtenerMegasEnGigas() {
        return megasEnGigas;
    }

    public double obtenerCostoGiga() {
        return costoGiga;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }
    
    public String toString() {
        String cadena = String.format("%s\n(2) Plan Post Pago Minutos\n"
                + "%s"
                + "Plan\n"
                + "\tMegas (En Gigas): %.2f\n"
                + "\tCosto Giga: %.2f\n"
                + "\tTarifa Base: %.2f\n"
                + "\tPago mensual: %.2f\n",
                "----------------------------------------",
                super.toString(),
                megasEnGigas,
                costoGiga,
                tarifaBase,
                pagoMensual);
        return cadena;
    }
    
    
    
    
}
