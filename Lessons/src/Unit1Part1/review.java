package Unit1Part1;
import java.util.Scanner;

public class review {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("T/F A computer program is the implementation of an algorithm");
        String ans = in.next();

        if (ans == "T"){
            System.out.println("True");
        }

        System.out.print("An algorithm refers to");
        ans = in.next();

        if (ans == "A step-by-step solution to solve a specific problem"){
            System.out.println("right");
        }

        System.out.print("The extension of a java source code file is");
        ans = in.next();

        if (ans == ".java"){
            System.out.println("right");
        }

        System.out.print("The source code in Java is compiled into a bytecode.");
        ans = in.next();

        if (ans == "true"){
            System.out.println("right");
        }

        System.out.print("Bytecode is machine dependent.");
        ans = in.next();

        if (ans == "false"){
            System.out.println("right");
        }

        System.out.print(" In the following java statement what does\n" +
                "System represent?");
        ans = in.next();

        if (ans == "class"){
            System.out.println("right");
        }

        System.out.print("In Java programming language, the main() method has to be declared as a static method of a class");
        ans = in.next();

        if (ans == "true"){
            System.out.println("right");
        }

        System.out.print("Which of the following statements is FALSE?");
        ans = in.next();

        if (ans == "In Java, a class definition should always be terminated with a semicolon."){
            System.out.println("right");
        }

        System.out.print("What will be the value of 'c' after the third statement? int a = 3, b = 2;\n" +
                "double c;\n" +
                "c = (a+b)/2;");
        ans = in.next();
        int a = 3, b = 2;
        double c;
        c = (a+b)/2;

        if (ans == (String.format("%.2f", c))){ // 2
            System.out.println("right");
        }

        System.out.print("What will be the value of 'c' after the third statement?\n" +
                "(Let’s draw the memory diagram to find our answer; in\n" +
                "class discussion)\n" +
                "float a = 3, b = 2;\n" +
                "int c;\n" +
                "c = (a+b)/2;");
        ans = in.next();

        if (ans == "The code will not compile"){
            System.out.println("right");
        }

        System.out.print("Output ? int a = 2, float b = 4.0;\n" +
                "System.out.println(a/b);");
        ans = in.next();

        if (ans == "The code will result in a Compilation error"){
            System.out.println("right");
        }

        System.out.print("Which of the following statements is FALSE?");
        ans = in.next();

        if (ans == "In Java, a class definition should always\n" +
                "be terminated with a semicolon."){
            System.out.println("right");
        }

        System.out.print("What will be the value of 'c' after the third statement?\n" +
                "(Let’s draw the memory diagram to find our answer; in\n" +
                "class discussion)\n" +
                "int a = 3, b = 2;\n" +
                "double c;\n" +
                "c = (a+b)/2;");
        ans = in.next();

        if (ans == "2"){ //cause dividing by int cause it to round down
            System.out.println("right");
        }

        System.out.print("What will be the value of 'c' after the third statement?\n" +
                "(Let’s draw the memory diagram to find our answer; in\n" +
                "class discussion)\n" +
                "float a = 3, b = 2;\n" +
                "int c;\n" +
                "c = (a+b)/2;");
        ans = in.next();

        if (ans == "The code will not compile"){
            System.out.println("right");
        }

        System.out.print("What will be the output of the code? Let’s draw the memory\n" +
                "diagram (in class discussion)\n" +
                "int a = 2, b = 4;\n" +
                "a = ++b;\n" +
                "System.out.println(a+\", \"+b);");
        ans = in.next();

        if (ans == "5, 5"){
            System.out.println("right");
        }

        System.out.print("Output ? int a = 2, float b = 4.0;\n" +
                "System.out.println(a/b);");
        ans = in.next();

        if (ans == "the code will result in a Compilation error"){
            System.out.println("right");
        }

    }
}
