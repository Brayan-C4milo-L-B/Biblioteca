package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

/*
 * Clase que lleva el detalle de los prestamos junto a su costo y el porcentaje que se cobra por tiempo
 */
public class DetallePrestamo {

    /*
     * Atributos de la clase
     */
    public int cantidad;
    public Prestamo prestamos;
    public Collection<Libro> libros;
    public double subTotal;

    /*
     * Constructor con los atributos
     */
    public DetallePrestamo(int cantidad, Prestamo prestamo, Collection<Libro> libros, double subTotal,
            double valorPrestamo) {
        this.cantidad = cantidad;
        this.prestamos = prestamo;
        this.libros = libros;
        this.subTotal = subTotal;

    }

    /*
     * Metodo para obtener un dato
     */
    public int getCantidad() {
        return cantidad;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /*
     * Metodo para obtener un dato
     */
    public Prestamo getPrestamo() {
        return prestamos;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setPrestamo(Prestamo prestamo) {
        this.prestamos = prestamo;
    }

    /*
     * Metodo para obtener un dato
     */
    public Collection<Libro> getLibros() {
        return libros;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setLibros(Collection<Libro> libros) {
        this.libros = libros;
    }

    /*
     * Metodo para obtener un dato
     */
    public double getSubTotal() {
        return subTotal;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    /*
     * Constructor con el toString
     */
    @Override
    public String toString() {
        return "DetallePrestamo [cantidad=" + cantidad + ", prestamo=" + prestamos + ", libros=" + libros + ", subTotal="
                + subTotal + ", valorPrestamo=" + "]";
    }

    /*
     * Metodo para calcular un total de valores
     */
    public double subTotal(double valorPrestamo) {
        double acum = 0;
        for (int i = 0; i >= 0; i++) {
            if (valorPrestamo >= 0) {
                acum = acum + valorPrestamo;
            }
        }
        return acum;
    }

    /*
     * Metodo para mostrar el titulo del libro
     */
    public String detalleTituloLibro(LinkedList<Libro> libros, String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro.getTitulo();
            }
        }
        return null;
    }

    /*
     * Metodo para mostrar el valor del prestamo del libro
     */
    public double detalleValorPrestamo(LinkedList<Libro> libros, double valorPrestamo) {
        for (Libro libro : libros) {
            if (libro.getValorPrestamo() == valorPrestamo) {
                return libro.getValorPrestamo();
            }
        }
        return -1;
    }

    /*
     * Metodo para mostrar el codigo del libro
     */
    public int detalleCodigo(LinkedList<Libro> libros, int codigo) {
        for (Libro libro : libros) {
            if (libro.getCodigo() == codigo) {
                return libro.getCodigo();
            }
        }
        return -1;
    }
}
