/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete003;

import java.util.ArrayList;
import paquete004.Pago;

public class BilleteraPagos {
    private String mes;
    private ArrayList<Pago> listaPagos = new ArrayList<>();

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void agregarPago(Pago p) {
        p.calcularPago();
        listaPagos.add(p);
    }

    public double calcularGastoTotal() {
        double total = 0;
        for (Pago p : listaPagos) {
            total += p.getValorPago();
        }
        return total;
    }

    public String toString() {
        String resultado = "\n=== BILLETERA DE PAGOS ===\n";
        resultado += "Mes: " + mes + "\n";
        resultado += "Pagos:\n";
        for (Pago p : listaPagos) {
            resultado += "- " + p.toString() + "\n";
        }
        resultado += "Total Pagado: " + String.format("%.2f", calcularGastoTotal());
        return resultado;
    }
}
