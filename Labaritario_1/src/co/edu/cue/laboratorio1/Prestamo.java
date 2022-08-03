package co.edu.cue.laboratorio1;

import javax.swing.*;

public class Prestamo {

    String comprador;
    double precioProd;
    int dias;
    String vendedor;

    public Prestamo(String comprador) {
        this.comprador=comprador;
    }

    public Prestamo(double precioProd, int dias, String vendedor) {
        this.dias=dias;
        this.precioProd=precioProd;
        this.vendedor = vendedor;
    }

    public String factura(){
        String mensaje = JOptionPane.showInputDialog("su compra contiene: \n"+"comprador='" + comprador +"\nprecioProd=" + precioProd + "\ndias=" + dias + "\nvendedor='" + vendedor);
        return mensaje;
    }
}
