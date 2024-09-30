package co.edu.uniquindio.poo;

import java.util.Collection;

/*
     * Clase principal para agregar libros, estudiantes, bibliotecarios y realizar prestamos de libros.
 */
public class Biblioteca {

    /*
     * Atributos de la clase principal
     */
    public String nombre;
    public double totalDineroRecaudo;
    public Collection<Bibliotecario> bibliotecarios;
    public Collection<Prestamo> prestamos;
    public Collection<Libro> libros;
    public Collection<Estudiante> estudiantes;
    public Collection<DetallePrestamo> detallePrestamos;

    /*
     * Constructor con los atributos de la clase
     */
    public Biblioteca(String nombre, double totalDineroRecaudo, Collection<Bibliotecario> bibliotecarios,
            Collection<Prestamo> prestamos, Collection<Libro> libros, Collection<Estudiante> estudiantes,
            Collection<DetallePrestamo> detallePrestamos) {
        this.nombre = nombre;
        this.totalDineroRecaudo = totalDineroRecaudo;
        this.bibliotecarios = bibliotecarios;
        this.prestamos = prestamos;
        this.libros = libros;
        this.estudiantes = estudiantes;
        this.detallePrestamos = detallePrestamos;
    }

    /*
     * Metodo para modificar un dato
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
    public double getTotalDineroRecaudo() {
        return totalDineroRecaudo;
    }

    /*
     * Metodo para modificar un dato
     */
    public void setTotalDineroRecaudo(double totalDineroRecaudo) {
        this.totalDineroRecaudo = totalDineroRecaudo;
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
        return "Biblioteca [nombre=" + nombre + ", totalDineroRecaudo=" + totalDineroRecaudo + ", bibliotecarios="
                + bibliotecarios + ", prestamos=" + prestamos + ", libros=" + libros + ", estudiantes=" + estudiantes
                + ", detallePrestamos=" + detallePrestamos + "]";
    }

    /*
     * Metodo para verificar si exite ya un bibliotecario con ese mismo nombre
     */
    public boolean verificarBibliotecario(String nombre) {
        boolean centinela = false;
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getNombre().equals(nombre)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo para agregar un nuevo bibliotecario
     */
    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        if (!verificarBibliotecario(bibliotecario.getNombre())) {
            bibliotecario.add(bibliotecario);
        }
    }

    /*
     * Metodo para eliminar los datos de un bibliotecario en caso de despido
     */
    public void eliminarBibliotecario(String nombre) {
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getNombre().equals(nombre)) {
                bibliotecario.remove(bibliotecario);
                break;

            }
        }
    }

    /*
     * Metodo para verificar si el estudiante esta dentro de la base de datos
     */
    public boolean verificarEstudiante(String nombre) {
        boolean centinela = false;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equals(nombre)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo para agregar un estudiante nuevo si solicita algun libro prestado
     */
    public void agregarEstudiantes(Estudiante estudiantes) {
        if (!verificarEstudiante(estudiantes.getNombre())) {
            estudiantes.add(estudiantes);
        }
    }

    /*
     * Metodo para eliminar datos de un estudiante
     */
    public void eliminarEstudiante(String nombre) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equals(nombre)) {
                estudiante.remove(estudiante);
                break;

            }
        }
    }

    /*
     * Metodo para verificar si algun libro ya exite
     */
    public boolean verificarLibro(String titulo) {
        boolean centinela = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo para agregar un libro
     */
    public void agregarLibro(Libro libros) {
        if (!verificarLibro(libros.getTitulo())) {
            libros.add(libros);
        }
    }

    /*
     * Metodo para elimiar algun libro en especifico
     */
    public void eliminarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                libro.remove(libro);
                break;

            }
        }
    }

    /*
     * Metodo para contar los libros con el mismo nombre
     */
    public int contarLibros(Libro libro, String titulo) {
        int contador = 0;
        for (int i = 0; i >= 0; i++) {
            if (libro.getTitulo().equals(titulo) == libro.getTitulo().equals(titulo)) {
                contador++;
                break;
            }
        }
        return contador;
    }

    /*
     * public int contarLibros(Libro libro) {
        int contador = 0;
        for (int i = 0; i >= 0; i++) {
            for (int j =0; j <= i; j--){
                if (libro.getTitulo() == libro.getTitulo()) {
                    contador++;
                    break;
    
            }
            
            }
        }
        return contador;
    }
     */

 /*
     * Metodo para calcular el acumulado con el contador
     */
    public double sumaLibros(int contador) {
        double acumulador = 0;
        for (int j = 0; j >= 0; j++) {
            if (contador > 0 && acumulador > 0) {
                acumulador = acumulador * contador;
            }

        }
        return acumulador;
    }

    /*
     * Metodo para consultar libros por codigo
     */
    public boolean consultarLibroPorCodigo(int codigo) {
        boolean centinela = false;
        for (Libro libro : libros) {
            if (libro.getCodigo() == codigo) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo para calcular la suma de todos los prestamos
     */
    public double calcularTotal(Collection<DetallePrestamo> detallePrestamos) {
        double total = 0;
        for (DetallePrestamo detallePrestamo : detallePrestamos) {
            total += detallePrestamo.getSubTotal();
        }
        return total;
    }

}
