/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

public class PagoAguaPotable extends Pago {
    private double tarifaFija;
    private double metrosCubicos;
    private double costoMetro;
    private String tipo; 

    public PagoAguaPotable(double tarifaFija, double metrosCubicos, double costoMetro, String tipo) {
        this.tarifaFija = tarifaFija;
        this.metrosCubicos = metrosCubicos;
        this.costoMetro = costoMetro;
        this.tipo = tipo;
    }

    @Override
    public void calcularPago() {
        if (tipo.equalsIgnoreCase("comercial")) {
            valorPago = tarifaFija + (metrosCubicos * costoMetro) + 15;
        } else {
            valorPago = tarifaFija + (metrosCubicos * costoMetro);
        }
    }

    @Override
    public String toString() {
        return String.format("Pago Agua (%s): %.2f", tipo, valorPago);
    }
}