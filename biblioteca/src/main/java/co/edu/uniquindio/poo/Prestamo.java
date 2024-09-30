package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;


/*
    * Clase para crear condiciones en el prestamo de un libro
 */
public class Prestamo {

    /*
     * Atributos de la clase
     */
    public String codigo;
    public LocalDate fechaPrestamo, fechaEntrega;
    public double total;
    public Collection<Bibliotecario> bibliotecarios;
    public Collection<Estudiante> estudiantes;
    public Collection<DetallePrestamo> detallePrestamos;

    /*
     * Constructor con los atributos de la clase
     */
    public Prestamo(String codigo, LocalDate fechaPrestamo, LocalDate fechaEntrega, double total,
            Collection<Bibliotecario> bibliotecarios, Collection<Estudiante> estudiantes,
            Collection<DetallePrestamo> detallePrestamos) {
        this.codigo = codigo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.total = total;
        this.bibliotecarios = bibliotecarios;
        this.estudiantes = estudiantes;
        this.detallePrestamos = detallePrestamos;
    }

    /*
     * Metodo para obtener un dato
     */
    public String getCodigo() {
        return codigo;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /*
     * Metodo para obtener un dato
     */
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    /*
     * Metodo para obtener un dato
     */
    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /*
     * Metodo para obtener un dato
     */
    public double getTotal() {
        return total;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /*
     * Metodo para obtener un dato
     */
    public Collection<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setBibliotecarios(Collection<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    /*
     * Metodo para obtener un dato
     */
    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    /*
     * Metodo para obtener un dato
     */
    public Collection<DetallePrestamo> getDetallePrestamos() {
        return detallePrestamos;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setDetallePrestamos(Collection<DetallePrestamo> detallePrestamos) {
        this.detallePrestamos = detallePrestamos;
    }

    /*
     * Constructor con el toString
     */
    @Override
    public String toString() {
        return "Prestamo [codigo=" + codigo + ", fechaPrestamo=" + fechaPrestamo + ", fechaEntrega=" + fechaEntrega
                + ", total=" + total + ", bibliotecarios=" + bibliotecarios + ", estudiantes=" + estudiantes
                + ", detallePrestamos=" + detallePrestamos + "]";
    }

}
