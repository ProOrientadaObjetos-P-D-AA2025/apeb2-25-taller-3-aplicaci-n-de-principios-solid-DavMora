/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// paquete004/PagoLuzElectrica.java
package paquete004;

public class PagoLuzElectrica extends Pago {
    private double tarifaBase;
    private double kilovatiosConsumidos;
    private double costoKilovatio;
    private String ciudad;

    public PagoLuzElectrica(double tarifaBase, double kilovatiosConsumidos, double costoKilovatio, String ciudad) {
        this.tarifaBase = tarifaBase;
        this.kilovatiosConsumidos = kilovatiosConsumidos;
        this.costoKilovatio = costoKilovatio;
        this.ciudad = ciudad;
    }

    @Override
    public void calcularPago() {
        if (ciudad.equalsIgnoreCase("Loja")) {
            valorPago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            valorPago = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }
    }

    @Override
    public String toString() {
        return String.format("Pago Luz (%s): %.2f", ciudad, valorPago);
    }
}


