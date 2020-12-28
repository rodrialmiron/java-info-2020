import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio3Arrays {
    public static void main(String[] args) {
        System.out.println("BIENVENIDOS");
        List<Integer> cartas = new ArrayList<>();
        cartas.add(2);
        cartas.add(3);
        cartas.add(4);
        cartas.add(5);
        cartas.add(6);
        cartas.add(7);
        cartas.add(8);
        cartas.add(9);
        cartas.add(10);
        cartas.add(11);
        cartas.add(12);
        cartas.add(13);
        cartas.add(14);
      Collections.sort(cartas);
      System.out.println(cartas);
      Collections.reverse(cartas);
      System.out.println(cartas);
      Collections.shuffle(cartas);
      System.out.println(cartas);
    }

}

