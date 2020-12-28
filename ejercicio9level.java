import java.util.Scanner;
public class ejercicio9level {
    public static void main(String[] args) {
        System.out.println("BIENVENIDOS");
        String texto;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un mensaje:");
        texto = scan.nextLine();
        scan.close();
        int contador=0;
        for(int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i)=='a'){   
                    ++contador;
            }
        }
        System.out.println(contador);
    }

}
