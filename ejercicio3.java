import java.util.Scanner;

public class ejercicio3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota = scan.nextInt();
        scan.close();
        if (nota > 92){
            System.out.println("Excelente");
        } else if (nota > 84){
            System.out.println("Sobresaliente");
        } else if (nota > 74){
            System.out.println("Distinguido");    
        } else if (nota > 64){
            System.out.println("Bueno");
        }else{
            System.out.println("Desaprobado");
        }
    }
}