package co.edu.cue.laboratorio1;

public class Cliente {

    int documento;
    String tipoId;
    String nombre;
    String genero;
    String ciudad;

    public Cliente(int documento, String tipoId, String nombre, String genero, String ciudad) {
        this.documento = documento;
        this.tipoId = tipoId;
        this.nombre = nombre;
        this.genero = genero;
        this.ciudad = ciudad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
