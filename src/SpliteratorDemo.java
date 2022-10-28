import java.util.*;
public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList <Double> vals = new ArrayList<>();

        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        System.out.println("Consistence of vals array: ");
        Spliterator<Double> split = vals.spliterator();
        while(split.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        split = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while(split.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));

        System.out.println("Consistence of arraylist sqrs: \n");
        split = sqrs.spliterator();
        split.forEachRemaining((n) -> System.out.println(n));
        System.out.println(

        );
    }
}
