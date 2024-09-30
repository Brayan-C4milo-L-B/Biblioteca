package co.edu.uniquindio.poo;

import java.time.LocalDate;

/*
 * Clase para obtener informacion de un libro
 */
public class Libro {

    /*
     * Atributos de la clase libro
     */
    public String titulo, editorial;
    public int unidadesDisponibles, codigo, isbn;
    public LocalDate fechaPublicacion;
    public boolean estado;
    public Autor autor;
    public double valorPrestamo;

    /*
     * Constructor con los atributos de la clase
     */
    public Libro(String titulo, String editorial, int unidadesDisponibles, int codigo, int isbn,
            LocalDate fechaPublicacion, boolean estado, Autor autor, double valorPrestamo) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.unidadesDisponibles = unidadesDisponibles;
        this.codigo = codigo;
        this.isbn = isbn;
        this.fechaPublicacion = fechaPublicacion;
        this.estado = estado;
        this.autor = autor;
        this.valorPrestamo = valorPrestamo;
    }

    /*
     * Metodo para obtener un dato
     */
    public String getTitulo() {
        return titulo;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /*
     * Metodo para obtener un dato
     */
    public String getEditorial() {
        return editorial;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /*
     * Metodo para obtener un dato
     */
    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    /*
     * Metodo para obtener un dato
     */
    public int getCodigo() {
        return codigo;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /*
     * Metodo para obtener un dato
     */
    public int getIsbn() {
        return isbn;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    /*
     * Metodo para obtener un dato
     */
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    /*
     * Metodo para obtener un estado
     */
    public boolean isEstado() {
        return estado;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /*
     * Metodo para obtener un dato
     */
    public Autor getAutor() {
        return autor;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    /*
     * Metodo para obtener un dato
     */
    public double getValorPrestamo() {
        return valorPrestamo;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setValorPrestamo(double valorPrestamo) {
        this.valorPrestamo = valorPrestamo;
    }

    /*
     * Constructor con el toString
     */
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", editorial=" + editorial + ", unidadesDisponibles=" + unidadesDisponibles
                + ", codigo=" + codigo + ", isbn=" + isbn + ", fechaPublicacion=" + fechaPublicacion + ", estado="
                + estado + ", autor=" + autor + ", valorPrestamo=" + valorPrestamo + "]";
    }

    /*
     * Metodo agregar datos de un libro nuevo
     */
    public void add(Libro libro) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    /*
     * Metodo para eliminar datos de un libro
     */
    public void remove(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
