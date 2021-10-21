package Midterm.Q1;
import java.util.*;

public class MarcusQ1{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        marcusHeader();

        System.out.print("Please enter an integer between 9 and 32 inclusively:");

        while(true){
            try {
                int num = in.nextInt();
                if (num < 9 || num > 32) {
                   int a = num / 0;
                }
                System.out.printf("You have entered: %d\n", 251162913 + num);
                break;


            }
            catch (InputMismatchException ex) {
                in.next();
                System.out.print("Invalid Entry! Enter an integer between 9 and 32 inclusive: ");

            }
            catch (ArithmeticException e){
                System.out.print("Invalid Entry! Enter an integer between 9 and 32 inclusive: ");
            }
        }
        marcusFooter();
    }

    public static void marcusHeader(){
        System.out.println("Name: Marcus Tuen Muk\n" +
                "Student Number: 251162913\n" +
                "Location number: 4");
    }

    public  static void marcusFooter(){
        System.out.println("Goodbye from Marcus Tuen Muk!");
    }

}
