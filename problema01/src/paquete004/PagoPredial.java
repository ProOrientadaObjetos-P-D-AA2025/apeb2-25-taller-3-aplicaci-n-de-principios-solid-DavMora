/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// paquete004/PagoPredial.java
package paquete004;

import paquete002.Propiedad;

public class PagoPredial extends Pago {
    private Propiedad propiedad;
    private double porcentajeDescuento;

    public PagoPredial(Propiedad propiedad, double porcentajeDescuento) {
        this.propiedad = propiedad;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public void calcularPago() {
        double valorPropiedad = propiedad.getCostoPropiedad();
        valorPago = valorPropiedad - ((valorPropiedad * porcentajeDescuento) / 100);
    }

    @Override
    public String toString() {
        return String.format("Pago Predial: %.2f", valorPago);
    }
}
