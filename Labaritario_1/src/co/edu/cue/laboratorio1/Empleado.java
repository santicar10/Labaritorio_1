package co.edu.cue.laboratorio1;

public class Empleado {

    int codigo;
    String nombre;
    String correo;
    int anios;


    public Empleado(int codigo, String nombre, String correo, int anios) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.correo = correo;
        this.anios = anios;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

}
