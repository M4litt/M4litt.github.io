public class Main extends persona{
    public static void main(String[] args) {
        persona p1 = new persona("Maier", 12, 999, 1169696969, "caja");
        persona p2 = new persona("Carlos", 2, 123, 1233211, "casa");
        persona p3 = new persona("no se", 99, 444, 984984, "puente");

        p1.setEdad(p1.getEdad() * 2);
        p2.setTelefono(28374);
        System.out.println(p3.getNombre() + " - " + p3.getEdad() + " - " + p3.getDni() + " - " + p3.getTelefono() + " - " + p3.getDireccion());
    }
}