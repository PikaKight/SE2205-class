package Quiz;
import java.util.Scanner;

public class Quiz2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Which of the following statements is true concerning abstract classes in Java?");
        String ans = in.next();

        if (ans == "All abstract methods declared in an abstract class must be defined inside the same abstract class."){
            System.out.println("right");
        }

        System.out.print("If you define an abstract class called MyClass (with 2 data-fields) in Java that is inherited by a class called AnotherClass, how many AnotherClass objects are instantiated in the heap once the following statement is executed.");
        ans = in.next();

        if (ans == "0"){
            System.out.println("right");
        }
    }
}
