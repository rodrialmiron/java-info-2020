import java.util.Scanner;
public class ejercicio1level {
    public static void main( String[] args) {
        String nombre;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca su nombre");
        nombre = scan.nextLine();
        scan.close();
        System.out.println("Hola"+" "+ nombre);

    }
    
}
