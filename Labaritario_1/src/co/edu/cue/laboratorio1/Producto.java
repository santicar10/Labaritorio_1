package co.edu.cue.laboratorio1;

import javax.swing.*;
import java.util.Objects;

public class Producto {

    String codigo;
    String nombre;
    int disponibilidad;
    String estado;
    double precio;

    public Producto(String codigo, String nombre, int disponibilidad, String estado, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
        this.estado = estado;
        this.precio = precio;
    }

    public Producto(String cantCompra) {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public int setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
        return disponibilidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
