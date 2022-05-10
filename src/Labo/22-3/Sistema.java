import java.util.ArrayList;

public class Sistema{
    // Vars
    private static ArrayList<Clientes> clientes;
    private static ArrayList<Libro> libros_en_venta;
    private static ArrayList<Integer> libros_en_oferta;
    private static ArrayList<Libro> libros_vendidos;
    private static String nombre;

    public static void main(String[] args) {
        return;
    }
    
    private static ArrayList<Clientes> clientes_frecuentes() {
        ArrayList<Clientes> output = new ArrayList<Clientes>();
        for(Clientes tgt : clientes) { if(tgt.getLibros_comprados().size() > 10) { output.add(tgt); } }
        return output;
    }

    private static ArrayList<Libro> libros_populares() {
        ArrayList<Libro> output = new ArrayList<Libro>();
        ArrayList<Integer> id_check = new ArrayList<Integer>();

        for(Libro tgt : libros_en_venta) {
            if(!(id_check.contains(tgt.getId()))) {
                int counter = 0;
                for(Libro libro : libros_en_venta) {
                    if(tgt.getId() == libro.getId()) { counter++; }
                }
                if(counter >= 100) { output.add(tgt); }
                id_check.add(tgt.getId());
            }
        }

        return output;
    }

    private static ArrayList<Integer> edades_frecuentes() {
        ArrayList<Integer> output = new ArrayList<Integer>();
        for(Clientes tgt : clientes_frecuentes()) { output.add(tgt.getEdad()); }
        return output;
    }

    private static ArrayList<Libro> libros_caros() {
        ArrayList<Libro> output = new ArrayList<Libro>();
        for(Libro tgt : libros_en_venta) { if(tgt.getPrecio() > 5500.50) { output.add(tgt); } }
        return output;
    }

    private static void venta(int id, String nombre, float precio, String editorial, Clientes John_Doe) {
        Libro output = new Libro(id, nombre, precio, editorial);
        libros_vendidos.add(output);
        John_Doe.agregar_libro(output);
        return;
    }

    private static ArrayList<Libro> get_libro(char letter) {
        ArrayList<Libro> output = new ArrayList<Libro>();
        for(Libro tgt : libros_en_venta) { if(tgt.getNombre().charAt(0) == letter) { output.add(tgt); } }
        return output;
    }

    private static int precio_final(int id) {
        int output = 0;
        for (Clientes client : clientes) {
            if(client.getId() == id) {
                for(Libro book : client.getLibros_comprados()) {
                    if(libros_en_oferta.contains(book.getId())) { output += book.getPrecio() - book.getPrecio() * 50 / 100; }
                    else { output += book.getPrecio();}
                }
            }
        }
        return output;
    }

    private static void cambiar_precio(int id, float precio, int descuento) {
        for(Libro tgt : libros_en_venta) { if(tgt.getId() == id) { tgt.setPrecio(precio - (precio * descuento / 100) ); } }
        return;
    }

    private static void precios_navidad() {
        for(Libro tgt : libros_en_venta) {
            if(tgt.getId() % 2 == 0) { cambiar_precio(libros_en_venta.indexOf(tgt), tgt.getPrecio(), 25); }
            else { cambiar_precio(libros_en_venta.indexOf(tgt), tgt.getPrecio(), 35); }
        }
        return;
    }
}