package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Collection;

/*
    * Clase para obtener datos del bibliotecario junto a su salario
 */
public class Bibliotecario extends Persona {

    /*
     * Atributos de la clase
     */
    private double salario;
    private LocalDate fechaIngreso;
    private Collection<Prestamo> prestamos;

    /*
     * Constructor de los atributos
     */
    public Bibliotecario(String nombre, String cedula, String correo, int telefono, double salario,
            LocalDate fechaIngreso, Collection<Prestamo> prestamos) {
        super(nombre, cedula, correo, telefono);
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
        this.prestamos = prestamos;
    }

    /*
     * Metodo para obtener un dato
     */
    public double getSalario() {
        return salario;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /*
     * Metodo para obtener un dato
     */
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /*
     * Metodo para obtener un dato
     */
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
        return "Bibliotecario [salario=" + salario + ", fechaIngreso=" + fechaIngreso + ", prestamos=" + prestamos
                + "]";
    }

    /*
     * Metodo para agregar datos de un biblitecario
     */
    public void add(Bibliotecario bibliotecario) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    /*
     * Metodo para eliniar datos de un bibliotecario
     */
    public void remove(Bibliotecario bibliotecario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* 
    ** Método para calcular antigüedad en años
     */
    public int calcularAntiguedad() {
        LocalDate fechaActual = LocalDate.now();
        return Period.between(this.fechaIngreso, fechaActual).getYears();
    }

    /*
    ** Método para calcular la bonificación basada en la antigüedad y préstamos
     */
    public double calcularBonificacion(double valorPrestamos) {
        int añosAntiguedad = calcularAntiguedad();
        double porcentajePrestamo = valorPrestamos * 0.20;
        return porcentajePrestamo * (0.02 * añosAntiguedad);
    }

    /* 
    ** Método para calcular el pago total incluyendo el 20% de los préstamos y la bonificación
     */
    public double calcularPagoTotal(double valorPrestamos) {
        double porcentajePrestamo = valorPrestamos * 0.20;
        double bonificacion = calcularBonificacion(valorPrestamos);
        return porcentajePrestamo + bonificacion;
    }

    public void crearPrestamo(Collection<Libro> libros) {

    }

    public void adicionarPrestamo() {

    }

    public void entregarPrestamo() {

    }
}
