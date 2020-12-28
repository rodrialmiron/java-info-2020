import java.util.Scanner;

public class ejercicio8level{
    public static void main(String[] args){
        String nombreyapellido;
        String edad;
        String direccion;
        String ciudad;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca su nombre y apellido");
        nombreyapellido = scan.nextLine();
        System.out.println("Ingrese su edad");
        edad = scan.nextLine();
        System.out.println("Introduzca su direccion");
        direccion = scan.nextLine();
        System.out.println("Introduzca su ciudad");
        ciudad = scan.nextLine();
        scan.close();
        System.out.print(nombreyapellido+" - "+ direccion+ " - "+edad+" - "+ ciudad+" ");
      
    }
}

