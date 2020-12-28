public class ejercicio6level {
    public static void main(String[] args) {
        String a;
        System.out.println("POR FAVOR INGRESE UN NUMERO");
        a= System.console().readLine();
        Integer num = Integer.parseInt(a);
        System.out.println("Primer numero:"+num);
        String b;
        System.out.println("POR FAVOR INGRESE EL SEGUNDO NUMERO");
        b= System.console().readLine();
        Integer num2= Integer.parseInt(b);
        System.out.println("Segundo numero:"+num2);
        Integer potencia = (int) Math.pow(num, num2);
        System.out.println(potencia);

    }
    
}
