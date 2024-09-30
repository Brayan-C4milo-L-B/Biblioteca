package co.edu.uniquindio.poo;

import java.util.Collection;

/*
 * Clase para obtener informacion del estudiante que va a realizar el prestamo de un libro
 */
public class Estudiante extends Persona {

    /*
     * Atributos de la clase
     */
    public boolean estado;
    public Collection<Prestamo> prestamos;

    /*
     * Constructor con los atributos
     */
    public Estudiante(String nombre, String cedula, String correo, int telefono, boolean estado,
            Collection<Prestamo> prestamos) {
        super(nombre, cedula, correo, telefono);
        this.estado = estado;
        this.prestamos = prestamos;
    }

    /*
     * Metodo para ver si presto algun libro
     */
    public boolean isEstado() {
        return estado;
    }

    /*
     * Metodo para obtener un estado sobre algun libro
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    /*
     * Constructor con el toString
     */
    @Override
    public String toString() {
        return "Estudiante [estado=" + estado + ", prestamos=" + prestamos + "]";
    }

    /*
     * Metodo para moagregar datos de un estudiante
     */
    public void add(Estudiante estudiante) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    /*
     * Metodo para eliminar datos de un estudiante
     */
    public void remove(Estudiante estudiante) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
