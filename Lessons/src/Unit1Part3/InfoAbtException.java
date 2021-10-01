package Unit1Part3;
import java.util.Scanner;

public class InfoAbtException {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Which of the following is a checked\n" +
                "exception in Java?");
        String ans = in.next();

        if (ans == " IOException"){
            System.out.println("right");
        }

        System.out.print("In the following code will statement5 be executed if no\n" +
                "exception is caught? \n" +
                "public static void main(String[] args)\n" +
                "try{ statement1; statement2;statement3;}\n" +
                "catch(Exception1 x1){}\n" +
                "catch(Exception2 x2){}\n" +
                "catch(Exception3 x3){}\n" +
                "finally{statement4;}\n" +
                "statement5;\n" +
                "}");
        ans = in.next();

        if (ans == " yes"){
            System.out.println("right");
        }

        System.out.print("If Exception3 is caught in the following code, which of the\n" +
                "following is a most possible scenario after the Exception3 block is\n" +
                "executed? \n" +
                "public static void main(String[] args)\n" +
                "try{ statement1; statement2;statement3;}\n" +
                "catch(Exception1 x1){}\n" +
                "catch(Exception2 x2){}\n" +
                "catch(Exception3 x3){}\n" +
                "finally{statement4;}\n" +
                "statement5;\n" +
                "}");
        ans = in.next();

        if (ans == "Both Statement 4 and 5 will be executed"){
            System.out.println("right");
        }

        System.out.print("What will be printed when the following code segment is run and\n" +
                "the user enters 3 and 0 after being prompted to enter two\n" +
                "integers? \n" +
                "public static void main(String[] args) {\n" +
                "Scanner input = new Scanner(System.in);\n" +
                "System.out.print(\"Enter two integers: \");\n" +
                "int number1 = input.nextInt();\n" +
                "int number2 = input.nextInt();\n" +
                "try {System.out.println(number1 + \" / \" + number2 + \" is \"+ (number1 /\n" +
                "number2));}\n" +
                "catch (Exception ex) { System.out.print(\"Exception: divided by zero!\"); }\n" +
                "System.out.println(\" Good bye!\");\n" +
                "}");
        ans = in.next();

        if (ans == "Exception: divided by zero! Good Bye!"){
            System.out.println("right");
        }
    }
}
