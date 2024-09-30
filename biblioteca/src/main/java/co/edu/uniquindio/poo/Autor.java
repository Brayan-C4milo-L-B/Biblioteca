package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;

/*
     * Clase para crear un autor con sus datos
 */
public class Autor extends Persona {

    /*
     * Atributos
     */
    public String apellido, nacionalidad, biografia, sitioWeb, seudonimo;
    public LocalDate fechaNacimiento;
    public Collection<Libro> libros;

    /*
     * Metodo constructor con los atributos
     */
    public Autor(String nombre, String cedula, String correo, int telefono, String apellido, String nacionalidad,
            String biografia, String sitioWeb, String seudonimo, LocalDate fechaNacimiento, Collection<Libro> libros) {
        super(nombre, cedula, correo, telefono);
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.biografia = biografia;
        this.sitioWeb = sitioWeb;
        this.seudonimo = seudonimo;
        this.fechaNacimiento = fechaNacimiento;
        this.libros = libros;
    }

    /*
     * Metodo para obtener
     */
    public String getApellido() {
        return apellido;
    }

    /*
     * Metodo para obtener
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /*
     * Metodo para obtener
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /*
     * Metodo para obtener
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /*
     * Metodo para obtener
     */
    public String getBiografia() {
        return biografia;
    }

    /*
     * Metodo para obtener
     */
    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    /*
     * Metodo para obtener
     */
    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    /*
     * Metodo para obtener
     */
    public String getSeudonimo() {
        return seudonimo;
    }

    /*
     * Metodo para obtener
     */
    public void setSeudonimo(String seudonimo) {
        this.seudonimo = seudonimo;
    }

    /*
     * Metodo para obtener
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /*
     * Metodo para obtener
     */
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /*
     * Metodo para obtener
     */
    public Collection<Libro> getLibros() {
        return libros;
    }

    /*
     * Metodo para obtener
     */
    public void setLibros(Collection<Libro> libros) {
        this.libros = libros;
    }

    /*
     * Constructor con el toString
     */
    @Override
    public String toString() {
        return "Autor [apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", biografia=" + biografia
                + ", sitioWeb=" + sitioWeb + ", seudonimo=" + seudonimo + ", fechaNacimiento=" + fechaNacimiento
                + ", libros=" + libros + "]";
    }

}
