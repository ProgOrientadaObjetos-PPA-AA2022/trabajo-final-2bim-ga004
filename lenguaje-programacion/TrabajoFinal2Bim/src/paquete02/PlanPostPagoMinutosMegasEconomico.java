/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author jpvpv
 */
public class PlanPostPagoMinutosMegasEconomico extends PlanCelular {
    
    private double minutos;
    private double costoMinuto;
    private double megasEnGigas;
    private double costoGiga;
    private double descuento;

    public PlanPostPagoMinutosMegasEconomico(double minutos, double costoMinuto,
            double megasEnGigas, double costoGiga, String nombresPropietario, 
            String cedulaPropietario, String ciudadPropietario, String marcaCelular,
            String modeloCelular) {
        super(nombresPropietario, cedulaPropietario, ciudadPropietario,
                marcaCelular, modeloCelular);
        this.minutos = minutos;
        this.costoMinuto = costoMinuto;
        this.megasEnGigas = megasEnGigas;
        this.costoGiga = costoGiga;
        this.descuento = 10;
    }

    public void establecerMinutos(double minutos) {
        this.minutos = minutos;
    }

    public void establecerCostoMinuto(double costoMinuto) {
        this.costoMinuto = costoMinuto;
    }

    public void establecerMegasEnGigas(double megasEnGigas) {
        this.megasEnGigas = megasEnGigas;
    }

    public void establecerCostoGiga(double costoGiga) {
        this.costoGiga = costoGiga;
    }

    public void stablecerDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    @Override
    public void calcularPagoMensual() {
        pagoMensual = ((minutos * costoMinuto) + (megasEnGigas * costoGiga)) * (1 - (descuento/ 100));
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerCostoMinuto() {
        return costoMinuto;
    }

    public double obtenerMegasEnGigas() {
        return megasEnGigas;
    }

    public double obtenerCostoGiga() {
        return costoGiga;
    }

    public double obtenerDescuento() {
        return descuento;
    }
    
    public String toString() {
        String cadena = String.format("%s\n(4) Plan Post Pago Minutos Megas Economico\n"
                + "%s"
                + "Plan\n"
                + "\tMinutos: %.2f\n"
                + "\tCosto Minuto: %.2f\n"
                + "\tMegas (En Gigas): %.2f\n"
                + "\tCosto Giga: %.2f\n"
                + "\tDescuento: %.2f\n"
                + "\tPago mensual: %.2f\n",
                "----------------------------------------",
                super.toString(),
                minutos,
                costoMinuto,
                megasEnGigas,
                costoGiga,
                descuento,
                pagoMensual);
        return cadena;
    }
    
    
    
}
