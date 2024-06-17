package global.biblio;

import global.biblio.biblioteca.Biblioteca;
import global.biblio.biblioteca.Libro;
import global.biblio.biblioteca.Prestamo;
import global.biblio.people.Estudiante;
import global.biblio.people.Profesor;
import java.util.List;

public class Biblio {
    public static void main(String[] args) {
        try {
            Biblioteca biblioteca = new Biblioteca();
            
            //Registrar Libros
            biblioteca.registrarLibro(new Libro("1","patito feo", "Antonio", 1965, "Novela"));
            biblioteca.registrarLibro(new Libro("2","El moribundo", "Camilo", 1967, "Drama"));
            
            // Registrar usuarios
            biblioteca.registrarUsuario(new Estudiante("1", "Juan Pérez", "Calle Falsa 123"));
            biblioteca.registrarUsuario(new Profesor("2", "Dr. Smith", "Avenida Siempre Viva 456"));

            // Prestar libros
            biblioteca.prestarLibro("1", "1"); // Juan Pérez toma "Patito feo"
            biblioteca.prestarLibro("2", "2"); // Dr. Smith toma "El Moribundo"
            
            
            // Listar libros disponibles
            List<Libro> disponibles = biblioteca.listarLibrosDisponibles();
            System.out.println("Libros disponibles:");
            for (Libro libro : disponibles) {
                System.out.println(libro.getTitulo());
            }

            // Listar libros prestados
            List<Prestamo> prestados = biblioteca.listarLibrosPrestados();
            System.out.println("Libros prestados:");
            for (Prestamo prestamo : prestados) {
                System.out.println(prestamo.getLibro().getTitulo() + " prestado a " + prestamo.getUsuario().getNombreCompleto() + " hasta " + prestamo.getFechaPrestamo());
            }

            // Devolver libro
            biblioteca.devolverLibro("1", "1"); // Juan Pérez devuelve "Cien Años de Soledad"

            // Consultar historial de préstamos de un usuario
            List<Prestamo> historial = biblioteca.consultarHistorialUsuario("1");
            System.out.println("Historial de préstamos de Juan Pérez:");
            for (Prestamo prestamo : historial) {
                System.out.println(prestamo.getLibro().getTitulo() + " prestado el " + prestamo.getFechaPrestamo());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
