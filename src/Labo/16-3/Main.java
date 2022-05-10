import java.util.ArrayList;
import java.util.Scanner;

public class Main extends persona {
    static Scanner stringsScanner = new Scanner(System.in);
    static Scanner intsScanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<persona> list = new ArrayList<>();
        while(true) {
            System.out.print("\n1. Registrar persona\n2. Borrar persona\n3. Modificar datos\n4. Mayores de edad\n5. Mostrar datos\n6. Salir\n> ");
            switch(intsScanner.nextInt()) {
                case 1:
                    list.add(create_object());
                    break;
                case 2:
                    list = delete_object(list);
                    break;
                case 3:
                    modify_object(list);
                    break;
                case 4:
                    mayores(list);
                    break;
                case 5:
                    list_data(list);
                    break;
                case 6:
                    stringsScanner.close();
                    intsScanner.close();
                    System.out.println("Bye!");
                    return;
                default:
                    break;
            }
        }
    }

    static persona create_object() {
        System.out.print("Ingrese su nombre\n> ");
        String nombre = stringsScanner.nextLine();
        System.out.print("Ingrese su Edad\n> ");
        int edad = intsScanner.nextInt();
        System.out.print("Ingrese su DNI\n> ");
        int dni = intsScanner.nextInt();
        System.out.print("Ingrese su telefono\n> ");
        int telefono = intsScanner.nextInt();
        System.out.print("Ingrese su direccion\n> ");
        String dir = stringsScanner.nextLine();

        persona p1 = new persona(nombre, edad, dni, telefono, dir);
        return p1;
    }

    static ArrayList<persona> delete_object(ArrayList<persona> src) {
        list_data(src);
        System.out.print("Ingrese el dni: ");
        int input = intsScanner.nextInt();
        for(persona tgt : src) { if(tgt.getDni() == input) { src.remove(tgt); break; } }
        return src;
    }

    static ArrayList<persona> modify_object(ArrayList<persona> src) {
        list_data(src);
        System.out.print("Ingrese el DNI: ");
        int input = intsScanner.nextInt();
        for(persona tgt : src) { if(tgt.getDni() == input) { src.set(src.indexOf(tgt), change_data(tgt)); } }
        return src;
    }

    static persona change_data(persona src) {
        System.out.print("\n1.Nombre\n2.Edad\n3.DNI\n4.Telefono\n5.Direccion\n> ");
        switch(intsScanner.nextInt()) {
            case 1:
                System.out.print("\nIngrese el nombre: ");
                src.setNombre(stringsScanner.nextLine());
                break;
            case 2:
                System.out.print("\nIngrese la edad: ");
                src.setEdad(intsScanner.nextInt());
                break;
            case 3:
                System.out.print("\nIngrese el DNI: ");
                src.setDni(intsScanner.nextInt());
                break;
            case 4:
                System.out.print("\nIngrese el telefono: ");
                src.setTelefono(intsScanner.nextInt());
                break;
            case 5:
                System.out.print("\nIngrese la direccion: ");
                src.setDireccion(stringsScanner.nextLine());
                break;
            default:
                break;
        }

        return src;
    }

    static void mayores(ArrayList<persona> src) {
        for(persona tgt : src) { if(tgt.esMayorDeEdad()) { print_data(tgt); } }
    }

    static void list_data(ArrayList<persona> src) {
        System.out.print("NOMBRE | EDAD | DNI | TELEFONO | DIRECCION\n");
        for(persona tgt : src) { print_data(tgt); }
    }

    static void print_data(persona src) {
        System.out.println(src.getNombre() + " | " +
        src.getEdad() + " | " +
        src.getDni() + " | " +
        src.getTelefono() + " | " +
        src.getDireccion()
        );
    }
}