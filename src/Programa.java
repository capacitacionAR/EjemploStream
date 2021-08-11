import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class Programa {
    public static void main(String[] args) {
        Random r = new Random();
        IntStream s = r.ints(10,30,90);
        //s.forEach(System.out::println);
        ArrayList lista = new ArrayList<>();
        s.filter(x -> x!= 60).forEach(x -> lista.add(x));
        System.out.println(lista);
    }
}
