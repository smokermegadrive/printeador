package org.wuewok.probando;

enum TipoPersona {
    FISICA, JURIDICA
}

public class FormData {

    // ------------------------------------------------------------------
    // Atributos

    TipoPersona tipoPersona;
    String nombre;
    String apellido;
    String razonSocial;
    String telefono;
    String direccion;
    String dni;
    String cuil;
    int empresasExpropiadas;

    // ------------------------------------------------------------------
    // Constructores

    public FormData() {
    }

    // ------------------------------------------------------------------
    // Gets Sets

    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public int getEmpresasExpropiadas() {
        return empresasExpropiadas;
    }

    public void setEmpresasExpropiadas(int empresasExpropiadas) {
        this.empresasExpropiadas = empresasExpropiadas;
    }

}