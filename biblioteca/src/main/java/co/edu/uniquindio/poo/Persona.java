package co.edu.uniquindio.poo;

/*
 * Clase padre que hereda a las clases bibliotecario y estudiante
 */
public class Persona {

    /*
     * Atributos de la clase padre
     */
    public String nombre, cedula, correo;
    public int telefono;

    /*
     * Constructor de los atributos de la clase
     */
    public Persona(String nombre, String cedula, String correo, int telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
    }

    /*
     * Metodo para obtener un dato
     */
    public String getNombre() {
        return nombre;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
     * Metodo para obtener un dato
     */
    public String getCedula() {
        return cedula;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /*
     * Metodo para obtener un dato
     */
    public String getCorreo() {
        return correo;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /*
     * Metodo para obtener un dato
     */
    public int getTelefono() {
        return telefono;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /*
     * Constructor con el toString
     */
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", cedula=" + cedula + ", correo=" + correo + ", telefono=" + telefono
                + "]";
    }

}
