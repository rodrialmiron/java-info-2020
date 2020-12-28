public class ejercicio4level {
    public static void main(String[] args) {
        double fact = 1;
        double n = 5;
        while (n != 0){
            fact = fact*n;
            n--;
        }
       System.out.println("El factorial es de:"+fact);
    }
}
