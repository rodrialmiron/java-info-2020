import java.util.ArrayList;
import java.util.List;
public class Ejercicio5Arrays {
    public static void main(String[] args) {
        System.out.println("BIENVENIDOS");
        List<Integer> horas_trabajadas = new ArrayList<>();
        List<Integer> valor_por_hora = new ArrayList<>();
        List<Integer> lista_final = new ArrayList<>();
        horas_trabajadas.add(6);horas_trabajadas.add(7);horas_trabajadas.add(8);horas_trabajadas.add(4);horas_trabajadas.add(5);
        valor_por_hora.add(350);valor_por_hora.add(345);valor_por_hora.add(550);valor_por_hora.add(600);valor_por_hora.add(320);
        int monto_final = 0;
        System.out.println(horas_trabajadas);
        System.out.println(valor_por_hora);
        for( int i =  0; i < horas_trabajadas.size(); i++){
            lista_final.add(horas_trabajadas.get(i)* valor_por_hora.get(i));
            monto_final+= lista_final.get(i);

            
        }
        System.out.println(lista_final);
        System.out.println("El monto final: $"+monto_final);
        }

}
