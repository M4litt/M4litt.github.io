public class producto {
    // Builders
    public producto() {
        this.nombre = "NULL";
        this.precio = 0;
    }

    public producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters & Setters
    public String getNombre() { return nombre; }
    public float getPrecio() { return precio; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecio(float precio) { this.precio = precio; }
    
    // Vars
    private String nombre;
    private float precio;
}