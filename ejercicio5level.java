public class ejercicio5level {

	public static void main(String[] args) {
                String num1;
                System.out.print("Por favor, dime un numero: ");
                num1 = System.console().readLine();
                Integer  numero = Integer.parseInt(num1);
                System.out.println("Primer numero:" +numero);
                System.out.print("Por favor, dime la cantidad que debo sumar ese numero: ");
                String num2 = System.console().readLine();
                Integer  numero2 = Integer.parseInt(num2);
                System.out.println("Segundo numero:" +numero2);
                int suma=0;
                while(numero2!=0){
                    suma=suma+numero;
                    numero2= numero2-1;
                    
                }
                System.out.println( "El resultado de la suma sucesiva es:" +suma); 
            }
        } 
        

