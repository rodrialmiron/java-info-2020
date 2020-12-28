import java.util.Scanner;

public class ejercicio4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        if (num == 1){
            System.out.println("Hoy es Domingo");
        } else if (num == 2){
            System.out.println("Hoy es Lunes");
        } else if (num == 3){
            System.out.println("Hoy es Martes");
        } else if (num == 4){
            System.out.println("Hoy es Miercoles");
        } else if (num == 5){
            System.out.println("Hoy es Jueves");
        } else if (num == 6){
            System.out.println("Hoy es Viernes");
        } else if (num == 7){
            System.out.println("Hoy es Sabado");
        } else{
            System.out.println("Ingrese un numero del 1 al 7");
        }
    }
}