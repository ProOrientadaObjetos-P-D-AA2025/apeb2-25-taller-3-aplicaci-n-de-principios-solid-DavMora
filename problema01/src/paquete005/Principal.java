/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete005;

import paquete002.*;
import paquete003.BilleteraPagos;
import paquete004.*;

public class Principal {
    public static void main(String[] args) {
        BilleteraPagos billetera = new BilleteraPagos();
        billetera.setMes("Julio");

        billetera.agregarPago(new PagoAguaPotable(2.20, 100.2, 0.2, "comercial"));
        billetera.agregarPago(new PagoAguaPotable(1.20, 80.2, 0.3, "residencial"));

        billetera.agregarPago(new PagoLuzElectrica(12.0, 100.2, 0.2, "Loja"));
        billetera.agregarPago(new PagoLuzElectrica(11.20, 80.2, 0.3, "Quito"));

        billetera.agregarPago(new PagoPredial(new Propiedad(120000), 10));
        billetera.agregarPago(new PagoPredial(new Propiedad(40000), 20));

        billetera.agregarPago(new PagoTelefonoConvencional(6.0, 200.2, 0.2));
        billetera.agregarPago(new PagoTelefonoConvencional(6.1, 250.2, 0.4));

        System.out.println(billetera);
    }
}
