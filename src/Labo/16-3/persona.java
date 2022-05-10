public class persona{
    // Constructs
    public persona() {
        this.nombre = "NULL";
        this.edad = 0;
        this.dni = 0;
        this.telefono = 0;
        this.direccion = "NULL";
    }

    public persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        this.dni = 0;
        this.telefono = 0;
        this.direccion = "NULL";
    }

    public persona(String nombre, int edad, int dni, int telefono, String dir) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = dir;
    }

    // Functions
    public boolean esMayorDeEdad() { return this.edad >= 18; }
    public boolean sonLaMismaPersona(persona src) { return this.dni == src.dni; }
    public boolean tienenLaMismaEdad(persona src) { return this.edad == src.edad; }

    // Getters & Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setDni(int dni) { this.dni = dni; }
    public void setTelefono(int telefono) { this.telefono = telefono; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public int getDni() { return dni; }
    public int getTelefono() { return telefono; }
    public String getDireccion() { return direccion; }

    // Vals
    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;
}