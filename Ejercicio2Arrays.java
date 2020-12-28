import java.util.ArrayList;
import java.util.List;

public class Ejercicio2Arrays {
     public static void main(String[] args) {
        
    List<Integer> enteros = new ArrayList<>();
    enteros.add(10);
    enteros.add(20);
    enteros.add(30);
    enteros.add(40);
    enteros.add(50);
    
    System.out.println("-----------ELEMENTOS DE ARRAYLIST----------------");    
    for(int i = 0; i < enteros.size(); i++) {
        System.out.println(enteros.get(i));
    }
    System.out.println("-----------PRIMER ELEMENTO Y ULTIMO ELEMENTO----------------");
    System.out.println(enteros.get(0));
    System.out.println(enteros.get(enteros.size()-1));
    System.out.println("-----------------AGREGANDO EL PRIMER Y ULTIMO ELEMENTO----------------");
    enteros.add(0, 25);
    enteros.add(enteros.size()-1+1, 14);
    

    for(int i = 0; i < enteros.size(); i++) {
        System.out.println(enteros.get(i));
    }
    }
}
