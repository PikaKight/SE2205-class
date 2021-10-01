package Quiz;
import java.util.Scanner;

public class Quiz1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Which one of the following names follows the naming convention for a class-name in JAVA? ");
        String ans = in.next();

        if (ans == "MyFirstClass"){
            System.out.println("right");
        }

        System.out.print("In the following Java statement, what does out represent?\n" +
                "System.out.println(\"Welcome to Java!\");");
        ans = in.next();

        if (ans == "An Object"){
            System.out.println("right");
        }

        System.out.print("In the following Java statement, what does out represent?\n" +
                "System.out.println(\"Welcome to Java!\");");
        ans = in.next();

        if (ans == "An Object"){
            System.out.println("right");
        }
    }
}
