import java.util.Scanner;

public class Main extends persona{
    public static void main(String[] args) {
        Scanner strings = new Scanner(System.in);
        Scanner ints = new Scanner(System.in);
        
        persona p1 = crear_persona(strings, ints);

        while (true) {
            System.out.print("Sus datos: ");
            print_data(p1);
            System.out.print("\nCambiar datos?\n1.Si\n2.No\n> ");
            if(ints.nextInt() == 1) change_data(strings, ints, p1);
            else break;
        }
        ints.close();
        strings.close();
        return;
    }

    static persona crear_persona(Scanner strings, Scanner ints) {
        System.out.print("Ingrese su nombre\n> ");
        String nombre = strings.nextLine();
        System.out.print("Ingrese su Edad\n> ");
        int edad = ints.nextInt();
        System.out.print("Ingrese su DNI\n> ");
        int dni = ints.nextInt();
        System.out.print("Ingrese su telefono\n> ");
        int telefono = ints.nextInt();
        System.out.print("Ingrese su direccion\n> ");
        String dir = strings.nextLine();

        persona p1 = new persona(nombre, edad, dni, telefono, dir);
        return p1;
    }

    static void print_data(persona src) {
        System.out.println(src.getNombre() + " - " +
        src.getEdad() + " - " +
        src.getDni() + " - " +
        src.getTelefono() + " - " +
        src.getDireccion()
        );
    }

    static void change_data(Scanner strings, Scanner ints, persona src) {
        System.out.print("\n1.Nombre\n2.Edad\n3.DNI\n4.Telefono\n5.Direccion\n> ");
        int slc = ints.nextInt();

        switch(slc) {
            case 1:
                System.out.print("\nIngrese su nombre: ");
                src.setNombre(strings.nextLine());
                break;
            case 2:
                System.out.print("\nIngrese su edad: ");
                src.setEdad(ints.nextInt());
                break;
            case 3:
                System.out.print("\nIngrese su DNI: ");
                src.setDni(ints.nextInt());
                break;
            case 4:
                System.out.print("\nIngrese su telefono: ");
                src.setTelefono(ints.nextInt());
                break;
            case 5:
                System.out.print("\nIngrese su direccion: ");
                src.setDireccion(strings.nextLine());
                break;
            default:
                break;
        }
    }
}