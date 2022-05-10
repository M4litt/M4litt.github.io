import java.util.ArrayList;
import java.util.Scanner;

public class Main extends producto{
    static Scanner stringsScanner = new Scanner(System.in);
    static Scanner intsScanner = new Scanner(System.in);
    

    public static void main(String[] args) {
        ArrayList<producto> lista = new ArrayList<>();
        
        while(true) {
            System.out.print("1. Ingresar Producto\n2. Importe parcial a pagar\n3. Finalizar registro\n> ");
            switch(intsScanner.nextInt()) {
                case 1:
                    lista.add(regProducto());
                    break;
                case 2:
                    System.out.println("Importe a pagar: " + importe(lista));
                    break;
                case 3:
                    System.out.println("Importe a pagar: " + importe(lista));
                    stringsScanner.close();
                    intsScanner.close();
                    return;
                default:
                    break;
            }
        }
    }

    static producto regProducto() {
        System.out.print("\nIngrese el nombre: ");
        String nombre = stringsScanner.nextLine();
        System.out.print("\nIngrese el precio: ");
        float precio = intsScanner.nextFloat();

        producto p1 = new producto(nombre, precio);
        return p1;
    }

    static float importe(ArrayList<producto> src) {
        float total = 0;
        for(int i = 0; i < src.size(); i++) { total += src.get(i).getPrecio(); }
        return total;
    }
}