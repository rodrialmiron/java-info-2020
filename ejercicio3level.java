import java.util.Scanner;

public class ejercicio3level {
    public static void main(String[] args) {
        int numero;
        Scanner scan = new Scanner(System.in);
        numero = scan.nextInt();
        scan.close();
        for (int i = 1; i <= numero; i++){
            System.out.println(i);
        }
    }
}   
