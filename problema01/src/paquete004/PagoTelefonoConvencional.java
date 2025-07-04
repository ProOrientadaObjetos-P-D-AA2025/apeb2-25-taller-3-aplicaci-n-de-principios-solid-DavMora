/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// paquete004/PagoTelefonoConvencional.java
package paquete004;

public class PagoTelefonoConvencional extends Pago {
    private double tarifaBase;
    private double minutosConsumidos;
    private double costoMinuto;

    public PagoTelefonoConvencional(double tarifaBase, double minutosConsumidos, double costoMinuto) {
        this.tarifaBase = tarifaBase;
        this.minutosConsumidos = minutosConsumidos;
        this.costoMinuto = costoMinuto;
    }

    @Override
    public void calcularPago() {
        valorPago = tarifaBase + (minutosConsumidos * costoMinuto);
    }

    @Override
    public String toString() {
        return String.format("Pago Teléfono: %.2f", valorPago);
    }
}


