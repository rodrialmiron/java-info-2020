import java.util.Scanner;
public class ejercicio2level {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int suma = num1+num2;
        int resta = num1-num2;
        scan.close();
        System.out.println("La suma es:"+" "+ suma);
        System.out.println("La resta es:"+" "+ resta);
        System.out.println("El producto es:"+" "+ num1*num2);
        System.out.println("La division es:"+ " "+ num1/num2);
        System.out.println("El modulo es:"+ " "+ num1 % num2);

    }
    
}
