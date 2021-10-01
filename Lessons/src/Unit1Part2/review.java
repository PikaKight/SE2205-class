package Unit1Part2;
import java.util.Scanner;

public class review {
    static Scanner in = new Scanner(System.in);

    public  static void main(String[] args){
        System.out.print("To create a list to store integers which of the following statements can be used? ");
        String ans = in.next();

        if (ans == "ArrayList<Integer> list = new ArrayList<Integer>();"){
            System.out.println("right");
        }

        System.out.print("To declare an interface named A with two generic types which of the following statements can be used?");
        ans = in.next();

        if (ans == "public interface A<E,F> {...}"){
            System.out.println("right");
        }

        System.out.print("In the following inheritance-chain\n" +
                "diagram, a method definition in Class_2 can access\n" +
                "a public method of Class_1 directly by using the\n" +
                "keyword super\n" +
                "obj <- cls 1 <- cls 2 <- cls 3");
        ans = in.next();

        if (ans == "true"){
            System.out.println("right");
        }

        System.out.print(" An abstract class declaration may or\n" +
                "may not have any abstract method.");
        ans = in.next();

        if (ans == "true"){
            System.out.println("right");
        }

        System.out.print("If you define an abstract class called\n" +
                "MyClass in Java and extends that class to\n" +
                "AnotherClass, you can use the following statement in\n" +
                "the main() method. \n" +
                "MyClass [] foo = new MyClass[20];");
        ans = in.next();

        if (ans == "true"){
            System.out.println("right");
        }

        System.out.print("the following Interface declaration is\n" +
                "NOT valid\n" +
                "public interface MyInterface{\n" +
                "//Contains no data field or method\n" +
                "}");
        ans = in.next();

        if (ans == "false"){
            System.out.println("right");
        }

        System.out.print("In the following inheritance-chain diagram, what’s the\n" +
                "relationship between Class_2 (concrete class) and\n" +
                "Interface_1?\n" +
                "   int 1 <- - int 2      int 3\n" +
                "obj <- cls 1 <- ^cls 2 <- ^cls3");
        ans = in.next();

        if (ans == "Class_2 implements the methods declared in Interface_1 and in Interface_2."){
            System.out.println("right");
        }

        System.out.print("In the following inheritance-chain diagram, if Class_1\n" +
                "has a non-final public method, can that method be\n" +
                "overwritten in Class_3?\n" +
                "   int 1 <- - int 2      int 3\n" +
                "obj <- cls 1 <- ^cls 2 <- ^cls3");
        ans = in.next();

        if (ans == "yes"){
            System.out.println("right");
        }

        System.out.print("What is the output of the following code segment?" +
                "GregorianCalendar calendar = new GregorianCalendar(2003, 2, 1);\n" +
                "Calendar calendarCopy = calendar.clone();\n" +
                "System.out.println(calendar == calendarCopy);");
        ans = in.next();

        if (ans == "won't compile"){
            System.out.println("right");
        }

        System.out.print("The following code will NOT compile? (you can safely assume\n" +
                "that the interface and the two classes are stored in three\n" +
                "different files inside the same package):\n" +
                "public class myClass {\n" +
                "public static void main(String[] args) {\n" +
                "myInterface mi = new someClass();\n" +
                "mi.printInfo();\n" +
                "}\n" +
                "}\n" +
                "public interface myInterface{\n" +
                "int x = 5;\n" +
                "public void printInfo();\n" +
                "}\n" +
                "public class someClass implements myInterface{\n" +
                "public void printInfo(){\n" +
                "int z = 3; z = ++x+z;\n" +
                "System.out.println(z);\n" +
                "}\n" +
                "}");
        ans = in.next();

        if (ans == "true"){
            System.out.println("right");
        }
        System.out.print(": The following code will compile\n" +
                "public class Apple extends Fruit {\n" +
                "}\n" +
                "class Fruit {\n" +
                "public Fruit(String name) {\n" +
                "System.out.println(\"Fruit's constructor is invoked\");\n" +
                "}\n" +
                "}");
        ans = in.next();

        if (ans == "false"){
            System.out.println("right");
        }
    }
}
