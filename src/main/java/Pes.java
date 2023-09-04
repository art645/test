import java.util.function.BiFunction;

public class Pes {
    public static void main(String[] args) {
        double d = Operation.PLUS.apply(3,5);
        int a = 5;
        int b = 6;
        System.out.println(a);
        BiFunction<Integer, Integer, Integer> sd =  Integer::sum;
        System.out.println(sd.apply(a,b));
    }
}
