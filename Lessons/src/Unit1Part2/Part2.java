package Unit1Part2;
import javax.swing.text.Utilities;
import java.util.Scanner;

public class Part2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");

        System.out.printf("%b", compare(p1,p2));
    }

    public static <K,V> boolean compare(Pair p1, Pair p2){
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

}
