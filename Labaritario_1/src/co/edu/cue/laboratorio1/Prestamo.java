package co.edu.cue.laboratorio1;

import javax.swing.*;

public class Prestamo {

    String comprador;
    double precioProd;
    int dias;
    String vendedor;

    public Prestamo(double precioProd, int dias, String vendedor,String comprador) {
        this.dias=dias;
        this.precioProd=precioProd;
        this.vendedor = vendedor;
        this.comprador=comprador;
    }

    public String factura(String comprador,double precioProd, int dias, String vendedor){

        int numero = (int)(Math.random()*40+10);
        String mensaje = "su compra contiene: \n"+"comprador: " + comprador +"\nprecioProd: " + precioProd + "\ndias: " + dias + "\nvendedor: " + vendedor+"\n EL NUMERO DE SU FACTURA ES:"+numero
                +"\n recuerde que cada dia de mas se cobrara un incremento del 70%";
        return mensaje;
    }
}
