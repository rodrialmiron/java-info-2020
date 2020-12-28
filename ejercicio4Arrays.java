import java.util.ArrayList;
import java.util.List;

public class ejercicio4Arrays {
    public static void main(String[] args) {
        System.out.println("BIENVENIDOS");
        List<String> alumnos = new ArrayList<>();
        alumnos.add("rodrigo");
        alumnos.add("mia");
        alumnos.add("ivana");
        alumnos.add("liam");
        alumnos.add("cristian");
        alumnos.add("benja");
        alumnos.add("tiago");
        alumnos.add("facu");
        alumnos.add("benicio");
        alumnos.add("brandon");
        alumnos.add("franco");
        alumnos.add("aldana");
        System.out.println(alumnos.size());
        System.out.println("*********SUBLISTA 1**********");
        List<String> sub1 = alumnos.subList(0, 4);
        System.out.println(sub1);
        System.out.println("*********SUBLISTA 2*********");
        List<String> sub2 = alumnos.subList(4, 8);
        System.out.println(sub2);
        System.out.println("*********SUBLISTA 3*********");
        List<String> sub3 = alumnos.subList(8, 12);
        System.out.println(sub3);
        
    }
}
