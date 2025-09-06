public class App {
    public static void main(String[] args)  {
        Libro libro1 = new Libro("Principito", "Saint-Exupery", 3, 6);
        Libro libro2 = new Libro("100 años de soledad", "Gabriel Garcia Marques", 4, 8);
        
        System.out.println("Mostrar datos: ");
        System.out.println(libro1);
        System.out.println(libro2);

        System.out.println("\nIntentando prestar 100 años de soledad: " + libro1.prestamo());
        System.out.println("\nIntentando prestar el Principito: " + libro2.prestamo());

        System.out.println("\nDevolviendo 100 años de soledad: " + libro1.devolucion());

        System.out.println("\nDatos finales: ");
        System.out.println(libro1);
        System.out.println(libro2);
    }
}
