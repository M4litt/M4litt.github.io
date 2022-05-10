public class Libro {
    // Constructs
    public Libro(int id, String nombre, float precio, String editorial) {
        // Def
    }

    // Funcs


    // Getters & Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public float getPrecio() { return precio; }
    public String getEditorial() { return editorial; }

    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecio(float precio) { this.precio = precio; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    // Vars
    private int id;
    private String nombre;
    private float precio;
    private String editorial;
}