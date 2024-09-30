package co.edu.uniquindio.poo;

public class App {

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        /*
         * Metodo para crear biblioteca
         */
        Biblioteca biblioteca = new Biblioteca("A leer");
        /*
         * Metodo para crear bibliotecario
         */
        Bibliotecario bibliotecario1 = new Bibliotecario("Cristian", 1234567890, "chdm@email.com", 311412123, 1300000.0, 21 / 01 / 2021);
        Bibliotecario bibliotecario2 = new Bibliotecario("Fernando", 2341459182, "vhfa@email.com", 312414123, 1300000.0, 12 / 07 / 2020);
        Bibliotecario bibliotecario3 = new Bibliotecario("Miguel", 510324901, "agdsioer@email.com", 333453253, 1700000.0, 29 / 12 / 2023);
        Bibliotecario bibliotecario4 = new Bibliotecario("Ana", 1401239418, ",asooqwienf@email.com", 310131234, 1100000.0, 05 / 06 / 2024);
        /*
         * Metodo para agregar Bibliotecario
         */
        Bibliotecario.agregarBibliotecario(bibliotecario1);
        Bibliotecario.agregarBibliotecario(bibliotecario2);
        Bibliotecario.agregarBibliotecario(bibliotecario3);
        Bibliotecario.agregarBibliotecario(bibliotecario4);
        /*
         * Metodo para agregar Estudiante
         */
        Estudiante estudiante1 = new Estudiante("Brayan", 18237419234, "brayan@email.com", 311123495345);
        Estudiante estudiante2 = new Estudiante("Alexander", 53123984, "asddsfj@email.com", 123134531);
        Estudiante estudiante3 = new Estudiante("Jhonny", 123184535, "jhonn@email.com", 3123455314);
        Estudiante estudiante4 = new Estudiante("James", 533209183, "jm@email.com", 3101312845);
        Estudiante estudiante5 = new Estudiante("Sofia", 12034182345, "sophi@email.com", 320342491823);
        /*
         * Metodo para agregar Estudiantes
         */
        Estudiante.agregarEstudiante(estudiante1);
        Estudiante.agregarEstudiante(estudiante2);
        Estudiante.agregarEstudiante(estudiante3);
        Estudiante.agregarEstudiante(estudiante4);
        Estudiante.agregarEstudiante(estudiante5);
        /*
         * Metodo para agregar Libro
         */
        Libro libro1 = new Libro("100 años de soledad", "paquitos", 3, 3121, 912385, 12 / 02 / 2001, true, "Gabriel Garcia Marquez")
        Libro libro2 = new Libro("100 años de soledad", "paquitos", 3, 3121, 912385, 12 / 02 / 2001, true, "Gabriel Garcia Marquez")
        Libro libro3 = new Libro("100 años de soledad", "paquitos", 3, 3121, 912385, 12 / 02 / 2001, true, "Gabriel Garcia Marquez")
        Libro libro4 = new Libro("100 años de soledad", "paquitos", 3, 3121, 912385, 12 / 02 / 2001, true, "Gabriel Garcia Marquez")
        Libro libro5 = new Libro("100 años de soledad", "paquitos", 3, 3121, 912385, 12 / 02 / 2001, true, "Gabriel Garcia Marquez")
        Libro libro6 = new Libro("100 años de soledad", "paquitos", 3, 3121, 912385, 12 / 02 / 2001, true, "Gabriel Garcia Marquez")
        Libro libro7 = new Libro("100 años de soledad", "paquitos", 3, 3121, 912385, 12 / 02 / 2001, true, "Gabriel Garcia Marquez")
        Libro libro8 = new Libro("100 años de soledad", "paquitos", 3, 3121, 912385, 12 / 02 / 2001, true, "Gabriel Garcia Marquez")
        Libro libro9 = new Libro("100 años de soledad", "paquitos", 3, 3121, 912385, 12 / 02 / 2001, true, "Gabriel Garcia Marquez")
        Libro libro10 = new Libro("100 años de soledad", "paquitos", 3, 3121, 912385, 12 / 02 / 2001, true, "Gabriel Garcia Marquez")
        Libro libro11 = new Libro("100 años de soledad", "paquitos", 3, 3121, 912385, 12 / 02 / 2001, true, "Gabriel Garcia Marquez")
        Libro libro12 = new Libro("100 años de soledad", "paquitos", 3, 3121, 912385, 12 / 02 / 2001, true, "Gabriel Garcia Marquez")
        Libro libro13 = new Libro("100 años de soledad", "paquitos", 3, 3121, 912385, 12 / 02 / 2001, true, "Gabriel Garcia Marquez")

 
    }

    public Biblioteca biblioteca;

    public static void main(String[] args) {
        System.out.println("Bienvenidos a tu Biblioteca favorita");
        // Se crea la Biblioteca
        Biblioteca biblioteca = new Biblioteca("A leer", 0, null, null, null, null);

        // Se crean los Bibliotecarios
        Bibliotecario bibliotecario1 = new Bibliotecarios("Yiceli", "3226022573", "yicelli@gmail.com", "1094917419", 1300000.0, 2020 - 01 - 01,);

        // Se crean los Estudiantes
        Estudiante estudiante1 = new Estudiantes("joan", "3148189096", "joans@gmail.com", "1094917417");
        //se crean las personas

        // Se agregan los bibliotecarios a la  biblioteca
        biblioteca.agregarBibliotecario(bibliotecario1);

        // Se agregan los estudiantes a la biblioteca
        biblioteca.agregarEstudiante(estudiante1);

        System.out.println(biblioteca);

    }

    /*
 * 
     */
