/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

public abstract class Pago {
    protected double valorPago;
    public abstract void calcularPago();
    public double getValorPago() {
        return valorPago;
    }
}

