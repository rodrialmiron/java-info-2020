import java.util.ArrayList;
import java.util.List;

public class Ejercicio1Arrays {
    public static void main(String[] args) {
        
     System.out.println("Bienvenidos al sistema");
     List<String> paises = new ArrayList<>();
     paises.add("Argentina");
     paises.add("Alemania");
     paises.add("Brasil");
     paises.add("Francia");


     System.out.println("#1"+" " + paises.get(0));
     System.out.println("#2"+" " + paises.get(1));
     System.out.println("#3"+" " + paises.get(2));
    }
    
}
