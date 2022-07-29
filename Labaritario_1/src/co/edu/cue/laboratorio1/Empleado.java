package co.edu.cue.laboratorio1;

public class Empleado {

    int codigo;
    String nombre;
    String correo;
    int años;


    public Empleado(int codigo, String nombre, String correo, int años) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.correo = correo;
        this.años = años;
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

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }
}
