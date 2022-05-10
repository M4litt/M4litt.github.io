import java.util.ArrayList;

public class Clientes {
    public Clientes(int id, String nombre, int edad) {
        // Def
    }

    // Getters & Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public ArrayList<Libro> getLibros_comprados() { return libros_comprados; }

    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setLibros_comprados(ArrayList<Libro> libros_comprados) { this.libros_comprados = libros_comprados; }

    // Vars
    private int id;
    private String nombre;
    private int edad;
    private ArrayList<Libro> libros_comprados;
}